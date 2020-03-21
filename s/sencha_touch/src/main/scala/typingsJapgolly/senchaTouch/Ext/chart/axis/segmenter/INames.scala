package typingsJapgolly.senchaTouch.Ext.chart.axis.segmenter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INames extends ISegmenter {
  /** [Method] Add step units to the value
  		* @param value Object
  		* @param step Object
  		* @param unit Object
  		*/
  @JSName("add")
  var add_INames: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Align value with step of units
  		* @param value Object
  		* @param step Object
  		* @param unit Object
  		* @returns * Aligned value.
  		*/
  @JSName("align")
  var align_INames: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Given a start point and estimated step size of a range determine the preferred step size
  		* @param min Object
  		* @param estStepSize Object
  		* @param minIdx Object
  		* @param data Object
  		* @returns Object Return the step size by an object of step x unit.
  		*/
  @JSName("preferredStep")
  var preferredStep_INames: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      /* minIdx */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
}

object INames {
  @scala.inline
  def apply(
    add: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    align: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alternateClassName: js.Any = null,
    axis: IAxis = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    diff: (/* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => CallbackTo[Double] = null,
    extend: String = null,
    from: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getAxis: js.UndefOr[CallbackTo[IAxis]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    preferredStep: (/* min */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], /* minIdx */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    renderer: (/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any]) => CallbackTo[String] = null,
    self: IClass = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): INames = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction3((t0: /* value */ js.UndefOr[js.Any], t1: /* step */ js.UndefOr[js.Any], t2: /* unit */ js.UndefOr[js.Any]) => add(t0, t1, t2).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(js.Any.fromFunction3((t0: /* value */ js.UndefOr[js.Any], t1: /* step */ js.UndefOr[js.Any], t2: /* unit */ js.UndefOr[js.Any]) => align(t0, t1, t2).runNow()))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (diff != null) __obj.updateDynamic("diff")(js.Any.fromFunction3((t0: /* min */ js.UndefOr[js.Any], t1: /* max */ js.UndefOr[js.Any], t2: /* unit */ js.UndefOr[js.Any]) => diff(t0, t1, t2).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => from(t0).runNow()))
    getAxis.foreach(p => __obj.updateDynamic("getAxis")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (preferredStep != null) __obj.updateDynamic("preferredStep")(js.Any.fromFunction4((t0: /* min */ js.UndefOr[js.Any], t1: /* estStepSize */ js.UndefOr[js.Any], t2: /* minIdx */ js.UndefOr[js.Any], t3: /* data */ js.UndefOr[js.Any]) => preferredStep(t0, t1, t2, t3).runNow()))
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction2((t0: /* value */ js.UndefOr[js.Any], t1: /* context */ js.UndefOr[js.Any]) => renderer(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1((t0: /* axis */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.axis.IAxis]) => setAxis(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[INames]
  }
}

