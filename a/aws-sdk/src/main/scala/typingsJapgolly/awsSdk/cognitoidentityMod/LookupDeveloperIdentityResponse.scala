package typingsJapgolly.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupDeveloperIdentityResponse extends js.Object {
  /**
    * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.
    */
  var DeveloperUserIdentifierList: js.UndefOr[typingsJapgolly.awsSdk.cognitoidentityMod.DeveloperUserIdentifierList] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityId] = js.native
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object LookupDeveloperIdentityResponse {
  @scala.inline
  def apply(
    DeveloperUserIdentifierList: DeveloperUserIdentifierList = null,
    IdentityId: IdentityId = null,
    NextToken: PaginationKey = null
  ): LookupDeveloperIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (DeveloperUserIdentifierList != null) __obj.updateDynamic("DeveloperUserIdentifierList")(DeveloperUserIdentifierList.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupDeveloperIdentityResponse]
  }
}

