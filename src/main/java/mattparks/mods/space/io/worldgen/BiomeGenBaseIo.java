package mattparks.mods.space.io.worldgen;

import mattparks.mods.space.core.util.ConfigManagerSpace;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedCreeper;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSkeleton;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBaseIo extends BiomeGenBase
{
	public static final BiomeGenBase io = new BiomeGenBaseIo(ConfigManagerSpace.idBiomeIo).setBiomeName("Io");

	public BiomeGenBaseIo(int var1)
	{
		super(var1);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSkeleton.class, 10, 2, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 10, 2, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 8, 2, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedCreeper.class, 4, 1, 1));
		this.rainfall = 0F;
	}

	@Override
	public BiomeGenBaseIo setColor(int var1)
	{
		return (BiomeGenBaseIo) super.setColor(var1);
	}

	@Override
	public float getSpawningChance()
	{
		return 0.01F;
	}
}