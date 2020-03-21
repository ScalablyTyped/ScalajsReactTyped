package typingsJapgolly.ldapjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var `type`: String
  def matches(obj: js.Any): Boolean
}

object Filter {
  @scala.inline
  def apply(matches: js.Any => CallbackTo[Boolean], `type`: String): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: js.Any) => matches(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

