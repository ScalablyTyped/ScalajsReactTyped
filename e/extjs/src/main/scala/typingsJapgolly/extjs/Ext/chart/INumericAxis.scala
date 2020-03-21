package typingsJapgolly.extjs.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumericAxis
  extends typingsJapgolly.extjs.Ext.chart.axis.IAxis {
  /** [Config Option] (Boolean) */
  var adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var decimals: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.undefined
}

object INumericAxis {
  @scala.inline
  def apply(
    adjustEnd: js.UndefOr[Boolean] = js.undefined,
    adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.undefined,
    adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.undefined,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    dashSize: Int | Double = null,
    decimals: Int | Double = null,
    drawAxis: /* init */ js.UndefOr[js.Any] => Callback = null,
    drawGrid: js.UndefOr[Callback] = js.undefined,
    drawLabel: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    fields: Array = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    grid: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[INumericAxis] = null,
    label: ILabel = null,
    length: Int | Double = null,
    majorTickSteps: Int | Double = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    minorTickSteps: Int | Double = null,
    mixins: js.Any = null,
    position: String = null,
    requires: Array = null,
    self: IClass = null,
    setTitle: /* title */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    title: String = null,
    uses: Array = null,
    width: Int | Double = null
  ): INumericAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustEnd)) __obj.updateDynamic("adjustEnd")(adjustEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustMaximumByMajorUnit)) __obj.updateDynamic("adjustMaximumByMajorUnit")(adjustMaximumByMajorUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustMinimumByMajorUnit)) __obj.updateDynamic("adjustMinimumByMajorUnit")(adjustMinimumByMajorUnit.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain.asInstanceOf[js.Any])
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (drawAxis != null) __obj.updateDynamic("drawAxis")(js.Any.fromFunction1((t0: /* init */ js.UndefOr[js.Any]) => drawAxis(t0).runNow()))
    drawGrid.foreach(p => __obj.updateDynamic("drawGrid")(p.toJsFn))
    drawLabel.foreach(p => __obj.updateDynamic("drawLabel")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericAxis]
  }
}

