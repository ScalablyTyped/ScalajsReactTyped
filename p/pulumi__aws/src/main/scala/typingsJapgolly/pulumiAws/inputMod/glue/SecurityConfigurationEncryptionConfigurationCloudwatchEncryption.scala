package typingsJapgolly.pulumiAws.inputMod.glue

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfigurationCloudwatchEncryption extends js.Object {
  /**
    * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
    */
  var cloudwatchEncryptionMode: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
}

object SecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
  @scala.inline
  def apply(cloudwatchEncryptionMode: Input[String] = null, kmsKeyArn: Input[String] = null): SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchEncryptionMode != null) __obj.updateDynamic("cloudwatchEncryptionMode")(cloudwatchEncryptionMode.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  }
}

