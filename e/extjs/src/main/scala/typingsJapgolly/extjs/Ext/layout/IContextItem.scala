package typingsJapgolly.extjs.Ext.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextItem extends IBase {
  /** [Method] Queue the addition of a class name or array of class names to this ContextItem s target when next flushed
  		* @param newCls Object
  		*/
  var addCls: js.UndefOr[js.Function1[/* newCls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Registers a layout in the block list for the given property
  		* @param layout Ext.layout.Layout
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		*/
  var block: js.UndefOr[
    js.Function2[/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] clears the margin cache so that marginInfo get re read from the dom on the next call to getMarginInfo  This is neede  */
  var clearMarginCache: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Registers a layout in the DOM block list for the given property
  		* @param layout Ext.layout.Layout
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		*/
  var domBlock: js.UndefOr[
    js.Function2[/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] Flushes any updates in the dirty collection to the DOM  */
  var flush: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the border information for the element as an object with left top right and bottom properties holding border s
  		* @returns Object
  		*/
  var getBorderInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a ClassList like object to buffer access to this item s element s classes  */
  var getClassList: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets a property of this object if it is correct in the DOM
  		* @param propName String The property name (e.g., 'width').
  		* @returns Object The property value or undefined if not yet set or is dirty.
  		*/
  var getDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns the context item for an owned element
  		* @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
  		* @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property. For more details on owned elements see childEls and renderSelectors
  		* @returns Ext.layout.ContextItem
  		*/
  var getEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Gets the frame information for the element as an object with left top right and bottom properties holding border
  		* @returns Object
  		*/
  var getFrameInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the margin information for the element as an object with left top right and bottom properties holding margin s
  		* @returns Object
  		*/
  var getMarginInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the padding information for the element as an object with left top right and bottom properties holding padding
  		* @returns Object
  		*/
  var getPaddingInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets a property of this object
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		* @returns Object The property value or undefined if not yet set.
  		*/
  var getProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns a style for this item
  		* @param styleName String The CSS style name.
  		* @returns Object The value of the DOM style (parsed as necessary).
  		*/
  var getStyle: js.UndefOr[js.Function1[/* styleName */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns styles for this item
  		* @param styleNames String[] The CSS style names.
  		* @param altNames String[] The alternate names for the returned styles. If given, these names must correspond one-for-one to the styleNames.
  		* @returns Object The values of the DOM styles (parsed as necessary).
  		*/
  var getStyles: js.UndefOr[
    js.Function2[/* styleNames */ js.UndefOr[Array], /* altNames */ js.UndefOr[Array], _]
  ] = js.undefined
  /** [Method] Returns true if the given property is correct in the DOM
  		* @param propName String The property name (e.g., 'width').
  		* @returns Boolean
  		*/
  var hasDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Returns true if the given property has been set
  		* @param propName String The property name (e.g., 'width').
  		* @returns Boolean
  		*/
  var hasProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Invalidates the component associated with this item
  		* @param options Object An object describing how to handle the invalidation.
  		*/
  var invalidate: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Recovers a property value from the last computation and restores its value and dirty state
  		* @param propName String The name of the property to recover.
  		* @param oldProps Object The old "props" object from which to recover values.
  		* @param oldDirty Object The old "dirty" object from which to recover state.
  		*/
  var recoverProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* oldProps */ js.UndefOr[js.Any], 
      /* oldDirty */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Queue the removal of a class name or array of class names from this ContextItem s target when next flushed
  		* @param removeCls Object
  		*/
  var removeCls: js.UndefOr[js.Function1[/* removeCls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes a cached ContextItem that was created using getEl
  		* @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
  		* @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property.
  		*/
  var removeEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Queue the setting of a DOM attribute on this ContextItem s target when next flushed
  		* @param name Object
  		* @param value Object
  		*/
  var setAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the contentHeight property
  		* @param height Object
  		* @param measured Object
  		*/
  var setContentHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the contentWidth and contentHeight properties
  		* @param width Object
  		* @param height Object
  		* @param measured Object
  		*/
  var setContentSize: js.UndefOr[
    js.Function3[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* measured */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the contentWidth property
  		* @param width Object
  		* @param measured Object
  		*/
  var setContentWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the height and constrains the height to min maxHeight range
  		* @param height Number The height.
  		* @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
  		* @returns Number The actual height after constraining.
  		*/
  var setHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean], Double]
  ] = js.undefined
  /** [Method] Sets a property value
  		* @param propName String The property name (e.g., 'width').
  		* @param value Object The new value of the property.
  		* @param dirty Boolean Optionally specifies if the value is currently in the DOM (default is true which indicates the value is not in the DOM and must be flushed at some point).
  		* @returns Number 1 if this call specified the property value, 0 if not.
  		*/
  var setProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* dirty */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  /** [Method] Sets the height and constrains the width to min maxWidth range
  		* @param width Number The width.
  		* @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
  		* @returns Number The actual width after constraining.
  		*/
  var setWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean], Double]
  ] = js.undefined
  /** [Property] (Object) */
  var state: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var wrapsComponent: js.UndefOr[Boolean] = js.undefined
}

object IContextItem {
  @scala.inline
  def apply(
    addCls: /* newCls */ js.UndefOr[js.Any] => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    block: (/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String]) => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearMarginCache: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    domBlock: (/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String]) => Callback = null,
    extend: String = null,
    flush: js.UndefOr[Callback] = js.undefined,
    getBorderInfo: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getClassList: js.UndefOr[Callback] = js.undefined,
    getDomProp: /* propName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getEl: (/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any]) => CallbackTo[IContextItem] = null,
    getFrameInfo: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMarginInfo: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPaddingInfo: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getProp: /* propName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getStyle: /* styleName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getStyles: (/* styleNames */ js.UndefOr[Array], /* altNames */ js.UndefOr[Array]) => CallbackTo[js.Any] = null,
    hasDomProp: /* propName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasProp: /* propName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IContextItem] = null,
    invalidate: /* options */ js.UndefOr[js.Any] => Callback = null,
    mixins: js.Any = null,
    recoverProp: (/* propName */ js.UndefOr[String], /* oldProps */ js.UndefOr[js.Any], /* oldDirty */ js.UndefOr[js.Any]) => Callback = null,
    removeCls: /* removeCls */ js.UndefOr[js.Any] => Callback = null,
    removeEl: (/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    setAttribute: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Callback = null,
    setContentHeight: (/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Callback = null,
    setContentSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Callback = null,
    setContentWidth: (/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Callback = null,
    setHeight: (/* height */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    setProp: (/* propName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* dirty */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    setWidth: (/* width */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    state: js.Any = null,
    statics: js.Any = null,
    uses: Array = null,
    wrapsComponent: js.UndefOr[Boolean] = js.undefined
  ): IContextItem = {
    val __obj = js.Dynamic.literal()
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1((t0: /* newCls */ js.UndefOr[js.Any]) => addCls(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(js.Any.fromFunction2((t0: /* layout */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.ILayout], t1: /* propName */ js.UndefOr[java.lang.String]) => block(t0, t1).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearMarginCache.foreach(p => __obj.updateDynamic("clearMarginCache")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (domBlock != null) __obj.updateDynamic("domBlock")(js.Any.fromFunction2((t0: /* layout */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.ILayout], t1: /* propName */ js.UndefOr[java.lang.String]) => domBlock(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    flush.foreach(p => __obj.updateDynamic("flush")(p.toJsFn))
    getBorderInfo.foreach(p => __obj.updateDynamic("getBorderInfo")(p.toJsFn))
    getClassList.foreach(p => __obj.updateDynamic("getClassList")(p.toJsFn))
    if (getDomProp != null) __obj.updateDynamic("getDomProp")(js.Any.fromFunction1((t0: /* propName */ js.UndefOr[java.lang.String]) => getDomProp(t0).runNow()))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction2((t0: /* nameOrEl */ js.UndefOr[js.Any], t1: /* owner */ js.UndefOr[js.Any]) => getEl(t0, t1).runNow()))
    getFrameInfo.foreach(p => __obj.updateDynamic("getFrameInfo")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMarginInfo.foreach(p => __obj.updateDynamic("getMarginInfo")(p.toJsFn))
    getPaddingInfo.foreach(p => __obj.updateDynamic("getPaddingInfo")(p.toJsFn))
    if (getProp != null) __obj.updateDynamic("getProp")(js.Any.fromFunction1((t0: /* propName */ js.UndefOr[java.lang.String]) => getProp(t0).runNow()))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction1((t0: /* styleName */ js.UndefOr[java.lang.String]) => getStyle(t0).runNow()))
    if (getStyles != null) __obj.updateDynamic("getStyles")(js.Any.fromFunction2((t0: /* styleNames */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t1: /* altNames */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getStyles(t0, t1).runNow()))
    if (hasDomProp != null) __obj.updateDynamic("hasDomProp")(js.Any.fromFunction1((t0: /* propName */ js.UndefOr[java.lang.String]) => hasDomProp(t0).runNow()))
    if (hasProp != null) __obj.updateDynamic("hasProp")(js.Any.fromFunction1((t0: /* propName */ js.UndefOr[java.lang.String]) => hasProp(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (invalidate != null) __obj.updateDynamic("invalidate")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => invalidate(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (recoverProp != null) __obj.updateDynamic("recoverProp")(js.Any.fromFunction3((t0: /* propName */ js.UndefOr[java.lang.String], t1: /* oldProps */ js.UndefOr[js.Any], t2: /* oldDirty */ js.UndefOr[js.Any]) => recoverProp(t0, t1, t2).runNow()))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1((t0: /* removeCls */ js.UndefOr[js.Any]) => removeCls(t0).runNow()))
    if (removeEl != null) __obj.updateDynamic("removeEl")(js.Any.fromFunction2((t0: /* nameOrEl */ js.UndefOr[js.Any], t1: /* owner */ js.UndefOr[js.Any]) => removeEl(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAttribute != null) __obj.updateDynamic("setAttribute")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[js.Any]) => setAttribute(t0, t1).runNow()))
    if (setContentHeight != null) __obj.updateDynamic("setContentHeight")(js.Any.fromFunction2((t0: /* height */ js.UndefOr[js.Any], t1: /* measured */ js.UndefOr[js.Any]) => setContentHeight(t0, t1).runNow()))
    if (setContentSize != null) __obj.updateDynamic("setContentSize")(js.Any.fromFunction3((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any], t2: /* measured */ js.UndefOr[js.Any]) => setContentSize(t0, t1, t2).runNow()))
    if (setContentWidth != null) __obj.updateDynamic("setContentWidth")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* measured */ js.UndefOr[js.Any]) => setContentWidth(t0, t1).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction2((t0: /* height */ js.UndefOr[scala.Double], t1: /* dirty */ js.UndefOr[scala.Boolean]) => setHeight(t0, t1).runNow()))
    if (setProp != null) __obj.updateDynamic("setProp")(js.Any.fromFunction3((t0: /* propName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* dirty */ js.UndefOr[scala.Boolean]) => setProp(t0, t1, t2).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[scala.Double], t1: /* dirty */ js.UndefOr[scala.Boolean]) => setWidth(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapsComponent)) __obj.updateDynamic("wrapsComponent")(wrapsComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextItem]
  }
}

