package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendTemplatedEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendTemplatedEmail action. 
    */
  var MessageId: typingsJapgolly.awsSdk.sesMod.MessageId = js.native
}

object SendTemplatedEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendTemplatedEmailResponse]
  }
}

