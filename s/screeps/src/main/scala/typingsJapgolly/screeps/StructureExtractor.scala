package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows to harvest mineral deposits.
  */
trait StructureExtractor
  extends StObject
     with OwnedStructure[STRUCTURE_EXTRACTOR]
     with AnyOwnedStructure {
  
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double
}
object StructureExtractor {
  
  inline def apply(
    cooldown: Double,
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureExtractor],
    isActive: CallbackTo[Boolean],
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_EXTRACTOR
  ): StructureExtractor = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureExtractor]
  }
  
  extension [Self <: StructureExtractor](x: Self) {
    
    inline def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
  }
}
