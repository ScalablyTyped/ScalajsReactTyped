package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The maximum number of results to return from this request.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.MaxResults] = js.undefined
  
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typingsJapgolly.awsSdk.clientsQuicksightMod.Namespace
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListUsersRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): ListUsersRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
  
  extension [Self <: ListUsersRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
