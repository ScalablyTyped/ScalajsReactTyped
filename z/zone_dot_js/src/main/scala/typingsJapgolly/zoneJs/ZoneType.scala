package typingsJapgolly.zoneJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneType extends js.Object {
  /**
    * @returns {Zone} Returns the current [Zone]. The only way to change
    * the current zone is by invoking a run() method, which will update the current zone for the
    * duration of the run method callback.
    */
  var current: Zone
  /**
    * @returns {Task} The task associated with the current execution.
    */
  var currentTask: Task | Null
  /**
    *  Return the root zone.
    */
  var root: Zone
  /**
    * load patch for specified native module, allow user to
    * define their own patch, user can use this API after loading zone.js
    */
  def __load_patch(name: String, fn: PatchFn): Unit
  /**
    * Zone symbol API to generate a string with __zone_symbol__ prefix
    */
  def __symbol__(name: String): String
  /**
    * Verify that Zone has been correctly patched. Specifically that Promise is zone aware.
    */
  def assertZonePatched(): Unit
}

object ZoneType {
  @scala.inline
  def apply(
    __load_patch: (String, PatchFn) => Callback,
    __symbol__ : String => CallbackTo[String],
    assertZonePatched: Callback,
    current: Zone,
    root: Zone,
    currentTask: Task = null
  ): ZoneType = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("__load_patch")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.zoneJs.PatchFn) => __load_patch(t0, t1).runNow()))
    __obj.updateDynamic("__symbol__")(js.Any.fromFunction1((t0: java.lang.String) => __symbol__(t0).runNow()))
    __obj.updateDynamic("assertZonePatched")(assertZonePatched.toJsFn)
    if (currentTask != null) __obj.updateDynamic("currentTask")(currentTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneType]
  }
}

