package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typingsJapgolly.chrome.chrome.omnibox.Suggestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofomnibox extends StObject {
  
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent
  
  var onInputCancelled: OmniboxInputCancelledEvent
  
  var onInputChanged: OmniboxInputChangedEvent
  
  var onInputEntered: OmniboxInputEnteredEvent
  
  var onInputStarted: OmniboxInputStartedEvent
  
  def setDefaultSuggestion(suggestion: Suggestion): Unit
}
object Typeofomnibox {
  
  inline def apply(
    onDeleteSuggestion: OmniboxSuggestionDeletedEvent,
    onInputCancelled: OmniboxInputCancelledEvent,
    onInputChanged: OmniboxInputChangedEvent,
    onInputEntered: OmniboxInputEnteredEvent,
    onInputStarted: OmniboxInputStartedEvent,
    setDefaultSuggestion: Suggestion => Callback
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion.asInstanceOf[js.Any], onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any], setDefaultSuggestion = js.Any.fromFunction1((t0: Suggestion) => setDefaultSuggestion(t0).runNow()))
    __obj.asInstanceOf[Typeofomnibox]
  }
  
  extension [Self <: Typeofomnibox](x: Self) {
    
    inline def setOnDeleteSuggestion(value: OmniboxSuggestionDeletedEvent): Self = StObject.set(x, "onDeleteSuggestion", value.asInstanceOf[js.Any])
    
    inline def setOnInputCancelled(value: OmniboxInputCancelledEvent): Self = StObject.set(x, "onInputCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnInputChanged(value: OmniboxInputChangedEvent): Self = StObject.set(x, "onInputChanged", value.asInstanceOf[js.Any])
    
    inline def setOnInputEntered(value: OmniboxInputEnteredEvent): Self = StObject.set(x, "onInputEntered", value.asInstanceOf[js.Any])
    
    inline def setOnInputStarted(value: OmniboxInputStartedEvent): Self = StObject.set(x, "onInputStarted", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultSuggestion(value: Suggestion => Callback): Self = StObject.set(x, "setDefaultSuggestion", js.Any.fromFunction1((t0: Suggestion) => value(t0).runNow()))
  }
}
