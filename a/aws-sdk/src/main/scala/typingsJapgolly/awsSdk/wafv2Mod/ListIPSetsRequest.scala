package typingsJapgolly.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsRequest extends js.Object {
  /**
    * The maximum number of objects that you want AWS WAF to return for this request. If more objects are available, in the response, AWS WAF provides a NextMarker value that you can use in a subsequent call to get the next batch of objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typingsJapgolly.awsSdk.wafv2Mod.NextMarker] = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsJapgolly.awsSdk.wafv2Mod.Scope = js.native
}

object ListIPSetsRequest {
  @scala.inline
  def apply(Scope: Scope, Limit: Int | Double = null, NextMarker: NextMarker = null): ListIPSetsRequest = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIPSetsRequest]
  }
}

