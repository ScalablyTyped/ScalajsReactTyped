package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedRolePoliciesResponse extends js.Object {
  /**
    * A list of the attached policies.
    */
  var AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
}

object ListAttachedRolePoliciesResponse {
  @scala.inline
  def apply(
    AttachedPolicies: attachedPoliciesListType = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    Marker: responseMarkerType = null
  ): ListAttachedRolePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedPolicies != null) __obj.updateDynamic("AttachedPolicies")(AttachedPolicies.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedRolePoliciesResponse]
  }
}

