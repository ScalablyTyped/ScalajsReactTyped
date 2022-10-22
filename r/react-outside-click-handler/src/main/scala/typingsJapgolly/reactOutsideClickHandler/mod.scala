package typingsJapgolly.reactOutsideClickHandler

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-outside-click-handler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-outside-click-handler", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DefaultProps extends StObject {
    
    var disabled: Boolean
    
    var display: block | flex | `inline` | `inline-block` | contents
    
    var useCapture: Boolean
  }
  object DefaultProps {
    
    inline def apply(
      disabled: Boolean,
      display: block | flex | `inline` | `inline-block` | contents,
      useCapture: Boolean
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    }
  }
  
  type OutsideClickHandler = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
  
  /* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
  trait Props extends StObject {
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.undefined
    
    def onOutsideClick(e: MouseEvent): Unit
    
    var useCapture: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(onOutsideClick: MouseEvent => Callback): Props = {
      val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1((t0: MouseEvent) => onOutsideClick(t0).runNow()), children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setOnOutsideClick(value: MouseEvent => Callback): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
      
      inline def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
    }
  }
}
