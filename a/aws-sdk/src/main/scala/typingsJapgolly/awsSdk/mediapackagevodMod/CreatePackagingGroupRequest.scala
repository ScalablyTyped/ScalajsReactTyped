package typingsJapgolly.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackagingGroupRequest extends js.Object {
  /**
    * The ID of the PackagingGroup.
    */
  var Id: string = js.native
}

object CreatePackagingGroupRequest {
  @scala.inline
  def apply(Id: string): CreatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePackagingGroupRequest]
  }
}

