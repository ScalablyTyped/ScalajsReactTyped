package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionRequest extends StObject {
  
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: String
}
object GetFieldLevelEncryptionRequest {
  
  inline def apply(Id: String): GetFieldLevelEncryptionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionRequest]
  }
  
  extension [Self <: GetFieldLevelEncryptionRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
