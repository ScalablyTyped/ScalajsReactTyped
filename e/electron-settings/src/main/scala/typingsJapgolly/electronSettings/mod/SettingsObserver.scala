package typingsJapgolly.electronSettings.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsObserver extends js.Object {
  /**
    * Disposes of this Observer instance.
    */
  def dispose(): Unit
}

object SettingsObserver {
  @scala.inline
  def apply(dispose: Callback): SettingsObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[SettingsObserver]
  }
}

