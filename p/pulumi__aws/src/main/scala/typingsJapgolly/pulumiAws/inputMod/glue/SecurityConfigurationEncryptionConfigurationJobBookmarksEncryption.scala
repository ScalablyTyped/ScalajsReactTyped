package typingsJapgolly.pulumiAws.inputMod.glue

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption extends js.Object {
  /**
    * Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
    */
  var jobBookmarksEncryptionMode: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
}

object SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
  @scala.inline
  def apply(jobBookmarksEncryptionMode: Input[String] = null, kmsKeyArn: Input[String] = null): SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    if (jobBookmarksEncryptionMode != null) __obj.updateDynamic("jobBookmarksEncryptionMode")(jobBookmarksEncryptionMode.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  }
}

