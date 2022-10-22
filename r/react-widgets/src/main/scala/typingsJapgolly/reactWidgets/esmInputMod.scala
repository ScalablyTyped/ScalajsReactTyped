package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInputMod extends Shortcut {
  
  @JSImport("react-widgets/esm/Input", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InputProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait InputProps
    extends StObject
       with AllHTMLAttributes[HTMLInputElement] {
    
    var component: js.UndefOr[ElementType] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[InputProps & RefAttributes[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esmInputMod.foo` */
  override def _to: ForwardRefExoticComponent[InputProps & RefAttributes[HTMLInputElement]] = default
}
