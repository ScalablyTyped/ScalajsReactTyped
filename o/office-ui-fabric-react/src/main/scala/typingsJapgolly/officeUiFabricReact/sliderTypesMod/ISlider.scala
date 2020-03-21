package typingsJapgolly.officeUiFabricReact.sliderTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
  def focus(): Unit
}

object ISlider {
  @scala.inline
  def apply(focus: Callback, value: Int | Double = null): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

