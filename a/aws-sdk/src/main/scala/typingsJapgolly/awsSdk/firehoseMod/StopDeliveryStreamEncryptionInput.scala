package typingsJapgolly.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeliveryStreamEncryptionInput extends js.Object {
  /**
    * The name of the delivery stream for which you want to disable server-side encryption (SSE).
    */
  var DeliveryStreamName: typingsJapgolly.awsSdk.firehoseMod.DeliveryStreamName = js.native
}

object StopDeliveryStreamEncryptionInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): StopDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopDeliveryStreamEncryptionInput]
  }
}

