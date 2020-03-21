package typingsJapgolly.sqlFormatter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[StringDictionary[String] | js.Array[String]] = js.undefined
}

object AnonIndent {
  @scala.inline
  def apply(
    indent: String = null,
    language: String = null,
    params: StringDictionary[String] | js.Array[String] = null
  ): AnonIndent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndent]
  }
}

