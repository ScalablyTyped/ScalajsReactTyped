package typingsJapgolly.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckConsistencyRequest extends StObject {
  
  /** Required. The token created using GenerateConsistencyToken for the Table. */
  var consistencyToken: js.UndefOr[String] = js.undefined
}
object CheckConsistencyRequest {
  
  inline def apply(): CheckConsistencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckConsistencyRequest]
  }
  
  extension [Self <: CheckConsistencyRequest](x: Self) {
    
    inline def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    inline def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
