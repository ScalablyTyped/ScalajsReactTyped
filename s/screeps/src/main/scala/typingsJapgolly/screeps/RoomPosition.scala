package typingsJapgolly.screeps

import typingsJapgolly.screeps.anon.Algorithm
import typingsJapgolly.screeps.anon.Filter
import typingsJapgolly.screeps.anon.LookAtResultLookConstant
import typingsJapgolly.screeps.anon.Pos
import typingsJapgolly.screeps.anon.`0`
import typingsJapgolly.screeps.anon.`1`
import typingsJapgolly.screeps.screepsStrings.constructionSite
import typingsJapgolly.screeps.screepsStrings.creep
import typingsJapgolly.screeps.screepsStrings.deposit
import typingsJapgolly.screeps.screepsStrings.energy
import typingsJapgolly.screeps.screepsStrings.exit
import typingsJapgolly.screeps.screepsStrings.flag
import typingsJapgolly.screeps.screepsStrings.mineral
import typingsJapgolly.screeps.screepsStrings.nuke
import typingsJapgolly.screeps.screepsStrings.powerCreep
import typingsJapgolly.screeps.screepsStrings.resource
import typingsJapgolly.screeps.screepsStrings.ruin
import typingsJapgolly.screeps.screepsStrings.source
import typingsJapgolly.screeps.screepsStrings.structure
import typingsJapgolly.screeps.screepsStrings.terrain
import typingsJapgolly.screeps.screepsStrings.tombstone
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the specified position in the room.
  *
  * Every object in the room contains RoomPosition as the pos property.
  *
  * The position object of a custom location can be obtained using the Room.getPositionAt() method or using the constructor.
  */
@js.native
trait RoomPosition extends StObject {
  
  /**
    * Create new ConstructionSite at the specified location.
    * @param structureType One of the following constants:
    *  * STRUCTURE_EXTENSION
    *  * STRUCTURE_RAMPART
    *  * STRUCTURE_ROAD
    *  * STRUCTURE_SPAWN
    *  * STRUCTURE_WALL
    *  * STRUCTURE_LINK
    */
  def createConstructionSite(structureType: BuildableStructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param structureType One of the following constants:
    *  * STRUCTURE_EXTENSION
    *  * STRUCTURE_RAMPART
    *  * STRUCTURE_ROAD
    *  * STRUCTURE_SPAWN
    *  * STRUCTURE_WALL
    *  * STRUCTURE_LINK
    * @param name The name of the structure, for structures that support it (currently only spawns).
    */
  def createConstructionSite(structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(structureType: STRUCTURE_SPAWN, name: String): ScreepsReturnCode = js.native
  
  /**
    * Create new Flag at the specified location.
    * @param name The name of a new flag.
    * It should be unique, i.e. the Game.flags object should not contain another flag with the same name (hash key).
    * If not defined, a random name will be generated.
    * @param color The color of a new flag. Should be one of the COLOR_* constants
    * @param secondaryColor The secondary color of a new flag. Should be one of the COLOR_* constants. The default value is equal to color.
    * @returns The name of the flag if created, or one of the following error codes: ERR_NAME_EXISTS, ERR_INVALID_ARGS
    */
  def createFlag(): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: String, color: Unit, secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: String, color: ColorConstant, secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: Unit, color: Unit, secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: Unit, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(name: Unit, color: ColorConstant, secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  
  /**
    * Find the object with the shortest path from the given position. Uses A* search algorithm and Dijkstra's algorithm.
    * @param objects An array of RoomPositions or objects with a RoomPosition
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    * @returns One of the supplied objects
    */
  def findClosestByPath[T /* <: HasRoomPosition | RoomPosition */](objects: js.Array[T]): T | Null = js.native
  def findClosestByPath[T /* <: HasRoomPosition | RoomPosition */](objects: js.Array[T], opts: FindPathOpts & Filter[T]): T | Null = js.native
  def findClosestByPath[S /* <: AnyStructure */](`type`: FIND_HOSTILE_STRUCTURES): S | Null = js.native
  def findClosestByPath[S /* <: AnyStructure */](
    `type`: FIND_HOSTILE_STRUCTURES,
    opts: FindPathOpts & (Partial[FilterOptions[FIND_STRUCTURES, S]]) & Algorithm
  ): S | Null = js.native
  def findClosestByPath[S /* <: AnyStructure */](`type`: FIND_MY_STRUCTURES): S | Null = js.native
  def findClosestByPath[S /* <: AnyStructure */](
    `type`: FIND_MY_STRUCTURES,
    opts: FindPathOpts & (Partial[FilterOptions[FIND_STRUCTURES, S]]) & Algorithm
  ): S | Null = js.native
  def findClosestByPath[S /* <: AnyStructure */](`type`: FIND_STRUCTURES): S | Null = js.native
  def findClosestByPath[S /* <: AnyStructure */](
    `type`: FIND_STRUCTURES,
    opts: FindPathOpts & (Partial[FilterOptions[FIND_STRUCTURES, S]]) & Algorithm
  ): S | Null = js.native
  /**
    * Find the object with the shortest path from the given position. Uses A* search algorithm and Dijkstra's algorithm.
    * @param type Any of the FIND_* constants.
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    * @returns An instance of a RoomObject.
    */
  def findClosestByPath[K /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any */](`type`: K): S | Null = js.native
  def findClosestByPath[K /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any */](`type`: K, opts: FindPathOpts & (Partial[FilterOptions[K, S]]) & Algorithm): S | Null = js.native
  
  /**
    * Find the object with the shortest linear distance from the given position.
    * @param objects An array of RoomPositions or objects with a RoomPosition.
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    */
  def findClosestByRange[T /* <: HasRoomPosition | RoomPosition */](objects: js.Array[T]): T | Null = js.native
  def findClosestByRange[T /* <: HasRoomPosition | RoomPosition */](objects: js.Array[T], opts: `0`): T | Null = js.native
  def findClosestByRange[S /* <: AnyStructure */](`type`: FIND_HOSTILE_STRUCTURES): S | Null = js.native
  def findClosestByRange[S /* <: AnyStructure */](`type`: FIND_HOSTILE_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES, S]): S | Null = js.native
  def findClosestByRange[S /* <: AnyStructure */](`type`: FIND_MY_STRUCTURES): S | Null = js.native
  def findClosestByRange[S /* <: AnyStructure */](`type`: FIND_MY_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES, S]): S | Null = js.native
  def findClosestByRange[S /* <: AnyStructure */](`type`: FIND_STRUCTURES): S | Null = js.native
  def findClosestByRange[S /* <: AnyStructure */](`type`: FIND_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES, S]): S | Null = js.native
  /**
    * Find the object with the shortest linear distance from the given position.
    * @param type Any of the FIND_* constants.
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    */
  def findClosestByRange[K /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any */](`type`: K): S | Null = js.native
  def findClosestByRange[K /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any */](`type`: K, opts: FilterOptions[K, S]): S | Null = js.native
  
