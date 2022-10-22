package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsButtonButtonMod.ButtonProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalMod.StrictModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsConfirmConfirmMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm/Confirm", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ConfirmProps, js.Object, Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm/Confirm", JSImport.Default)
  @js.native
  val default: ComponentClassP[ConfirmProps & js.Object] = js.native
  
  trait ConfirmProps
    extends StObject
       with StrictConfirmProps
       with /* key */ StringDictionary[Any]
  object ConfirmProps {
    
    inline def apply(): ConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmProps]
    }
  }
  
  trait StrictConfirmProps
    extends StObject
       with StrictModalProps {
    
    /** The cancel button text. */
    var cancelButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.undefined
    
    /** The OK button text. */
    var confirmButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.undefined
    
    /**
      * Called when the Modal is closed without clicking confirm.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onCancel: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the OK button is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onConfirm: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
      ] = js.undefined
  }
  object StrictConfirmProps {
    
    inline def apply(): StrictConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictConfirmProps]
    }
    
    extension [Self <: StrictConfirmProps](x: Self) {
      
      inline def setCancelButton(value: SemanticShorthandItem[ButtonProps]): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonFunction3(
        value: (/* component */ ElementType, ButtonProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "cancelButton", js.Any.fromFunction3(value))
      
      inline def setCancelButtonNull: Self = StObject.set(x, "cancelButton", null)
      
      inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      inline def setCancelButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelButton", js.Array(value*))
      
      inline def setCancelButtonVdomElement(value: VdomElement): Self = StObject.set(x, "cancelButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setConfirmButton(value: SemanticShorthandItem[ButtonProps]): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonFunction3(
        value: (/* component */ ElementType, ButtonProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "confirmButton", js.Any.fromFunction3(value))
      
      inline def setConfirmButtonNull: Self = StObject.set(x, "confirmButton", null)
      
      inline def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
      
      inline def setConfirmButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "confirmButton", js.Array(value*))
      
      inline def setConfirmButtonVdomElement(value: VdomElement): Self = StObject.set(x, "confirmButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnCancel(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ConfirmProps) => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ ConfirmProps) => (value(t0, t1)).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnConfirm(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ConfirmProps) => Callback): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ ConfirmProps) => (value(t0, t1)).runNow()))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  type _To = ComponentClassP[ConfirmProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsAddonsConfirmConfirmMod.foo` */
  override def _to: ComponentClassP[ConfirmProps & js.Object] = default
}
