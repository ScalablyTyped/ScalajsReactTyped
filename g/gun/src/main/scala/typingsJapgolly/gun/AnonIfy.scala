package typingsJapgolly.gun

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gun.gunBooleans.`false`
import typingsJapgolly.gun.mod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIfy extends js.Object {
  /** Returns a "gun-ified" variant of the json input by injecting a new gun ID into the metadata field. */
  def ify(json: js.Any): js.Any
  /** Returns true if data is a gun node, otherwise false. */
  def is(anything: js.Any): /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean
  /**
    * Returns data's gun ID (instead of manually grabbing its metadata i.e. data["_"]["#"], which is faster but could change in the future)
    *
    * Returns undefined if data is not correct gun data.
    */
  @JSName("soul")
  def soul_false(data: ChainReference[_, _, `false`]): String
}

object AnonIfy {
  @scala.inline
  def apply(
    ify: js.Any => CallbackTo[js.Any],
    is: js.Any => CallbackTo[/* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean],
    soul: ChainReference[js.Any, js.Any, `false`] => CallbackTo[String]
  ): AnonIfy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ify")(js.Any.fromFunction1((t0: js.Any) => ify(t0).runNow()))
    __obj.updateDynamic("is")(js.Any.fromFunction1((t0: js.Any) => is(t0).runNow()))
    __obj.updateDynamic("soul")(js.Any.fromFunction1((t0: typingsJapgolly.gun.mod.Gun.ChainReference[js.Any, js.Any, typingsJapgolly.gun.gunBooleans.`false`]) => soul(t0).runNow()))
    __obj.asInstanceOf[AnonIfy]
  }
}

