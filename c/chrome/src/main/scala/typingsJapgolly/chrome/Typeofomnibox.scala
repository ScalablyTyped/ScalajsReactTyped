package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typingsJapgolly.chrome.chrome.omnibox.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofomnibox extends js.Object {
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent
  var onInputCancelled: OmniboxInputCancelledEvent
  var onInputChanged: OmniboxInputChangedEvent
  var onInputEntered: OmniboxInputEnteredEvent
  var onInputStarted: OmniboxInputStartedEvent
  def setDefaultSuggestion(suggestion: Suggestion): Unit
}

object Typeofomnibox {
  @scala.inline
  def apply(
    onDeleteSuggestion: OmniboxSuggestionDeletedEvent,
    onInputCancelled: OmniboxInputCancelledEvent,
    onInputChanged: OmniboxInputChangedEvent,
    onInputEntered: OmniboxInputEnteredEvent,
    onInputStarted: OmniboxInputStartedEvent,
    setDefaultSuggestion: Suggestion => Callback
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion.asInstanceOf[js.Any], onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any])
    __obj.updateDynamic("setDefaultSuggestion")(js.Any.fromFunction1((t0: typingsJapgolly.chrome.chrome.omnibox.Suggestion) => setDefaultSuggestion(t0).runNow()))
    __obj.asInstanceOf[Typeofomnibox]
  }
}

