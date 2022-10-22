package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.formTokenFieldMod.FormTokenField.Props
import typingsJapgolly.wordpressComponents.formTokenFieldMod.FormTokenField.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormTokenField {
  
  @JSImport("@wordpress/components", "FormTokenField")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def displayTransform(value: /* token */ String => String): this.type = set("displayTransform", js.Any.fromFunction1(value))
    
    inline def isBorderless(value: Boolean): this.type = set("isBorderless", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def maxSuggestions(value: Double): this.type = set("maxSuggestions", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ js.Array[Value] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.Array[Value]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onInputChange(value: /* token */ String => Callback): this.type = set("onInputChange", js.Any.fromFunction1((t0: /* token */ String) => value(t0).runNow()))
    
    inline def saveTransform(value: /* token */ String => String): this.type = set("saveTransform", js.Any.fromFunction1(value))
    
    inline def suggestions(value: js.Array[String]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    
    inline def suggestionsVarargs(value: String*): this.type = set("suggestions", js.Array(value*))
    
    inline def tokenizeOnSpace(value: Boolean): this.type = set("tokenizeOnSpace", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Value]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Value*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: FormTokenField.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
