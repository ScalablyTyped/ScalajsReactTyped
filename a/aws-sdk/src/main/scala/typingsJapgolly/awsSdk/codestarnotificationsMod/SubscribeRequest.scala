package typingsJapgolly.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.ClientRequestToken] = js.native
  var Target: typingsJapgolly.awsSdk.codestarnotificationsMod.Target = js.native
}

object SubscribeRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn, Target: Target, ClientRequestToken: ClientRequestToken = null): SubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeRequest]
  }
}

