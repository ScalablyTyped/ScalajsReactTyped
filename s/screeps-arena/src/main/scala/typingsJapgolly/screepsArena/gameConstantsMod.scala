package typingsJapgolly.screepsArena

import typingsJapgolly.screepsArena.gamePrototypesMod.Creep
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_CONTAINER
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_EXTENSION
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_RAMPART
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_ROAD
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_SPAWN
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_TOWER
import typingsJapgolly.screepsArena.gamePrototypesMod.STRUCTURE_WALL
import typingsJapgolly.screepsArena.gamePrototypesMod.StructureRampart
import typingsJapgolly.screepsArena.gamePrototypesMod.StructureRoad
import typingsJapgolly.screepsArena.gamePrototypesMod.StructureWall
import typingsJapgolly.screepsArena.screepsArenaInts.`-10`
import typingsJapgolly.screepsArena.screepsArenaInts.`-11`
import typingsJapgolly.screepsArena.screepsArenaInts.`-12`
import typingsJapgolly.screepsArena.screepsArenaInts.`-14`
import typingsJapgolly.screepsArena.screepsArenaInts.`-15`
import typingsJapgolly.screepsArena.screepsArenaInts.`-1`
import typingsJapgolly.screepsArena.screepsArenaInts.`-2`
import typingsJapgolly.screepsArena.screepsArenaInts.`-3`
import typingsJapgolly.screepsArena.screepsArenaInts.`-4`
import typingsJapgolly.screepsArena.screepsArenaInts.`-5`
import typingsJapgolly.screepsArena.screepsArenaInts.`-6`
import typingsJapgolly.screepsArena.screepsArenaInts.`-7`
import typingsJapgolly.screepsArena.screepsArenaInts.`-8`
import typingsJapgolly.screepsArena.screepsArenaInts.`-9`
import typingsJapgolly.screepsArena.screepsArenaInts.`0`
import typingsJapgolly.screepsArena.screepsArenaInts.`1`
import typingsJapgolly.screepsArena.screepsArenaInts.`2`
import typingsJapgolly.screepsArena.screepsArenaInts.`3`
import typingsJapgolly.screepsArena.screepsArenaInts.`4`
import typingsJapgolly.screepsArena.screepsArenaInts.`5`
import typingsJapgolly.screepsArena.screepsArenaInts.`6`
import typingsJapgolly.screepsArena.screepsArenaInts.`7`
import typingsJapgolly.screepsArena.screepsArenaInts.`8`
import typingsJapgolly.screepsArena.screepsArenaStrings.attack
import typingsJapgolly.screepsArena.screepsArenaStrings.carry
import typingsJapgolly.screepsArena.screepsArenaStrings.claim
import typingsJapgolly.screepsArena.screepsArenaStrings.energy
import typingsJapgolly.screepsArena.screepsArenaStrings.heal
import typingsJapgolly.screepsArena.screepsArenaStrings.move
import typingsJapgolly.screepsArena.screepsArenaStrings.ranged_attack
import typingsJapgolly.screepsArena.screepsArenaStrings.tough
import typingsJapgolly.screepsArena.screepsArenaStrings.work
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameConstantsMod {
  
  @JSImport("game/constants", "ATTACK")
  @js.native
  val ATTACK: typingsJapgolly.screepsArena.gameConstantsMod.ATTACK = js.native
  type ATTACK = attack
  
  @JSImport("game/constants", "ATTACK_POWER")
  @js.native
  val ATTACK_POWER: Double = js.native
  
  /* Inlined {[ index in screeps-arena.game/constants.BodyPartConstant ]: number} */
  object BODYPART_COST {
    
    @JSImport("game/constants", "BODYPART_COST")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("game/constants", "BODYPART_COST.attack")
    @js.native
    def attack: Double = js.native
    inline def attack_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attack")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.carry")
    @js.native
    def carry: Double = js.native
    inline def carry_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carry")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.claim")
    @js.native
    def claim: Double = js.native
    inline def claim_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("claim")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.heal")
    @js.native
    def heal: Double = js.native
    inline def heal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heal")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.move")
    @js.native
    def move: Double = js.native
    inline def move_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("move")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.ranged_attack")
    @js.native
    def rangedAttack: Double = js.native
    
    inline def rangedAttack_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranged_attack")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.tough")
    @js.native
    def tough: Double = js.native
    inline def tough_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tough")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "BODYPART_COST.work")
    @js.native
    def work: Double = js.native
    inline def work_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("work")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("game/constants", "BODYPART_HITS")
  @js.native
  val BODYPART_HITS: Double = js.native
  
  @JSImport("game/constants", "BOTTOM")
  @js.native
  val BOTTOM: typingsJapgolly.screepsArena.gameConstantsMod.BOTTOM = js.native
  type BOTTOM = `5`
  
  @JSImport("game/constants", "BOTTOM_LEFT")
  @js.native
  val BOTTOM_LEFT: typingsJapgolly.screepsArena.gameConstantsMod.BOTTOM_LEFT = js.native
  type BOTTOM_LEFT = `6`
  
  @JSImport("game/constants", "BOTTOM_RIGHT")
  @js.native
  val BOTTOM_RIGHT: typingsJapgolly.screepsArena.gameConstantsMod.BOTTOM_RIGHT = js.native
  type BOTTOM_RIGHT = `4`
  
  @JSImport("game/constants", "BUILD_POWER")
  @js.native
  val BUILD_POWER: Double = js.native
  
  @JSImport("game/constants", "CARRY")
  @js.native
  val CARRY: typingsJapgolly.screepsArena.gameConstantsMod.CARRY = js.native
  type CARRY = carry
  
  @JSImport("game/constants", "CARRY_CAPACITY")
  @js.native
  val CARRY_CAPACITY: Double = js.native
  
  @JSImport("game/constants", "CLAIM")
  @js.native
  val CLAIM: typingsJapgolly.screepsArena.gameConstantsMod.CLAIM = js.native
  type CLAIM = claim
  
  object CONSTRUCTION_COST {
    
    @JSImport("game/constants", "CONSTRUCTION_COST")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureContainer")
    @js.native
    def StructureContainer: Double = js.native
    inline def StructureContainer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureExtension")
    @js.native
    def StructureExtension: Double = js.native
    inline def StructureExtension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureExtension")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureRampart")
    @js.native
    def StructureRampart: Double = js.native
    inline def StructureRampart_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRampart")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureRoad")
    @js.native
    def StructureRoad: Double = js.native
    inline def StructureRoad_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRoad")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureSpawnt")
    @js.native
    def StructureSpawnt: Double = js.native
    inline def StructureSpawnt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureSpawnt")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureTower")
    @js.native
    def StructureTower: Double = js.native
    inline def StructureTower_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureTower")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "CONSTRUCTION_COST.StructureWall")
    @js.native
    def StructureWall: Double = js.native
    inline def StructureWall_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureWall")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("game/constants", "CONSTRUCTION_COST_ROAD_SWAMP_RATIO")
  @js.native
  val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Double = js.native
  
  @JSImport("game/constants", "CONSTRUCTION_COST_ROAD_WALL_RATIO")
  @js.native
  val CONSTRUCTION_COST_ROAD_WALL_RATIO: Double = js.native
  
  @JSImport("game/constants", "CONTAINER_CAPACITY")
  @js.native
  val CONTAINER_CAPACITY: Double = js.native
  
  @JSImport("game/constants", "CONTAINER_HITS")
  @js.native
  val CONTAINER_HITS: Double = js.native
  
  @JSImport("game/constants", "CREEP_SPAWN_TIME")
  @js.native
  val CREEP_SPAWN_TIME: Double = js.native
  
  @JSImport("game/constants", "DISMANTLE_COST")
  @js.native
  val DISMANTLE_COST: Double = js.native
  
  @JSImport("game/constants", "DISMANTLE_POWER")
  @js.native
  val DISMANTLE_POWER: Double = js.native
  
  @JSImport("game/constants", "ERR_BUSY")
  @js.native
  val ERR_BUSY: typingsJapgolly.screepsArena.gameConstantsMod.ERR_BUSY = js.native
  type ERR_BUSY = `-4`
  
  @JSImport("game/constants", "ERR_FULL")
  @js.native
  val ERR_FULL: typingsJapgolly.screepsArena.gameConstantsMod.ERR_FULL = js.native
  type ERR_FULL = `-8`
  
  @JSImport("game/constants", "ERR_INVALID_ARGS")
  @js.native
  val ERR_INVALID_ARGS: typingsJapgolly.screepsArena.gameConstantsMod.ERR_INVALID_ARGS = js.native
  type ERR_INVALID_ARGS = `-10`
  
  @JSImport("game/constants", "ERR_INVALID_TARGET")
  @js.native
  val ERR_INVALID_TARGET: typingsJapgolly.screepsArena.gameConstantsMod.ERR_INVALID_TARGET = js.native
  type ERR_INVALID_TARGET = `-7`
  
  @JSImport("game/constants", "ERR_NAME_EXISTS")
  @js.native
  val ERR_NAME_EXISTS: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NAME_EXISTS = js.native
  type ERR_NAME_EXISTS = `-3`
  
  @JSImport("game/constants", "ERR_NOT_ENOUGH_ENERGY")
  @js.native
  val ERR_NOT_ENOUGH_ENERGY: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_ENOUGH_ENERGY = js.native
  type ERR_NOT_ENOUGH_ENERGY = `-6`
  
  @JSImport("game/constants", "ERR_NOT_ENOUGH_EXTENSIONS")
  @js.native
  val ERR_NOT_ENOUGH_EXTENSIONS: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_ENOUGH_EXTENSIONS = js.native
  type ERR_NOT_ENOUGH_EXTENSIONS = `-6`
  
  @JSImport("game/constants", "ERR_NOT_ENOUGH_RESOURCES")
  @js.native
  val ERR_NOT_ENOUGH_RESOURCES: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_ENOUGH_RESOURCES = js.native
  type ERR_NOT_ENOUGH_RESOURCES = `-6`
  
  @JSImport("game/constants", "ERR_NOT_FOUND")
  @js.native
  val ERR_NOT_FOUND: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_FOUND = js.native
  type ERR_NOT_FOUND = `-5`
  
  @JSImport("game/constants", "ERR_NOT_IN_RANGE")
  @js.native
  val ERR_NOT_IN_RANGE: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_IN_RANGE = js.native
  type ERR_NOT_IN_RANGE = `-9`
  
  @JSImport("game/constants", "ERR_NOT_OWNER")
  @js.native
  val ERR_NOT_OWNER: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_OWNER = js.native
  type ERR_NOT_OWNER = `-1`
  
  @JSImport("game/constants", "ERR_NO_BODYPART")
  @js.native
  val ERR_NO_BODYPART: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NO_BODYPART = js.native
  type ERR_NO_BODYPART = `-12`
  
  @JSImport("game/constants", "ERR_NO_PATH")
  @js.native
  val ERR_NO_PATH: typingsJapgolly.screepsArena.gameConstantsMod.ERR_NO_PATH = js.native
  type ERR_NO_PATH = `-2`
  
  @JSImport("game/constants", "ERR_TIRED")
  @js.native
  val ERR_TIRED: typingsJapgolly.screepsArena.gameConstantsMod.ERR_TIRED = js.native
  type ERR_TIRED = `-11`
  
  @JSImport("game/constants", "EXTENSION_ENERGY_CAPACITY")
  @js.native
  val EXTENSION_ENERGY_CAPACITY: Double = js.native
  
  @JSImport("game/constants", "EXTENSION_HITS")
  @js.native
  val EXTENSION_HITS: Double = js.native
  
  @JSImport("game/constants", "HARVEST_POWER")
  @js.native
  val HARVEST_POWER: Double = js.native
  
  @JSImport("game/constants", "HEAL")
  @js.native
  val HEAL: typingsJapgolly.screepsArena.gameConstantsMod.HEAL = js.native
  type HEAL = heal
  
  @JSImport("game/constants", "HEAL_POWER")
  @js.native
  val HEAL_POWER: Double = js.native
  
  @JSImport("game/constants", "LEFT")
  @js.native
  val LEFT: typingsJapgolly.screepsArena.gameConstantsMod.LEFT = js.native
  type LEFT = `7`
  
  @JSImport("game/constants", "MAX_CONSTRUCTION_SITES")
  @js.native
  val MAX_CONSTRUCTION_SITES: Double = js.native
  
  @JSImport("game/constants", "MAX_CREEP_SIZE")
  @js.native
  val MAX_CREEP_SIZE: Double = js.native
  
  @JSImport("game/constants", "MOVE")
  @js.native
  val MOVE: typingsJapgolly.screepsArena.gameConstantsMod.MOVE = js.native
  type MOVE = move
  
  @JSImport("game/constants", "OBSTACLE_OBJECT_TYPES")
  @js.native
  val OBSTACLE_OBJECT_TYPES: typingsJapgolly.screepsArena.gameConstantsMod.OBSTACLE_OBJECT_TYPES = js.native
  type OBSTACLE_OBJECT_TYPES = AnyCreep | STRUCTURE_TOWER | STRUCTURE_WALL | STRUCTURE_SPAWN | STRUCTURE_EXTENSION
  
  @JSImport("game/constants", "OK")
  @js.native
  val OK: typingsJapgolly.screepsArena.gameConstantsMod.OK = js.native
  type OK = `0`
  
  @JSImport("game/constants", "RAMPART_HITS")
  @js.native
  val RAMPART_HITS: Double = js.native
  
  @JSImport("game/constants", "RAMPART_HITS_MAX")
  @js.native
  val RAMPART_HITS_MAX: Double = js.native
  
  @JSImport("game/constants", "RANGED_ATTACK")
  @js.native
  val RANGED_ATTACK: typingsJapgolly.screepsArena.gameConstantsMod.RANGED_ATTACK = js.native
  type RANGED_ATTACK = ranged_attack
  
  @JSImport("game/constants", "RANGED_ATTACK_DISTANCE_RATE")
  @js.native
  val RANGED_ATTACK_DISTANCE_RATE: js.Array[Any] = js.native
  
  @JSImport("game/constants", "RANGED_ATTACK_POWER")
  @js.native
  val RANGED_ATTACK_POWER: Double = js.native
  
  @JSImport("game/constants", "RANGED_HEAL_POWER")
  @js.native
  val RANGED_HEAL_POWER: Double = js.native
  
  @JSImport("game/constants", "REPAIR_COST")
  @js.native
  val REPAIR_COST: Double = js.native
  
  @JSImport("game/constants", "REPAIR_POWER")
  @js.native
  val REPAIR_POWER: Double = js.native
  
  @JSImport("game/constants", "RESOURCE_DECAY")
  @js.native
  val RESOURCE_DECAY: Double = js.native
  
  @JSImport("game/constants", "RESOURCE_ENERGY")
  @js.native
  val RESOURCE_ENERGY: energy = js.native
  
  @JSImport("game/constants", "RIGHT")
  @js.native
  val RIGHT: typingsJapgolly.screepsArena.gameConstantsMod.RIGHT = js.native
  type RIGHT = `3`
  
  @JSImport("game/constants", "ROAD_HITS")
  @js.native
  val ROAD_HITS: Double = js.native
  
  @JSImport("game/constants", "ROAD_WEAROUT")
  @js.native
  val ROAD_WEAROUT: Double = js.native
  
  @JSImport("game/constants", "SOURCE_ENERGY_REGEN")
  @js.native
  val SOURCE_ENERGY_REGEN: Double = js.native
  
  @JSImport("game/constants", "SPAWN_ENERGY_CAPACITY")
  @js.native
  val SPAWN_ENERGY_CAPACITY: Double = js.native
  
  @JSImport("game/constants", "SPAWN_HITS")
  @js.native
  val SPAWN_HITS: Double = js.native
  
  object STRUCTURE_PROTOTYPES {
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureContainer")
    @js.native
    def StructureContainer: STRUCTURE_CONTAINER = js.native
    inline def StructureContainer_=(x: STRUCTURE_CONTAINER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureExtension")
    @js.native
    def StructureExtension: STRUCTURE_EXTENSION = js.native
    inline def StructureExtension_=(x: STRUCTURE_EXTENSION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureExtension")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureRampart")
    @js.native
    def StructureRampart: STRUCTURE_RAMPART = js.native
    inline def StructureRampart_=(x: STRUCTURE_RAMPART): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRampart")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureRoad")
    @js.native
    def StructureRoad: STRUCTURE_ROAD = js.native
    inline def StructureRoad_=(x: STRUCTURE_ROAD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRoad")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureSpawn")
    @js.native
    def StructureSpawn: STRUCTURE_SPAWN = js.native
    inline def StructureSpawn_=(x: STRUCTURE_SPAWN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureSpawn")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureTower")
    @js.native
    def StructureTower: STRUCTURE_TOWER = js.native
    inline def StructureTower_=(x: STRUCTURE_TOWER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureTower")(x.asInstanceOf[js.Any])
    
    @JSImport("game/constants", "STRUCTURE_PROTOTYPES.StructureWall")
    @js.native
    def StructureWall: STRUCTURE_WALL = js.native
    inline def StructureWall_=(x: STRUCTURE_WALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureWall")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("game/constants", "TERRAIN_SWAMP")
  @js.native
  val TERRAIN_SWAMP: typingsJapgolly.screepsArena.gameConstantsMod.TERRAIN_SWAMP = js.native
  type TERRAIN_SWAMP = `2`
  
  @JSImport("game/constants", "TERRAIN_WALL")
  @js.native
  val TERRAIN_WALL: typingsJapgolly.screepsArena.gameConstantsMod.TERRAIN_WALL = js.native
  type TERRAIN_WALL = `1`
  
  @JSImport("game/constants", "TOP")
  @js.native
  val TOP: typingsJapgolly.screepsArena.gameConstantsMod.TOP = js.native
  type TOP = `1`
  
  @JSImport("game/constants", "TOP_LEFT")
  @js.native
  val TOP_LEFT: typingsJapgolly.screepsArena.gameConstantsMod.TOP_LEFT = js.native
  type TOP_LEFT = `8`
  
  @JSImport("game/constants", "TOP_RIGHT")
  @js.native
  val TOP_RIGHT: typingsJapgolly.screepsArena.gameConstantsMod.TOP_RIGHT = js.native
  type TOP_RIGHT = `2`
  
  @JSImport("game/constants", "TOUGH")
  @js.native
  val TOUGH: typingsJapgolly.screepsArena.gameConstantsMod.TOUGH = js.native
  type TOUGH = tough
  
  @JSImport("game/constants", "TOWER_CAPACITY")
  @js.native
  val TOWER_CAPACITY: Double = js.native
  
  @JSImport("game/constants", "TOWER_COOLDOWN")
  @js.native
  val TOWER_COOLDOWN: Double = js.native
  
  @JSImport("game/constants", "TOWER_ENERGY_COST")
  @js.native
  val TOWER_ENERGY_COST: Double = js.native
  
  @JSImport("game/constants", "TOWER_FALLOFF")
  @js.native
  val TOWER_FALLOFF: Double = js.native
  
  @JSImport("game/constants", "TOWER_FALLOFF_RANGE")
  @js.native
  val TOWER_FALLOFF_RANGE: Double = js.native
  
  @JSImport("game/constants", "TOWER_HITS")
  @js.native
  val TOWER_HITS: Double = js.native
  
  @JSImport("game/constants", "TOWER_OPTIMAL_RANGE")
  @js.native
  val TOWER_OPTIMAL_RANGE: Double = js.native
  
  @JSImport("game/constants", "TOWER_POWER_ATTACK")
  @js.native
  val TOWER_POWER_ATTACK: Double = js.native
  
  @JSImport("game/constants", "TOWER_POWER_HEAL")
  @js.native
  val TOWER_POWER_HEAL: Double = js.native
  
  @JSImport("game/constants", "TOWER_POWER_REPAIR")
  @js.native
  val TOWER_POWER_REPAIR: Double = js.native
  
  @JSImport("game/constants", "TOWER_RANGE")
  @js.native
  val TOWER_RANGE: Double = js.native
  
  @JSImport("game/constants", "WALL_HITS")
  @js.native
  val WALL_HITS: Double = js.native
  
  @JSImport("game/constants", "WALL_HITS_MAX")
  @js.native
  val WALL_HITS_MAX: Double = js.native
  
  @JSImport("game/constants", "WORK")
  @js.native
  val WORK: typingsJapgolly.screepsArena.gameConstantsMod.WORK = js.native
  type WORK = work
  
  type AnyCreep = Creep
  
  type BodyPartConstant = typingsJapgolly.screepsArena.gameConstantsMod.MOVE | typingsJapgolly.screepsArena.gameConstantsMod.WORK | typingsJapgolly.screepsArena.gameConstantsMod.CARRY | typingsJapgolly.screepsArena.gameConstantsMod.ATTACK | typingsJapgolly.screepsArena.gameConstantsMod.RANGED_ATTACK | typingsJapgolly.screepsArena.gameConstantsMod.TOUGH | typingsJapgolly.screepsArena.gameConstantsMod.HEAL | typingsJapgolly.screepsArena.gameConstantsMod.CLAIM
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureTower
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureExtension
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureRoad
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureContainer
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureWall
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureRampart
    - typingsJapgolly.screepsArena.gamePrototypesMod.StructureSpawn
  */
  type BuildableStructure = _BuildableStructure | StructureRoad | StructureWall | StructureRampart
  
  type BuildableStructureConstant = STRUCTURE_TOWER | STRUCTURE_EXTENSION | STRUCTURE_ROAD | STRUCTURE_CONTAINER | STRUCTURE_WALL | STRUCTURE_RAMPART | STRUCTURE_SPAWN
  
  type CreepActionReturnCode = typingsJapgolly.screepsArena.gameConstantsMod.OK | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_OWNER | typingsJapgolly.screepsArena.gameConstantsMod.ERR_BUSY | typingsJapgolly.screepsArena.gameConstantsMod.ERR_INVALID_TARGET | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_IN_RANGE | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NO_BODYPART | typingsJapgolly.screepsArena.gameConstantsMod.ERR_TIRED
  
  type CreepMoveReturnCode = typingsJapgolly.screepsArena.gameConstantsMod.OK | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_OWNER | typingsJapgolly.screepsArena.gameConstantsMod.ERR_BUSY | typingsJapgolly.screepsArena.gameConstantsMod.ERR_TIRED | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NO_BODYPART
  
  type DirectionConstant = typingsJapgolly.screepsArena.gameConstantsMod.TOP | typingsJapgolly.screepsArena.gameConstantsMod.TOP_RIGHT | typingsJapgolly.screepsArena.gameConstantsMod.RIGHT | typingsJapgolly.screepsArena.gameConstantsMod.BOTTOM_RIGHT | typingsJapgolly.screepsArena.gameConstantsMod.BOTTOM | typingsJapgolly.screepsArena.gameConstantsMod.BOTTOM_LEFT | typingsJapgolly.screepsArena.gameConstantsMod.LEFT | typingsJapgolly.screepsArena.gameConstantsMod.TOP_LEFT
  
  type ERR_GCL_NOT_ENOUGH = `-15`
  
  type ERR_RCL_NOT_ENOUGH = `-14`
  
  type ResourceConstant = energy
  
  type ScreepsReturnCode = typingsJapgolly.screepsArena.gameConstantsMod.OK | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_OWNER | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NO_PATH | typingsJapgolly.screepsArena.gameConstantsMod.ERR_BUSY | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NAME_EXISTS | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_FOUND | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_ENOUGH_RESOURCES | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_ENOUGH_ENERGY | typingsJapgolly.screepsArena.gameConstantsMod.ERR_INVALID_TARGET | typingsJapgolly.screepsArena.gameConstantsMod.ERR_FULL | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_IN_RANGE | typingsJapgolly.screepsArena.gameConstantsMod.ERR_INVALID_ARGS | typingsJapgolly.screepsArena.gameConstantsMod.ERR_TIRED | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NO_BODYPART | typingsJapgolly.screepsArena.gameConstantsMod.ERR_NOT_ENOUGH_EXTENSIONS | ERR_RCL_NOT_ENOUGH | ERR_GCL_NOT_ENOUGH
  
  trait _BuildableStructure extends StObject
}
