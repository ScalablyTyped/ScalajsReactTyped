package typingsJapgolly.extjs.Ext.draw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.dd.IDragSource
import typingsJapgolly.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ trait ISprite extends IObservable {
  /** [Method] Adds one or more CSS classes to the element
  		* @param className String/String[] The CSS class to add, or an array of classes
  		* @returns Ext.draw.Sprite this
  		*/
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Performs custom animation on this object
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Object this
  		*/
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.undefined
  /** [Property] (Ext.dd.DragSource) */
  var dd: js.UndefOr[IDragSource] = js.undefined
  /** [Method] Removes the sprite and clears all listeners  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var fill: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var font: js.UndefOr[String] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Retrieves the bounding box of the sprite
  		* @returns Object bbox
  		*/
  var getBBox: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/String[]) */
  var group: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.undefined
  /** [Method] Hides the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var isSprite: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var opacity: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusY: js.UndefOr[Double] = js.undefined
  /** [Method] Redraws the sprite
  		* @returns Ext.draw.Sprite this
  		*/
  var redraw: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Removes the sprite
  		* @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
  		*/
  var remove: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Removes one or more CSS classes from the element
  		* @param className String/String[] The CSS class to remove, or an array of classes. Note this method is severly limited in VML.
  		* @returns Ext.draw.Sprite this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Change the attributes of the sprite
  		* @param attrs Object attributes to be changed on the sprite.
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.draw.Sprite this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.undefined
  /** [Method] Shows the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Config Option] (String) */
  var src: js.UndefOr[String] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Config Option] (String) */
  var stroke: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var strokewidth: js.UndefOr[Double] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}

object ISprite {
  @scala.inline
  def apply(
    addCls: /* className */ js.UndefOr[js.Any] => CallbackTo[ISprite] = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _]) = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    dd: IDragSource = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fill: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    font: String = null,
    getActiveAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBBox: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    group: js.Any = null,
    hasActiveFx: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    height: Int | Double = null,
    hide: /* redraw */ js.UndefOr[Boolean] => CallbackTo[ISprite] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ISprite] = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSprite: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    opacity: Int | Double = null,
    path: String = null,
    radius: Int | Double = null,
    radiusX: Int | Double = null,
    radiusY: Int | Double = null,
    redraw: js.UndefOr[CallbackTo[ISprite]] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    remove: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    removeCls: /* className */ js.UndefOr[js.Any] => CallbackTo[ISprite] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    sequenceFx: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setAttributes: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => CallbackTo[ISprite] = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => CallbackTo[ISprite] = null,
    show: /* redraw */ js.UndefOr[Boolean] => CallbackTo[ISprite] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    statics: js.Any = null,
    stopAnimation: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    stopFx: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    stroke: String = null,
    strokewidth: Int | Double = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    syncFx: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    text: String = null,
    `type`: String = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ISprite = {
    val __obj = js.Dynamic.literal()
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => addCls(t0).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dd != null) __obj.updateDynamic("dd")(dd.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    getActiveAnimation.foreach(p => __obj.updateDynamic("getActiveAnimation")(p.toJsFn))
    getBBox.foreach(p => __obj.updateDynamic("getBBox")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    hasActiveFx.foreach(p => __obj.updateDynamic("hasActiveFx")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* redraw */ js.UndefOr[scala.Boolean]) => hide(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSprite)) __obj.updateDynamic("isSprite")(isSprite.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusX != null) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (radiusY != null) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    redraw.foreach(p => __obj.updateDynamic("redraw")(p.toJsFn))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => removeCls(t0).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    sequenceFx.foreach(p => __obj.updateDynamic("sequenceFx")(p.toJsFn))
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction2((t0: /* attrs */ js.UndefOr[js.Any], t1: /* redraw */ js.UndefOr[scala.Boolean]) => setAttributes(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => setStyle(t0, t1).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* redraw */ js.UndefOr[scala.Boolean]) => show(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    stopAnimation.foreach(p => __obj.updateDynamic("stopAnimation")(p.toJsFn))
    stopFx.foreach(p => __obj.updateDynamic("stopFx")(p.toJsFn))
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokewidth != null) __obj.updateDynamic("strokewidth")(strokewidth.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    syncFx.foreach(p => __obj.updateDynamic("syncFx")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISprite]
  }
}

