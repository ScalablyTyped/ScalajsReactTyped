package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointLabelOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double | String] = js.undefined
}

object PointLabelOptions {
  @scala.inline
  def apply(
    callback: /* arg */ js.Any => CallbackTo[js.Any] = null,
    fontColor: ChartColor = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    lineHeight: Double | String = null
  ): PointLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* arg */ js.Any) => callback(t0).runNow()))
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLabelOptions]
  }
}

