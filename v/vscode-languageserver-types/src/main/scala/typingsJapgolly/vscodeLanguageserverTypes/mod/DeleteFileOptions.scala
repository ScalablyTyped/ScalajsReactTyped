package typingsJapgolly.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileOptions extends js.Object {
  /**
    * Ignore the operation if the file doesn't exist.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  /**
    * Delete the content recursively if a folder is denoted.
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object DeleteFileOptions {
  @scala.inline
  def apply(
    ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfNotExists)) __obj.updateDynamic("ignoreIfNotExists")(ignoreIfNotExists.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileOptions]
  }
}

