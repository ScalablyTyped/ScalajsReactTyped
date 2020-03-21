package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The resource ARN for the tag.
    */
  var ResourceArn: string = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: string, Tags: Tags = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

