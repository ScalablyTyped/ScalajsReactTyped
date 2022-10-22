package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.radioTypesMod.Align
import typingsJapgolly.baseui.radioTypesMod.LabelPlacement
import typingsJapgolly.baseui.radioTypesMod.RadioGroupOverrides
import typingsJapgolly.baseui.radioTypesMod.RadioGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  @JSImport("baseui/radio", "RadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.radioMod.RadioGroup] {
    
    inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Node*): this.type = set("children", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(value: LabelPlacement): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onMouseEnter(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def onMouseLeave(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    inline def overrides(value: RadioGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
