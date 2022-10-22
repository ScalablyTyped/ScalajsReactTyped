package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blocks movement of all creeps.
  */
trait StructureWall
  extends StObject
     with Structure[STRUCTURE_WALL]
     with AnyStructure {
  
  /**
    * The amount of game ticks when the wall will disappear (only for automatically placed border walls at the start of the game).
    */
  var ticksToLive: Double
}
object StructureWall {
  
  inline def apply(
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureWall],
    isActive: CallbackTo[Boolean],
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_WALL,
    ticksToLive: Double
  ): StructureWall = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToLive = ticksToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureWall]
  }
  
  extension [Self <: StructureWall](x: Self) {
    
    inline def setTicksToLive(value: Double): Self = StObject.set(x, "ticksToLive", value.asInstanceOf[js.Any])
  }
}
