package typingsJapgolly.baseui.menuTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.PartialStatefulContainerS
import typingsJapgolly.baseui.anon.`14`
import typingsJapgolly.baseui.baseuiStrings.character
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.enter_
import typingsJapgolly.baseui.baseuiStrings.focus
import typingsJapgolly.baseui.baseuiStrings.mouseEnter
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulMenuProps
  extends StObject
     with MenuProps {
  
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ `14`, Unit]] = js.undefined
  
  /** Child as function pattern. */
  var children: js.UndefOr[js.Function1[/* a */ RenderProps, Node]] = js.undefined
  
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ `14`, js.UndefOr[`14` | Null]]] = js.undefined
  
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ `14`, js.UndefOr[`14` | Null]]] = js.undefined
  
  /** Function to get props for each rendered item. This will have some defaults needed for keyboard
    * bindings to work properly. Every rendered item should call this.
    */
  var getRequiredItemProps: js.UndefOr[GetRequiredItemPropsFn] = js.undefined
  
  /** Initial state of the stateful menu. */
  var initialState: js.UndefOr[InitialState] = js.undefined
  
  var isNestedMenuVisible: js.UndefOr[js.Function1[/* ref */ `14`, Boolean]] = js.undefined
  
  /** List of menu items. */
  var items: Items
  
  var nestedMenuHoverIndex: js.UndefOr[Double] = js.undefined
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Any]] = js.undefined
  
  /** Callback executed on menu item clicks. */
  var onItemSelect: js.UndefOr[OnItemSelectFn] = js.undefined
  
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ `14`, Unit]] = js.undefined
  
  /** Ref for the menu container element. Used to capture key events for navigation */
  var rootRef: js.UndefOr[RootRef] = js.undefined
  
  /** State reducer to intercept state changes and return new internal state */
  var stateReducer: js.UndefOr[StateReducerFn] = js.undefined
  
  /** whether has keyboard type-ahead function */
  var typeAhead: js.UndefOr[Boolean] = js.undefined
}
object StatefulMenuProps {
  
  inline def apply(items: Items): StatefulMenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulMenuProps]
  }
  
  extension [Self <: StatefulMenuProps](x: Self) {
    
    inline def setAddMenuToNesting(value: /* ref */ `14` => Callback): Self = StObject.set(x, "addMenuToNesting", js.Any.fromFunction1((t0: /* ref */ `14`) => value(t0).runNow()))
    
    inline def setAddMenuToNestingUndefined: Self = StObject.set(x, "addMenuToNesting", js.undefined)
    
    inline def setChildren(value: /* a */ RenderProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setGetChildMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    inline def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    inline def setGetParentMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): Self = StObject.set(x, "getParentMenu", js.Any.fromFunction1(value))
    
    inline def setGetParentMenuUndefined: Self = StObject.set(x, "getParentMenu", js.undefined)
    
    inline def setGetRequiredItemProps(value: (/* item */ Item, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    inline def setGetRequiredItemPropsUndefined: Self = StObject.set(x, "getRequiredItemProps", js.undefined)
    
    inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setIsNestedMenuVisible(value: /* ref */ `14` => Boolean): Self = StObject.set(x, "isNestedMenuVisible", js.Any.fromFunction1(value))
    
    inline def setIsNestedMenuVisibleUndefined: Self = StObject.set(x, "isNestedMenuVisible", js.undefined)
    
    inline def setItems(value: Items): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def setNestedMenuHoverIndexUndefined: Self = StObject.set(x, "nestedMenuHoverIndex", js.undefined)
    
    inline def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    inline def setOnItemSelect(value: /* a */ typingsJapgolly.baseui.anon.Item => Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    inline def setRemoveMenuFromNesting(value: /* ref */ `14` => Callback): Self = StObject.set(x, "removeMenuFromNesting", js.Any.fromFunction1((t0: /* ref */ `14`) => value(t0).runNow()))
    
    inline def setRemoveMenuFromNestingUndefined: Self = StObject.set(x, "removeMenuFromNesting", js.undefined)
    
    inline def setRootRef(value: RootRef): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    
    inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    
    inline def setStateReducer(
      value: (/* changeType */ js.UndefOr[
          click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
        ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    inline def setTypeAhead(value: Boolean): Self = StObject.set(x, "typeAhead", value.asInstanceOf[js.Any])
    
    inline def setTypeAheadUndefined: Self = StObject.set(x, "typeAhead", js.undefined)
  }
}
