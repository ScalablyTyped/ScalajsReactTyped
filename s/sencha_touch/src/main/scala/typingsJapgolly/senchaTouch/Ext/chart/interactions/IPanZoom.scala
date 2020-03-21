package typingsJapgolly.senchaTouch.Ext.chart.interactions

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.chart.IAbstractChart
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanZoom extends IAbstract {
  /** [Config Option] (Object/Array) */
  var axes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of axes
  		* @returns Object/Array
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hideLabelInGesture
  		* @returns Boolean
  		*/
  var getHideLabelInGesture: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of maxZoom
  		* @returns Object
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minZoom
  		* @returns Object
  		*/
  var getMinZoom: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of modeToggleButton
  		* @returns Object
  		*/
  var getModeToggleButton: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of panGesture
  		* @returns String
  		*/
  var getPanGesture: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of showOverflowArrows
  		* @returns Boolean
  		*/
  var getShowOverflowArrows: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of zoomOnPanGesture
  		* @returns Boolean
  		*/
  var getZoomOnPanGesture: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Placeholder method
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_IPanZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var overflowArrowOptions: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of axes
  		* @param axes Object/Array The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of hideLabelInGesture
  		* @param hideLabelInGesture Boolean The new value.
  		*/
  var setHideLabelInGesture: js.UndefOr[js.Function1[/* hideLabelInGesture */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Object The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of minZoom
  		* @param minZoom Object The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of modeToggleButton
  		* @param modeToggleButton Object The new value.
  		*/
  var setModeToggleButton: js.UndefOr[js.Function1[/* modeToggleButton */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of panGesture
  		* @param panGesture String The new value.
  		*/
  var setPanGesture: js.UndefOr[js.Function1[/* panGesture */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of showOverflowArrows
  		* @param showOverflowArrows Boolean The new value.
  		*/
  var setShowOverflowArrows: js.UndefOr[js.Function1[/* showOverflowArrows */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of zoomOnPanGesture
  		* @param zoomOnPanGesture Boolean The new value.
  		*/
  var setZoomOnPanGesture: js.UndefOr[js.Function1[/* zoomOnPanGesture */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showOverflowArrows: js.UndefOr[Boolean] = js.undefined
}

object IPanZoom {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    axes: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    chart: IAbstractChart = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    gesture: String = null,
    getAxes: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getChart: js.UndefOr[CallbackTo[IAbstractChart]] = js.undefined,
    getEnabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getGesture: js.UndefOr[CallbackTo[String]] = js.undefined,
    getHideLabelInGesture: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getItemForEvent: /* e */ js.UndefOr[Event_] => CallbackTo[js.Any] = null,
    getItemsForEvent: /* e */ js.UndefOr[Event_] => CallbackTo[Array] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMaxZoom: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMinZoom: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModeToggleButton: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPanGesture: js.UndefOr[CallbackTo[String]] = js.undefined,
    getShowOverflowArrows: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getZoomOnPanGesture: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    initialize: js.UndefOr[Callback] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onGesture: /* e */ js.UndefOr[js.Any] => Callback = null,
    overflowArrowOptions: js.Any = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setAxes: /* axes */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setChart: /* chart */ js.UndefOr[IAbstractChart] => Callback = null,
    setEnabled: /* enabled */ js.UndefOr[Boolean] => Callback = null,
    setGesture: /* gesture */ js.UndefOr[String] => Callback = null,
    setHideLabelInGesture: /* hideLabelInGesture */ js.UndefOr[Boolean] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMaxZoom: /* maxZoom */ js.UndefOr[js.Any] => Callback = null,
    setMinZoom: /* minZoom */ js.UndefOr[js.Any] => Callback = null,
    setModeToggleButton: /* modeToggleButton */ js.UndefOr[js.Any] => Callback = null,
    setPanGesture: /* panGesture */ js.UndefOr[String] => Callback = null,
    setShowOverflowArrows: /* showOverflowArrows */ js.UndefOr[Boolean] => Callback = null,
    setZoomOnPanGesture: /* zoomOnPanGesture */ js.UndefOr[Boolean] => Callback = null,
    showOverflowArrows: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    throttleGap: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IPanZoom = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (gesture != null) __obj.updateDynamic("gesture")(gesture.asInstanceOf[js.Any])
    getAxes.foreach(p => __obj.updateDynamic("getAxes")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getChart.foreach(p => __obj.updateDynamic("getChart")(p.toJsFn))
    getEnabled.foreach(p => __obj.updateDynamic("getEnabled")(p.toJsFn))
    getGesture.foreach(p => __obj.updateDynamic("getGesture")(p.toJsFn))
    getHideLabelInGesture.foreach(p => __obj.updateDynamic("getHideLabelInGesture")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getItemForEvent != null) __obj.updateDynamic("getItemForEvent")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => getItemForEvent(t0).runNow()))
    if (getItemsForEvent != null) __obj.updateDynamic("getItemsForEvent")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => getItemsForEvent(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMaxZoom.foreach(p => __obj.updateDynamic("getMaxZoom")(p.toJsFn))
    getMinZoom.foreach(p => __obj.updateDynamic("getMinZoom")(p.toJsFn))
    getModeToggleButton.foreach(p => __obj.updateDynamic("getModeToggleButton")(p.toJsFn))
    getPanGesture.foreach(p => __obj.updateDynamic("getPanGesture")(p.toJsFn))
    getShowOverflowArrows.foreach(p => __obj.updateDynamic("getShowOverflowArrows")(p.toJsFn))
    getZoomOnPanGesture.foreach(p => __obj.updateDynamic("getZoomOnPanGesture")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initialize.foreach(p => __obj.updateDynamic("initialize")(p.toJsFn))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (onGesture != null) __obj.updateDynamic("onGesture")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onGesture(t0).runNow()))
    if (overflowArrowOptions != null) __obj.updateDynamic("overflowArrowOptions")(overflowArrowOptions.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAxes != null) __obj.updateDynamic("setAxes")(js.Any.fromFunction1((t0: /* axes */ js.UndefOr[js.Any]) => setAxes(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1((t0: /* chart */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.IAbstractChart]) => setChart(t0).runNow()))
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(js.Any.fromFunction1((t0: /* enabled */ js.UndefOr[scala.Boolean]) => setEnabled(t0).runNow()))
    if (setGesture != null) __obj.updateDynamic("setGesture")(js.Any.fromFunction1((t0: /* gesture */ js.UndefOr[java.lang.String]) => setGesture(t0).runNow()))
    if (setHideLabelInGesture != null) __obj.updateDynamic("setHideLabelInGesture")(js.Any.fromFunction1((t0: /* hideLabelInGesture */ js.UndefOr[scala.Boolean]) => setHideLabelInGesture(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(js.Any.fromFunction1((t0: /* maxZoom */ js.UndefOr[js.Any]) => setMaxZoom(t0).runNow()))
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(js.Any.fromFunction1((t0: /* minZoom */ js.UndefOr[js.Any]) => setMinZoom(t0).runNow()))
    if (setModeToggleButton != null) __obj.updateDynamic("setModeToggleButton")(js.Any.fromFunction1((t0: /* modeToggleButton */ js.UndefOr[js.Any]) => setModeToggleButton(t0).runNow()))
    if (setPanGesture != null) __obj.updateDynamic("setPanGesture")(js.Any.fromFunction1((t0: /* panGesture */ js.UndefOr[java.lang.String]) => setPanGesture(t0).runNow()))
    if (setShowOverflowArrows != null) __obj.updateDynamic("setShowOverflowArrows")(js.Any.fromFunction1((t0: /* showOverflowArrows */ js.UndefOr[scala.Boolean]) => setShowOverflowArrows(t0).runNow()))
    if (setZoomOnPanGesture != null) __obj.updateDynamic("setZoomOnPanGesture")(js.Any.fromFunction1((t0: /* zoomOnPanGesture */ js.UndefOr[scala.Boolean]) => setZoomOnPanGesture(t0).runNow()))
    if (!js.isUndefined(showOverflowArrows)) __obj.updateDynamic("showOverflowArrows")(showOverflowArrows.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (throttleGap != null) __obj.updateDynamic("throttleGap")(throttleGap.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanZoom]
  }
}