  /**
    * Find all objects in the specified linear range.
    * @param objects An array of room's objects or RoomPosition objects that the search should be executed against.
    * @param range The range distance.
    * @param opts See Room.find.
    */
  def findInRange[T /* <: HasRoomPosition | RoomPosition */](objects: js.Array[T], range: Double): js.Array[T] = js.native
  def findInRange[T /* <: HasRoomPosition | RoomPosition */](objects: js.Array[T], range: Double, opts: `1`): js.Array[T] = js.native
  def findInRange[S /* <: AnyStructure */](`type`: FIND_HOSTILE_STRUCTURES, range: Double): js.Array[S] = js.native
  def findInRange[S /* <: AnyStructure */](`type`: FIND_HOSTILE_STRUCTURES, range: Double, opts: FilterOptions[FIND_STRUCTURES, S]): js.Array[S] = js.native
  def findInRange[S /* <: AnyStructure */](`type`: FIND_MY_STRUCTURES, range: Double): js.Array[S] = js.native
  def findInRange[S /* <: AnyStructure */](`type`: FIND_MY_STRUCTURES, range: Double, opts: FilterOptions[FIND_STRUCTURES, S]): js.Array[S] = js.native
  def findInRange[S /* <: AnyStructure */](`type`: FIND_STRUCTURES, range: Double): js.Array[S] = js.native
  def findInRange[S /* <: AnyStructure */](`type`: FIND_STRUCTURES, range: Double, opts: FilterOptions[FIND_STRUCTURES, S]): js.Array[S] = js.native
  /**
    * Find all objects in the specified linear range.
    * @param type Any of the FIND_* constants.
    * @param range The range distance.
    * @param opts See Room.find.
    */
  def findInRange[K /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any */](`type`: K, range: Double): js.Array[S] = js.native
  def findInRange[K /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any */](`type`: K, range: Double, opts: FilterOptions[K, S]): js.Array[S] = js.native
  
