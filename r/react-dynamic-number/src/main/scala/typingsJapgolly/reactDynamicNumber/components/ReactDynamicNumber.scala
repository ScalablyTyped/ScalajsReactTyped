package typingsJapgolly.reactDynamicNumber.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDynamicNumber.mod.DynamicNumberProps
import typingsJapgolly.reactDynamicNumber.mod.default
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Space
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDynamicNumber {
  
  @JSImport("react-dynamic-number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def fraction(value: Double): this.type = set("fraction", value.asInstanceOf[js.Any])
    
    inline def integer(value: Double): this.type = set("integer", value.asInstanceOf[js.Any])
    
    inline def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* event */ ReactEventFrom[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* modelValue */ Double, t2: /* viewValue */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def separator(value: Dot | Comma): this.type = set("separator", value.asInstanceOf[js.Any])
    
    inline def thousand(value: Boolean | Space): this.type = set("thousand", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | _empty): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDynamicNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DynamicNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
