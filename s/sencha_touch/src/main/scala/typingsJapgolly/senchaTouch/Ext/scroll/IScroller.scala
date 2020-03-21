package typingsJapgolly.senchaTouch.Ext.scroll

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.IEvented
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller extends IEvented {
  /** [Config Option] (Number) */
  var acceleration: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var directionLock: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var friction: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of initialOffset
  		* @returns Object/Number
  		*/
  var getInitialOffset: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of momentumEasing
  		* @returns Object
  		*/
  var getMomentumEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slotSnapEasing
  		* @returns Object
  		*/
  var getSlotSnapEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slotSnapSize
  		* @returns Number/Object
  		*/
  var getSlotSnapSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object/Number) */
  var initialOffset: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if a specified axis is enabled
  		* @param axis String The axis to check (x or y).
  		* @returns Boolean true if the axis is enabled.
  		*/
  var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Config Option] (Object) */
  var momentumEasing: js.UndefOr[js.Any] = js.undefined
  /** [Method] Change the scroll offset by the given amount
  		* @param x Number The offset to scroll by on the x axis.
  		* @param y Number The offset to scroll by on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls to the given location
  		* @param x Number The scroll position on the x axis.
  		* @param y Number The scroll position on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollTo: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls to the end of the scrollable view
  		* @param animation Object
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of initialOffset
  		* @param initialOffset Object/Number The new value.
  		*/
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of momentumEasing
  		* @param momentumEasing Object The new value.
  		*/
  var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the offset of this scroller
  		* @param offset Object The offset to move to.
  		* @returns Ext.scroll.Scroller this
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of slotSnapEasing
  		* @param slotSnapEasing Object The new value.
  		*/
  var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of slotSnapSize
  		* @param slotSnapSize Number/Object The new value.
  		*/
  var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number/Object) */
  var slotSnapSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the boundary information for this scroller
  		* @returns Ext.scroll.Scroller this
  		*/
  var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.undefined
}

object IScroller {
  @scala.inline
  def apply(
    acceleration: Int | Double = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    direction: String = null,
    directionLock: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    friction: Int | Double = null,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDirectionLock: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDisabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInitialOffset: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMomentumEasing: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSlotSnapEasing: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSlotSnapSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTranslatable: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    initialOffset: js.Any = null,
    isAxisEnabled: /* axis */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    momentumEasing: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    scrollBy: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => CallbackTo[IScroller] = null,
    scrollTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => CallbackTo[IScroller] = null,
    scrollToEnd: /* animation */ js.UndefOr[js.Any] => CallbackTo[IScroller] = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    setDirectionLock: /* directionLock */ js.UndefOr[Boolean] => Callback = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Callback = null,
    setInitialOffset: /* initialOffset */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMomentumEasing: /* momentumEasing */ js.UndefOr[js.Any] => Callback = null,
    setOffset: /* offset */ js.UndefOr[js.Any] => CallbackTo[IScroller] = null,
    setSlotSnapEasing: /* slotSnapEasing */ js.UndefOr[js.Any] => Callback = null,
    setSlotSnapSize: /* slotSnapSize */ js.UndefOr[js.Any] => Callback = null,
    setTranslatable: /* translatable */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slotSnapSize: js.Any = null,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    updateBoundary: js.UndefOr[CallbackTo[IScroller]] = js.undefined,
    uses: Array = null
  ): IScroller = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(directionLock)) __obj.updateDynamic("directionLock")(directionLock.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getDirection.foreach(p => __obj.updateDynamic("getDirection")(p.toJsFn))
    getDirectionLock.foreach(p => __obj.updateDynamic("getDirectionLock")(p.toJsFn))
    getDisabled.foreach(p => __obj.updateDynamic("getDisabled")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getInitialOffset.foreach(p => __obj.updateDynamic("getInitialOffset")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMomentumEasing.foreach(p => __obj.updateDynamic("getMomentumEasing")(p.toJsFn))
    getSlotSnapEasing.foreach(p => __obj.updateDynamic("getSlotSnapEasing")(p.toJsFn))
    getSlotSnapSize.foreach(p => __obj.updateDynamic("getSlotSnapSize")(p.toJsFn))
    getTranslatable.foreach(p => __obj.updateDynamic("getTranslatable")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (initialOffset != null) __obj.updateDynamic("initialOffset")(initialOffset.asInstanceOf[js.Any])
    if (isAxisEnabled != null) __obj.updateDynamic("isAxisEnabled")(js.Any.fromFunction1((t0: /* axis */ js.UndefOr[java.lang.String]) => isAxisEnabled(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (momentumEasing != null) __obj.updateDynamic("momentumEasing")(momentumEasing.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* animation */ js.UndefOr[js.Any]) => scrollBy(t0, t1, t2).runNow()))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* animation */ js.UndefOr[js.Any]) => scrollTo(t0, t1, t2).runNow()))
    if (scrollToEnd != null) __obj.updateDynamic("scrollToEnd")(js.Any.fromFunction1((t0: /* animation */ js.UndefOr[js.Any]) => scrollToEnd(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (setDirectionLock != null) __obj.updateDynamic("setDirectionLock")(js.Any.fromFunction1((t0: /* directionLock */ js.UndefOr[scala.Boolean]) => setDirectionLock(t0).runNow()))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[scala.Boolean]) => setDisabled(t0).runNow()))
    if (setInitialOffset != null) __obj.updateDynamic("setInitialOffset")(js.Any.fromFunction1((t0: /* initialOffset */ js.UndefOr[js.Any]) => setInitialOffset(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMomentumEasing != null) __obj.updateDynamic("setMomentumEasing")(js.Any.fromFunction1((t0: /* momentumEasing */ js.UndefOr[js.Any]) => setMomentumEasing(t0).runNow()))
    if (setOffset != null) __obj.updateDynamic("setOffset")(js.Any.fromFunction1((t0: /* offset */ js.UndefOr[js.Any]) => setOffset(t0).runNow()))
    if (setSlotSnapEasing != null) __obj.updateDynamic("setSlotSnapEasing")(js.Any.fromFunction1((t0: /* slotSnapEasing */ js.UndefOr[js.Any]) => setSlotSnapEasing(t0).runNow()))
    if (setSlotSnapSize != null) __obj.updateDynamic("setSlotSnapSize")(js.Any.fromFunction1((t0: /* slotSnapSize */ js.UndefOr[js.Any]) => setSlotSnapSize(t0).runNow()))
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(js.Any.fromFunction1((t0: /* translatable */ js.UndefOr[js.Any]) => setTranslatable(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slotSnapSize != null) __obj.updateDynamic("slotSnapSize")(slotSnapSize.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    updateBoundary.foreach(p => __obj.updateDynamic("updateBoundary")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroller]
  }
}

