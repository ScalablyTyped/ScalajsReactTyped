package typingsJapgolly.extjs.Ext.layout.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.layout.IContextItem
import typingsJapgolly.extjs.Ext.layout.ILayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls */ trait IContainer
  extends StObject
     with ILayout {
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    * @param firstCycle Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IContainer: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[Any], /* firstCycle */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] In addition to work done by our base classes containers benefit from some extra cached data
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IContainer: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Adds layout s itemCls and owning Container s itemCls
    * @param item Object
    */
  @JSName("configureItem")
  var configureItem_IContainer: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Returns the container size that of the target
    * @param ownerContext Ext.layout.ContextItem The owner's context item.
    * @param inDom Boolean True if the container size must be in the DOM.
    * @returns Object The size
    */
  var getContainerSize: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], Any]
  ] = js.undefined
  
  /** [Method] Returns the element into which extra functional DOM elements can be inserted
    * @returns Ext.Element
    */
  var getElementTarget: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Returns an array of child components either for a render phase Performed in the beforeLayout method of the layout s
    * @returns Ext.Component[] of child components
    */
  @JSName("getLayoutItems")
  var getLayoutItems_IContainer: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the element into which rendering must take place
    * @returns Ext.Element
    */
  var getRenderTarget: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Returns all items that are rendered
    * @returns Array All matching items
    */
  var getRenderedItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the owner component s resize element
    * @returns Ext.Element
    */
  var getTarget: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Returns all items that are both rendered and visible
    * @returns Array All matching items
    */
  var getVisibleItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var overflowPadderEl: js.UndefOr[IElement] = js.undefined
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
}
object IContainer {
  
  inline def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  
  extension [Self <: IContainer](x: Self) {
    
    inline def setAddChildEls(value: Callback): Self = StObject.set(x, "addChildEls", value.toJsFn)
    
    inline def setAddChildElsUndefined: Self = StObject.set(x, "addChildEls", js.undefined)
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setBeginLayoutCycle(value: (/* ownerContext */ js.UndefOr[Any], /* firstCycle */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction2((t0: /* ownerContext */ js.UndefOr[Any], t1: /* firstCycle */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    inline def setConfigureItem(value: /* item */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "configureItem", js.Any.fromFunction1((t0: /* item */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setConfigureItemUndefined: Self = StObject.set(x, "configureItem", js.undefined)
    
    inline def setGetContainerSize(value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "getContainerSize", js.Any.fromFunction2(value))
    
    inline def setGetContainerSizeUndefined: Self = StObject.set(x, "getContainerSize", js.undefined)
    
    inline def setGetElementTarget(value: CallbackTo[IElement]): Self = StObject.set(x, "getElementTarget", value.toJsFn)
    
    inline def setGetElementTargetUndefined: Self = StObject.set(x, "getElementTarget", js.undefined)
    
    inline def setGetLayoutItems(value: CallbackTo[Array]): Self = StObject.set(x, "getLayoutItems", value.toJsFn)
    
    inline def setGetLayoutItemsUndefined: Self = StObject.set(x, "getLayoutItems", js.undefined)
    
    inline def setGetRenderTarget(value: CallbackTo[IElement]): Self = StObject.set(x, "getRenderTarget", value.toJsFn)
    
    inline def setGetRenderTargetUndefined: Self = StObject.set(x, "getRenderTarget", js.undefined)
    
    inline def setGetRenderedItems(value: CallbackTo[Array]): Self = StObject.set(x, "getRenderedItems", value.toJsFn)
    
    inline def setGetRenderedItemsUndefined: Self = StObject.set(x, "getRenderedItems", js.undefined)
    
    inline def setGetTarget(value: CallbackTo[IElement]): Self = StObject.set(x, "getTarget", value.toJsFn)
    
    inline def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    inline def setGetVisibleItems(value: CallbackTo[Array]): Self = StObject.set(x, "getVisibleItems", value.toJsFn)
    
    inline def setGetVisibleItemsUndefined: Self = StObject.set(x, "getVisibleItems", js.undefined)
    
    inline def setItemCls(value: String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
    
    inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
    
    inline def setOverflowPadderEl(value: IElement): Self = StObject.set(x, "overflowPadderEl", value.asInstanceOf[js.Any])
    
    inline def setOverflowPadderElUndefined: Self = StObject.set(x, "overflowPadderEl", js.undefined)
    
    inline def setRemoveChildEls(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "removeChildEls", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setRemoveChildElsUndefined: Self = StObject.set(x, "removeChildEls", js.undefined)
  }
}
