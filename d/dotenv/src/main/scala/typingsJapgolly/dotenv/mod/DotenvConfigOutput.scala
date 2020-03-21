package typingsJapgolly.dotenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvConfigOutput extends js.Object {
  var error: js.UndefOr[js.Error] = js.undefined
  var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
}

object DotenvConfigOutput {
  @scala.inline
  def apply(error: js.Error = null, parsed: DotenvParseOutput = null): DotenvConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvConfigOutput]
  }
}

