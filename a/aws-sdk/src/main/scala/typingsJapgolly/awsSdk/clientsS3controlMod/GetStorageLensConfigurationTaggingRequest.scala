package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageLensConfigurationTaggingRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The ID of the Amazon S3 Storage Lens configuration.
    */
  var ConfigId: typingsJapgolly.awsSdk.clientsS3controlMod.ConfigId
}
object GetStorageLensConfigurationTaggingRequest {
  
  inline def apply(AccountId: AccountId, ConfigId: ConfigId): GetStorageLensConfigurationTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageLensConfigurationTaggingRequest]
  }
  
  extension [Self <: GetStorageLensConfigurationTaggingRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
  }
}
