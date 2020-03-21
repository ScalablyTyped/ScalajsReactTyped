package typingsJapgolly.senchaTouch.Ext.chart.axis.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.chart.axis.IAxis
import typingsJapgolly.senchaTouch.Ext.chart.series.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContinuous extends ILayout {
  /** [Method] Returns the value of adjustMaximumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of adjustMinimumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of adjustMaximumByMajorUnit
  		* @param adjustMaximumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMaximumByMajorUnit: js.UndefOr[js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of adjustMinimumByMajorUnit
  		* @param adjustMinimumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMinimumByMajorUnit: js.UndefOr[js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Object
  		* @param max Object
  		* @param estStepSize Object
  		*/
  @JSName("snapEnds")
  var snapEnds_IContinuous: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IContinuous {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    axis: IAxis = null,
    calculateLayout: /* context */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    calculateMajorTicks: /* context */ js.UndefOr[js.Any] => Callback = null,
    calculateMinorTicks: /* context */ js.UndefOr[js.Any] => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getAdjustMaximumByMajorUnit: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAdjustMinimumByMajorUnit: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAxis: js.UndefOr[CallbackTo[IAxis]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    processData: /* series */ js.UndefOr[ISeries] => Callback = null,
    self: IClass = null,
    setAdjustMaximumByMajorUnit: /* adjustMaximumByMajorUnit */ js.UndefOr[Boolean] => Callback = null,
    setAdjustMinimumByMajorUnit: /* adjustMinimumByMajorUnit */ js.UndefOr[Boolean] => Callback = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapEnds: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Callback = null,
    statics: js.Any = null,
    trimByRange: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Callback = null,
    uses: Array = null
  ): IContinuous = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (calculateLayout != null) __obj.updateDynamic("calculateLayout")(js.Any.fromFunction1((t0: /* context */ js.UndefOr[js.Any]) => calculateLayout(t0).runNow()))
    if (calculateMajorTicks != null) __obj.updateDynamic("calculateMajorTicks")(js.Any.fromFunction1((t0: /* context */ js.UndefOr[js.Any]) => calculateMajorTicks(t0).runNow()))
    if (calculateMinorTicks != null) __obj.updateDynamic("calculateMinorTicks")(js.Any.fromFunction1((t0: /* context */ js.UndefOr[js.Any]) => calculateMinorTicks(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAdjustMaximumByMajorUnit.foreach(p => __obj.updateDynamic("getAdjustMaximumByMajorUnit")(p.toJsFn))
    getAdjustMinimumByMajorUnit.foreach(p => __obj.updateDynamic("getAdjustMinimumByMajorUnit")(p.toJsFn))
    getAxis.foreach(p => __obj.updateDynamic("getAxis")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (processData != null) __obj.updateDynamic("processData")(js.Any.fromFunction1((t0: /* series */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.series.ISeries]) => processData(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAdjustMaximumByMajorUnit != null) __obj.updateDynamic("setAdjustMaximumByMajorUnit")(js.Any.fromFunction1((t0: /* adjustMaximumByMajorUnit */ js.UndefOr[scala.Boolean]) => setAdjustMaximumByMajorUnit(t0).runNow()))
    if (setAdjustMinimumByMajorUnit != null) __obj.updateDynamic("setAdjustMinimumByMajorUnit")(js.Any.fromFunction1((t0: /* adjustMinimumByMajorUnit */ js.UndefOr[scala.Boolean]) => setAdjustMinimumByMajorUnit(t0).runNow()))
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1((t0: /* axis */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.axis.IAxis]) => setAxis(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (snapEnds != null) __obj.updateDynamic("snapEnds")(js.Any.fromFunction4((t0: /* context */ js.UndefOr[js.Any], t1: /* min */ js.UndefOr[js.Any], t2: /* max */ js.UndefOr[js.Any], t3: /* estStepSize */ js.UndefOr[js.Any]) => snapEnds(t0, t1, t2, t3).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (trimByRange != null) __obj.updateDynamic("trimByRange")(js.Any.fromFunction4((t0: /* context */ js.UndefOr[js.Any], t1: /* out */ js.UndefOr[js.Any], t2: /* trimMin */ js.UndefOr[scala.Double], t3: /* trimMax */ js.UndefOr[scala.Double]) => trimByRange(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContinuous]
  }
}

