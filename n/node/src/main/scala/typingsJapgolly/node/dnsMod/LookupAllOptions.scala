package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.nodeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAllOptions extends LookupOptions {
  @JSName("all")
  var all_LookupAllOptions: `true`
}

object LookupAllOptions {
  @scala.inline
  def apply(
    all: `true`,
    family: Int | Double = null,
    hints: Int | Double = null,
    verbatim: js.UndefOr[Boolean] = js.undefined
  ): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAllOptions]
  }
}

