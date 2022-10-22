package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for SuggestionsResponse objects.
  */
trait SuggestionsResponseBuilder extends StObject {
  
  def build(): SuggestionsResponse
  
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder
}
object SuggestionsResponseBuilder {
  
  inline def apply(build: CallbackTo[SuggestionsResponse], setSuggestions: Suggestions => SuggestionsResponseBuilder): SuggestionsResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, setSuggestions = js.Any.fromFunction1(setSuggestions))
    __obj.asInstanceOf[SuggestionsResponseBuilder]
  }
  
  extension [Self <: SuggestionsResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[SuggestionsResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetSuggestions(value: Suggestions => SuggestionsResponseBuilder): Self = StObject.set(x, "setSuggestions", js.Any.fromFunction1(value))
  }
}
