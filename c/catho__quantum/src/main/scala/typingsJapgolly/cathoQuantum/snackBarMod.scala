package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLParagraphElement
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeBreakpointsColors
import typingsJapgolly.cathoQuantum.anon.CallbackFn
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackBarMod {
  
  @JSImport("@catho/quantum/SnackBar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SnackBarProps, js.Object, Any]
  
  type SnackBar = japgolly.scalajs.react.facade.React.Component[SnackBarProps & js.Object, js.Object]
  
  trait SnackBarProps extends StObject {
    
    var actionTrigger: js.UndefOr[CallbackFn] = js.undefined
    
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    var hideIcon: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[
        (MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]) | (TouchEventHandler[HTMLButtonElement | HTMLAnchorElement])
      ] = js.undefined
    
    var secondsToClose: js.UndefOr[Double] = js.undefined
    
    var skin: js.UndefOr[primary | success | error | neutral | warning] = js.undefined
    
    var text: String | HTMLParagraphElement
    
    var theme: js.UndefOr[BaseFontSizeBreakpointsColors] = js.undefined
  }
  object SnackBarProps {
    
    inline def apply(text: String | HTMLParagraphElement): SnackBarProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackBarProps]
    }
    
    extension [Self <: SnackBarProps](x: Self) {
      
      inline def setActionTrigger(value: CallbackFn): Self = StObject.set(x, "actionTrigger", value.asInstanceOf[js.Any])
      
      inline def setActionTriggerUndefined: Self = StObject.set(x, "actionTrigger", js.undefined)
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setHideIcon(value: Boolean): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      inline def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setOnClose(
        value: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) => Callback
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element])) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setSecondsToClose(value: Double): Self = StObject.set(x, "secondsToClose", value.asInstanceOf[js.Any])
      
      inline def setSecondsToCloseUndefined: Self = StObject.set(x, "secondsToClose", js.undefined)
      
      inline def setSkin(value: primary | success | error | neutral | warning): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setText(value: String | HTMLParagraphElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: BaseFontSizeBreakpointsColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
