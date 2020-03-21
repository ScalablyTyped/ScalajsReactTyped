package typingsJapgolly.reactAlert.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertCustomOptions extends js.Object {
  /**
    * Callback that will be executed after this alert is removed
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback that will be executed after this alert open
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Custom timeout just for this one alert
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AlertCustomOptions {
  @scala.inline
  def apply(
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    timeout: Int | Double = null
  ): AlertCustomOptions = {
    val __obj = js.Dynamic.literal()
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertCustomOptions]
  }
}

