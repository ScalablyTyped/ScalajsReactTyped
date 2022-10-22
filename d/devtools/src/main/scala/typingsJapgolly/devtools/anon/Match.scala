package typingsJapgolly.devtools.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.devtools.devtoolsStrings.`object`
import typingsJapgolly.devtools.devtoolsStrings.boolean
import typingsJapgolly.devtools.devtoolsStrings.function
import typingsJapgolly.devtools.devtoolsStrings.number
import typingsJapgolly.devtools.devtoolsStrings.string
import typingsJapgolly.wdioTypes.buildOptionsMod.WebDriverLogTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match extends StObject {
  
  var default: js.UndefOr[WebDriverLogTypes] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[js.Function1[/* option */ js.UndefOr[WebDriverLogTypes], Unit]] = js.undefined
}
object Match {
  
  inline def apply(`type`: string | number | `object` | boolean | function): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  extension [Self <: Match](x: Self) {
    
    inline def setDefault(value: WebDriverLogTypes): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* option */ js.UndefOr[WebDriverLogTypes] => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ js.UndefOr[WebDriverLogTypes]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
