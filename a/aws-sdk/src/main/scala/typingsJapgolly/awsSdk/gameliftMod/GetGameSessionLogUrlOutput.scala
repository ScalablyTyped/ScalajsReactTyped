package typingsJapgolly.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGameSessionLogUrlOutput extends js.Object {
  /**
    * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day period that the logs are retained.
    */
  var PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.native
}

object GetGameSessionLogUrlOutput {
  @scala.inline
  def apply(PreSignedUrl: NonZeroAndMaxString = null): GetGameSessionLogUrlOutput = {
    val __obj = js.Dynamic.literal()
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameSessionLogUrlOutput]
  }
}

