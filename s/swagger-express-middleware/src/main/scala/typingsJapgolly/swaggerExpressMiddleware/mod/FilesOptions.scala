package typingsJapgolly.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesOptions extends js.Object {
  var apiPath: js.UndefOr[String] = js.undefined
  var rawFilesPath: js.UndefOr[String] = js.undefined
  var useBasePath: js.UndefOr[Boolean] = js.undefined
}

object FilesOptions {
  @scala.inline
  def apply(
    apiPath: String = null,
    rawFilesPath: String = null,
    useBasePath: js.UndefOr[Boolean] = js.undefined
  ): FilesOptions = {
    val __obj = js.Dynamic.literal()
    if (apiPath != null) __obj.updateDynamic("apiPath")(apiPath.asInstanceOf[js.Any])
    if (rawFilesPath != null) __obj.updateDynamic("rawFilesPath")(rawFilesPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useBasePath)) __obj.updateDynamic("useBasePath")(useBasePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesOptions]
  }
}

