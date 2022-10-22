package typingsJapgolly.reactToastify

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactToastify.distTypesMod.Theme
import typingsJapgolly.reactToastify.distTypesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsCloseButtonMod {
  
  @JSImport("react-toastify/dist/components/CloseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CloseButton(hasCloseToastThemeAriaLabel: CloseButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CloseButton")(hasCloseToastThemeAriaLabel.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CloseButtonProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    def closeToast(e: ReactMouseEventFrom[HTMLElement]): Unit
    
    var theme: Theme
    
    var `type`: TypeOptions
  }
  object CloseButtonProps {
    
    inline def apply(closeToast: ReactMouseEventFrom[HTMLElement] => Callback, theme: Theme, `type`: TypeOptions): CloseButtonProps = {
      val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => closeToast(t0).runNow()), theme = theme.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseButtonProps]
    }
    
    extension [Self <: CloseButtonProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setCloseToast(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "closeToast", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
