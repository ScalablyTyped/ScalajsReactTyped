package typingsJapgolly.webdriverio.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
import typingsJapgolly.webdriverio.webdriverioStrings.`object`
import typingsJapgolly.webdriverio.webdriverioStrings.boolean
import typingsJapgolly.webdriverio.webdriverioStrings.function
import typingsJapgolly.webdriverio.webdriverioStrings.number
import typingsJapgolly.webdriverio.webdriverioStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var default: js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[
    js.Function1[
      /* option */ js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]], 
      Unit
    ]
  ] = js.undefined
}
object `1` {
  
  inline def apply(`type`: string | number | `object` | boolean | function): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDefault(value: /* requestOptions */ RequestLibOptions => RequestLibOptions): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(
      value: /* option */ js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]] => Callback
    ): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
