package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibToastHeaderMod {
  
  @JSImport("reactstrap/types/lib/ToastHeader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToastHeaderProps, js.Object, Any]
  
  type ToastHeader = japgolly.scalajs.react.facade.React.Component[ToastHeaderProps & js.Object, js.Object]
  
  trait ToastHeaderProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var close: js.UndefOr[Node] = js.undefined
    
    var closeAriaLabel: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var icon: js.UndefOr[String | Node] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[Any]] = js.undefined
    
    var wrapTag: js.UndefOr[ElementType] = js.undefined
  }
  object ToastHeaderProps {
    
    inline def apply(): ToastHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastHeaderProps]
    }
    
    extension [Self <: ToastHeaderProps](x: Self) {
      
      inline def setClose(value: VdomNode): Self = StObject.set(x, "close", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseAriaLabel(value: String): Self = StObject.set(x, "closeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseAriaLabelUndefined: Self = StObject.set(x, "closeAriaLabel", js.undefined)
      
      inline def setCloseNull: Self = StObject.set(x, "close", null)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCloseVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "close", js.Array(value*))
      
      inline def setCloseVdomElement(value: VdomElement): Self = StObject.set(x, "close", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setIcon(value: String | Node): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setToggle(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setWrapTag(value: ElementType): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      inline def setWrapTagUndefined: Self = StObject.set(x, "wrapTag", js.undefined)
    }
  }
}
