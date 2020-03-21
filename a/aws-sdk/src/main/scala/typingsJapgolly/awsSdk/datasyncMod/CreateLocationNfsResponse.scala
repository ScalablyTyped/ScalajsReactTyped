package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationNfsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source NFS file system location that is created.
    */
  var LocationArn: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.LocationArn] = js.native
}

object CreateLocationNfsResponse {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationNfsResponse]
  }
}

