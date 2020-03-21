package typingsJapgolly.morrisJs.morris

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarOptions extends IGridChartOptions {
  /** Array containing colors for the series bars. */
  var barColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ IBarOptions, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.undefined
  /** Set to true to draw bars stacked vertically. */
  var stacked: js.UndefOr[Boolean] = js.undefined
}

object IBarOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String],
    axes: js.UndefOr[Boolean] = js.undefined,
    barColors: js.Array[String] = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridStrokeWidth: Int | Double = null,
    gridTextColor: String = null,
    gridTextFamily: String = null,
    gridTextSize: Int | Double = null,
    gridTextWeight: String = null,
    hideHover: Boolean | AutoAlways = null,
    hoverCallback: (/* index */ Double, /* options */ IBarOptions, /* content */ String, /* row */ js.Any) => CallbackTo[String] = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined
  ): IBarOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (barColors != null) __obj.updateDynamic("barColors")(barColors.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridStrokeWidth != null) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor.asInstanceOf[js.Any])
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily.asInstanceOf[js.Any])
    if (gridTextSize != null) __obj.updateDynamic("gridTextSize")(gridTextSize.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight.asInstanceOf[js.Any])
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (hoverCallback != null) __obj.updateDynamic("hoverCallback")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* options */ typingsJapgolly.morrisJs.morris.IBarOptions, t2: /* content */ java.lang.String, t3: /* row */ js.Any) => hoverCallback(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarOptions]
  }
}

