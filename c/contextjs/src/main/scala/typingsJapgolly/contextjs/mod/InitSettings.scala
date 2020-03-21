package typingsJapgolly.contextjs.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSettings extends js.Object {
  var above: js.UndefOr[String | Boolean] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var fadeSpeed: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.undefined
  var preventDoubleContext: js.UndefOr[Boolean] = js.undefined
}

object InitSettings {
  @scala.inline
  def apply(
    above: String | Boolean = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    fadeSpeed: Int | Double = null,
    filter: /* e */ Element => Callback = null,
    preventDoubleContext: js.UndefOr[Boolean] = js.undefined
  ): InitSettings = {
    val __obj = js.Dynamic.literal()
    if (above != null) __obj.updateDynamic("above")(above.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (fadeSpeed != null) __obj.updateDynamic("fadeSpeed")(fadeSpeed.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.Element) => filter(t0).runNow()))
    if (!js.isUndefined(preventDoubleContext)) __obj.updateDynamic("preventDoubleContext")(preventDoubleContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSettings]
  }
}

