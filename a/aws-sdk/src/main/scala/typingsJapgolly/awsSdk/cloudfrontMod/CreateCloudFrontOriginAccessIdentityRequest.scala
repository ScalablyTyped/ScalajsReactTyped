package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The current configuration information for the identity.
    */
  var CloudFrontOriginAccessIdentityConfig: typingsJapgolly.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig = js.native
}

object CreateCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig): CreateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityRequest]
  }
}

