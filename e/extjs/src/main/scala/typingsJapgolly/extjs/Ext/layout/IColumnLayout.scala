package typingsJapgolly.extjs.Ext.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.layout.container.IAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnLayout extends IAuto {
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IColumnLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.undefined
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
  		* @param ownerContext Object
  		* @param containerSize Object
  		*/
  @JSName("setCtSizeIfNeeded")
  var setCtSizeIfNeeded_IColumnLayout: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* containerSize */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IColumnLayout {
  @scala.inline
  def apply(
    addChildEls: js.UndefOr[Callback] = js.undefined,
    afterRemove: /* item */ js.UndefOr[js.Any] => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    beginLayoutCycle: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    calculateOverflow: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    completeLayout: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[js.Any] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    finishedLayout: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    getContainerSize: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getElementTarget: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getItemSizePolicy: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => CallbackTo[ISizePolicy] = null,
    getLayoutItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getOverflowXStyle: /* ownerContext */ js.UndefOr[IContextItem] => CallbackTo[String] = null,
    getOverflowYStyle: /* ownerContext */ js.UndefOr[IContextItem] => CallbackTo[String] = null,
    getRenderTarget: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getRenderedItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getTarget: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getVisibleItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IColumnLayout] = null,
    initLayout: js.UndefOr[Callback] = js.undefined,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Callback = null,
    itemCls: String = null,
    manageOverflow: js.UndefOr[Boolean] = js.undefined,
    managePadding: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => CallbackTo[Boolean] = null,
    overflowPadderEl: IElement = null,
    removeChildEls: js.UndefOr[js.Any] => Callback = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    reserveScrollbar: js.UndefOr[Boolean] = js.undefined,
    self: IClass = null,
    setCtSizeIfNeeded: (/* ownerContext */ js.UndefOr[js.Any], /* containerSize */ js.UndefOr[js.Any]) => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IColumnLayout = {
    val __obj = js.Dynamic.literal()
    addChildEls.foreach(p => __obj.updateDynamic("addChildEls")(p.toJsFn))
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => afterRemove(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => beginLayout(t0).runNow()))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => beginLayoutCycle(t0).runNow()))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => calculate(t0).runNow()))
    if (calculateOverflow != null) __obj.updateDynamic("calculateOverflow")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => calculateOverflow(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => completeLayout(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => configureItem(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => finalizeLayout(t0).runNow()))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => finishedLayout(t0).runNow()))
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(js.Any.fromFunction2((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem], t1: /* inDom */ js.UndefOr[scala.Boolean]) => getContainerSize(t0, t1).runNow()))
    getElementTarget.foreach(p => __obj.updateDynamic("getElementTarget")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* ownerSizeModel */ js.UndefOr[js.Any]) => getItemSizePolicy(t0, t1).runNow()))
    getLayoutItems.foreach(p => __obj.updateDynamic("getLayoutItems")(p.toJsFn))
    if (getOverflowXStyle != null) __obj.updateDynamic("getOverflowXStyle")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => getOverflowXStyle(t0).runNow()))
    if (getOverflowYStyle != null) __obj.updateDynamic("getOverflowYStyle")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => getOverflowYStyle(t0).runNow()))
    getRenderTarget.foreach(p => __obj.updateDynamic("getRenderTarget")(p.toJsFn))
    getRenderedItems.foreach(p => __obj.updateDynamic("getRenderedItems")(p.toJsFn))
    getTarget.foreach(p => __obj.updateDynamic("getTarget")(p.toJsFn))
    getVisibleItems.foreach(p => __obj.updateDynamic("getVisibleItems")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initLayout.foreach(p => __obj.updateDynamic("initLayout")(p.toJsFn))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout.asInstanceOf[js.Any])
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any], t2: /* position */ js.UndefOr[js.Any]) => isValidParent(t0, t1, t2).runNow()))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (!js.isUndefined(manageOverflow)) __obj.updateDynamic("manageOverflow")(manageOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(managePadding)) __obj.updateDynamic("managePadding")(managePadding.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => notifyOwner(t0).runNow()))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1((t0: /* child */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => onContentChange(t0).runNow()))
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl.asInstanceOf[js.Any])
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => removeChildEls(t0).runNow()))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2((t0: /* items */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any]) => renderItems(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveScrollbar)) __obj.updateDynamic("reserveScrollbar")(reserveScrollbar.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCtSizeIfNeeded != null) __obj.updateDynamic("setCtSizeIfNeeded")(js.Any.fromFunction2((t0: /* ownerContext */ js.UndefOr[js.Any], t1: /* containerSize */ js.UndefOr[js.Any]) => setCtSizeIfNeeded(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnLayout]
  }
}

