package typingsJapgolly.jqueryMenuaim

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /** Dropdown menus that can differentiate between a user trying hover over a dropdown item vs trying to navigate into a submenu's contents.
    * @author Ben Kamens
    * https://github.com/kamens/jQuery-menu-aim
    */
  def menuAim(options: JQueryMenuAimOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(menuAim: JQueryMenuAimOptions => CallbackTo[JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("menuAim")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryMenuaim.JQueryMenuAimOptions) => menuAim(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

