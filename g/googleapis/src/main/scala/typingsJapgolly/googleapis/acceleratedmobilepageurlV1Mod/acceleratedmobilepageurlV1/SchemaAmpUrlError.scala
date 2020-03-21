package typingsJapgolly.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AMP URL Error resource for a requested URL that couldn&#39;t be found.
  */
@js.native
trait SchemaAmpUrlError extends js.Object {
  /**
    * The error code of an API call.
    */
  var errorCode: js.UndefOr[String] = js.native
  /**
    * An optional descriptive error message.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The original non-AMP URL.
    */
  var originalUrl: js.UndefOr[String] = js.native
}

object SchemaAmpUrlError {
  @scala.inline
  def apply(errorCode: String = null, errorMessage: String = null, originalUrl: String = null): SchemaAmpUrlError = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAmpUrlError]
  }
}

