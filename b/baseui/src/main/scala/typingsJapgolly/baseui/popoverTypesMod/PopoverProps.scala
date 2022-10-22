package typingsJapgolly.baseui.popoverTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverProps
  extends StObject
     with BasePopoverProps {
  
  /** Content that should trigger the popover to be shown (also acts as the anchor against
    * which the popover will be positioned).
    */
  var children: Node
  
  /** Content to render within the popover when it's shown. */
  var content: Node | ContentRenderProp
  
  /** Whether or not to show the popover. */
  var isOpen: Boolean
  
  /** Handler for clicks outside the anchor/popover elements. */
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.undefined
  
  /** Handler for click events on trigger element. */
  var onEsc: js.UndefOr[js.Function0[Any]] = js.undefined
}
object PopoverProps {
  
  inline def apply(isOpen: Boolean): PopoverProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], children = null, content = null)
    __obj.asInstanceOf[PopoverProps]
  }
  
  extension [Self <: PopoverProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContent(value: Node | ContentRenderProp): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "content", value.toJsFn)
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOnClickOutside(value: /* event */ MouseEvent => Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
    
    inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
    
    inline def setOnEsc(value: CallbackTo[Any]): Self = StObject.set(x, "onEsc", value.toJsFn)
    
    inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
  }
}
