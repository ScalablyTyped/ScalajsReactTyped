package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectLockConfigurationOutput extends js.Object {
  var RequestCharged: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.RequestCharged] = js.native
}

object PutObjectLockConfigurationOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null): PutObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLockConfigurationOutput]
  }
}

