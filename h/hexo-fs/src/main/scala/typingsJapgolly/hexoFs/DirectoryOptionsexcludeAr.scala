package typingsJapgolly.hexoFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hexo-fs.hexo-fs.DirectoryOptions & {  exclude ? :std.Array<string>} */
trait DirectoryOptionsexcludeAr extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreHidden: js.UndefOr[Boolean] = js.undefined
  var ignorePattern: js.UndefOr[js.RegExp] = js.undefined
}

object DirectoryOptionsexcludeAr {
  @scala.inline
  def apply(
    exclude: js.Array[String] = null,
    ignoreHidden: js.UndefOr[Boolean] = js.undefined,
    ignorePattern: js.RegExp = null
  ): DirectoryOptionsexcludeAr = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHidden)) __obj.updateDynamic("ignoreHidden")(ignoreHidden.asInstanceOf[js.Any])
    if (ignorePattern != null) __obj.updateDynamic("ignorePattern")(ignorePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryOptionsexcludeAr]
  }
}

