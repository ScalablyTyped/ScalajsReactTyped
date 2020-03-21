package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretsManagerSecretResourceData extends js.Object {
  /**
    * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version (represented by the ''AWSCURRENT'' staging label) is included by default.
    */
  var ARN: js.UndefOr[string] = js.native
  /**
    * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
    */
  var AdditionalStagingLabelsToDownload: js.UndefOr[listOfString] = js.native
}

object SecretsManagerSecretResourceData {
  @scala.inline
  def apply(ARN: string = null, AdditionalStagingLabelsToDownload: listOfString = null): SecretsManagerSecretResourceData = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (AdditionalStagingLabelsToDownload != null) __obj.updateDynamic("AdditionalStagingLabelsToDownload")(AdditionalStagingLabelsToDownload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretsManagerSecretResourceData]
  }
}

