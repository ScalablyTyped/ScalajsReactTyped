package typingsJapgolly.mrmlncReaddirEnhanced.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var deep: js.UndefOr[Boolean | Double | js.RegExp | FilterFunction] = js.undefined
  var filter: js.UndefOr[String | js.RegExp | FilterFunction] = js.undefined
  var fs: js.UndefOr[FileSystem] = js.undefined
  var sep: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: String = null,
    deep: Boolean | Double | js.RegExp | FilterFunction = null,
    filter: String | js.RegExp | FilterFunction = null,
    fs: FileSystem = null,
    sep: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

