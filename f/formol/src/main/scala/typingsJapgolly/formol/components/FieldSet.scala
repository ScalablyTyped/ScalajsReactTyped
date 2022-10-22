package typingsJapgolly.formol.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formol.mod.FieldSetProps
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldSet {
  
  @JSImport("formol", "FieldSet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def choices(value: js.Array[Any]): this.type = set("choices", value.asInstanceOf[js.Any])
    
    inline def choicesVarargs(value: Any*): this.type = set("choices", js.Array(value*))
    
    inline def dangerousRawHTMLLabels(value: Boolean): this.type = set("dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
    
    inline def elementRef(value: Ref[Any]): this.type = set("elementRef", value.asInstanceOf[js.Any])
    
    inline def elementRefFunction1(value: Any | Null => Callback): this.type = set("elementRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def elementRefNull: this.type = set("elementRef", null)
    
    inline def isChecked(value: Boolean): this.type = set("isChecked", value.asInstanceOf[js.Any])
    
    inline def onChange(value: Callback): this.type = set("onChange", value.toJsFn)
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FieldSet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FieldSetProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
