package typingsJapgolly.reactVirtualKeyboard.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVirtualKeyboard.mod.KeyboardProps
import typingsJapgolly.reactVirtualKeyboard.mod.ReactKeyboardOptions
import typingsJapgolly.reactVirtualKeyboard.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactVirtualKeyboard {
  
  @JSImport("react-virtual-keyboard", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def callbackParent(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback
    ): this.type = set("callbackParent", js.Any.fromFunction3((t0: /* event */ js.UndefOr[String | Event], t1: /* keyboard */ js.UndefOr[Element], t2: /* el */ js.UndefOr[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onAccepted(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback
    ): this.type = set("onAccepted", js.Any.fromFunction3((t0: /* event */ js.UndefOr[String | Event], t1: /* keyboard */ js.UndefOr[Element], t2: /* el */ js.UndefOr[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onChange(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* event */ js.UndefOr[String | Event], t1: /* keyboard */ js.UndefOr[Element], t2: /* el */ js.UndefOr[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def options(value: ReactKeyboardOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactVirtualKeyboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: KeyboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
