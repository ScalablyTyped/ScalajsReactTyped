package typingsJapgolly.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyResponse extends StObject {
  
  /**
    * Metadata associated with the KMS key.
    */
  var KeyMetadata: js.UndefOr[typingsJapgolly.awsSdk.clientsKmsMod.KeyMetadata] = js.undefined
}
object CreateKeyResponse {
  
  inline def apply(): CreateKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyResponse]
  }
  
  extension [Self <: CreateKeyResponse](x: Self) {
    
    inline def setKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
    
    inline def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
  }
}
