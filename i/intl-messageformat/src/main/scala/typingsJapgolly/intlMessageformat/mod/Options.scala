package typingsJapgolly.intlMessageformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var formatters: js.UndefOr[Formatters] = js.undefined
}

object Options {
  @scala.inline
  def apply(formatters: Formatters = null): Options = {
    val __obj = js.Dynamic.literal()
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

