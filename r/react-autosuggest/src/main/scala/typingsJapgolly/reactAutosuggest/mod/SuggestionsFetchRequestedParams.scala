package typingsJapgolly.reactAutosuggest.mod

import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`escape-pressed`
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`input-changed`
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`input-focused`
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`suggestion-selected`
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`suggestions-revealed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsFetchRequestedParams extends js.Object {
  var reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`
  var value: String
}

object SuggestionsFetchRequestedParams {
  @scala.inline
  def apply(
    reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`,
    value: String
  ): SuggestionsFetchRequestedParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
}

