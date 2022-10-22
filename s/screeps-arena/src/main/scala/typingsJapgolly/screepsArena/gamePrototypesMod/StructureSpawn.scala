package typingsJapgolly.screepsArena.gamePrototypesMod

import typingsJapgolly.screepsArena.anon.ErrorObject
import typingsJapgolly.screepsArena.anon.StoreResourceConstant
import typingsJapgolly.screepsArena.gameConstantsMod.BodyPartConstant
import typingsJapgolly.screepsArena.gameConstantsMod._BuildableStructure
import typingsJapgolly.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructureSpawn
  extends StObject
     with OwnedStructure[STRUCTURE_SPAWN]
     with _BuildableStructure {
  
  /**
    * Start the creep spawning process. The required energy amount can be withdrawn from all spawns and extensions in the room.
    * @returns A creep on success or an errorcode on failure
    */
  def spawnCreep(body: js.Array[BodyPartConstant]): ErrorObject = js.native
  
  /**
    * A Store object that contains a cargo of this structure. Spawns can contain only energy.
    */
  var store: StoreResourceConstant = js.native
}
object StructureSpawn {
  
  inline def apply: StructureSpawnConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureSpawn").asInstanceOf[StructureSpawnConstructor]
}
