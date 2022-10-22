package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parent object for structure classes
  */
trait Structure[T /* <: StructureConstant */]
  extends StObject
     with RoomObject {
  
  /**
    * Destroy this structure immediately.
    */
  def destroy(): ScreepsReturnCode
  
  /**
    * The current amount of hit points of the structure.
    */
  var hits: Double
  
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: Double
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type]
  
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  def isActive(): Boolean
  
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
  
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  @JSName("room")
  var room_Structure: Room
  
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T
}
object Structure {
  
  inline def apply[T /* <: StructureConstant */](
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[Structure[T]],
    isActive: CallbackTo[Boolean],
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): Structure[T] = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure[T]]
  }
  
  extension [Self <: Structure[?], T /* <: StructureConstant */](x: Self & Structure[T]) {
    
    inline def setDestroy(value: CallbackTo[ScreepsReturnCode]): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsMax(value: Double): Self = StObject.set(x, "hitsMax", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id[Structure[T]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setNotifyWhenAttacked(value: Boolean => ScreepsReturnCode): Self = StObject.set(x, "notifyWhenAttacked", js.Any.fromFunction1(value))
    
    inline def setRoom(value: Room): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setStructureType(value: T): Self = StObject.set(x, "structureType", value.asInstanceOf[js.Any])
  }
}
