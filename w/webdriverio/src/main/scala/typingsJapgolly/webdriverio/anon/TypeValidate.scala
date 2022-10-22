package typingsJapgolly.webdriverio.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibResponse
import typingsJapgolly.webdriverio.webdriverioStrings.`object`
import typingsJapgolly.webdriverio.webdriverioStrings.boolean
import typingsJapgolly.webdriverio.webdriverioStrings.function
import typingsJapgolly.webdriverio.webdriverioStrings.number
import typingsJapgolly.webdriverio.webdriverioStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValidate extends StObject {
  
  var default: js.UndefOr[
    js.Function2[
      /* response */ RequestLibResponse, 
      /* requestOptions */ RequestLibOptions, 
      RequestLibResponse
    ]
  ] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[
    js.Function1[
      /* option */ js.UndefOr[
        js.Function2[
          /* response */ RequestLibResponse, 
          /* requestOptions */ RequestLibOptions, 
          RequestLibResponse
        ]
      ], 
      Unit
    ]
  ] = js.undefined
}
object TypeValidate {
  
  inline def apply(`type`: string | number | `object` | boolean | function): TypeValidate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValidate]
  }
  
  extension [Self <: TypeValidate](x: Self) {
    
    inline def setDefault(
      value: (/* response */ RequestLibResponse, /* requestOptions */ RequestLibOptions) => RequestLibResponse
    ): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(
      value: /* option */ js.UndefOr[
          js.Function2[
            /* response */ RequestLibResponse, 
            /* requestOptions */ RequestLibOptions, 
            RequestLibResponse
          ]
        ] => Callback
    ): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ js.UndefOr[
          js.Function2[
            /* response */ RequestLibResponse, 
            /* requestOptions */ RequestLibOptions, 
            RequestLibResponse
          ]
        ]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
