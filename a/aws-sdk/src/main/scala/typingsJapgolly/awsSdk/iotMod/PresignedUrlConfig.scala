package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresignedUrlConfig extends js.Object {
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
    */
  var expiresInSec: js.UndefOr[ExpiresInSec] = js.native
  /**
    * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job data/updates are stored. The role must also grant permission for IoT to download the files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object PresignedUrlConfig {
  @scala.inline
  def apply(expiresInSec: Int | Double = null, roleArn: RoleArn = null): PresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    if (expiresInSec != null) __obj.updateDynamic("expiresInSec")(expiresInSec.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresignedUrlConfig]
  }
}

