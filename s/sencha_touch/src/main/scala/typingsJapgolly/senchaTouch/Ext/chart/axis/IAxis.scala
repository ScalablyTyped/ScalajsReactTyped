package typingsJapgolly.senchaTouch.Ext.chart.axis

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.chart.IAbstractChart
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import typingsJapgolly.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis extends IObservable {
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[IAbstractChart] = js.undefined
  /** [Config Option] (Array) */
  var fields: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.undefined
  /** [Method] Mapping data value into coordinate
  		* @param value *
  		* @param field String
  		* @param idx Number
  		* @param items Ext.util.MixedCollection
  		* @returns Number
  		*/
  var getCoordFor: js.UndefOr[
    js.Function4[
      /* value */ js.UndefOr[js.Any], 
      /* field */ js.UndefOr[String], 
      /* idx */ js.UndefOr[Double], 
      /* items */ js.UndefOr[IMixedCollection], 
      Double
    ]
  ] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  var getFields: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of grid
  		* @returns Object
  		*/
  var getGrid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelInSpan
  		* @returns Boolean
  		*/
  var getLabelInSpan: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of majorTickSteps
  		* @returns Number
  		*/
  var getMajorTickSteps: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxZoom
  		* @returns Number
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maximum
  		* @returns Number
  		*/
  var getMaximum: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minZoom
  		* @returns Number
  		*/
  var getMinZoom: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minimum
  		* @returns Number
  		*/
  var getMinimum: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minorTickSteps
  		* @returns Number
  		*/
  var getMinorTickSteps: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of needHighPrecision
  		* @returns Boolean
  		*/
  var getNeedHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of position
  		* @returns String
  		*/
  var getPosition: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Get the range derived from all the bound series
  		* @returns Array
  		*/
  var getRange: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String|Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of titleMargin
  		* @returns Number
  		*/
  var getTitleMargin: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of visibleRange
  		* @returns Array
  		*/
  var getVisibleRange: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (Object) */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var labelInSpan: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minZoom: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var needHighPrecision: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  /** [Method] Invoked when data has changed  */
  var processData: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAxis: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Invokes renderFrame on this axis s surface s  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of grid
  		* @param grid Object The new value.
  		*/
  var setGrid: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of labelInSpan
  		* @param labelInSpan Boolean The new value.
  		*/
  var setLabelInSpan: js.UndefOr[js.Function1[/* labelInSpan */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of majorTickSteps
  		* @param majorTickSteps Number The new value.
  		*/
  var setMajorTickSteps: js.UndefOr[js.Function1[/* majorTickSteps */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Number The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maximum
  		* @param maximum Number The new value.
  		*/
  var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minZoom
  		* @param minZoom Number The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minimum
  		* @param minimum Number The new value.
  		*/
  var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minorTickSteps
  		* @param minorTickSteps Number The new value.
  		*/
  var setMinorTickSteps: js.UndefOr[js.Function1[/* minorTickSteps */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of needHighPrecision
  		* @param needHighPrecision Boolean The new value.
  		*/
  var setNeedHighPrecision: js.UndefOr[js.Function1[/* needHighPrecision */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of position
  		* @param position String The new value.
  		*/
  var setPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns String The label to display.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], String]] = js.undefined
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String|Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of titleMargin
  		* @param titleMargin Number The new value.
  		*/
  var setTitleMargin: js.UndefOr[js.Function1[/* titleMargin */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of visibleRange
  		* @param visibleRange Array The new value.
  		*/
  var setVisibleRange: js.UndefOr[js.Function1[/* visibleRange */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String|Object) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var titleMargin: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Array) */
  var visibleRange: js.UndefOr[Array] = js.undefined
}

object IAxis {
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
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    chart: IAbstractChart = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fields: Array = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getBackground: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getChart: js.UndefOr[CallbackTo[IAbstractChart]] = js.undefined,
    getCoordFor: (/* value */ js.UndefOr[js.Any], /* field */ js.UndefOr[String], /* idx */ js.UndefOr[Double], /* items */ js.UndefOr[IMixedCollection]) => CallbackTo[Double] = null,
    getFields: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getGrid: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHidden: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getIncrement: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLabel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLabelInSpan: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
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
    getSegmenter: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitleMargin: js.UndefOr[CallbackTo[Double]] = js.undefined,
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
    setBackground: /* background */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setChart: /* chart */ js.UndefOr[IAbstractChart] => Callback = null,
    setFields: /* fields */ js.UndefOr[Array] => Callback = null,
    setGrid: /* grid */ js.UndefOr[js.Any] => Callback = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Callback = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Callback = null,
    setLabel: /* label */ js.UndefOr[js.Any] => Callback = null,
    setLabelInSpan: /* labelInSpan */ js.UndefOr[Boolean] => Callback = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Callback = null,
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
    setSegmenter: /* segmenter */ js.UndefOr[js.Any] => Callback = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Callback = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Callback = null,
    setTitleMargin: /* titleMargin */ js.UndefOr[Double] => Callback = null,
    setVisibleRange: /* visibleRange */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    style: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    title: js.Any = null,
    titleMargin: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    visibleRange: Array = null
  ): IAxis = {
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
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getBackground.foreach(p => __obj.updateDynamic("getBackground")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getChart.foreach(p => __obj.updateDynamic("getChart")(p.toJsFn))
    if (getCoordFor != null) __obj.updateDynamic("getCoordFor")(js.Any.fromFunction4((t0: /* value */ js.UndefOr[js.Any], t1: /* field */ js.UndefOr[java.lang.String], t2: /* idx */ js.UndefOr[scala.Double], t3: /* items */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IMixedCollection]) => getCoordFor(t0, t1, t2, t3).runNow()))
    getFields.foreach(p => __obj.updateDynamic("getFields")(p.toJsFn))
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
    getStyle.foreach(p => __obj.updateDynamic("getStyle")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    getTitleMargin.foreach(p => __obj.updateDynamic("getTitleMargin")(p.toJsFn))
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
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1((t0: /* background */ js.UndefOr[js.Any]) => setBackground(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1((t0: /* chart */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.chart.IAbstractChart]) => setChart(t0).runNow()))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1((t0: /* fields */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFields(t0).runNow()))
    if (setGrid != null) __obj.updateDynamic("setGrid")(js.Any.fromFunction1((t0: /* grid */ js.UndefOr[js.Any]) => setGrid(t0).runNow()))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1((t0: /* hidden */ js.UndefOr[scala.Boolean]) => setHidden(t0).runNow()))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1((t0: /* increment */ js.UndefOr[scala.Double]) => setIncrement(t0).runNow()))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: /* label */ js.UndefOr[js.Any]) => setLabel(t0).runNow()))
    if (setLabelInSpan != null) __obj.updateDynamic("setLabelInSpan")(js.Any.fromFunction1((t0: /* labelInSpan */ js.UndefOr[scala.Boolean]) => setLabelInSpan(t0).runNow()))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1((t0: /* layout */ js.UndefOr[js.Any]) => setLayout(t0).runNow()))
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
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1((t0: /* segmenter */ js.UndefOr[js.Any]) => setSegmenter(t0).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: /* style */ js.UndefOr[js.Any]) => setStyle(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[js.Any]) => setTitle(t0).runNow()))
    if (setTitleMargin != null) __obj.updateDynamic("setTitleMargin")(js.Any.fromFunction1((t0: /* titleMargin */ js.UndefOr[scala.Double]) => setTitleMargin(t0).runNow()))
    if (setVisibleRange != null) __obj.updateDynamic("setVisibleRange")(js.Any.fromFunction1((t0: /* visibleRange */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setVisibleRange(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleMargin != null) __obj.updateDynamic("titleMargin")(titleMargin.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
}

