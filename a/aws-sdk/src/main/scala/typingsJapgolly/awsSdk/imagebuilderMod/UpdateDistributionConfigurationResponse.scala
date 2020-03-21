package typingsJapgolly.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionConfigurationResponse extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that was updated by this request. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object UpdateDistributionConfigurationResponse {
  @scala.inline
  def apply(
    clientToken: ClientToken = null,
    distributionConfigurationArn: DistributionConfigurationArn = null,
    requestId: NonEmptyString = null
  ): UpdateDistributionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (distributionConfigurationArn != null) __obj.updateDynamic("distributionConfigurationArn")(distributionConfigurationArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionConfigurationResponse]
  }
}

