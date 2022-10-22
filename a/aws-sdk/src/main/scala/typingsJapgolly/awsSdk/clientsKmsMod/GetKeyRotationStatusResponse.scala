package typingsJapgolly.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyRotationStatusResponse extends StObject {
  
  /**
    * A Boolean value that specifies whether key rotation is enabled.
    */
  var KeyRotationEnabled: js.UndefOr[BooleanType] = js.undefined
}
object GetKeyRotationStatusResponse {
  
  inline def apply(): GetKeyRotationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyRotationStatusResponse]
  }
  
  extension [Self <: GetKeyRotationStatusResponse](x: Self) {
    
    inline def setKeyRotationEnabled(value: BooleanType): Self = StObject.set(x, "KeyRotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setKeyRotationEnabledUndefined: Self = StObject.set(x, "KeyRotationEnabled", js.undefined)
  }
}
