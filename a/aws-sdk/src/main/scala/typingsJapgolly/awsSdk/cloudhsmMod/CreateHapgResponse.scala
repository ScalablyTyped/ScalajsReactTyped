package typingsJapgolly.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmMod.HapgArn] = js.native
}

object CreateHapgResponse {
  @scala.inline
  def apply(HapgArn: HapgArn = null): CreateHapgResponse = {
    val __obj = js.Dynamic.literal()
    if (HapgArn != null) __obj.updateDynamic("HapgArn")(HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHapgResponse]
  }
}

