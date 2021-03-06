package wailafeatures.feature;

import net.minecraftforge.fml.relauncher.Side;

public enum FeatureList
{
    author(new AuthorFeature());

    private IFeature feature;

    FeatureList(IFeature feature)
    {
        this.feature = feature;
    }

    public void register(Side side)
    {
        this.feature.registerFeature(side);
    }

    public static void registerFeatures(Side side)
    {
        for (FeatureList feature : FeatureList.values())
            feature.register(side);
    }
}