  def findPathTo(target: HasRoomPosition): js.Array[PathStep] = js.native
  def findPathTo(target: HasRoomPosition, opts: FindPathOpts): js.Array[PathStep] = js.native
  /**
    * Find an optimal path to the specified position using A* search algorithm.
    *
    * This method is a shorthand for Room.findPath. If the target is in another room, then the corresponding exit will be used as a target.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @param opts An object containing pathfinding options flags (see Room.findPath for more details).
    */
  def findPathTo(target: RoomPosition): js.Array[PathStep] = js.native
  def findPathTo(target: RoomPosition, opts: FindPathOpts): js.Array[PathStep] = js.native
  /**
    * Find an optimal path to the specified position using A* search algorithm.
    *
    * This method is a shorthand for Room.findPath. If the target is in another room, then the corresponding exit will be used as a target.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param opts An object containing pathfinding options flags (see Room.findPath for more details).
    */
  def findPathTo(x: Double, y: Double): js.Array[PathStep] = js.native
  def findPathTo(x: Double, y: Double, opts: FindPathOpts): js.Array[PathStep] = js.native
  
  def getDirectionTo(target: HasRoomPosition): DirectionConstant = js.native
  /**
    * Get linear direction to the specified position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def getDirectionTo(target: RoomPosition): DirectionConstant = js.native
  /**
    * Get linear direction to the specified position.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def getDirectionTo(x: Double, y: Double): DirectionConstant = js.native
  
  /**
    * Get linear range to the specified position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def getRangeTo(target: RoomPosition): Double = js.native
  def getRangeTo(target: Pos): Double = js.native
  /**
    * Get linear range to the specified position.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def getRangeTo(x: Double, y: Double): Double = js.native
  
  /**
    * Check whether this position is in the given range of another position.
    * @param toPos The target position.
    * @param range The range distance.
    */
  def inRangeTo(target: RoomPosition, range: Double): Boolean = js.native
  def inRangeTo(target: Pos, range: Double): Boolean = js.native
  /**
    * Check whether this position is in the given range of another position.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param range The range distance.
    */
  def inRangeTo(x: Double, y: Double, range: Double): Boolean = js.native
  
  /**
    * Check whether this position is the same as the specified position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def isEqualTo(target: RoomPosition): Boolean = js.native
  def isEqualTo(target: Pos): Boolean = js.native
  /**
    * Check whether this position is the same as the specified position.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def isEqualTo(x: Double, y: Double): Boolean = js.native
  
  /**
    * Check whether this position is on the adjacent square to the specified position. The same as inRangeTo(target, 1).
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def isNearTo(target: RoomPosition): Boolean = js.native
  def isNearTo(target: Pos): Boolean = js.native
  /**
    * Check whether this position is on the adjacent square to the specified position. The same as inRangeTo(target, 1).
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def isNearTo(x: Double, y: Double): Boolean = js.native
  
  /**
    * Get the list of objects at the specified room position.
    */
  def look(): js.Array[LookAtResultLookConstant] = js.native
  
  /**
    * Get an object with the given type at the specified room position.
    * @param type One of the following string constants: constructionSite, creep, exit, flag, resource, source, structure, terrain
    */
  @JSName("lookFor")
  def lookFor_constructionSite(`type`: constructionSite): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  @JSName("lookFor")
  def lookFor_creep(`type`: creep): js.Array[Creep] = js.native
  @JSName("lookFor")
  def lookFor_deposit(`type`: deposit): js.Array[Deposit] = js.native
  @JSName("lookFor")
  def lookFor_energy(`type`: energy): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookFor")
  def lookFor_exit(`type`: exit): js.Array[Any] = js.native
  @JSName("lookFor")
  def lookFor_flag(`type`: flag): js.Array[Flag] = js.native
  @JSName("lookFor")
  def lookFor_mineral(`type`: mineral): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookFor")
  def lookFor_nuke(`type`: nuke): js.Array[Nuke] = js.native
  @JSName("lookFor")
  def lookFor_powerCreep(`type`: powerCreep): js.Array[PowerCreep] = js.native
  @JSName("lookFor")
  def lookFor_resource(`type`: resource): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookFor")
  def lookFor_ruin(`type`: ruin): js.Array[Ruin] = js.native
  @JSName("lookFor")
  def lookFor_source(`type`: source): js.Array[Source] = js.native
  @JSName("lookFor")
  def lookFor_structure(`type`: structure): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookFor")
  def lookFor_terrain(`type`: terrain): js.Array[Terrain] = js.native
  @JSName("lookFor")
  def lookFor_tombstone(`type`: tombstone): js.Array[Tombstone] = js.native
  
  /**
    * The name of the room.
    */
  var roomName: String = js.native
  
  /**
    * X position in the room.
    */
  var x: Double = js.native
  
  /**
    * Y position in the room.
    */
  var y: Double = js.native
}
