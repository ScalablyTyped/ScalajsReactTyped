package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typingsJapgolly.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typingsJapgolly.chrome.chrome.omnibox.Suggestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Omnibox
////////////////////
/**
  * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
  * Manifest:  "omnibox": {...}
  * @since Chrome 9.
  */
object omnibox {
  
  @JSGlobal("chrome.omnibox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.omnibox.onDeleteSuggestion")
  @js.native
  def onDeleteSuggestion: OmniboxSuggestionDeletedEvent = js.native
  inline def onDeleteSuggestion_=(x: OmniboxSuggestionDeletedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeleteSuggestion")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.omnibox.onInputCancelled")
  @js.native
  def onInputCancelled: OmniboxInputCancelledEvent = js.native
  inline def onInputCancelled_=(x: OmniboxInputCancelledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputCancelled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.omnibox.onInputChanged")
  @js.native
  def onInputChanged: OmniboxInputChangedEvent = js.native
  inline def onInputChanged_=(x: OmniboxInputChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.omnibox.onInputEntered")
  @js.native
  def onInputEntered: OmniboxInputEnteredEvent = js.native
  inline def onInputEntered_=(x: OmniboxInputEnteredEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputEntered")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.omnibox.onInputStarted")
  @js.native
  def onInputStarted: OmniboxInputStartedEvent = js.native
  inline def onInputStarted_=(x: OmniboxInputStartedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputStarted")(x.asInstanceOf[js.Any])
  
  inline def setDefaultSuggestion(suggestion: Suggestion): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSuggestion")(suggestion.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
