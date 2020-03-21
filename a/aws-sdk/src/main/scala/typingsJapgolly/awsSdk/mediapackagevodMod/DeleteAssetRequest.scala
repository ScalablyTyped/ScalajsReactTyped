package typingsJapgolly.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssetRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD Asset resource to delete.
    */
  var Id: string = js.native
}

object DeleteAssetRequest {
  @scala.inline
  def apply(Id: string): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAssetRequest]
  }
}

