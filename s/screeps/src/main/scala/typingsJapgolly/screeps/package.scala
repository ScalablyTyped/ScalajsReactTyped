package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object screeps {
  type ATTACK = typingsJapgolly.screeps.screepsStrings.attack
  type BOTTOM = typingsJapgolly.screeps.screepsNumbers.`5`
  type BOTTOM_LEFT = typingsJapgolly.screeps.screepsNumbers.`6`
  type BOTTOM_RIGHT = typingsJapgolly.screeps.screepsNumbers.`4`
  // Body Part Constants
  type BodyPartConstant = typingsJapgolly.screeps.MOVE | typingsJapgolly.screeps.WORK | typingsJapgolly.screeps.CARRY | typingsJapgolly.screeps.ATTACK | typingsJapgolly.screeps.RANGED_ATTACK | typingsJapgolly.screeps.TOUGH | typingsJapgolly.screeps.HEAL | typingsJapgolly.screeps.CLAIM
  // Structure Constants
  type BuildableStructureConstant = typingsJapgolly.screeps.STRUCTURE_EXTENSION | typingsJapgolly.screeps.STRUCTURE_RAMPART | typingsJapgolly.screeps.STRUCTURE_ROAD | typingsJapgolly.screeps.STRUCTURE_SPAWN | typingsJapgolly.screeps.STRUCTURE_LINK | typingsJapgolly.screeps.STRUCTURE_WALL | typingsJapgolly.screeps.STRUCTURE_STORAGE | typingsJapgolly.screeps.STRUCTURE_TOWER | typingsJapgolly.screeps.STRUCTURE_OBSERVER | typingsJapgolly.screeps.STRUCTURE_POWER_SPAWN | typingsJapgolly.screeps.STRUCTURE_EXTRACTOR | typingsJapgolly.screeps.STRUCTURE_LAB | typingsJapgolly.screeps.STRUCTURE_TERMINAL | typingsJapgolly.screeps.STRUCTURE_CONTAINER | typingsJapgolly.screeps.STRUCTURE_NUKER | typingsJapgolly.screeps.STRUCTURE_FACTORY
  type CARRY = typingsJapgolly.screeps.screepsStrings.carry
  type CLAIM = typingsJapgolly.screeps.screepsStrings.claim
  type COLOR_BLUE = typingsJapgolly.screeps.screepsNumbers.`3`
  type COLOR_BROWN = typingsJapgolly.screeps.screepsNumbers.`8`
  type COLOR_CYAN = typingsJapgolly.screeps.screepsNumbers.`4`
  type COLOR_GREEN = typingsJapgolly.screeps.screepsNumbers.`5`
  type COLOR_GREY = typingsJapgolly.screeps.screepsNumbers.`9`
  type COLOR_ORANGE = typingsJapgolly.screeps.screepsNumbers.`7`
  type COLOR_PURPLE = typingsJapgolly.screeps.screepsNumbers.`2`
  type COLOR_RED = typingsJapgolly.screeps.screepsNumbers.`1`
  type COLOR_WHITE = typingsJapgolly.screeps.screepsNumbers.`10`
  type COLOR_YELLOW = typingsJapgolly.screeps.screepsNumbers.`6`
  type CPUShardLimits = org.scalablytyped.runtime.StringDictionary[scala.Double]
  // Color Constants
  type ColorConstant = typingsJapgolly.screeps.COLOR_RED | typingsJapgolly.screeps.COLOR_PURPLE | typingsJapgolly.screeps.COLOR_BLUE | typingsJapgolly.screeps.COLOR_CYAN | typingsJapgolly.screeps.COLOR_GREEN | typingsJapgolly.screeps.COLOR_YELLOW | typingsJapgolly.screeps.COLOR_ORANGE | typingsJapgolly.screeps.COLOR_BROWN | typingsJapgolly.screeps.COLOR_GREY | typingsJapgolly.screeps.COLOR_WHITE
  /** The commodities, produced by the Factory */
  type CommodityConstant = typingsJapgolly.screeps.RESOURCE_UTRIUM_BAR | typingsJapgolly.screeps.RESOURCE_LEMERGIUM_BAR | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM_BAR | typingsJapgolly.screeps.RESOURCE_KEANIUM_BAR | typingsJapgolly.screeps.RESOURCE_GHODIUM_MELT | typingsJapgolly.screeps.RESOURCE_OXIDANT | typingsJapgolly.screeps.RESOURCE_REDUCTANT | typingsJapgolly.screeps.RESOURCE_PURIFIER | typingsJapgolly.screeps.RESOURCE_BATTERY | typingsJapgolly.screeps.RESOURCE_COMPOSITE | typingsJapgolly.screeps.RESOURCE_CRYSTAL | typingsJapgolly.screeps.RESOURCE_LIQUID | typingsJapgolly.screeps.RESOURCE_WIRE | typingsJapgolly.screeps.RESOURCE_SWITCH | typingsJapgolly.screeps.RESOURCE_TRANSISTOR | typingsJapgolly.screeps.RESOURCE_MICROCHIP | typingsJapgolly.screeps.RESOURCE_CIRCUIT | typingsJapgolly.screeps.RESOURCE_DEVICE | typingsJapgolly.screeps.RESOURCE_CELL | typingsJapgolly.screeps.RESOURCE_PHLEGM | typingsJapgolly.screeps.RESOURCE_TISSUE | typingsJapgolly.screeps.RESOURCE_MUSCLE | typingsJapgolly.screeps.RESOURCE_ORGANOID | typingsJapgolly.screeps.RESOURCE_ORGANISM | typingsJapgolly.screeps.RESOURCE_ALLOY | typingsJapgolly.screeps.RESOURCE_TUBE | typingsJapgolly.screeps.RESOURCE_FIXTURES | typingsJapgolly.screeps.RESOURCE_FRAME | typingsJapgolly.screeps.RESOURCE_HYDRAULICS | typingsJapgolly.screeps.RESOURCE_MACHINE | typingsJapgolly.screeps.RESOURCE_CONDENSATE | typingsJapgolly.screeps.RESOURCE_CONCENTRATE | typingsJapgolly.screeps.RESOURCE_EXTRACT | typingsJapgolly.screeps.RESOURCE_SPIRIT | typingsJapgolly.screeps.RESOURCE_EMANATION | typingsJapgolly.screeps.RESOURCE_ESSENCE
  type CreepActionReturnCode = typingsJapgolly.screeps.OK | typingsJapgolly.screeps.ERR_NOT_OWNER | typingsJapgolly.screeps.ERR_BUSY | typingsJapgolly.screeps.ERR_INVALID_TARGET | typingsJapgolly.screeps.ERR_NOT_IN_RANGE | typingsJapgolly.screeps.ERR_NO_BODYPART | typingsJapgolly.screeps.ERR_TIRED
  type CreepMoveReturnCode = typingsJapgolly.screeps.OK | typingsJapgolly.screeps.ERR_NOT_OWNER | typingsJapgolly.screeps.ERR_BUSY | typingsJapgolly.screeps.ERR_TIRED | typingsJapgolly.screeps.ERR_NO_BODYPART
  /** The raw deposits */
  type DepositConstant = typingsJapgolly.screeps.RESOURCE_MIST | typingsJapgolly.screeps.RESOURCE_BIOMASS | typingsJapgolly.screeps.RESOURCE_METAL | typingsJapgolly.screeps.RESOURCE_SILICON
  // Direction Constants
  type DirectionConstant = typingsJapgolly.screeps.TOP | typingsJapgolly.screeps.TOP_RIGHT | typingsJapgolly.screeps.RIGHT | typingsJapgolly.screeps.BOTTOM_RIGHT | typingsJapgolly.screeps.BOTTOM | typingsJapgolly.screeps.BOTTOM_LEFT | typingsJapgolly.screeps.LEFT | typingsJapgolly.screeps.TOP_LEFT
  type EFFECT_COLLAPSE_TIMER = typingsJapgolly.screeps.screepsNumbers.`1002`
  type EFFECT_INVULNERABILITY = typingsJapgolly.screeps.screepsNumbers.`1001`
  type ERR_BUSY = typingsJapgolly.screeps.screepsNumbers.`-4`
  type ERR_FULL = typingsJapgolly.screeps.screepsNumbers.`-8`
  type ERR_GCL_NOT_ENOUGH = typingsJapgolly.screeps.screepsNumbers.`-15`
  type ERR_INVALID_ARGS = typingsJapgolly.screeps.screepsNumbers.`-10`
  type ERR_INVALID_TARGET = typingsJapgolly.screeps.screepsNumbers.`-7`
  type ERR_NAME_EXISTS = typingsJapgolly.screeps.screepsNumbers.`-3`
  type ERR_NOT_ENOUGH_ENERGY = typingsJapgolly.screeps.screepsNumbers.`-6`
  type ERR_NOT_ENOUGH_EXTENSIONS = typingsJapgolly.screeps.screepsNumbers.`-6`
  type ERR_NOT_ENOUGH_RESOURCES = typingsJapgolly.screeps.screepsNumbers.`-6`
  type ERR_NOT_FOUND = typingsJapgolly.screeps.screepsNumbers.`-5`
  type ERR_NOT_IN_RANGE = typingsJapgolly.screeps.screepsNumbers.`-9`
  type ERR_NOT_OWNER = typingsJapgolly.screeps.screepsNumbers.`-1`
  type ERR_NO_BODYPART = typingsJapgolly.screeps.screepsNumbers.`-12`
  type ERR_NO_PATH = typingsJapgolly.screeps.screepsNumbers.`-2`
  type ERR_RCL_NOT_ENOUGH = typingsJapgolly.screeps.screepsNumbers.`-14`
  type ERR_TIRED = typingsJapgolly.screeps.screepsNumbers.`-11`
  type EVENT_ATTACK = typingsJapgolly.screeps.screepsNumbers.`1`
  type EVENT_ATTACK_CONTROLLER = typingsJapgolly.screeps.screepsNumbers.`3`
  type EVENT_ATTACK_TYPE_DISMANTLE = typingsJapgolly.screeps.screepsNumbers.`4`
  type EVENT_ATTACK_TYPE_HIT_BACK = typingsJapgolly.screeps.screepsNumbers.`5`
  type EVENT_ATTACK_TYPE_MELEE = typingsJapgolly.screeps.screepsNumbers.`1`
  type EVENT_ATTACK_TYPE_NUKE = typingsJapgolly.screeps.screepsNumbers.`6`
  type EVENT_ATTACK_TYPE_RANGED = typingsJapgolly.screeps.screepsNumbers.`2`
  type EVENT_ATTACK_TYPE_RANGED_MASS = typingsJapgolly.screeps.screepsNumbers.`3`
  type EVENT_BUILD = typingsJapgolly.screeps.screepsNumbers.`4`
  type EVENT_EXIT = typingsJapgolly.screeps.screepsNumbers.`10`
  type EVENT_HARVEST = typingsJapgolly.screeps.screepsNumbers.`5`
  type EVENT_HEAL = typingsJapgolly.screeps.screepsNumbers.`6`
  type EVENT_HEAL_TYPE_MELEE = typingsJapgolly.screeps.screepsNumbers.`1`
  type EVENT_HEAL_TYPE_RANGED = typingsJapgolly.screeps.screepsNumbers.`2`
  type EVENT_OBJECT_DESTROYED = typingsJapgolly.screeps.screepsNumbers.`2`
  type EVENT_POWER = typingsJapgolly.screeps.screepsNumbers.`11`
  type EVENT_REPAIR = typingsJapgolly.screeps.screepsNumbers.`7`
  type EVENT_RESERVE_CONTROLLER = typingsJapgolly.screeps.screepsNumbers.`8`
  type EVENT_TRANSFER = typingsJapgolly.screeps.screepsNumbers.`12`
  type EVENT_UPGRADE_CONTROLLER = typingsJapgolly.screeps.screepsNumbers.`9`
  type EffectConstant = typingsJapgolly.screeps.EFFECT_INVULNERABILITY | typingsJapgolly.screeps.EFFECT_COLLAPSE_TIMER
  type EventAttackType = typingsJapgolly.screeps.EVENT_ATTACK_TYPE_MELEE | typingsJapgolly.screeps.EVENT_ATTACK_TYPE_RANGED | typingsJapgolly.screeps.EVENT_ATTACK_TYPE_RANGED_MASS | typingsJapgolly.screeps.EVENT_ATTACK_TYPE_DISMANTLE | typingsJapgolly.screeps.EVENT_ATTACK_TYPE_HIT_BACK | typingsJapgolly.screeps.EVENT_ATTACK_TYPE_NUKE
  type EventConstant = typingsJapgolly.screeps.EVENT_ATTACK | typingsJapgolly.screeps.EVENT_OBJECT_DESTROYED | typingsJapgolly.screeps.EVENT_ATTACK_CONTROLLER | typingsJapgolly.screeps.EVENT_BUILD | typingsJapgolly.screeps.EVENT_HARVEST | typingsJapgolly.screeps.EVENT_HEAL | typingsJapgolly.screeps.EVENT_REPAIR | typingsJapgolly.screeps.EVENT_RESERVE_CONTROLLER | typingsJapgolly.screeps.EVENT_UPGRADE_CONTROLLER | typingsJapgolly.screeps.EVENT_EXIT | typingsJapgolly.screeps.EVENT_POWER | typingsJapgolly.screeps.EVENT_TRANSFER
  type EventDestroyType = typingsJapgolly.screeps.screepsStrings.creep | typingsJapgolly.screeps.StructureConstant
  type EventHealType = typingsJapgolly.screeps.EVENT_HEAL_TYPE_MELEE | typingsJapgolly.screeps.EVENT_HEAL_TYPE_RANGED
  // Find Constants
  type ExitConstant = typingsJapgolly.screeps.FIND_EXIT_TOP | typingsJapgolly.screeps.FIND_EXIT_RIGHT | typingsJapgolly.screeps.FIND_EXIT_BOTTOM | typingsJapgolly.screeps.FIND_EXIT_LEFT
  type FIND_CONSTRUCTION_SITES = typingsJapgolly.screeps.screepsNumbers.`111`
  type FIND_CREEPS = typingsJapgolly.screeps.screepsNumbers.`101`
  type FIND_DEPOSITS = typingsJapgolly.screeps.screepsNumbers.`122`
  type FIND_DROPPED_RESOURCES = typingsJapgolly.screeps.screepsNumbers.`106`
  type FIND_EXIT = typingsJapgolly.screeps.screepsNumbers.`10`
  type FIND_EXIT_BOTTOM = typingsJapgolly.screeps.screepsNumbers.`5`
  type FIND_EXIT_LEFT = typingsJapgolly.screeps.screepsNumbers.`7`
  type FIND_EXIT_RIGHT = typingsJapgolly.screeps.screepsNumbers.`3`
  type FIND_EXIT_TOP = typingsJapgolly.screeps.screepsNumbers.`1`
  type FIND_FLAGS = typingsJapgolly.screeps.screepsNumbers.`110`
  type FIND_HOSTILE_CONSTRUCTION_SITES = typingsJapgolly.screeps.screepsNumbers.`115`
  type FIND_HOSTILE_CREEPS = typingsJapgolly.screeps.screepsNumbers.`103`
  type FIND_HOSTILE_POWER_CREEPS = typingsJapgolly.screeps.screepsNumbers.`121`
  type FIND_HOSTILE_SPAWNS = typingsJapgolly.screeps.screepsNumbers.`113`
  type FIND_HOSTILE_STRUCTURES = typingsJapgolly.screeps.screepsNumbers.`109`
  type FIND_MINERALS = typingsJapgolly.screeps.screepsNumbers.`116`
  type FIND_MY_CONSTRUCTION_SITES = typingsJapgolly.screeps.screepsNumbers.`114`
  type FIND_MY_CREEPS = typingsJapgolly.screeps.screepsNumbers.`102`
  type FIND_MY_POWER_CREEPS = typingsJapgolly.screeps.screepsNumbers.`120`
  type FIND_MY_SPAWNS = typingsJapgolly.screeps.screepsNumbers.`112`
  type FIND_MY_STRUCTURES = typingsJapgolly.screeps.screepsNumbers.`108`
  type FIND_NUKES = typingsJapgolly.screeps.screepsNumbers.`117`
  type FIND_POWER_CREEPS = typingsJapgolly.screeps.screepsNumbers.`119`
  type FIND_RUINS = typingsJapgolly.screeps.screepsNumbers.`123`
  type FIND_SOURCES = typingsJapgolly.screeps.screepsNumbers.`105`
  type FIND_SOURCES_ACTIVE = typingsJapgolly.screeps.screepsNumbers.`104`
  type FIND_STRUCTURES = typingsJapgolly.screeps.screepsNumbers.`107`
  type FIND_TOMBSTONES = typingsJapgolly.screeps.screepsNumbers.`118`
  type FilterFunction[T /* <: typingsJapgolly.screeps.FindConstant */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any, 
    scala.Boolean
  ]
  type FilterObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type FindConstant = typingsJapgolly.screeps.FIND_EXIT_TOP | typingsJapgolly.screeps.FIND_EXIT_RIGHT | typingsJapgolly.screeps.FIND_EXIT_BOTTOM | typingsJapgolly.screeps.FIND_EXIT_LEFT | typingsJapgolly.screeps.FIND_EXIT | typingsJapgolly.screeps.FIND_CREEPS | typingsJapgolly.screeps.FIND_MY_CREEPS | typingsJapgolly.screeps.FIND_HOSTILE_CREEPS | typingsJapgolly.screeps.FIND_SOURCES_ACTIVE | typingsJapgolly.screeps.FIND_SOURCES | typingsJapgolly.screeps.FIND_DROPPED_RESOURCES | typingsJapgolly.screeps.FIND_STRUCTURES | typingsJapgolly.screeps.FIND_MY_STRUCTURES | typingsJapgolly.screeps.FIND_HOSTILE_STRUCTURES | typingsJapgolly.screeps.FIND_FLAGS | typingsJapgolly.screeps.FIND_CONSTRUCTION_SITES | typingsJapgolly.screeps.FIND_MY_SPAWNS | typingsJapgolly.screeps.FIND_HOSTILE_SPAWNS | typingsJapgolly.screeps.FIND_MY_CONSTRUCTION_SITES | typingsJapgolly.screeps.FIND_HOSTILE_CONSTRUCTION_SITES | typingsJapgolly.screeps.FIND_MINERALS | typingsJapgolly.screeps.FIND_NUKES | typingsJapgolly.screeps.FIND_TOMBSTONES | typingsJapgolly.screeps.FIND_POWER_CREEPS | typingsJapgolly.screeps.FIND_MY_POWER_CREEPS | typingsJapgolly.screeps.FIND_HOSTILE_POWER_CREEPS | typingsJapgolly.screeps.FIND_DEPOSITS | typingsJapgolly.screeps.FIND_RUINS
  type HEAL = typingsJapgolly.screeps.screepsStrings.heal
  type Id[T] = java.lang.String with typingsJapgolly.screeps.Tag.OpaqueTag[T]
  type LEFT = typingsJapgolly.screeps.screepsNumbers.`7`
  type LOOK_CONSTRUCTION_SITES = typingsJapgolly.screeps.screepsStrings.constructionSite
  type LOOK_CREEPS = typingsJapgolly.screeps.screepsStrings.creep
  type LOOK_DEPOSITS = typingsJapgolly.screeps.screepsStrings.deposit
  type LOOK_ENERGY = typingsJapgolly.screeps.screepsStrings.energy
  type LOOK_FLAGS = typingsJapgolly.screeps.screepsStrings.flag
  type LOOK_MINERALS = typingsJapgolly.screeps.screepsStrings.mineral
  type LOOK_NUKES = typingsJapgolly.screeps.screepsStrings.nuke
  type LOOK_POWER_CREEPS = typingsJapgolly.screeps.screepsStrings.powerCreep
  type LOOK_RESOURCES = typingsJapgolly.screeps.screepsStrings.resource
  type LOOK_RUINS = typingsJapgolly.screeps.screepsStrings.ruin
  type LOOK_SOURCES = typingsJapgolly.screeps.screepsStrings.source
  type LOOK_STRUCTURES = typingsJapgolly.screeps.screepsStrings.structure
  type LOOK_TERRAIN = typingsJapgolly.screeps.screepsStrings.terrain
  type LOOK_TOMBSTONES = typingsJapgolly.screeps.screepsStrings.tombstone
  type LookAtResult[K /* <: typingsJapgolly.screeps.LookConstant */] = (typingsJapgolly.std.Pick[typingsJapgolly.screeps.LookAtTypes, K]) with typingsJapgolly.screeps.AnonType[K]
  type LookAtResultMatrix[K /* <: typingsJapgolly.screeps.LookConstant */] = org.scalablytyped.runtime.NumberDictionary[
    org.scalablytyped.runtime.NumberDictionary[js.Array[typingsJapgolly.screeps.LookAtResult[K]]]
  ]
  type LookAtResultWithPos[K /* <: typingsJapgolly.screeps.LookConstant */] = typingsJapgolly.screeps.LookAtResult[K] with typingsJapgolly.screeps.AnonY
  // Look Constants
  type LookConstant = typingsJapgolly.screeps.LOOK_CREEPS | typingsJapgolly.screeps.LOOK_ENERGY | typingsJapgolly.screeps.LOOK_RESOURCES | typingsJapgolly.screeps.LOOK_SOURCES | typingsJapgolly.screeps.LOOK_MINERALS | typingsJapgolly.screeps.LOOK_DEPOSITS | typingsJapgolly.screeps.LOOK_STRUCTURES | typingsJapgolly.screeps.LOOK_FLAGS | typingsJapgolly.screeps.LOOK_CONSTRUCTION_SITES | typingsJapgolly.screeps.LOOK_NUKES | typingsJapgolly.screeps.LOOK_TERRAIN | typingsJapgolly.screeps.LOOK_TOMBSTONES | typingsJapgolly.screeps.LOOK_POWER_CREEPS | typingsJapgolly.screeps.LOOK_RUINS
  type LookForAtAreaResultArray[T, K /* <: typingsJapgolly.screeps.screepsStrings.exit | typingsJapgolly.screeps.screepsStrings.structure | typingsJapgolly.screeps.screepsStrings.source | typingsJapgolly.screeps.screepsStrings.nuke | typingsJapgolly.screeps.screepsStrings.deposit | typingsJapgolly.screeps.screepsStrings.powerCreep | typingsJapgolly.screeps.screepsStrings.terrain | typingsJapgolly.screeps.screepsStrings.tombstone | typingsJapgolly.screeps.screepsStrings.resource | typingsJapgolly.screeps.screepsStrings.flag | typingsJapgolly.screeps.screepsStrings.mineral | typingsJapgolly.screeps.screepsStrings.ruin | typingsJapgolly.screeps.screepsStrings.constructionSite | typingsJapgolly.screeps.screepsStrings.creep | typingsJapgolly.screeps.screepsStrings.energy */] = js.Array[typingsJapgolly.screeps.LookForAtAreaResultWithPos[T, K]]
  type LookForAtAreaResultMatrix[T, K /* <: typingsJapgolly.screeps.screepsStrings.exit | typingsJapgolly.screeps.screepsStrings.structure | typingsJapgolly.screeps.screepsStrings.source | typingsJapgolly.screeps.screepsStrings.nuke | typingsJapgolly.screeps.screepsStrings.deposit | typingsJapgolly.screeps.screepsStrings.powerCreep | typingsJapgolly.screeps.screepsStrings.terrain | typingsJapgolly.screeps.screepsStrings.tombstone | typingsJapgolly.screeps.screepsStrings.resource | typingsJapgolly.screeps.screepsStrings.flag | typingsJapgolly.screeps.screepsStrings.mineral | typingsJapgolly.screeps.screepsStrings.ruin | typingsJapgolly.screeps.screepsStrings.constructionSite | typingsJapgolly.screeps.screepsStrings.creep | typingsJapgolly.screeps.screepsStrings.energy */] = org.scalablytyped.runtime.NumberDictionary[
    org.scalablytyped.runtime.NumberDictionary[js.Array[typingsJapgolly.screeps.LookForAtAreaResult[T, K]]]
  ]
  type LookForAtAreaResultWithPos[T, K /* <: typingsJapgolly.screeps.screepsStrings.exit | typingsJapgolly.screeps.screepsStrings.structure | typingsJapgolly.screeps.screepsStrings.source | typingsJapgolly.screeps.screepsStrings.nuke | typingsJapgolly.screeps.screepsStrings.deposit | typingsJapgolly.screeps.screepsStrings.powerCreep | typingsJapgolly.screeps.screepsStrings.terrain | typingsJapgolly.screeps.screepsStrings.tombstone | typingsJapgolly.screeps.screepsStrings.resource | typingsJapgolly.screeps.screepsStrings.flag | typingsJapgolly.screeps.screepsStrings.mineral | typingsJapgolly.screeps.screepsStrings.ruin | typingsJapgolly.screeps.screepsStrings.constructionSite | typingsJapgolly.screeps.screepsStrings.creep | typingsJapgolly.screeps.screepsStrings.energy */] = (typingsJapgolly.screeps.LookForAtAreaResult[T, K]) with typingsJapgolly.screeps.AnonY
  type MOVE = typingsJapgolly.screeps.screepsStrings.move
  type MarketResourceConstant = typingsJapgolly.screeps.ResourceConstant | typingsJapgolly.screeps.SUBSCRIPTION_TOKEN
  /** The compounds which can't boost */
  type MineralBaseCompoundsConstant = typingsJapgolly.screeps.RESOURCE_HYDROXIDE | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM_KEANITE | typingsJapgolly.screeps.RESOURCE_UTRIUM_LEMERGITE | typingsJapgolly.screeps.RESOURCE_GHODIUM
  /** The boosts (from tier 1 to tier 3) */
  type MineralBoostConstant = typingsJapgolly.screeps.RESOURCE_UTRIUM_HYDRIDE | typingsJapgolly.screeps.RESOURCE_UTRIUM_OXIDE | typingsJapgolly.screeps.RESOURCE_KEANIUM_HYDRIDE | typingsJapgolly.screeps.RESOURCE_KEANIUM_OXIDE | typingsJapgolly.screeps.RESOURCE_LEMERGIUM_HYDRIDE | typingsJapgolly.screeps.RESOURCE_LEMERGIUM_OXIDE | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM_HYDRIDE | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM_OXIDE | typingsJapgolly.screeps.RESOURCE_GHODIUM_HYDRIDE | typingsJapgolly.screeps.RESOURCE_GHODIUM_OXIDE | typingsJapgolly.screeps.RESOURCE_UTRIUM_ACID | typingsJapgolly.screeps.RESOURCE_UTRIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_KEANIUM_ACID | typingsJapgolly.screeps.RESOURCE_KEANIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_LEMERGIUM_ACID | typingsJapgolly.screeps.RESOURCE_LEMERGIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM_ACID | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_GHODIUM_ACID | typingsJapgolly.screeps.RESOURCE_GHODIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_CATALYZED_UTRIUM_ACID | typingsJapgolly.screeps.RESOURCE_CATALYZED_UTRIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_CATALYZED_KEANIUM_ACID | typingsJapgolly.screeps.RESOURCE_CATALYZED_KEANIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_CATALYZED_LEMERGIUM_ACID | typingsJapgolly.screeps.RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_CATALYZED_ZYNTHIUM_ACID | typingsJapgolly.screeps.RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE | typingsJapgolly.screeps.RESOURCE_CATALYZED_GHODIUM_ACID | typingsJapgolly.screeps.RESOURCE_CATALYZED_GHODIUM_ALKALIDE
  /** All the mineral compounds */
  type MineralCompoundConstant = typingsJapgolly.screeps.MineralBaseCompoundsConstant | typingsJapgolly.screeps.MineralBoostConstant
  /** The raw harvestable minerals */
  type MineralConstant = typingsJapgolly.screeps.RESOURCE_UTRIUM | typingsJapgolly.screeps.RESOURCE_LEMERGIUM | typingsJapgolly.screeps.RESOURCE_KEANIUM | typingsJapgolly.screeps.RESOURCE_ZYNTHIUM | typingsJapgolly.screeps.RESOURCE_OXYGEN | typingsJapgolly.screeps.RESOURCE_HYDROGEN | typingsJapgolly.screeps.RESOURCE_CATALYST
  type OK = typingsJapgolly.screeps.screepsNumbers.`0`
  type ORDER_BUY = typingsJapgolly.screeps.screepsStrings.buy
  type ORDER_SELL = typingsJapgolly.screeps.screepsStrings.sell
  type PWR_DISRUPT_SOURCE = typingsJapgolly.screeps.screepsNumbers.`11`
  type PWR_DISRUPT_SPAWN = typingsJapgolly.screeps.screepsNumbers.`9`
  type PWR_DISRUPT_TERMINAL = typingsJapgolly.screeps.screepsNumbers.`15`
  type PWR_DISRUPT_TOWER = typingsJapgolly.screeps.screepsNumbers.`10`
  type PWR_FORTIFY = typingsJapgolly.screeps.screepsNumbers.`17`
  type PWR_GENERATE_OPS = typingsJapgolly.screeps.screepsNumbers.`1`
  type PWR_OPERATE_CONTROLLER = typingsJapgolly.screeps.screepsNumbers.`18`
  type PWR_OPERATE_EXTENSION = typingsJapgolly.screeps.screepsNumbers.`6`
  type PWR_OPERATE_FACTORY = typingsJapgolly.screeps.screepsNumbers.`19`
  type PWR_OPERATE_LAB = typingsJapgolly.screeps.screepsNumbers.`5`
  type PWR_OPERATE_OBSERVER = typingsJapgolly.screeps.screepsNumbers.`7`
  type PWR_OPERATE_POWER = typingsJapgolly.screeps.screepsNumbers.`16`
  type PWR_OPERATE_SPAWN = typingsJapgolly.screeps.screepsNumbers.`2`
  type PWR_OPERATE_STORAGE = typingsJapgolly.screeps.screepsNumbers.`4`
  type PWR_OPERATE_TERMINAL = typingsJapgolly.screeps.screepsNumbers.`8`
  type PWR_OPERATE_TOWER = typingsJapgolly.screeps.screepsNumbers.`3`
  type PWR_REGEN_MINERAL = typingsJapgolly.screeps.screepsNumbers.`14`
  type PWR_REGEN_SOURCE = typingsJapgolly.screeps.screepsNumbers.`13`
  type PWR_SHIELD = typingsJapgolly.screeps.screepsNumbers.`12`
  type PowerClassConstant = typingsJapgolly.screeps.screepsStrings.operator
  type PowerConstant = typingsJapgolly.screeps.PWR_GENERATE_OPS | typingsJapgolly.screeps.PWR_OPERATE_SPAWN | typingsJapgolly.screeps.PWR_OPERATE_TOWER | typingsJapgolly.screeps.PWR_OPERATE_STORAGE | typingsJapgolly.screeps.PWR_OPERATE_LAB | typingsJapgolly.screeps.PWR_OPERATE_EXTENSION | typingsJapgolly.screeps.PWR_OPERATE_OBSERVER | typingsJapgolly.screeps.PWR_OPERATE_TERMINAL | typingsJapgolly.screeps.PWR_DISRUPT_SPAWN | typingsJapgolly.screeps.PWR_DISRUPT_TOWER | typingsJapgolly.screeps.PWR_DISRUPT_SOURCE | typingsJapgolly.screeps.PWR_SHIELD | typingsJapgolly.screeps.PWR_REGEN_SOURCE | typingsJapgolly.screeps.PWR_REGEN_MINERAL | typingsJapgolly.screeps.PWR_DISRUPT_TERMINAL | typingsJapgolly.screeps.PWR_OPERATE_POWER | typingsJapgolly.screeps.PWR_FORTIFY | typingsJapgolly.screeps.PWR_OPERATE_CONTROLLER
  /**
    * Available powers, an object with power ID as a key, and the following properties
    */
  type PowerCreepPowers = org.scalablytyped.runtime.NumberDictionary[typingsJapgolly.screeps.AnonCooldownLevel]
  type RANGED_ATTACK = typingsJapgolly.screeps.screepsStrings.ranged_attack
  type RESOURCE_ALLOY = typingsJapgolly.screeps.screepsStrings.alloy
  type RESOURCE_BATTERY = typingsJapgolly.screeps.screepsStrings.battery
  type RESOURCE_BIOMASS = typingsJapgolly.screeps.screepsStrings.biomass
  type RESOURCE_CATALYST = typingsJapgolly.screeps.screepsStrings.X
  type RESOURCE_CATALYZED_GHODIUM_ACID = typingsJapgolly.screeps.screepsStrings.XGH2O
  type RESOURCE_CATALYZED_GHODIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.XGHO2
  type RESOURCE_CATALYZED_KEANIUM_ACID = typingsJapgolly.screeps.screepsStrings.XKH2O
  type RESOURCE_CATALYZED_KEANIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.XKHO2
  type RESOURCE_CATALYZED_LEMERGIUM_ACID = typingsJapgolly.screeps.screepsStrings.XLH2O
  type RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.XLHO2
  type RESOURCE_CATALYZED_UTRIUM_ACID = typingsJapgolly.screeps.screepsStrings.XUH2O
  type RESOURCE_CATALYZED_UTRIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.XUHO2
  type RESOURCE_CATALYZED_ZYNTHIUM_ACID = typingsJapgolly.screeps.screepsStrings.XZH2O
  type RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.XZHO2
  type RESOURCE_CELL = typingsJapgolly.screeps.screepsStrings.cell
  type RESOURCE_CIRCUIT = typingsJapgolly.screeps.screepsStrings.circuit
  type RESOURCE_COMPOSITE = typingsJapgolly.screeps.screepsStrings.composite
  type RESOURCE_CONCENTRATE = typingsJapgolly.screeps.screepsStrings.concentrate
  type RESOURCE_CONDENSATE = typingsJapgolly.screeps.screepsStrings.condensate
  type RESOURCE_CRYSTAL = typingsJapgolly.screeps.screepsStrings.crystal
  type RESOURCE_DEVICE = typingsJapgolly.screeps.screepsStrings.device
  type RESOURCE_EMANATION = typingsJapgolly.screeps.screepsStrings.emanation
  type RESOURCE_ENERGY = typingsJapgolly.screeps.screepsStrings.energy
  type RESOURCE_ESSENCE = typingsJapgolly.screeps.screepsStrings.essence
  type RESOURCE_EXTRACT = typingsJapgolly.screeps.screepsStrings.extract
  type RESOURCE_FIXTURES = typingsJapgolly.screeps.screepsStrings.fixtures
  type RESOURCE_FRAME = typingsJapgolly.screeps.screepsStrings.frame
  type RESOURCE_GHODIUM = typingsJapgolly.screeps.screepsStrings.G
  type RESOURCE_GHODIUM_ACID = typingsJapgolly.screeps.screepsStrings.GH2O
  type RESOURCE_GHODIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.GHO2
  type RESOURCE_GHODIUM_HYDRIDE = typingsJapgolly.screeps.screepsStrings.GH
  type RESOURCE_GHODIUM_MELT = typingsJapgolly.screeps.screepsStrings.ghodium_melt
  type RESOURCE_GHODIUM_OXIDE = typingsJapgolly.screeps.screepsStrings.GO
  type RESOURCE_HYDRAULICS = typingsJapgolly.screeps.screepsStrings.hydraulics
  type RESOURCE_HYDROGEN = typingsJapgolly.screeps.screepsStrings.H
  type RESOURCE_HYDROXIDE = typingsJapgolly.screeps.screepsStrings.OH
  type RESOURCE_KEANIUM = typingsJapgolly.screeps.screepsStrings.K
  type RESOURCE_KEANIUM_ACID = typingsJapgolly.screeps.screepsStrings.KH2O
  type RESOURCE_KEANIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.KHO2
  type RESOURCE_KEANIUM_BAR = typingsJapgolly.screeps.screepsStrings.keanium_bar
  type RESOURCE_KEANIUM_HYDRIDE = typingsJapgolly.screeps.screepsStrings.KH
  type RESOURCE_KEANIUM_OXIDE = typingsJapgolly.screeps.screepsStrings.KO
  type RESOURCE_LEMERGIUM = typingsJapgolly.screeps.screepsStrings.L
  type RESOURCE_LEMERGIUM_ACID = typingsJapgolly.screeps.screepsStrings.LH2O
  type RESOURCE_LEMERGIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.LHO2
  type RESOURCE_LEMERGIUM_BAR = typingsJapgolly.screeps.screepsStrings.lemergium_bar
  type RESOURCE_LEMERGIUM_HYDRIDE = typingsJapgolly.screeps.screepsStrings.LH
  type RESOURCE_LEMERGIUM_OXIDE = typingsJapgolly.screeps.screepsStrings.LO
  type RESOURCE_LIQUID = typingsJapgolly.screeps.screepsStrings.liquid
  type RESOURCE_MACHINE = typingsJapgolly.screeps.screepsStrings.machine
  type RESOURCE_METAL = typingsJapgolly.screeps.screepsStrings.metal
  type RESOURCE_MICROCHIP = typingsJapgolly.screeps.screepsStrings.microchip
  type RESOURCE_MIST = typingsJapgolly.screeps.screepsStrings.mist
  type RESOURCE_MUSCLE = typingsJapgolly.screeps.screepsStrings.muscle
  type RESOURCE_OPS = typingsJapgolly.screeps.screepsStrings.ops
  type RESOURCE_ORGANISM = typingsJapgolly.screeps.screepsStrings.organism
  type RESOURCE_ORGANOID = typingsJapgolly.screeps.screepsStrings.organoid
  type RESOURCE_OXIDANT = typingsJapgolly.screeps.screepsStrings.oxidant
  type RESOURCE_OXYGEN = typingsJapgolly.screeps.screepsStrings.O
  type RESOURCE_PHLEGM = typingsJapgolly.screeps.screepsStrings.phlegm
  type RESOURCE_POWER = typingsJapgolly.screeps.screepsStrings.power
  type RESOURCE_PURIFIER = typingsJapgolly.screeps.screepsStrings.purifier
  type RESOURCE_REDUCTANT = typingsJapgolly.screeps.screepsStrings.reductant
  type RESOURCE_SILICON = typingsJapgolly.screeps.screepsStrings.silicon
  type RESOURCE_SPIRIT = typingsJapgolly.screeps.screepsStrings.spirit
  type RESOURCE_SWITCH = typingsJapgolly.screeps.screepsStrings.switch
  type RESOURCE_TISSUE = typingsJapgolly.screeps.screepsStrings.tissue
  type RESOURCE_TRANSISTOR = typingsJapgolly.screeps.screepsStrings.transistor
  type RESOURCE_TUBE = typingsJapgolly.screeps.screepsStrings.tube
  type RESOURCE_UTRIUM = typingsJapgolly.screeps.screepsStrings.U
  type RESOURCE_UTRIUM_ACID = typingsJapgolly.screeps.screepsStrings.UH2O
  type RESOURCE_UTRIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.UHO2
  type RESOURCE_UTRIUM_BAR = typingsJapgolly.screeps.screepsStrings.utrium_bar
  type RESOURCE_UTRIUM_HYDRIDE = typingsJapgolly.screeps.screepsStrings.UH
  type RESOURCE_UTRIUM_LEMERGITE = typingsJapgolly.screeps.screepsStrings.UL
  type RESOURCE_UTRIUM_OXIDE = typingsJapgolly.screeps.screepsStrings.UO
  type RESOURCE_WIRE = typingsJapgolly.screeps.screepsStrings.wire
  type RESOURCE_ZYNTHIUM = typingsJapgolly.screeps.screepsStrings.Z
  type RESOURCE_ZYNTHIUM_ACID = typingsJapgolly.screeps.screepsStrings.ZH2O
  type RESOURCE_ZYNTHIUM_ALKALIDE = typingsJapgolly.screeps.screepsStrings.ZHO2
  type RESOURCE_ZYNTHIUM_BAR = typingsJapgolly.screeps.screepsStrings.zynthium_bar
  type RESOURCE_ZYNTHIUM_HYDRIDE = typingsJapgolly.screeps.screepsStrings.ZH
  type RESOURCE_ZYNTHIUM_KEANITE = typingsJapgolly.screeps.screepsStrings.ZK
  type RESOURCE_ZYNTHIUM_OXIDE = typingsJapgolly.screeps.screepsStrings.ZO
  type RIGHT = typingsJapgolly.screeps.screepsNumbers.`3`
  // Resource Constants
  type ResourceConstant = typingsJapgolly.screeps.RESOURCE_ENERGY | typingsJapgolly.screeps.RESOURCE_POWER | typingsJapgolly.screeps.RESOURCE_OPS | typingsJapgolly.screeps.MineralConstant | typingsJapgolly.screeps.MineralCompoundConstant | typingsJapgolly.screeps.DepositConstant | typingsJapgolly.screeps.CommodityConstant
  type STRUCTURE_CONTAINER = typingsJapgolly.screeps.screepsStrings.container
  type STRUCTURE_CONTROLLER = typingsJapgolly.screeps.screepsStrings.controller
  type STRUCTURE_EXTENSION = typingsJapgolly.screeps.screepsStrings.extension
  type STRUCTURE_EXTRACTOR = typingsJapgolly.screeps.screepsStrings.extractor
  type STRUCTURE_FACTORY = typingsJapgolly.screeps.screepsStrings.factory
  type STRUCTURE_INVADER_CORE = typingsJapgolly.screeps.screepsStrings.invaderCore
  type STRUCTURE_KEEPER_LAIR = typingsJapgolly.screeps.screepsStrings.keeperLair
  type STRUCTURE_LAB = typingsJapgolly.screeps.screepsStrings.lab
  type STRUCTURE_LINK = typingsJapgolly.screeps.screepsStrings.link
  type STRUCTURE_NUKER = typingsJapgolly.screeps.screepsStrings.nuker
  type STRUCTURE_OBSERVER = typingsJapgolly.screeps.screepsStrings.observer
  type STRUCTURE_PORTAL = typingsJapgolly.screeps.screepsStrings.portal
  type STRUCTURE_POWER_BANK = typingsJapgolly.screeps.screepsStrings.powerBank
  type STRUCTURE_POWER_SPAWN = typingsJapgolly.screeps.screepsStrings.powerSpawn
  type STRUCTURE_RAMPART = typingsJapgolly.screeps.screepsStrings.rampart
  type STRUCTURE_ROAD = typingsJapgolly.screeps.screepsStrings.road
  type STRUCTURE_SPAWN = typingsJapgolly.screeps.screepsStrings.spawn
  type STRUCTURE_STORAGE = typingsJapgolly.screeps.screepsStrings.storage
  type STRUCTURE_TERMINAL = typingsJapgolly.screeps.screepsStrings.terminal
  type STRUCTURE_TOWER = typingsJapgolly.screeps.screepsStrings.tower
  type STRUCTURE_WALL = typingsJapgolly.screeps.screepsStrings.constructedWall
  type SUBSCRIPTION_TOKEN = typingsJapgolly.screeps.screepsStrings.token
  // Return Codes
  type ScreepsReturnCode = typingsJapgolly.screeps.OK | typingsJapgolly.screeps.ERR_NOT_OWNER | typingsJapgolly.screeps.ERR_NO_PATH | typingsJapgolly.screeps.ERR_BUSY | typingsJapgolly.screeps.ERR_NAME_EXISTS | typingsJapgolly.screeps.ERR_NOT_FOUND | typingsJapgolly.screeps.ERR_NOT_ENOUGH_RESOURCES | typingsJapgolly.screeps.ERR_NOT_ENOUGH_ENERGY | typingsJapgolly.screeps.ERR_INVALID_TARGET | typingsJapgolly.screeps.ERR_FULL | typingsJapgolly.screeps.ERR_NOT_IN_RANGE | typingsJapgolly.screeps.ERR_INVALID_ARGS | typingsJapgolly.screeps.ERR_TIRED | typingsJapgolly.screeps.ERR_NO_BODYPART | typingsJapgolly.screeps.ERR_NOT_ENOUGH_EXTENSIONS | typingsJapgolly.screeps.ERR_RCL_NOT_ENOUGH | typingsJapgolly.screeps.ERR_GCL_NOT_ENOUGH
  type Store[POSSIBLE_RESOURCES /* <: typingsJapgolly.screeps.ResourceConstant */, UNLIMITED_STORE /* <: scala.Boolean */] = (typingsJapgolly.screeps.StoreBase[POSSIBLE_RESOURCES, UNLIMITED_STORE]) with typingsJapgolly.screeps.screepsStrings.Store with js.Any
  type StructureConstant = typingsJapgolly.screeps.BuildableStructureConstant | typingsJapgolly.screeps.STRUCTURE_KEEPER_LAIR | typingsJapgolly.screeps.STRUCTURE_CONTROLLER | typingsJapgolly.screeps.STRUCTURE_POWER_BANK | typingsJapgolly.screeps.STRUCTURE_PORTAL | typingsJapgolly.screeps.STRUCTURE_INVADER_CORE
  type TERRAIN_MASK_LAVA = typingsJapgolly.screeps.screepsNumbers.`4`
  type TERRAIN_MASK_SWAMP = typingsJapgolly.screeps.screepsNumbers.`2`
  // Terrain mask constants
  type TERRAIN_MASK_WALL = typingsJapgolly.screeps.screepsNumbers.`1`
  type TOMBSTONE_DECAY_PER_PART = typingsJapgolly.screeps.screepsNumbers.`5`
  type TOP = typingsJapgolly.screeps.screepsNumbers.`1`
  type TOP_LEFT = typingsJapgolly.screeps.screepsNumbers.`8`
  type TOP_RIGHT = typingsJapgolly.screeps.screepsNumbers.`2`
  type TOUGH = typingsJapgolly.screeps.screepsStrings.tough
  type WORK = typingsJapgolly.screeps.screepsStrings.work
}
