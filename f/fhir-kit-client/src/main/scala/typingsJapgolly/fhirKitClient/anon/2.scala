package typingsJapgolly.fhirKitClient.anon

import typingsJapgolly.fhirKitClient.fhirKitClientStrings.`transaction-response`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `type`: `transaction-response`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("transaction-response")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: `transaction-response`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
