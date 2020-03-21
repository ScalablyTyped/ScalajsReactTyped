package typingsJapgolly.cordovaPluginSplashscreen

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHide extends js.Object {
  /** Dismiss the splash screen. */
  def hide(): Unit
  /** Displays the splash screen. */
  def show(): Unit
}

object AnonHide {
  @scala.inline
  def apply(hide: Callback, show: Callback): AnonHide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[AnonHide]
  }
}

