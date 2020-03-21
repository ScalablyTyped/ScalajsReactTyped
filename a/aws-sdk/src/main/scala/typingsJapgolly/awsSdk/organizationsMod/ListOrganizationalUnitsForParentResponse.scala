package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationalUnitsForParentResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * A list of the OUs in the specified root or parent OU.
    */
  var OrganizationalUnits: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.OrganizationalUnits] = js.native
}

object ListOrganizationalUnitsForParentResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, OrganizationalUnits: OrganizationalUnits = null): ListOrganizationalUnitsForParentResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationalUnits != null) __obj.updateDynamic("OrganizationalUnits")(OrganizationalUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationalUnitsForParentResponse]
  }
}

