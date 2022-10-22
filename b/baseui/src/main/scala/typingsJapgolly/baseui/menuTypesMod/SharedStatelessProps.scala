package typingsJapgolly.baseui.menuTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStatelessProps extends StObject {
  
  /** Id of the highlighted menu item. */
  var activedescendantId: js.UndefOr[String | Null] = js.undefined
  
  /** Function to get props for each rendered item. This will have some defaults needed for keyboard
    * bindings to work properly. Every rendered item should call this.
    */
  /** Passed to the top level menu element. */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var focusMenu: js.UndefOr[
    js.Function1[
      /* event */ ReactFocusEventFrom[Element] | ReactMouseEventFrom[Element] | KeyboardEvent, 
      Any
    ]
  ] = js.undefined
  
  var getRequiredItemProps: js.UndefOr[GetRequiredItemPropsFn] = js.undefined
  
  var handleKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
  
  var handleMouseLeave: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Any]] = js.undefined
  
  /** Index of highlighted menu item. */
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  /** List of menu items. */
  var items: Items
  
  /** Message to be displayed if no menu items are passed in. */
  var noResultsMsg: js.UndefOr[Node] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Any]] = js.undefined
  
  /** Ref for the menu container element. Used to capture key events for navigation */
  var rootRef: js.UndefOr[RootRef] = js.undefined
  
  var unfocusMenu: js.UndefOr[js.Function0[Any]] = js.undefined
}
object SharedStatelessProps {
  
  inline def apply(items: Items): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStatelessProps]
  }
  
  extension [Self <: SharedStatelessProps](x: Self) {
    
    inline def setActivedescendantId(value: String): Self = StObject.set(x, "activedescendantId", value.asInstanceOf[js.Any])
    
    inline def setActivedescendantIdNull: Self = StObject.set(x, "activedescendantId", null)
    
    inline def setActivedescendantIdUndefined: Self = StObject.set(x, "activedescendantId", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setFocusMenu(
      value: /* event */ ReactFocusEventFrom[Element] | ReactMouseEventFrom[Element] | KeyboardEvent => Any
    ): Self = StObject.set(x, "focusMenu", js.Any.fromFunction1(value))
    
    inline def setFocusMenuUndefined: Self = StObject.set(x, "focusMenu", js.undefined)
    
    inline def setGetRequiredItemProps(value: (/* item */ Item, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    inline def setGetRequiredItemPropsUndefined: Self = StObject.set(x, "getRequiredItemProps", js.undefined)
    
    inline def setHandleKeyDown(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
    
    inline def setHandleKeyDownUndefined: Self = StObject.set(x, "handleKeyDown", js.undefined)
    
    inline def setHandleMouseLeave(value: /* event */ ReactMouseEventFrom[HTMLElement] => Any): Self = StObject.set(x, "handleMouseLeave", js.Any.fromFunction1(value))
    
    inline def setHandleMouseLeaveUndefined: Self = StObject.set(x, "handleMouseLeave", js.undefined)
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setItems(value: Items): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNoResultsMsg(value: VdomNode): Self = StObject.set(x, "noResultsMsg", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNoResultsMsgNull: Self = StObject.set(x, "noResultsMsg", null)
    
    inline def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    inline def setNoResultsMsgVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "noResultsMsg", js.Array(value*))
    
    inline def setNoResultsMsgVdomElement(value: VdomElement): Self = StObject.set(x, "noResultsMsg", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: /* event */ ReactFocusEventFrom[HTMLElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: /* event */ ReactFocusEventFrom[HTMLElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setRootRef(value: RootRef): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    
    inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    
    inline def setUnfocusMenu(value: CallbackTo[Any]): Self = StObject.set(x, "unfocusMenu", value.toJsFn)
    
    inline def setUnfocusMenuUndefined: Self = StObject.set(x, "unfocusMenu", js.undefined)
  }
}
