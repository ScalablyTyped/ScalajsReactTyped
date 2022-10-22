package typingsJapgolly.webdriver.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.webdriver.webdriverStrings.`object`
import typingsJapgolly.webdriver.webdriverStrings.boolean
import typingsJapgolly.webdriver.webdriverStrings.function
import typingsJapgolly.webdriver.webdriverStrings.number
import typingsJapgolly.webdriver.webdriverStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var default: js.UndefOr[Double] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[js.Function1[/* option */ Double, Unit]] = js.undefined
}
object Required {
  
  inline def apply(`type`: string | number | `object` | boolean | function): Required = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* option */ Double => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ Double) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
