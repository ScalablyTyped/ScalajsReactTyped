package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortMultipartUploadOutput extends js.Object {
  var RequestCharged: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.RequestCharged] = js.native
}

object AbortMultipartUploadOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null): AbortMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartUploadOutput]
  }
}

