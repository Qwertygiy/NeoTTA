/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.neotta.generator.plant.plains.grass;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.StaticBlockFloraSpawnDefinition;
import org.terasology.neotta.generator.Blocks;
import org.terasology.world.block.BlockUri;
import org.terasology.world.generator.plugin.RegisterPlugin;

import java.util.Arrays;

/**
 * Defines properties of flower plains pertaining to generation.
 */
@RegisterPlugin
public class FlowerPlainsSpawnDefinition extends StaticBlockFloraSpawnDefinition {
    public FlowerPlainsSpawnDefinition() {
        super(PlantType.GRASS, AnotherWorldBiomes.PLAINS.getId(), 0.5f, 1f, "CoreBlocks:Flower",
                Arrays.asList(new BlockUri("CoreBlocks:Dandelion"), new BlockUri("CoreBlocks:Iris"),
                        new BlockUri("CoreBlocks:Lavender"), new BlockUri("CoreBlocks:RedClover"), new BlockUri("CoreBlocks:RedFlower"),
                        new BlockUri("CoreBlocks:Tulip"), new BlockUri("CoreBlocks:YellowFlower")),
                new BlockCollectionPredicate(Blocks.getBlock("CoreBlocks:Grass")), null);
    }
}
