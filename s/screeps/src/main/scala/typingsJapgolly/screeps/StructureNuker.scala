package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.screeps.anon.StoreRESOURCEENERGYRESOURAlloy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Launches a nuke to another room dealing huge damage to the landing area.
  * Each launch has a cooldown and requires energy and ghodium resources. Launching
  * creates a Nuke object at the target room position which is visible to any player
  * until it is landed. Incoming nuke cannot be moved or cancelled. Nukes cannot
  * be launched from or to novice rooms.
  */
trait StructureNuker
  extends StObject
     with OwnedStructure[STRUCTURE_NUKER]
     with AnyOwnedStructure
     with AnyStoreStructure {
  
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: Double
  
  /**
    * The amount of energy contained in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double
  
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double
  
  /**
    * The amount of energy contained in this structure.
    * @deprecated An alias for .store[RESOURCE_GHODIUM].
    */
  var ghodium: Double
  
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_GHODIUM).
    */
  var ghodiumCapacity: Double
  
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  def launchNuke(pos: RoomPosition): ScreepsReturnCode
  
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYRESOURAlloy
}
object StructureNuker {
  
  inline def apply(
    cooldown: Double,
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    ghodium: Double,
    ghodiumCapacity: Double,
    hits: Double,
    hitsMax: Double,
    id: Id[StructureNuker],
    isActive: CallbackTo[Boolean],
    launchNuke: RoomPosition => ScreepsReturnCode,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    store: StoreRESOURCEENERGYRESOURAlloy,
    structureType: STRUCTURE_NUKER
  ): StructureNuker = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], ghodium = ghodium.asInstanceOf[js.Any], ghodiumCapacity = ghodiumCapacity.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, launchNuke = js.Any.fromFunction1(launchNuke), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureNuker]
  }
  
  extension [Self <: StructureNuker](x: Self) {
    
    inline def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyCapacity(value: Double): Self = StObject.set(x, "energyCapacity", value.asInstanceOf[js.Any])
    
    inline def setGhodium(value: Double): Self = StObject.set(x, "ghodium", value.asInstanceOf[js.Any])
    
    inline def setGhodiumCapacity(value: Double): Self = StObject.set(x, "ghodiumCapacity", value.asInstanceOf[js.Any])
    
    inline def setLaunchNuke(value: RoomPosition => ScreepsReturnCode): Self = StObject.set(x, "launchNuke", js.Any.fromFunction1(value))
    
    inline def setStore(value: StoreRESOURCEENERGYRESOURAlloy): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
