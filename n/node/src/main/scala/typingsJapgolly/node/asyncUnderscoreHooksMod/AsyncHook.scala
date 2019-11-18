package typingsJapgolly.node.asyncUnderscoreHooksMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHook extends js.Object {
  /**
    * Disable the callbacks for a given AsyncHook instance from the global pool of AsyncHook callbacks to be executed. Once a hook has been disabled it will not be called again until enabled.
    */
  def disable(): this.type
  /**
    * Enable the callbacks for a given AsyncHook instance. If no callbacks are provided enabling is a noop.
    */
  def enable(): this.type
}

object AsyncHook {
  @scala.inline
  def apply(disable: CallbackTo[AsyncHook], enable: CallbackTo[AsyncHook]): AsyncHook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.asInstanceOf[AsyncHook]
  }
}

