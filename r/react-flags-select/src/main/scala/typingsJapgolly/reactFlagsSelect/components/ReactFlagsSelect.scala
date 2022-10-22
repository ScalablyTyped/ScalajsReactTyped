package typingsJapgolly.reactFlagsSelect.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFlagsSelect.mod.Props
import typingsJapgolly.reactFlagsSelect.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlagsSelect {
  
  @JSImport("react-flags-select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def alignOptions(value: String): this.type = set("alignOptions", value.asInstanceOf[js.Any])
    
    inline def blackList(value: Boolean): this.type = set("blackList", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def countries(value: js.Array[String]): this.type = set("countries", value.asInstanceOf[js.Any])
    
    inline def countriesVarargs(value: String*): this.type = set("countries", js.Array(value*))
    
    inline def defaultCountry(value: String): this.type = set("defaultCountry", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: /* countryCode */ String => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* countryCode */ String) => value(t0).runNow()))
    
    inline def optionsSize(value: Double): this.type = set("optionsSize", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    inline def selectedSize(value: Double): this.type = set("selectedSize", value.asInstanceOf[js.Any])
    
    inline def showOptionLabel(value: Boolean): this.type = set("showOptionLabel", value.asInstanceOf[js.Any])
    
    inline def showSelectedLabel(value: Boolean): this.type = set("showSelectedLabel", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactFlagsSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
