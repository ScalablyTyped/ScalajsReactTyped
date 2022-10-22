package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
trait SearchSuggestionsRequestDeferral extends StObject {
  
  /** Signals that the app has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. */
  def complete(): Unit
}
object SearchSuggestionsRequestDeferral {
  
  inline def apply(complete: Callback): SearchSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SearchSuggestionsRequestDeferral]
  }
  
  extension [Self <: SearchSuggestionsRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
