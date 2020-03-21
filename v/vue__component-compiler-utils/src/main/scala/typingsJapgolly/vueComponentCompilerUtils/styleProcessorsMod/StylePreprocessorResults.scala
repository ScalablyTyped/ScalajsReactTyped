package typingsJapgolly.vueComponentCompilerUtils.styleProcessorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylePreprocessorResults extends js.Object {
  var code: String
  var errors: js.Array[js.Error]
  var map: js.UndefOr[js.Any] = js.undefined
}

object StylePreprocessorResults {
  @scala.inline
  def apply(code: String, errors: js.Array[js.Error], map: js.Any = null): StylePreprocessorResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylePreprocessorResults]
  }
}

