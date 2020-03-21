package typingsJapgolly.uglifyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOutput extends js.Object {
  var code: String
  var error: js.UndefOr[js.Error] = js.undefined
  var map: String
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object MinifyOutput {
  @scala.inline
  def apply(code: String, map: String, error: js.Error = null, warnings: js.Array[String] = null): MinifyOutput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyOutput]
  }
}

