package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides visibility into a distant room from your script.
  */
trait StructureObserver
  extends StObject
     with OwnedStructure[STRUCTURE_OBSERVER]
     with AnyOwnedStructure {
  
  /**
    * Provide visibility into a distant room from your script. The target room object will be available on the next tick. The maximum range is 5 rooms.
    * @param roomName The room to observe.
    */
  def observeRoom(roomName: String): ScreepsReturnCode
}
object StructureObserver {
  
  inline def apply(
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureObserver],
    isActive: CallbackTo[Boolean],
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    observeRoom: String => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_OBSERVER
  ): StructureObserver = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), observeRoom = js.Any.fromFunction1(observeRoom), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureObserver]
  }
  
  extension [Self <: StructureObserver](x: Self) {
    
    inline def setObserveRoom(value: String => ScreepsReturnCode): Self = StObject.set(x, "observeRoom", js.Any.fromFunction1(value))
  }
}
