package typingsJapgolly.autoLaunch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLaunch extends js.Object {
  /**
    * Disables auto-launch at start up.
    */
  def disable(): js.Promise[Unit]
  /**
    * Enables auto-launch at start up.
    */
  def enable(): js.Promise[Unit]
  /**
    * Returns true if auto-launch is enabled.
    */
  def isEnabled(): js.Promise[Boolean]
}

object AutoLaunch {
  @scala.inline
  def apply(
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    isEnabled: CallbackTo[js.Promise[Boolean]]
  ): AutoLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.asInstanceOf[AutoLaunch]
  }
}

