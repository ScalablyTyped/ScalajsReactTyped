package typingsJapgolly.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to delete.
    */
  var HapgArn: typingsJapgolly.awsSdk.cloudhsmMod.HapgArn = js.native
}

object DeleteHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DeleteHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHapgRequest]
  }
}

