package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response object that can be returned from a suggestions callback function. This is used with
  * TextInput widgets that implement autocomplete.
  *
  *     var suggestionsResponse = CardService.newSuggestionsResponseBuilder()
  *         .setSuggestions(CardService.newSuggestions()
  *             .addSuggestion("First suggestion")
  *             .addSuggestion("Second suggestion"))
  *             .build();
  */
trait SuggestionsResponse extends StObject {
  
  def printJson(): String
}
object SuggestionsResponse {
  
  inline def apply(printJson: CallbackTo[String]): SuggestionsResponse = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn)
    __obj.asInstanceOf[SuggestionsResponse]
  }
  
  extension [Self <: SuggestionsResponse](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
  }
}
