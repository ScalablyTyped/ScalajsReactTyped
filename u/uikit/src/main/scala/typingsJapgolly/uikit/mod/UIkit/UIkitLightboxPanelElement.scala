package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLightboxPanelElement extends js.Object {
  def hide(): Unit
  def show(index: Double): Unit
  def startAutoplay(): Unit
  def stopAutoplay(): Unit
}

object UIkitLightboxPanelElement {
  @scala.inline
  def apply(hide: Callback, show: Double => Callback, startAutoplay: Callback, stopAutoplay: Callback): UIkitLightboxPanelElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: scala.Double) => show(t0).runNow()))
    __obj.updateDynamic("startAutoplay")(startAutoplay.toJsFn)
    __obj.updateDynamic("stopAutoplay")(stopAutoplay.toJsFn)
    __obj.asInstanceOf[UIkitLightboxPanelElement]
  }
}

