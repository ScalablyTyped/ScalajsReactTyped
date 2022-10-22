package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libAccordionIndexDotnativeMod.AccordionNativeProps
import typingsJapgolly.antdMobileRn.libAccordionStyleIndexDotnativeMod.AccordionStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  @JSImport("antd-mobile-rn", "Accordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Accordion] {
    
    inline def activeKey(value: String | js.Array[String]): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    inline def activeKeyVarargs(value: String*): this.type = set("activeKey", js.Array(value*))
    
    inline def defaultActiveKey(value: String | js.Array[String]): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKeyVarargs(value: String*): this.type = set("defaultActiveKey", js.Array(value*))
    
    inline def onChange(value: /* x */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* x */ Any) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: AccordionStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Accordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AccordionNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
