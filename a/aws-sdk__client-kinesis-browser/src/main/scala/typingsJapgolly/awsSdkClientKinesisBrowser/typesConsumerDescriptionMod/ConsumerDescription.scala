package typingsJapgolly.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod

import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerDescription extends js.Object {
  /**
    * <p>When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call <a>SubscribeToShard</a>.</p> <p>If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.</p>
    */
  var ConsumerARN: String
  /**
    * <p/>
    */
  var ConsumerCreationTimestamp: js.Date | String | Double
  /**
    * <p>The name of the consumer is something you choose when you register the consumer.</p>
    */
  var ConsumerName: String
  /**
    * <p>A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.</p>
    */
  var ConsumerStatus: CREATING | DELETING | ACTIVE | String
  /**
    * <p>The ARN of the stream with which you registered the consumer.</p>
    */
  var StreamARN: String
}

object ConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: js.Date | String | Double,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String,
    StreamARN: String
  ): ConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConsumerDescription]
  }
}

