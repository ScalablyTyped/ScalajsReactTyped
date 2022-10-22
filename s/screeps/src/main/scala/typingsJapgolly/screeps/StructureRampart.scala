package typingsJapgolly.screeps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blocks movement of hostile creeps, and defends your creeps and structures on
  * the same tile. Can be used as a controllable gate.
  */
trait StructureRampart
  extends StObject
     with OwnedStructure[STRUCTURE_RAMPART]
     with AnyOwnedStructure {
  
  /**
    * If false (default), only your creeps can step on the same square. If true, any hostile creeps can pass through.
    */
  var isPublic: Boolean
  
  /**
    * Make this rampart public to allow other players' creeps to pass through.
    * @param isPublic Whether this rampart should be public or non-public
    */
  def setPublic(isPublic: Boolean): Unit
  
  /**
    * The amount of game ticks when this rampart will lose some hit points.
    */
  var ticksToDecay: Double
}
object StructureRampart {
  
  inline def apply(
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureRampart],
    isActive: CallbackTo[Boolean],
    isPublic: Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    setPublic: Boolean => Callback,
    structureType: STRUCTURE_RAMPART,
    ticksToDecay: Double
  ): StructureRampart = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, isPublic = isPublic.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], setPublic = js.Any.fromFunction1((t0: Boolean) => setPublic(t0).runNow()), structureType = structureType.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureRampart]
  }
  
  extension [Self <: StructureRampart](x: Self) {
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setSetPublic(value: Boolean => Callback): Self = StObject.set(x, "setPublic", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
  }
}
