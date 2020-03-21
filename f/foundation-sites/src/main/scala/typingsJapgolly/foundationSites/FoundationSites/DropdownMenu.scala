package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/dropdown-menu.html#javascript-reference
trait DropdownMenu extends js.Object {
  def destroy(): Unit
}

object DropdownMenu {
  @scala.inline
  def apply(destroy: Callback): DropdownMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[DropdownMenu]
  }
}

