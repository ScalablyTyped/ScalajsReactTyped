package typingsJapgolly.reactVirtualized.esCellMeasurerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerCacheParams extends js.Object {
  var defaultHeight: js.UndefOr[Double] = js.undefined
  var defaultWidth: js.UndefOr[Double] = js.undefined
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var keyMapper: js.UndefOr[KeyMapper] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
}

object CellMeasurerCacheParams {
  @scala.inline
  def apply(
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    fixedHeight: js.UndefOr[Boolean] = js.undefined,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    keyMapper: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[js.Any] = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null
  ): CellMeasurerCacheParams = {
    val __obj = js.Dynamic.literal()
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => keyMapper(t0, t1).runNow()))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMeasurerCacheParams]
  }
}

