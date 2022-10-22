package typingsJapgolly.reactKeyboardEventHandler

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactKeyboardEventHandler.reactKeyboardEventHandlerStrings.keydown
import typingsJapgolly.reactKeyboardEventHandler.reactKeyboardEventHandlerStrings.keypress
import typingsJapgolly.reactKeyboardEventHandler.reactKeyboardEventHandlerStrings.keyup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-keyboard-event-handler", JSImport.Namespace)
  @js.native
  val ^ : FC[KeyboardEventHandlerProps] = js.native
  
  trait KeyboardEventHandlerProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var handleEventType: js.UndefOr[keydown | keyup | keypress] = js.undefined
    
    var handleFocusableElements: js.UndefOr[Boolean] = js.undefined
    
    var handleKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isExclusive: js.UndefOr[Boolean] = js.undefined
    
    var onKeyEvent: js.UndefOr[js.Function2[/* key */ String, /* event */ KeyboardEvent, Unit]] = js.undefined
  }
  object KeyboardEventHandlerProps {
    
    inline def apply(): KeyboardEventHandlerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardEventHandlerProps]
    }
    
    extension [Self <: KeyboardEventHandlerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHandleEventType(value: keydown | keyup | keypress): Self = StObject.set(x, "handleEventType", value.asInstanceOf[js.Any])
      
      inline def setHandleEventTypeUndefined: Self = StObject.set(x, "handleEventType", js.undefined)
      
      inline def setHandleFocusableElements(value: Boolean): Self = StObject.set(x, "handleFocusableElements", value.asInstanceOf[js.Any])
      
      inline def setHandleFocusableElementsUndefined: Self = StObject.set(x, "handleFocusableElements", js.undefined)
      
      inline def setHandleKeys(value: js.Array[String]): Self = StObject.set(x, "handleKeys", value.asInstanceOf[js.Any])
      
      inline def setHandleKeysUndefined: Self = StObject.set(x, "handleKeys", js.undefined)
      
      inline def setHandleKeysVarargs(value: String*): Self = StObject.set(x, "handleKeys", js.Array(value*))
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsExclusive(value: Boolean): Self = StObject.set(x, "isExclusive", value.asInstanceOf[js.Any])
      
      inline def setIsExclusiveUndefined: Self = StObject.set(x, "isExclusive", js.undefined)
      
      inline def setOnKeyEvent(value: (/* key */ String, /* event */ KeyboardEvent) => Callback): Self = StObject.set(x, "onKeyEvent", js.Any.fromFunction2((t0: /* key */ String, t1: /* event */ KeyboardEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyEventUndefined: Self = StObject.set(x, "onKeyEvent", js.undefined)
    }
  }
  
  type _To = FC[KeyboardEventHandlerProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[KeyboardEventHandlerProps] = ^
}
