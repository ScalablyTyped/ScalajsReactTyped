package typingsJapgolly.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDownloadParameters extends js.Object {
  /**
    * gdata
    */
  var allowGzipCompression: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var ignoreRange: js.UndefOr[Boolean] = js.native
}

object SchemaGdataDownloadParameters {
  @scala.inline
  def apply(
    allowGzipCompression: js.UndefOr[Boolean] = js.undefined,
    ignoreRange: js.UndefOr[Boolean] = js.undefined
  ): SchemaGdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowGzipCompression)) __obj.updateDynamic("allowGzipCompression")(allowGzipCompression.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRange)) __obj.updateDynamic("ignoreRange")(ignoreRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataDownloadParameters]
  }
}

