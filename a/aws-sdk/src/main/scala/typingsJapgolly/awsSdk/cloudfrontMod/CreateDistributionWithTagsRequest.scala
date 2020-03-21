package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionWithTagsRequest extends js.Object {
  /**
    * The distribution's configuration information. 
    */
  var DistributionConfigWithTags: typingsJapgolly.awsSdk.cloudfrontMod.DistributionConfigWithTags = js.native
}

object CreateDistributionWithTagsRequest {
  @scala.inline
  def apply(DistributionConfigWithTags: DistributionConfigWithTags): CreateDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(DistributionConfigWithTags = DistributionConfigWithTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDistributionWithTagsRequest]
  }
}

