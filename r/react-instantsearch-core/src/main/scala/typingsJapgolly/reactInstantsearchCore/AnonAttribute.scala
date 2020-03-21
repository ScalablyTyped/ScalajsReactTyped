package typingsJapgolly.reactInstantsearchCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchCore.mod.RefinementValue
import typingsJapgolly.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttribute extends js.Object {
  var attribute: String
  var id: String
  var index: String
  var label: String
  var value: RefinementValue
}

object AnonAttribute {
  @scala.inline
  def apply(
    attribute: String,
    id: String,
    index: String,
    label: String,
    value: /* searchState */ SearchState => CallbackTo[SearchState]
  ): AnonAttribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: /* searchState */ typingsJapgolly.reactInstantsearchCore.mod.SearchState) => value(t0).runNow()))
    __obj.asInstanceOf[AnonAttribute]
  }
}

