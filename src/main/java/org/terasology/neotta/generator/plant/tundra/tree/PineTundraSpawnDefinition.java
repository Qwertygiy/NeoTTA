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
package org.terasology.neotta.generator.plant.tundra.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.PineGrowthDefinition;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;
import org.terasology.world.generator.plugin.RegisterPlugin;

import java.util.Arrays;

/**
 * Defines properties of pine trees in tundra regions pertaining to generation.
 */
@RegisterPlugin
public class PineTundraSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public PineTundraSpawnDefinition() {
        super(PlantType.TREE, PineGrowthDefinition.ID, AnotherWorldBiomes.TUNDRA.getId(), 0.45f, 0.6f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreBlocks:Snow"))));
    }
}
