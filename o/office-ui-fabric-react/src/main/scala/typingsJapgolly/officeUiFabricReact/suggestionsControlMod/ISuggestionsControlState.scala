package typingsJapgolly.officeUiFabricReact.suggestionsControlMod

import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsControlState[T] extends js.Object {
  var selectedFooterIndex: Double
  var selectedHeaderIndex: Double
  var suggestions: js.Array[ISuggestionModel[T]]
}

object ISuggestionsControlState {
  @scala.inline
  def apply[T](
    selectedFooterIndex: Double,
    selectedHeaderIndex: Double,
    suggestions: js.Array[ISuggestionModel[T]]
  ): ISuggestionsControlState[T] = {
    val __obj = js.Dynamic.literal(selectedFooterIndex = selectedFooterIndex.asInstanceOf[js.Any], selectedHeaderIndex = selectedHeaderIndex.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISuggestionsControlState[T]]
  }
}

