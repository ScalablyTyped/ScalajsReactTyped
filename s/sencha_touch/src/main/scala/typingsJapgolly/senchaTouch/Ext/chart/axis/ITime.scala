package typingsJapgolly.senchaTouch.Ext.chart.axis

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.chart.IAbstractChart
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends INumeric {
  /** [Config Option] (Boolean) */
  var calculateByLabelSize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of calculateByLabelSize
  		* @returns Boolean
  		*/
  var getCalculateByLabelSize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Mapping data value into coordinate
  		* @param value Object
  		* @returns Number
  		*/
  @JSName("getCoordFor")
  var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Returns the value of dateFormat
  		* @returns String/Boolean
  		*/
  var getDateFormat: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fromDate
  		* @returns Date
  		*/
  var getFromDate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of step
  		* @returns Array
  		*/
  var getStep: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of toDate
  		* @returns Date
  		*/
  var getToDate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of calculateByLabelSize
  		* @param calculateByLabelSize Boolean The new value.
  		*/
  var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String/Boolean The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of fromDate
  		* @param fromDate Date The new value.
  		*/
  var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of step
  		* @param step Array The new value.
  		*/
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of toDate
  		* @param toDate Date The new value.
  		*/
  var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    calculateByLabelSize: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    chart: IAbstractChart = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    dateFormat: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fields: Array = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fromDate: js.Any = null,
    getAggregator: js.UndefOr[CallbackTo[String]] = js.undefined,
    getBackground: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCalculateByLabelSize: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getChart: js.UndefOr[CallbackTo[IAbstractChart]] = js.undefined,
    getCoordFor: /* value */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    getDateFormat: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFields: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getFromDate: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getGrid: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHidden: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getIncrement: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLabel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLabelInSpan: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[String]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMajorTickSteps: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxZoom: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaximum: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinZoom: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinimum: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinorTickSteps: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getNeedHighPrecision: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getPosition: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRange: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRenderer: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSegmenter: js.UndefOr[CallbackTo[String]] = js.undefined,
    getStep: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitleMargin: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getToDate: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getVisibleRange: js.UndefOr[CallbackTo[Array]] = js.undefined,
    grid: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    increment: Int | Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    label: js.Any = null,
    labelInSpan: js.UndefOr[Boolean] = js.undefined,
    layout: js.Any = null,
    listeners: js.Any = null,
    majorTickSteps: Int | Double = null,
    maxZoom: Int | Double = null,
    maximum: Int | Double = null,
    minZoom: Int | Double = null,
    minimum: Int | Double = null,
    minorTickSteps: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    needHighPrecision: js.UndefOr[Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    position: String = null,
    processData: js.UndefOr[Callback] = js.undefined,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    renderFrame: js.UndefOr[Callback] = js.undefined,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    segmenter: js.Any = null,
    self: IClass = null,
    setAggregator: /* aggregator */ js.UndefOr[String] => Callback = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setCalculateByLabelSize: /* calculateByLabelSize */ js.UndefOr[Boolean] => Callback = null,
    setChart: /* chart */ js.UndefOr[IAbstractChart] => Callback = null,
    setDateFormat: /* dateFormat */ js.UndefOr[js.Any] => Callback = null,
    setFields: /* fields */ js.UndefOr[Array] => Callback = null,
    setFromDate: /* fromDate */ js.UndefOr[js.Any] => Callback = null,
    setGrid: /* grid */ js.UndefOr[js.Any] => Callback = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Callback = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Callback = null,
    setLabel: /* label */ js.UndefOr[js.Any] => Callback = null,
    setLabelInSpan: /* labelInSpan */ js.UndefOr[Boolean] => Callback = null,
    setLayout: /* layout */ js.UndefOr[String] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMajorTickSteps: /* majorTickSteps */ js.UndefOr[Double] => Callback = null,
    setMaxZoom: /* maxZoom */ js.UndefOr[Double] => Callback = null,
    setMaximum: /* maximum */ js.UndefOr[Double] => Callback = null,
    setMinZoom: /* minZoom */ js.UndefOr[Double] => Callback = null,
    setMinimum: /* minimum */ js.UndefOr[Double] => Callback = null,
    setMinorTickSteps: /* minorTickSteps */ js.UndefOr[Double] => Callback = null,
    setNeedHighPrecision: /* needHighPrecision */ js.UndefOr[Boolean] => Callback = null,
    setPosition: /* position */ js.UndefOr[String] => Callback = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    setSegmenter: /* segmenter */ js.UndefOr[String] => Callback = null,
    setStep: /* step */ js.UndefOr[Array] => Callback = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Callback = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Callback = null,
    setTitleMargin: /* titleMargin */ js.UndefOr[Double] => Callback = null,
    setToDate: /* toDate */ js.UndefOr[js.Any] => Callback = null,
    setVisibleRange: /* visibleRange */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    step: Array = null,
    style: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    title: js.Any = null,
    titleMargin: Int | Double = null,
    toDate: js.Any = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    visibleRange: Array = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(calculateByLabelSize)) __obj.updateDynamic("calculateByLabelSize")(calculateByLabelSize.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fromDate != null) __obj.updateDynamic("fromDate")(fromDate.asInstanceOf[js.Any])
    getAggregator.foreach(p => __obj.updateDynamic("getAggregator")(p.toJsFn))
    getBackground.foreach(p => __obj.updateDynamic("getBackground")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getCalculateByLabelSize.foreach(p => __obj.updateDynamic("getCalculateByLabelSize")(p.toJsFn))
    getChart.foreach(p => __obj.updateDynamic("getChart")(p.toJsFn))
    if (getCoordFor != null) __obj.updateDynamic("getCoordFor")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => getCoordFor(t0).runNow()))
    getDateFormat.foreach(p => __obj.updateDynamic("getDateFormat")(p.toJsFn))
    getFields.foreach(p => __obj.updateDynamic("getFields")(p.toJsFn))
    getFromDate.foreach(p => __obj.updateDynamic("getFromDate")(p.toJsFn))
    getGrid.foreach(p => __obj.updateDynamic("getGrid")(p.toJsFn))
    getHidden.foreach(p => __obj.updateDynamic("getHidden")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    getIncrement.foreach(p => __obj.updateDynamic("getIncrement")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLabel.foreach(p => __obj.updateDynamic("getLabel")(p.toJsFn))
    getLabelInSpan.foreach(p => __obj.updateDynamic("getLabelInSpan")(p.toJsFn))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMajorTickSteps.foreach(p => __obj.updateDynamic("getMajorTickSteps")(p.toJsFn))
    getMaxZoom.foreach(p => __obj.updateDynamic("getMaxZoom")(p.toJsFn))
    getMaximum.foreach(p => __obj.updateDynamic("getMaximum")(p.toJsFn))
    getMinZoom.foreach(p => __obj.updateDynamic("getMinZoom")(p.toJsFn))
    getMinimum.foreach(p => __obj.updateDynamic("getMinimum")(p.toJsFn))
    getMinorTickSteps.foreach(p => __obj.updateDynamic("getMinorTickSteps")(p.toJsFn))
    getNeedHighPrecision.foreach(p => __obj.updateDynamic("getNeedHighPrecision")(p.toJsFn))
    getPosition.foreach(p => __obj.updateDynamic("getPosition")(p.toJsFn))
    getRange.foreach(p => __obj.updateDynamic("getRange")(p.toJsFn))
    getRenderer.foreach(p => __obj.updateDynamic("getRenderer")(p.toJsFn))
    getSegmenter.foreach(p => __obj.updateDynamic("getSegmenter")(p.toJsFn))
    getStep.foreach(p => __obj.updateDynamic("getStep")(p.toJsFn))
    getStyle.foreach(p => __obj.updateDynamic("getStyle")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    getTitleMargin.foreach(p => __obj.updateDynamic("getTitleMargin")(p.toJsFn))
    getToDate.foreach(p => __obj.updateDynamic("getToDate")(p.toJsFn))
    getVisibleRange.foreach(p => __obj.updateDynamic("getVisibleRange")(p.toJsFn))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInSpan)) __obj.updateDynamic("labelInSpan")(labelInSpan.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(needHighPrecision)) __obj.updateDynamic("needHighPrecision")(needHighPrecision.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    processData.foreach(p => __obj.updateDynamic("processData")(p.toJsFn))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    renderFrame.foreach(p => __obj.updateDynamic("renderFrame")(p.toJsFn))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAggregator != null) __obj.updateDynamic("setAggregator")(js.Any.fromFunction1((t0: /* aggregator */ js.UndefOr[java.lang.String]) => setAggregator(t0).runNow()))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1((t0: /* background */ js.UndefOr[js.Any]) => setBackground(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setCalculateByLabelSize != null) __obj.updateDynamic("setCalculateByLabelSize")(js.Any.fromFunction1((t0: /* calculateByLabelSize */ js.UndefOr[scala.Boolean]) => setCalculateByLabelSize(t0).runNow()))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1((t0: /* chart */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.IAbstractChart]) => setChart(t0).runNow()))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1((t0: /* dateFormat */ js.UndefOr[js.Any]) => setDateFormat(t0).runNow()))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1((t0: /* fields */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFields(t0).runNow()))
    if (setFromDate != null) __obj.updateDynamic("setFromDate")(js.Any.fromFunction1((t0: /* fromDate */ js.UndefOr[js.Any]) => setFromDate(t0).runNow()))
    if (setGrid != null) __obj.updateDynamic("setGrid")(js.Any.fromFunction1((t0: /* grid */ js.UndefOr[js.Any]) => setGrid(t0).runNow()))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1((t0: /* hidden */ js.UndefOr[scala.Boolean]) => setHidden(t0).runNow()))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1((t0: /* increment */ js.UndefOr[scala.Double]) => setIncrement(t0).runNow()))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: /* label */ js.UndefOr[js.Any]) => setLabel(t0).runNow()))
    if (setLabelInSpan != null) __obj.updateDynamic("setLabelInSpan")(js.Any.fromFunction1((t0: /* labelInSpan */ js.UndefOr[scala.Boolean]) => setLabelInSpan(t0).runNow()))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1((t0: /* layout */ js.UndefOr[java.lang.String]) => setLayout(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMajorTickSteps != null) __obj.updateDynamic("setMajorTickSteps")(js.Any.fromFunction1((t0: /* majorTickSteps */ js.UndefOr[scala.Double]) => setMajorTickSteps(t0).runNow()))
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(js.Any.fromFunction1((t0: /* maxZoom */ js.UndefOr[scala.Double]) => setMaxZoom(t0).runNow()))
    if (setMaximum != null) __obj.updateDynamic("setMaximum")(js.Any.fromFunction1((t0: /* maximum */ js.UndefOr[scala.Double]) => setMaximum(t0).runNow()))
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(js.Any.fromFunction1((t0: /* minZoom */ js.UndefOr[scala.Double]) => setMinZoom(t0).runNow()))
    if (setMinimum != null) __obj.updateDynamic("setMinimum")(js.Any.fromFunction1((t0: /* minimum */ js.UndefOr[scala.Double]) => setMinimum(t0).runNow()))
    if (setMinorTickSteps != null) __obj.updateDynamic("setMinorTickSteps")(js.Any.fromFunction1((t0: /* minorTickSteps */ js.UndefOr[scala.Double]) => setMinorTickSteps(t0).runNow()))
    if (setNeedHighPrecision != null) __obj.updateDynamic("setNeedHighPrecision")(js.Any.fromFunction1((t0: /* needHighPrecision */ js.UndefOr[scala.Boolean]) => setNeedHighPrecision(t0).runNow()))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: /* position */ js.UndefOr[java.lang.String]) => setPosition(t0).runNow()))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1((t0: /* renderer */ js.UndefOr[js.Any]) => setRenderer(t0).runNow()))
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1((t0: /* segmenter */ js.UndefOr[java.lang.String]) => setSegmenter(t0).runNow()))
    if (setStep != null) __obj.updateDynamic("setStep")(js.Any.fromFunction1((t0: /* step */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setStep(t0).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: /* style */ js.UndefOr[js.Any]) => setStyle(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[js.Any]) => setTitle(t0).runNow()))
    if (setTitleMargin != null) __obj.updateDynamic("setTitleMargin")(js.Any.fromFunction1((t0: /* titleMargin */ js.UndefOr[scala.Double]) => setTitleMargin(t0).runNow()))
    if (setToDate != null) __obj.updateDynamic("setToDate")(js.Any.fromFunction1((t0: /* toDate */ js.UndefOr[js.Any]) => setToDate(t0).runNow()))
    if (setVisibleRange != null) __obj.updateDynamic("setVisibleRange")(js.Any.fromFunction1((t0: /* visibleRange */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setVisibleRange(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleMargin != null) __obj.updateDynamic("titleMargin")(titleMargin.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITime]
  }
}

