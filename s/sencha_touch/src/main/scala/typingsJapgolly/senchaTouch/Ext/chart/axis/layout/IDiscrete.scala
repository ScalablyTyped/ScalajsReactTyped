package typingsJapgolly.senchaTouch.Ext.chart.axis.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiscrete extends ILayout {
  /** [Method] Processes the data of the series bound to the axis  */
  @JSName("processData")
  var processData_IDiscrete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Object
  		* @param max Object
  		* @param estStepSize Object
  		*/
  @JSName("snapEnds")
  var snapEnds_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
  		* @param context Object
  		* @param out Object
  		* @param trimMin Object
  		* @param trimMax Object
  		*/
  @JSName("trimByRange")
  var trimByRange_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[js.Any], 
      /* trimMax */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IDiscrete {
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
    getAxis: js.UndefOr[CallbackTo[IAxis]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    processData: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapEnds: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Callback = null,
    statics: js.Any = null,
    trimByRange: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[js.Any], /* trimMax */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IDiscrete = {
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
    getAxis.foreach(p => __obj.updateDynamic("getAxis")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    processData.foreach(p => __obj.updateDynamic("processData")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1((t0: /* axis */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.axis.IAxis]) => setAxis(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (snapEnds != null) __obj.updateDynamic("snapEnds")(js.Any.fromFunction4((t0: /* context */ js.UndefOr[js.Any], t1: /* min */ js.UndefOr[js.Any], t2: /* max */ js.UndefOr[js.Any], t3: /* estStepSize */ js.UndefOr[js.Any]) => snapEnds(t0, t1, t2, t3).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (trimByRange != null) __obj.updateDynamic("trimByRange")(js.Any.fromFunction4((t0: /* context */ js.UndefOr[js.Any], t1: /* out */ js.UndefOr[js.Any], t2: /* trimMin */ js.UndefOr[js.Any], t3: /* trimMax */ js.UndefOr[js.Any]) => trimByRange(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiscrete]
  }
}

