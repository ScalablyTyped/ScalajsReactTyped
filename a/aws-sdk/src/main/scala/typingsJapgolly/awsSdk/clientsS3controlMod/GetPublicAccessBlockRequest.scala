package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicAccessBlockRequest extends StObject {
  
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to retrieve.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsS3controlMod.AccountId
}
object GetPublicAccessBlockRequest {
  
  inline def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
  
  extension [Self <: GetPublicAccessBlockRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
