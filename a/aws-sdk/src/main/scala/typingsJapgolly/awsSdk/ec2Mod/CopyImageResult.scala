package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyImageResult extends js.Object {
  /**
    * The ID of the new AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
}

object CopyImageResult {
  @scala.inline
  def apply(ImageId: String = null): CopyImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageResult]
  }
}

