package typingsJapgolly.extjs.Ext.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayout extends IBase {
  /** [Method] Removes layout s itemCls and owning Container s itemCls
  		* @param item Object
  		*/
  var afterRemove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayoutCycle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var calculate: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var completeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Called before an item is rendered to allow the layout to configure the item
  		* @param item Ext.Component The item to be configured
  		*/
  var configureItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Destroys this layout  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var done: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method if implemented is called after all layouts have completed
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finalizeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finishedLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Ext.Component
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  var getItemSizePolicy: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], ISizePolicy]] = js.undefined
  /** [Method] Returns the set of items to layout empty by default */
  var getLayoutItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] A one time initialization method called just before rendering  */
  var initLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isLayout: js.UndefOr[Boolean] = js.undefined
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param position Object
  		*/
  var isValidParent: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var notifyOwner: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] This method is called when a child item changes in some way
  		* @param child Ext.Component The child item that has changed.
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  var onContentChange: js.UndefOr[js.Function1[/* child */ js.UndefOr[IComponent], Boolean]] = js.undefined
  /** [Method] Iterates over all passed items ensuring they are rendered
  		* @param items Object
  		* @param target Object
  		*/
  var renderItems: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object ILayout {
  @scala.inline
  def apply(
    afterRemove: /* item */ js.UndefOr[js.Any] => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    beginLayoutCycle: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    calculate: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    completeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[IComponent] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    finishedLayout: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getItemSizePolicy: /* item */ js.UndefOr[IComponent] => CallbackTo[ISizePolicy] = null,
    getLayoutItems: js.UndefOr[Callback] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ILayout] = null,
    initLayout: js.UndefOr[Callback] = js.undefined,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Callback = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[IContextItem] => Callback = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => CallbackTo[Boolean] = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ILayout = {
    val __obj = js.Dynamic.literal()
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => afterRemove(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => beginLayout(t0).runNow()))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => beginLayoutCycle(t0).runNow()))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => calculate(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => completeLayout(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => configureItem(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => finalizeLayout(t0).runNow()))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => finishedLayout(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => getItemSizePolicy(t0).runNow()))
    getLayoutItems.foreach(p => __obj.updateDynamic("getLayoutItems")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initLayout.foreach(p => __obj.updateDynamic("initLayout")(p.toJsFn))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout.asInstanceOf[js.Any])
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any], t2: /* position */ js.UndefOr[js.Any]) => isValidParent(t0, t1, t2).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem]) => notifyOwner(t0).runNow()))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1((t0: /* child */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => onContentChange(t0).runNow()))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2((t0: /* items */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any]) => renderItems(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayout]
  }
}

