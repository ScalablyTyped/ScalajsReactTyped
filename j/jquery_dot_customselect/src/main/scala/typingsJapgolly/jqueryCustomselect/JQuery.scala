package typingsJapgolly.jqueryCustomselect

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def customSelect(`val`: JQueryCustomSelectOption): JQuery
}

object JQuery {
  @scala.inline
  def apply(customSelect: JQueryCustomSelectOption => CallbackTo[JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customSelect")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryCustomselect.JQueryCustomSelectOption) => customSelect(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

