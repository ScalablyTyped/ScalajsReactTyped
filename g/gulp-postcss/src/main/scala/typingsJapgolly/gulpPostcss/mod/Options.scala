package typingsJapgolly.gulpPostcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var parser: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(parser: js.Any = null): Options = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

