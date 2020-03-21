package typingsJapgolly.pulumiAws.topicSubscriptionMod

import typingsJapgolly.pulumiAws.topicMod.Topic
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicSubscriptionState extends js.Object {
  /**
    * The ARN of the subscription stored as a more user-friendly property
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
    */
  val confirmationTimeoutInMinutes: js.UndefOr[Input[Double]] = js.native
  /**
    * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
    */
  val deliveryPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
    */
  val endpointAutoConfirms: js.UndefOr[Input[Boolean]] = js.native
  /**
    * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
    */
  val filterPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
    */
  val rawMessageDelivery: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the SNS topic to subscribe to
    */
  val topic: js.UndefOr[Input[Topic]] = js.native
}

object TopicSubscriptionState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    confirmationTimeoutInMinutes: Input[Double] = null,
    deliveryPolicy: Input[String] = null,
    endpoint: Input[String] = null,
    endpointAutoConfirms: Input[Boolean] = null,
    filterPolicy: Input[String] = null,
    protocol: Input[String] = null,
    rawMessageDelivery: Input[Boolean] = null,
    topic: Input[Topic] = null
  ): TopicSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (confirmationTimeoutInMinutes != null) __obj.updateDynamic("confirmationTimeoutInMinutes")(confirmationTimeoutInMinutes.asInstanceOf[js.Any])
    if (deliveryPolicy != null) __obj.updateDynamic("deliveryPolicy")(deliveryPolicy.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpointAutoConfirms != null) __obj.updateDynamic("endpointAutoConfirms")(endpointAutoConfirms.asInstanceOf[js.Any])
    if (filterPolicy != null) __obj.updateDynamic("filterPolicy")(filterPolicy.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (rawMessageDelivery != null) __obj.updateDynamic("rawMessageDelivery")(rawMessageDelivery.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicSubscriptionState]
  }
}

