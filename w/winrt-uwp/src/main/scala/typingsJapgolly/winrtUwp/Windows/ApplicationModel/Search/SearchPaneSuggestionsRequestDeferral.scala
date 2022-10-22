package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
trait SearchPaneSuggestionsRequestDeferral extends StObject {
  
  /** Signals that the app has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. */
  def complete(): Unit
}
object SearchPaneSuggestionsRequestDeferral {
  
  inline def apply(complete: Callback): SearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SearchPaneSuggestionsRequestDeferral]
  }
  
  extension [Self <: SearchPaneSuggestionsRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
