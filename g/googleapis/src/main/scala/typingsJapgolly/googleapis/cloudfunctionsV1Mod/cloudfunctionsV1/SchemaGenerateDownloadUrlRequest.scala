package typingsJapgolly.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlRequest extends js.Object {
  /**
    * The optional version of function. If not set, default, current version is
    * used.
    */
  var versionId: js.UndefOr[String] = js.native
}

object SchemaGenerateDownloadUrlRequest {
  @scala.inline
  def apply(versionId: String = null): SchemaGenerateDownloadUrlRequest = {
    val __obj = js.Dynamic.literal()
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateDownloadUrlRequest]
  }
}

