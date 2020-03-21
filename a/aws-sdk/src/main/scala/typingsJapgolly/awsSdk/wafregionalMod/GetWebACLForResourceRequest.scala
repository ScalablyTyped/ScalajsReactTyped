package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLForResourceRequest extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the resource for which to get the web ACL, either an application load balancer or Amazon API Gateway stage. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
    */
  var ResourceArn: typingsJapgolly.awsSdk.wafregionalMod.ResourceArn = js.native
}

object GetWebACLForResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetWebACLForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWebACLForResourceRequest]
  }
}

