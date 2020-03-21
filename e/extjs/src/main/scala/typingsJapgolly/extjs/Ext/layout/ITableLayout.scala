package typingsJapgolly.extjs.Ext.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableLayout extends IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.undefined
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITableLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param rowIdx Object
  		* @param cellIdx Object
  		*/
  @JSName("isValidParent")
  var isValidParent_ITableLayout: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[js.Any] = js.undefined
}

object ITableLayout {
  @scala.inline
  def apply(
    addChildEls: js.UndefOr[Callback] = js.undefined,
    afterRemove: /* item */ js.UndefOr[js.Any] => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    beginLayoutCycle: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Callback = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    columns: Int | Double = null,
    completeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[js.Any] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    finalizeLayout: js.UndefOr[Callback] = js.undefined,
    finishedLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    getContainerSize: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getElementTarget: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getItemSizePolicy: /* item */ js.UndefOr[IComponent] => CallbackTo[ISizePolicy] = null,
    getLayoutItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRenderTarget: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getRenderedItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getTarget: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getVisibleItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ITableLayout] = null,
    initLayout: js.UndefOr[Callback] = js.undefined,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* cellIdx */ js.UndefOr[js.Any]) => Callback = null,
    itemCls: String = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => CallbackTo[Boolean] = null,
    overflowPadderEl: IElement = null,
    removeChildEls: js.UndefOr[js.Any] => Callback = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    tableAttrs: js.Any = null,
    tdAttrs: js.Any = null,
    trAttrs: js.Any = null,
    uses: Array = null
  ): ITableLayout = {
    val __obj = js.Dynamic.literal()
    addChildEls.foreach(p => __obj.updateDynamic("addChildEls")(p.toJsFn))
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => afterRemove(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => beginLayout(t0).runNow()))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction2((t0: /* ownerContext */ js.UndefOr[js.Any], t1: /* firstCycle */ js.UndefOr[js.Any]) => beginLayoutCycle(t0, t1).runNow()))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[js.Any]) => calculate(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => completeLayout(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => configureItem(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    finalizeLayout.foreach(p => __obj.updateDynamic("finalizeLayout")(p.toJsFn))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => finishedLayout(t0).runNow()))
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(js.Any.fromFunction2((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem], t1: /* inDom */ js.UndefOr[scala.Boolean]) => getContainerSize(t0, t1).runNow()))
    getElementTarget.foreach(p => __obj.updateDynamic("getElementTarget")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => getItemSizePolicy(t0).runNow()))
    getLayoutItems.foreach(p => __obj.updateDynamic("getLayoutItems")(p.toJsFn))
    getRenderTarget.foreach(p => __obj.updateDynamic("getRenderTarget")(p.toJsFn))
    getRenderedItems.foreach(p => __obj.updateDynamic("getRenderedItems")(p.toJsFn))
    getTarget.foreach(p => __obj.updateDynamic("getTarget")(p.toJsFn))
    getVisibleItems.foreach(p => __obj.updateDynamic("getVisibleItems")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initLayout.foreach(p => __obj.updateDynamic("initLayout")(p.toJsFn))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout.asInstanceOf[js.Any])
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any], t2: /* rowIdx */ js.UndefOr[js.Any], t3: /* cellIdx */ js.UndefOr[js.Any]) => isValidParent(t0, t1, t2, t3).runNow()))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => notifyOwner(t0).runNow()))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1((t0: /* child */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => onContentChange(t0).runNow()))
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl.asInstanceOf[js.Any])
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => removeChildEls(t0).runNow()))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2((t0: /* items */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any]) => renderItems(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (tableAttrs != null) __obj.updateDynamic("tableAttrs")(tableAttrs.asInstanceOf[js.Any])
    if (tdAttrs != null) __obj.updateDynamic("tdAttrs")(tdAttrs.asInstanceOf[js.Any])
    if (trAttrs != null) __obj.updateDynamic("trAttrs")(trAttrs.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableLayout]
  }
}

