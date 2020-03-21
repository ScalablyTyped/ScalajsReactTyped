package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLoggingStatus extends js.Object {
  var LoggingEnabled: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.LoggingEnabled] = js.native
}

object BucketLoggingStatus {
  @scala.inline
  def apply(LoggingEnabled: LoggingEnabled = null): BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLoggingStatus]
  }
}

