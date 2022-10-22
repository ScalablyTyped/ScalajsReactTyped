package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.screeps.anon.StoreRESOURCEENERGYRESOUR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Non-player structure. Contains power resource which can be obtained by
  * destroying the structure. Hits the attacker creep back on each attack.
  */
trait StructurePowerSpawn
  extends StObject
     with OwnedStructure[STRUCTURE_POWER_SPAWN]
     with AnyOwnedStructure
     with AnyStoreStructure {
  
  /**
    * The amount of energy containing in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double
  
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double
  
  /**
    * The amount of power containing in this structure.
    * @deprecated An alias for .store[RESOURCE_POWER].
    */
  var power: Double
  
  /**
    * The total amount of power this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_POWER).
    */
  var powerCapacity: Double
  
  /**
    * Register power resource units into your account. Registered power allows to develop power creeps skills. Consumes 1 power resource unit and 50 energy resource units.
    */
  def processPower(): ScreepsReturnCode
  
  /**
    *
    */
  var store: StoreRESOURCEENERGYRESOUR
}
object StructurePowerSpawn {
  
  inline def apply(
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    hits: Double,
    hitsMax: Double,
    id: Id[StructurePowerSpawn],
    isActive: CallbackTo[Boolean],
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    power: Double,
    powerCapacity: Double,
    processPower: CallbackTo[ScreepsReturnCode],
    room: Room,
    store: StoreRESOURCEENERGYRESOUR,
    structureType: STRUCTURE_POWER_SPAWN
  ): StructurePowerSpawn = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], powerCapacity = powerCapacity.asInstanceOf[js.Any], processPower = processPower.toJsFn, room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePowerSpawn]
  }
  
  extension [Self <: StructurePowerSpawn](x: Self) {
    
    inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyCapacity(value: Double): Self = StObject.set(x, "energyCapacity", value.asInstanceOf[js.Any])
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerCapacity(value: Double): Self = StObject.set(x, "powerCapacity", value.asInstanceOf[js.Any])
    
    inline def setProcessPower(value: CallbackTo[ScreepsReturnCode]): Self = StObject.set(x, "processPower", value.toJsFn)
    
    inline def setStore(value: StoreRESOURCEENERGYRESOUR): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
