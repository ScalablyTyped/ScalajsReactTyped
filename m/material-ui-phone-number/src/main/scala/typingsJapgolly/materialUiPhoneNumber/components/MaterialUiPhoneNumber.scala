package typingsJapgolly.materialUiPhoneNumber.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiPhoneNumber.mod.MaterialUiPhoneNumberProps
import typingsJapgolly.materialUiPhoneNumber.mod.default
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialUiPhoneNumber {
  
  @JSImport("material-ui-phone-number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoFormat(value: Boolean): this.type = set("autoFormat", value.asInstanceOf[js.Any])
    
    inline def classes(value: Record[String, Any]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def countryCodeEditable(value: Boolean): this.type = set("countryCodeEditable", value.asInstanceOf[js.Any])
    
    inline def defaultCountry(value: String): this.type = set("defaultCountry", value.asInstanceOf[js.Any])
    
    inline def disableAreaCodes(value: Boolean): this.type = set("disableAreaCodes", value.asInstanceOf[js.Any])
    
    inline def disableCountryCode(value: Boolean): this.type = set("disableCountryCode", value.asInstanceOf[js.Any])
    
    inline def disableDropdown(value: Boolean): this.type = set("disableDropdown", value.asInstanceOf[js.Any])
    
    inline def dropdownClass(value: String): this.type = set("dropdownClass", value.asInstanceOf[js.Any])
    
    inline def enableLongNumbers(value: Boolean): this.type = set("enableLongNumbers", value.asInstanceOf[js.Any])
    
    inline def excludeCountries(value: js.Array[String]): this.type = set("excludeCountries", value.asInstanceOf[js.Any])
    
    inline def excludeCountriesVarargs(value: String*): this.type = set("excludeCountries", js.Array(value*))
    
    inline def inputClass(value: String): this.type = set("inputClass", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def onlyCountries(value: js.Array[String]): this.type = set("onlyCountries", value.asInstanceOf[js.Any])
    
    inline def onlyCountriesVarargs(value: String*): this.type = set("onlyCountries", js.Array(value*))
    
    inline def preferredCountries(value: js.Array[String]): this.type = set("preferredCountries", value.asInstanceOf[js.Any])
    
    inline def preferredCountriesVarargs(value: String*): this.type = set("preferredCountries", js.Array(value*))
    
    inline def ref(value: Any): this.type = set("ref", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MaterialUiPhoneNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MaterialUiPhoneNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
