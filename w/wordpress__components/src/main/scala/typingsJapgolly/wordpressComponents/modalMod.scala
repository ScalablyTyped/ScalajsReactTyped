package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wordpressComponents.anon.Describedby
import typingsJapgolly.wordpressComponents.modalMod.Modal.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/modal", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Modal {
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      var aria: js.UndefOr[Describedby] = js.undefined
      
      /**
        * `className` that is applied to the `document.body` while the modal is open.
        * @defaultValue "modal-open"
        */
      var bodyOpenClassName: js.UndefOr[String] = js.undefined
      
      @JSName("children")
      var children_Props: Node
      
      /**
        * Label for the close button.
        * @defaultValue "Close dialog"
        */
      var closeButtonLabel: js.UndefOr[String] = js.undefined
      
      /**
        * If this property is true, it will focus the first tabbable element
        * rendered in the modal.
        * @defaultValue true
        */
      var focusOnMount: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Icon component to render before the title.
        */
      var icon: js.UndefOr[Node] = js.undefined
      
      /**
        * If this property is set to false, the modal will not display a close
        * icon and cannot be dismissed.
        * @defaultValue true
        * @deprecated Use isDismissible
        */
      var isDismissable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If this property is set to false, the modal will not display a close
        * icon and cannot be dismissed.
        * @defaultValue true
        */
      var isDismissible: js.UndefOr[Boolean] = js.undefined
      
      /**
        * This function is called to indicate that the modal should be closed.
        *
        * The originating event might be different depending on how the modal
        * is closed.
        */
      var onRequestClose: KeyboardEventHandler[Element] | MouseEventHandler[Element] | FocusEventHandler[Element]
      
      /**
        * If this property is added, it will an additional class name to the
        * modal overlay div.
        */
      var overlayClassName: js.UndefOr[String] = js.undefined
      
      /**
        * If this property is added, it will determine whether the modal
        * requests to close when a mouse click occurs outside of the modal
        * content.
        * @defaultValue true
        */
      var shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If this property is added, it will determine whether the modal
        * requests to close when the escape key is pressed.
        * @defaultValue true
        */
      var shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined
      
      /**
        * This property is used as the modal header's title. It is required
        * for a11y reasons.
        */
      @JSName("title")
      var title_Props: String
    }
    object Props {
      
      inline def apply(
        onRequestClose: (ReactFocusEventFrom[Element & Element]) | (ReactKeyboardEventFrom[Element & Element]) | (ReactMouseEventFrom[Element & Element]) => Callback,
        title: String
      ): Props = {
        val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction1((t0: (ReactFocusEventFrom[Element & Element]) | (ReactKeyboardEventFrom[Element & Element]) | (ReactMouseEventFrom[Element & Element])) => onRequestClose(t0).runNow()), title = title.asInstanceOf[js.Any], children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAria(value: Describedby): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
        
        inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
        
        inline def setBodyOpenClassName(value: String): Self = StObject.set(x, "bodyOpenClassName", value.asInstanceOf[js.Any])
        
        inline def setBodyOpenClassNameUndefined: Self = StObject.set(x, "bodyOpenClassName", js.undefined)
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setCloseButtonLabel(value: String): Self = StObject.set(x, "closeButtonLabel", value.asInstanceOf[js.Any])
        
        inline def setCloseButtonLabelUndefined: Self = StObject.set(x, "closeButtonLabel", js.undefined)
        
        inline def setFocusOnMount(value: Boolean): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        inline def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
        
        inline def setIconNull: Self = StObject.set(x, "icon", null)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icon", js.Array(value*))
        
        inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
        
        inline def setIsDismissable(value: Boolean): Self = StObject.set(x, "isDismissable", value.asInstanceOf[js.Any])
        
        inline def setIsDismissableUndefined: Self = StObject.set(x, "isDismissable", js.undefined)
        
        inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        inline def setOnRequestClose(
          value: (ReactFocusEventFrom[Element & Element]) | (ReactKeyboardEventFrom[Element & Element]) | (ReactMouseEventFrom[Element & Element]) => Callback
        ): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1((t0: (ReactFocusEventFrom[Element & Element]) | (ReactKeyboardEventFrom[Element & Element]) | (ReactMouseEventFrom[Element & Element])) => value(t0).runNow()))
        
        inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
        
        inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
        
        inline def setShouldCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
        
        inline def setShouldCloseOnClickOutsideUndefined: Self = StObject.set(x, "shouldCloseOnClickOutside", js.undefined)
        
        inline def setShouldCloseOnEsc(value: Boolean): Self = StObject.set(x, "shouldCloseOnEsc", value.asInstanceOf[js.Any])
        
        inline def setShouldCloseOnEscUndefined: Self = StObject.set(x, "shouldCloseOnEsc", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
