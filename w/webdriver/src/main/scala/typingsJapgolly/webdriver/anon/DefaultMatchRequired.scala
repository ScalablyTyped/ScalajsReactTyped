package typingsJapgolly.webdriver.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webdriver.webdriverStrings.`object`
import typingsJapgolly.webdriver.webdriverStrings.boolean
import typingsJapgolly.webdriver.webdriverStrings.function
import typingsJapgolly.webdriver.webdriverStrings.number
import typingsJapgolly.webdriver.webdriverStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultMatchRequired extends StObject {
  
  var default: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[js.Function1[/* option */ StringDictionary[String], Unit]] = js.undefined
}
object DefaultMatchRequired {
  
  inline def apply(`type`: string | number | `object` | boolean | function): DefaultMatchRequired = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMatchRequired]
  }
  
  extension [Self <: DefaultMatchRequired](x: Self) {
    
    inline def setDefault(value: StringDictionary[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* option */ StringDictionary[String] => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ StringDictionary[String]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
