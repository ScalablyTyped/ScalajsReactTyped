package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The user email address used to filter results. Maximum 1.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.UserType] = js.undefined
}
object ListUsersRequest {
  
  inline def apply(AccountId: NonEmptyString): ListUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
  
  extension [Self <: ListUsersRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ProfileServiceMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserEmail(value: EmailAddress): Self = StObject.set(x, "UserEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "UserEmail", js.undefined)
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
