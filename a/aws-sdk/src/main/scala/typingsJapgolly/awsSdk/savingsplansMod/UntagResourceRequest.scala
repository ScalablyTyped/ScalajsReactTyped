package typingsJapgolly.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: SavingsPlanArn = js.native
  /**
    * The tag keys.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: SavingsPlanArn, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

