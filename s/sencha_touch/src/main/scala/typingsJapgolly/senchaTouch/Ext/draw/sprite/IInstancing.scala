package typingsJapgolly.senchaTouch.Ext.draw.sprite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstancing extends ISprite {
  /** [Method] Creates a new sprite instance
  		* @param config Object The configuration of the instance.
  		* @param data Object
  		* @param bypassNormalization Boolean 'true' to bypass attribute normalization.
  		* @param avoidCopy Boolean 'true' to avoid copying.
  		* @returns Object The attributes of the instance.
  		*/
  var createInstance: js.UndefOr[
    js.Function4[
      /* config */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      /* avoidCopy */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the bounding box for the instance at the given index
  		* @param index Number The index of the instance.
  		* @param isWithoutTransform Boolean 'true' to not apply sprite transforms to the bounding box.
  		* @returns Object The bounding box for the instance.
  		*/
  var getBBoxFor: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* isWithoutTransform */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Not supported
  		* @returns null
  		*/
  @JSName("getBBox")
  var getBBox_IInstancing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of template
  		* @returns Object
  		*/
  var getTemplate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @param region Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IInstancing: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the attributes for the instance at the given index
  		* @param index Number the index of the instance
  		* @param changes Object the attributes to change
  		* @param bypassNormalization Boolean 'true' to avoid attribute normalization
  		*/
  var setAttributesFor: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of template
  		* @param template Object The new value.
  		*/
  var setTemplate: js.UndefOr[js.Function1[/* template */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var template: js.UndefOr[js.Any] = js.undefined
}

object IInstancing {
  @scala.inline
  def apply(
    A: Int | Double = null,
    An: Array = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    attr: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    createInstance: (/* config */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fillOpacity: Int | Double = null,
    fillStyle: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getBBox: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBBoxCenter: /* isWithoutTransform */ js.UndefOr[Boolean] => CallbackTo[Array] = null,
    getBBoxFor: (/* index */ js.UndefOr[Double], /* isWithoutTransform */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getParent: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTemplate: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    globalAlpha: Int | Double = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hide: js.UndefOr[CallbackTo[IInstancing]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    lineCap: String = null,
    lineJoin: String = null,
    lineWidth: Int | Double = null,
    listeners: js.Any = null,
    miterLimit: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    preRender: js.UndefOr[Callback] = js.undefined,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    render: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    rotationCenterX: Int | Double = null,
    rotationCenterY: Int | Double = null,
    rotationRads: Int | Double = null,
    scalingCenterX: Int | Double = null,
    scalingCenterY: Int | Double = null,
    scalingX: Int | Double = null,
    scalingY: Int | Double = null,
    self: IClass = null,
    setAttributes: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Callback = null,
    setAttributesBypassingNormalization: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean]) => Callback = null,
    setAttributesFor: (/* index */ js.UndefOr[Double], /* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean]) => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setParent: /* parent */ js.UndefOr[js.Any] => Callback = null,
    setTemplate: /* template */ js.UndefOr[js.Any] => Callback = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[CallbackTo[IInstancing]] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: String = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    template: js.Any = null,
    transformFillStroke: js.UndefOr[Boolean] = js.undefined,
    translationX: Int | Double = null,
    translationY: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    updatePlainBBox: /* plain */ js.UndefOr[js.Any] => Callback = null,
    updateTransformedBBox: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => Callback = null,
    useAttributes: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => Callback = null,
    uses: Array = null,
    zIndex: Int | Double = null
  ): IInstancing = {
    val __obj = js.Dynamic.literal()
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    if (An != null) __obj.updateDynamic("An")(An.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (createInstance != null) __obj.updateDynamic("createInstance")(js.Any.fromFunction4((t0: /* config */ js.UndefOr[js.Any], t1: /* data */ js.UndefOr[js.Any], t2: /* bypassNormalization */ js.UndefOr[scala.Boolean], t3: /* avoidCopy */ js.UndefOr[scala.Boolean]) => createInstance(t0, t1, t2, t3).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getBBox.foreach(p => __obj.updateDynamic("getBBox")(p.toJsFn))
    if (getBBoxCenter != null) __obj.updateDynamic("getBBoxCenter")(js.Any.fromFunction1((t0: /* isWithoutTransform */ js.UndefOr[scala.Boolean]) => getBBoxCenter(t0).runNow()))
    if (getBBoxFor != null) __obj.updateDynamic("getBBoxFor")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* isWithoutTransform */ js.UndefOr[scala.Boolean]) => getBBoxFor(t0, t1).runNow()))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getParent.foreach(p => __obj.updateDynamic("getParent")(p.toJsFn))
    getTemplate.foreach(p => __obj.updateDynamic("getTemplate")(p.toJsFn))
    if (globalAlpha != null) __obj.updateDynamic("globalAlpha")(globalAlpha.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    preRender.foreach(p => __obj.updateDynamic("preRender")(p.toJsFn))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction4((t0: /* surface */ js.UndefOr[js.Any], t1: /* ctx */ js.UndefOr[js.Any], t2: /* clipRegion */ js.UndefOr[js.Any], t3: /* region */ js.UndefOr[js.Any]) => render(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (rotationCenterX != null) __obj.updateDynamic("rotationCenterX")(rotationCenterX.asInstanceOf[js.Any])
    if (rotationCenterY != null) __obj.updateDynamic("rotationCenterY")(rotationCenterY.asInstanceOf[js.Any])
    if (rotationRads != null) __obj.updateDynamic("rotationRads")(rotationRads.asInstanceOf[js.Any])
    if (scalingCenterX != null) __obj.updateDynamic("scalingCenterX")(scalingCenterX.asInstanceOf[js.Any])
    if (scalingCenterY != null) __obj.updateDynamic("scalingCenterY")(scalingCenterY.asInstanceOf[js.Any])
    if (scalingX != null) __obj.updateDynamic("scalingX")(scalingX.asInstanceOf[js.Any])
    if (scalingY != null) __obj.updateDynamic("scalingY")(scalingY.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction3((t0: /* changes */ js.UndefOr[js.Any], t1: /* bypassNormalization */ js.UndefOr[scala.Boolean], t2: /* avoidCopy */ js.UndefOr[scala.Boolean]) => setAttributes(t0, t1, t2).runNow()))
    if (setAttributesBypassingNormalization != null) __obj.updateDynamic("setAttributesBypassingNormalization")(js.Any.fromFunction2((t0: /* changes */ js.UndefOr[js.Any], t1: /* avoidCopy */ js.UndefOr[scala.Boolean]) => setAttributesBypassingNormalization(t0, t1).runNow()))
    if (setAttributesFor != null) __obj.updateDynamic("setAttributesFor")(js.Any.fromFunction3((t0: /* index */ js.UndefOr[scala.Double], t1: /* changes */ js.UndefOr[js.Any], t2: /* bypassNormalization */ js.UndefOr[scala.Boolean]) => setAttributesFor(t0, t1, t2).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setParent != null) __obj.updateDynamic("setParent")(js.Any.fromFunction1((t0: /* parent */ js.UndefOr[js.Any]) => setParent(t0).runNow()))
    if (setTemplate != null) __obj.updateDynamic("setTemplate")(js.Any.fromFunction1((t0: /* template */ js.UndefOr[js.Any]) => setTemplate(t0).runNow()))
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(transformFillStroke)) __obj.updateDynamic("transformFillStroke")(transformFillStroke.asInstanceOf[js.Any])
    if (translationX != null) __obj.updateDynamic("translationX")(translationX.asInstanceOf[js.Any])
    if (translationY != null) __obj.updateDynamic("translationY")(translationY.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (updatePlainBBox != null) __obj.updateDynamic("updatePlainBBox")(js.Any.fromFunction1((t0: /* plain */ js.UndefOr[js.Any]) => updatePlainBBox(t0).runNow()))
    if (updateTransformedBBox != null) __obj.updateDynamic("updateTransformedBBox")(js.Any.fromFunction2((t0: /* transform */ js.UndefOr[js.Any], t1: /* plain */ js.UndefOr[js.Any]) => updateTransformedBBox(t0, t1).runNow()))
    if (useAttributes != null) __obj.updateDynamic("useAttributes")(js.Any.fromFunction2((t0: /* ctx */ js.UndefOr[js.Any], t1: /* region */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => useAttributes(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstancing]
  }
}

