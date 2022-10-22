package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.Spacing
import typingsJapgolly.cathoQuantum.autoCompleteMod.AutoCompleteProps
import typingsJapgolly.cathoQuantum.autoCompleteMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoComplete {
  
  inline def apply(suggestions: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteProps]))
  }
  
  @JSImport("@catho/quantum/AutoComplete", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def minlength(value: String): this.type = set("minlength", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onSelectedItem(value: /* item */ String => Callback): this.type = set("onSelectedItem", js.Any.fromFunction1((t0: /* item */ String) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def theme(value: Spacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
