package typingsJapgolly.findJavaHome.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var allowJre: Boolean
  var registry: js.UndefOr[RegArch] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(allowJre: Boolean, registry: RegArch = null): IOptions = {
    val __obj = js.Dynamic.literal(allowJre = allowJre.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

