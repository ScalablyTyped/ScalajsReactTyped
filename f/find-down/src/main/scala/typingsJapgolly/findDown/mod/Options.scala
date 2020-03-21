package typingsJapgolly.findDown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Directory to end with. Default: `process.cwd()` */
  var cwd: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

