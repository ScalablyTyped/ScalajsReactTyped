package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLightboxElement extends js.Object {
  def hide(): Unit
  def show(index: Double): Unit
}

object UIkitLightboxElement {
  @scala.inline
  def apply(hide: Callback, show: Double => Callback): UIkitLightboxElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: scala.Double) => show(t0).runNow()))
    __obj.asInstanceOf[UIkitLightboxElement]
  }
}

