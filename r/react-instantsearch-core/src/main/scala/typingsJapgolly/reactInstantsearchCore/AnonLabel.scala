package typingsJapgolly.reactInstantsearchCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchCore.mod.RefinementValue
import typingsJapgolly.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  var value: RefinementValue
}

object AnonLabel {
  @scala.inline
  def apply(label: String, value: /* searchState */ SearchState => CallbackTo[SearchState]): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: /* searchState */ typingsJapgolly.reactInstantsearchCore.mod.SearchState) => value(t0).runNow()))
    __obj.asInstanceOf[AnonLabel]
  }
}

