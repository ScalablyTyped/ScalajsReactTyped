package typingsJapgolly.gijgo.Types

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Slider
trait SliderSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var slide: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ Double, _]] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SliderSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => CallbackTo[js.Any] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    slide: (/* e */ js.Any, /* value */ Double) => CallbackTo[js.Any] = null,
    uiLibrary: String = null,
    value: String = null,
    width: Int | Double = null
  ): SliderSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ js.Any) => change(t0).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* value */ scala.Double) => slide(t0, t1).runNow()))
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderSettings]
  }
}

