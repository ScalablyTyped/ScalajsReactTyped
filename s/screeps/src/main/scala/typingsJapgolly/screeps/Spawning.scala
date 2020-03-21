package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare type Spawn = StructureSpawn;
trait Spawning extends js.Object {
  /**
    * An array with the spawn directions
    * @see http://docs.screeps.com/api/#StructureSpawn.Spawning.setDirections
    */
  var directions: js.Array[DirectionConstant]
  /**
    * The name of the creep
    */
  var name: String
  /**
    * Time needed in total to complete the spawning.
    */
  var needTime: Double
  /**
    * Remaining time to go.
    */
  var remainingTime: Double
  /**
    * A link to the spawn
    */
  var spawn: StructureSpawn
  /**
    * Cancel spawning immediately. Energy spent on spawning is not returned.
    */
  def cancel(): ScreepsReturnCode with (OK | ERR_NOT_OWNER)
  /**
    * Set desired directions where the creep should move when spawned.
    * @param directions An array with the spawn directions
    */
  def setDirections(directions: js.Array[DirectionConstant]): ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)
}

object Spawning {
  @scala.inline
  def apply(
    cancel: CallbackTo[ScreepsReturnCode with (OK | ERR_NOT_OWNER)],
    directions: js.Array[DirectionConstant],
    name: String,
    needTime: Double,
    remainingTime: Double,
    setDirections: js.Array[DirectionConstant] => CallbackTo[ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)],
    spawn: StructureSpawn
  ): Spawning = {
    val __obj = js.Dynamic.literal(directions = directions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needTime = needTime.asInstanceOf[js.Any], remainingTime = remainingTime.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("setDirections")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.screeps.DirectionConstant]) => setDirections(t0).runNow()))
    __obj.asInstanceOf[Spawning]
  }
}

