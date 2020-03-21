package typingsJapgolly.dotenvExpand.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvResult extends js.Object {
  var error: js.UndefOr[js.Error] = js.undefined
  var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
}

object DotenvResult {
  @scala.inline
  def apply(error: js.Error = null, parsed: StringDictionary[String] = null): DotenvResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvResult]
  }
}

