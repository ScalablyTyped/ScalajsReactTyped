package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Non-player structure. Spawns NPC Source Keepers that guards energy sources
  * and minerals in some rooms. This structure cannot be destroyed.
  */
trait StructureKeeperLair
  extends StObject
     with OwnedStructure[STRUCTURE_KEEPER_LAIR]
     with AnyOwnedStructure {
  
  /**
    * Time to spawning of the next Source Keeper.
    */
  var ticksToSpawn: js.UndefOr[Double] = js.undefined
}
object StructureKeeperLair {
  
  inline def apply(
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureKeeperLair],
    isActive: CallbackTo[Boolean],
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_KEEPER_LAIR
  ): StructureKeeperLair = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureKeeperLair]
  }
  
  extension [Self <: StructureKeeperLair](x: Self) {
    
    inline def setTicksToSpawn(value: Double): Self = StObject.set(x, "ticksToSpawn", value.asInstanceOf[js.Any])
    
    inline def setTicksToSpawnUndefined: Self = StObject.set(x, "ticksToSpawn", js.undefined)
  }
}
