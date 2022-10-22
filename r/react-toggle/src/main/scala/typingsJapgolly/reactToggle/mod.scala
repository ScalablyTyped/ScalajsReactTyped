package typingsJapgolly.reactToggle

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toggle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToggleProps, js.Object, Any]
  
  type Toggle = japgolly.scalajs.react.facade.React.Component[ToggleProps & js.Object, js.Object]
  
  trait ToggleIcons extends StObject {
    
    var checked: js.UndefOr[Node] = js.undefined
    
    var unchecked: js.UndefOr[Node] = js.undefined
  }
  object ToggleIcons {
    
    inline def apply(): ToggleIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleIcons]
    }
    
    extension [Self <: ToggleIcons](x: Self) {
      
      inline def setChecked(value: VdomNode): Self = StObject.set(x, "checked", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckedNull: Self = StObject.set(x, "checked", null)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCheckedVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checked", js.Array(value*))
      
      inline def setCheckedVdomElement(value: VdomElement): Self = StObject.set(x, "checked", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUnchecked(value: VdomNode): Self = StObject.set(x, "unchecked", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUncheckedNull: Self = StObject.set(x, "unchecked", null)
      
      inline def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
      
      inline def setUncheckedVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "unchecked", js.Array(value*))
      
      inline def setUncheckedVdomElement(value: VdomElement): Self = StObject.set(x, "unchecked", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ToggleProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var icons: js.UndefOr[Boolean | ToggleIcons] = js.undefined
  }
  object ToggleProps {
    
    inline def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    extension [Self <: ToggleProps](x: Self) {
      
      inline def setIcons(value: Boolean | ToggleIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    }
  }
}
