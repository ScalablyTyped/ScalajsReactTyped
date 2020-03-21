package typingsJapgolly.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyEditOptions extends js.Object {
  /** Whether the readonly protections on the text editor should be ignored. */
  var bypassReadOnly: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyEditOptions {
  @scala.inline
  def apply(bypassReadOnly: js.UndefOr[Boolean] = js.undefined): ReadonlyEditOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassReadOnly)) __obj.updateDynamic("bypassReadOnly")(bypassReadOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEditOptions]
  }
}

