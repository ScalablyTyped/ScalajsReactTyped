package typingsJapgolly.screepsArena.gamePrototypesMod

import typingsJapgolly.screepsArena.gameConstantsMod.ResourceConstant
import typingsJapgolly.screepsArena.gamePrototypesMod.^
import typingsJapgolly.screepsArena.screepsArenaStrings.`extension`
import typingsJapgolly.screepsArena.screepsArenaStrings.constructedWall
import typingsJapgolly.screepsArena.screepsArenaStrings.container
import typingsJapgolly.screepsArena.screepsArenaStrings.rampart
import typingsJapgolly.screepsArena.screepsArenaStrings.road
import typingsJapgolly.screepsArena.screepsArenaStrings.spawn
import typingsJapgolly.screepsArena.screepsArenaStrings.tower
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def StructureRampart: StructureRampartConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureRampart").asInstanceOf[StructureRampartConstructor]
type StructureRampart = OwnedStructure[STRUCTURE_RAMPART]

inline def StructureRoad: StructureRoadConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureRoad").asInstanceOf[StructureRoadConstructor]
type StructureRoad = Structure[STRUCTURE_ROAD]

inline def StructureWall: StructureWallConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureWall").asInstanceOf[StructureWallConstructor]
type StructureWall = Structure[STRUCTURE_WALL]

type STRUCTURE_CONTAINER = container

type STRUCTURE_EXTENSION = `extension`

type STRUCTURE_RAMPART = rampart

type STRUCTURE_ROAD = road

type STRUCTURE_SPAWN = spawn

type STRUCTURE_TOWER = tower

type STRUCTURE_WALL = constructedWall

type Store[POSSIBLE_RESOURCES /* <: ResourceConstant */] = StoreBase[POSSIBLE_RESOURCES] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in POSSIBLE_RESOURCES ]: number} */ js.Any)

type StructureConstant = STRUCTURE_TOWER | STRUCTURE_EXTENSION | STRUCTURE_WALL | STRUCTURE_CONTAINER | STRUCTURE_RAMPART | STRUCTURE_SPAWN | STRUCTURE_ROAD
