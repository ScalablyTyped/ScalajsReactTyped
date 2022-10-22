package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLParagraphElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeBreakpointsColors
import typingsJapgolly.cathoQuantum.anon.CallbackFn
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.snackBarMod.SnackBarProps
import typingsJapgolly.cathoQuantum.snackBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SnackBar {
  
  inline def apply(text: String | HTMLParagraphElement): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SnackBarProps]))
  }
  
  @JSImport("@catho/quantum/SnackBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def actionTrigger(value: CallbackFn): this.type = set("actionTrigger", value.asInstanceOf[js.Any])
    
    inline def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def hideIcon(value: Boolean): this.type = set("hideIcon", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def onClose(
      value: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) => Callback
    ): this.type = set("onClose", js.Any.fromFunction1((t0: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element])) => value(t0).runNow()))
    
    inline def secondsToClose(value: Double): this.type = set("secondsToClose", value.asInstanceOf[js.Any])
    
    inline def skin(value: primary | success | error | neutral | warning): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSizeBreakpointsColors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
