package typingsJapgolly.fhirKitClient.anon

import typingsJapgolly.fhirKitClient.fhirKitClientStrings.`batch-response`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: `batch-response`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("batch-response")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: `batch-response`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
