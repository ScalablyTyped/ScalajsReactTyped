package typingsJapgolly.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Spawns NPC Source Keepers that guards energy sources
  * and minerals in some rooms. This structure cannot be destroyed.
  */
trait StructureKeeperLair
  extends OwnedStructure[STRUCTURE_KEEPER_LAIR]
     with AnyOwnedStructure {
  /**
    * Time to spawning of the next Source Keeper.
    */
  var ticksToSpawn: js.UndefOr[Double] = js.undefined
}

@JSGlobal("StructureKeeperLair")
@js.native
object StructureKeeperLair extends TopLevel[StructureKeeperLairConstructor]

