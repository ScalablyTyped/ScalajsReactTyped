package typingsJapgolly.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: string = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceArn: string): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsRequest]
  }
}

