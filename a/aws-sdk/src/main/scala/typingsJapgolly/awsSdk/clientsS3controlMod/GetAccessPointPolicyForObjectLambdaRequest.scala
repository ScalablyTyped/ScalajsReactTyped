package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyForObjectLambdaRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified Object Lambda Access Point.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The name of the Object Lambda Access Point.
    */
  var Name: ObjectLambdaAccessPointName
}
object GetAccessPointPolicyForObjectLambdaRequest {
  
  inline def apply(AccountId: AccountId, Name: ObjectLambdaAccessPointName): GetAccessPointPolicyForObjectLambdaRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPolicyForObjectLambdaRequest]
  }
  
  extension [Self <: GetAccessPointPolicyForObjectLambdaRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
