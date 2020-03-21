package typingsJapgolly.senchaTouch.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeries extends IObservable {
  /** [Config Option] (Object) */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var colors: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the value of animate
  		* @returns Object
  		*/
  var getAnimate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of colors
  		* @returns Array
  		*/
  var getColors: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean|Array
  		*/
  var getHidden: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightCfg
  		* @returns Object
  		*/
  var getHighlightCfg: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @param target Object optional target to receive the result
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of itemInstancing
  		* @returns Object
  		*/
  var getItemInstancing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelField
  		* @returns String/String[]
  		*/
  var getLabelField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelOverflowPadding
  		* @returns Number
  		*/
  var getLabelOverflowPadding: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of marker
  		* @returns Object
  		*/
  var getMarker: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of markerSubStyle
  		* @returns Object
  		*/
  var getMarkerSubStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of overlaySurface
  		* @returns Object
  		*/
  var getOverlaySurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of showInLegend
  		* @returns Boolean
  		*/
  var getShowInLegend: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Performs drawing of this series  */
  var getSprites: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of subStyle
  		* @returns Object
  		*/
  var getSubStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of surface
  		* @returns Object
  		*/
  var getSurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Boolean|Array) */
  var hidden: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var itemInstancing: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]) */
  var labelField: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var marker: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var markerSubStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var overlaySurface: js.UndefOr[js.Any] = js.undefined
  /** [Method] Provide legend information to target array
  		* @param target Array The information consists:
  		*/
  var provideLegendInfo: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISeries: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Property] (String) */
  var seriesType: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of animate
  		* @param animate Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of colors
  		* @param colors Array The new value.
  		*/
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean|Array The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method]
  		* @param index Number
  		* @param value Boolean
  		*/
  var setHiddenByIndex: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Sets the value of highlightCfg
  		* @param highlightCfg Object The new value.
  		*/
  var setHighlightCfg: js.UndefOr[js.Function1[/* highlightCfg */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemInstancing
  		* @param itemInstancing Object The new value.
  		*/
  var setItemInstancing: js.UndefOr[js.Function1[/* itemInstancing */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		* @returns Object/String The attributes that have been changed or added, or the text for the label. Example to enclose every other label in parentheses: renderer: function (text) { if (index % 2 == 0) { return '(' + text + ')' } } Default value: null.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of labelField
  		* @param labelField String/String[] The new value.
  		*/
  var setLabelField: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of labelOverflowPadding
  		* @param labelOverflowPadding Number The new value.
  		*/
  var setLabelOverflowPadding: js.UndefOr[js.Function1[/* labelOverflowPadding */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of marker
  		* @param marker Object The new value.
  		*/
  var setMarker: js.UndefOr[js.Function1[/* marker */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of markerSubStyle
  		* @param markerSubStyle Object The new value.
  		*/
  var setMarkerSubStyle: js.UndefOr[js.Function1[/* markerSubStyle */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of overlaySurface
  		* @param overlaySurface Object The new value.
  		*/
  var setOverlaySurface: js.UndefOr[js.Function1[/* overlaySurface */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns Object The attributes that have been changed or added. Note: it is usually possible to add or modify the attributes directly into the config parameter and not return anything, but returning an object with only those attributes that have been changed may allow for optimizations in the rendering of some series. Example to draw every other item in red: renderer: function (sprite, config, rendererData, index) { if (index % 2 == 0) { return { strokeStyle: 'red' }; } }
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of showInLegend
  		* @param showInLegend Boolean The new value.
  		*/
  var setShowInLegend: js.UndefOr[js.Function1[/* showInLegend */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of subStyle
  		* @param subStyle Object The new value.
  		*/
  var setSubStyle: js.UndefOr[js.Function1[/* subStyle */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of surface
  		* @param surface Object The new value.
  		*/
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var subStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var surface: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}

object ISeries {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    colors: Array = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getAnimate: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBackground: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getColors: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getHidden: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHighlightCfg: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHighlightItem: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getItemForPoint: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* target */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    getItemInstancing: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLabel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLabelField: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLabelOverflowPadding: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMarker: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMarkerSubStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOverlaySurface: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRenderer: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getShowInLegend: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getSprites: js.UndefOr[Callback] = js.undefined,
    getStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSurface: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hidden: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    itemInstancing: js.Any = null,
    label: js.Any = null,
    labelField: js.Any = null,
    labelOverflowPadding: Int | Double = null,
    listeners: js.Any = null,
    marker: js.Any = null,
    markerSubStyle: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    overlaySurface: js.Any = null,
    platformConfig: js.Any = null,
    provideLegendInfo: /* target */ js.UndefOr[Array] => Callback = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    seriesType: String = null,
    setAnimate: /* animate */ js.UndefOr[js.Any] => Callback = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setColors: /* colors */ js.UndefOr[Array] => Callback = null,
    setHidden: /* hidden */ js.UndefOr[js.Any] => Callback = null,
    setHiddenByIndex: (/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean]) => Callback = null,
    setHighlightCfg: /* highlightCfg */ js.UndefOr[js.Any] => Callback = null,
    setHighlightItem: /* highlightItem */ js.UndefOr[js.Any] => Callback = null,
    setItemInstancing: /* itemInstancing */ js.UndefOr[js.Any] => Callback = null,
    setLabel: /* label */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    setLabelField: /* labelField */ js.UndefOr[js.Any] => Callback = null,
    setLabelOverflowPadding: /* labelOverflowPadding */ js.UndefOr[Double] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMarker: /* marker */ js.UndefOr[js.Any] => Callback = null,
    setMarkerSubStyle: /* markerSubStyle */ js.UndefOr[js.Any] => Callback = null,
    setOverlaySurface: /* overlaySurface */ js.UndefOr[js.Any] => Callback = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    setShowInLegend: /* showInLegend */ js.UndefOr[Boolean] => Callback = null,
    setStore: /* store */ js.UndefOr[js.Any] => Callback = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Callback = null,
    setSubStyle: /* subStyle */ js.UndefOr[js.Any] => Callback = null,
    setSurface: /* surface */ js.UndefOr[js.Any] => Callback = null,
    setTitle: /* title */ js.UndefOr[String] => Callback = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    style: js.Any = null,
    subStyle: js.Any = null,
    surface: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    title: String = null,
    `type`: String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): ISeries = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getAnimate.foreach(p => __obj.updateDynamic("getAnimate")(p.toJsFn))
    getBackground.foreach(p => __obj.updateDynamic("getBackground")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getColors.foreach(p => __obj.updateDynamic("getColors")(p.toJsFn))
    getHidden.foreach(p => __obj.updateDynamic("getHidden")(p.toJsFn))
    getHighlightCfg.foreach(p => __obj.updateDynamic("getHighlightCfg")(p.toJsFn))
    getHighlightItem.foreach(p => __obj.updateDynamic("getHighlightItem")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* target */ js.UndefOr[js.Any]) => getItemForPoint(t0, t1, t2).runNow()))
    getItemInstancing.foreach(p => __obj.updateDynamic("getItemInstancing")(p.toJsFn))
    getLabel.foreach(p => __obj.updateDynamic("getLabel")(p.toJsFn))
    getLabelField.foreach(p => __obj.updateDynamic("getLabelField")(p.toJsFn))
    getLabelOverflowPadding.foreach(p => __obj.updateDynamic("getLabelOverflowPadding")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMarker.foreach(p => __obj.updateDynamic("getMarker")(p.toJsFn))
    getMarkerSubStyle.foreach(p => __obj.updateDynamic("getMarkerSubStyle")(p.toJsFn))
    getOverlaySurface.foreach(p => __obj.updateDynamic("getOverlaySurface")(p.toJsFn))
    getRenderer.foreach(p => __obj.updateDynamic("getRenderer")(p.toJsFn))
    getShowInLegend.foreach(p => __obj.updateDynamic("getShowInLegend")(p.toJsFn))
    getSprites.foreach(p => __obj.updateDynamic("getSprites")(p.toJsFn))
    getStyle.foreach(p => __obj.updateDynamic("getStyle")(p.toJsFn))
    getSubStyle.foreach(p => __obj.updateDynamic("getSubStyle")(p.toJsFn))
    getSurface.foreach(p => __obj.updateDynamic("getSurface")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg.asInstanceOf[js.Any])
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (itemInstancing != null) __obj.updateDynamic("itemInstancing")(itemInstancing.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (labelOverflowPadding != null) __obj.updateDynamic("labelOverflowPadding")(labelOverflowPadding.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerSubStyle != null) __obj.updateDynamic("markerSubStyle")(markerSubStyle.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (overlaySurface != null) __obj.updateDynamic("overlaySurface")(overlaySurface.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (provideLegendInfo != null) __obj.updateDynamic("provideLegendInfo")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => provideLegendInfo(t0).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType.asInstanceOf[js.Any])
    if (setAnimate != null) __obj.updateDynamic("setAnimate")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => setAnimate(t0).runNow()))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1((t0: /* background */ js.UndefOr[js.Any]) => setBackground(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setColors != null) __obj.updateDynamic("setColors")(js.Any.fromFunction1((t0: /* colors */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setColors(t0).runNow()))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1((t0: /* hidden */ js.UndefOr[js.Any]) => setHidden(t0).runNow()))
    if (setHiddenByIndex != null) __obj.updateDynamic("setHiddenByIndex")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* value */ js.UndefOr[scala.Boolean]) => setHiddenByIndex(t0, t1).runNow()))
    if (setHighlightCfg != null) __obj.updateDynamic("setHighlightCfg")(js.Any.fromFunction1((t0: /* highlightCfg */ js.UndefOr[js.Any]) => setHighlightCfg(t0).runNow()))
    if (setHighlightItem != null) __obj.updateDynamic("setHighlightItem")(js.Any.fromFunction1((t0: /* highlightItem */ js.UndefOr[js.Any]) => setHighlightItem(t0).runNow()))
    if (setItemInstancing != null) __obj.updateDynamic("setItemInstancing")(js.Any.fromFunction1((t0: /* itemInstancing */ js.UndefOr[js.Any]) => setItemInstancing(t0).runNow()))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: /* label */ js.UndefOr[js.Any]) => setLabel(t0).runNow()))
    if (setLabelField != null) __obj.updateDynamic("setLabelField")(js.Any.fromFunction1((t0: /* labelField */ js.UndefOr[js.Any]) => setLabelField(t0).runNow()))
    if (setLabelOverflowPadding != null) __obj.updateDynamic("setLabelOverflowPadding")(js.Any.fromFunction1((t0: /* labelOverflowPadding */ js.UndefOr[scala.Double]) => setLabelOverflowPadding(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMarker != null) __obj.updateDynamic("setMarker")(js.Any.fromFunction1((t0: /* marker */ js.UndefOr[js.Any]) => setMarker(t0).runNow()))
    if (setMarkerSubStyle != null) __obj.updateDynamic("setMarkerSubStyle")(js.Any.fromFunction1((t0: /* markerSubStyle */ js.UndefOr[js.Any]) => setMarkerSubStyle(t0).runNow()))
    if (setOverlaySurface != null) __obj.updateDynamic("setOverlaySurface")(js.Any.fromFunction1((t0: /* overlaySurface */ js.UndefOr[js.Any]) => setOverlaySurface(t0).runNow()))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1((t0: /* renderer */ js.UndefOr[js.Any]) => setRenderer(t0).runNow()))
    if (setShowInLegend != null) __obj.updateDynamic("setShowInLegend")(js.Any.fromFunction1((t0: /* showInLegend */ js.UndefOr[scala.Boolean]) => setShowInLegend(t0).runNow()))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[js.Any]) => setStore(t0).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: /* style */ js.UndefOr[js.Any]) => setStyle(t0).runNow()))
    if (setSubStyle != null) __obj.updateDynamic("setSubStyle")(js.Any.fromFunction1((t0: /* subStyle */ js.UndefOr[js.Any]) => setSubStyle(t0).runNow()))
    if (setSurface != null) __obj.updateDynamic("setSurface")(js.Any.fromFunction1((t0: /* surface */ js.UndefOr[js.Any]) => setSurface(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subStyle != null) __obj.updateDynamic("subStyle")(subStyle.asInstanceOf[js.Any])
    if (surface != null) __obj.updateDynamic("surface")(surface.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeries]
  }
}

