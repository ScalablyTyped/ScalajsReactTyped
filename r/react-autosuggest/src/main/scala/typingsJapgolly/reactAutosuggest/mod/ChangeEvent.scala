package typingsJapgolly.reactAutosuggest.mod

import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`type`
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.click
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.down
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.enter
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.escape
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends js.Object {
  var method: down | up | escape | enter | click | `type`
  var newValue: String
}

object ChangeEvent {
  @scala.inline
  def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

