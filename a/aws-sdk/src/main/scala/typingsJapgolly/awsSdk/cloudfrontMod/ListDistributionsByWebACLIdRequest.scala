package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionsByWebACLIdRequest extends js.Object {
  /**
    * Use Marker and MaxItems to control pagination of results. If you have more than MaxItems distributions that satisfy the request, the response includes a NextMarker element. To get the next page of results, submit another request. For the value of Marker, specify the value of NextMarker from the last response. (For the first request, omit Marker.) 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and default values are both 100.
    */
  var MaxItems: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null" for the ID, the request returns a list of the distributions that aren't associated with a web ACL. 
    */
  var WebACLId: String = js.native
}

object ListDistributionsByWebACLIdRequest {
  @scala.inline
  def apply(WebACLId: String, Marker: String = null, MaxItems: String = null): ListDistributionsByWebACLIdRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByWebACLIdRequest]
  }
}

