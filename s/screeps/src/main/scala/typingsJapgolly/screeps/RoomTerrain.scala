package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.screeps.screepsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of Object that contains all terrain for a room
  */
trait RoomTerrain extends js.Object {
  /**
    * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @return number Number of terrain mask like: TERRAIN_MASK_SWAMP | TERRAIN_MASK_WALL
    */
  def get(x: Double, y: Double): `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP
}

object RoomTerrain {
  @scala.inline
  def apply(get: (Double, Double) => CallbackTo[`0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP]): RoomTerrain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.asInstanceOf[RoomTerrain]
  }
}

