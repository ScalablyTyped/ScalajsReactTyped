package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationS3Response extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source Amazon S3 bucket location that is created.
    */
  var LocationArn: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.LocationArn] = js.native
}

object CreateLocationS3Response {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationS3Response = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationS3Response]
  }
}

