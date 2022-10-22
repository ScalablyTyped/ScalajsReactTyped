package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a suggestionsrequested event that is associated with a searchPane object. */
trait SearchPaneSuggestionsRequestedEventArgs extends StObject {
  
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String
  
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails
  
  /** The text that the app should provide suggestions for and that was in the search box when the suggestionsrequested event fired. */
  var queryText: String
  
  /** An object that stores suggestions and information about the request. */
  var request: SearchPaneSuggestionsRequest
}
object SearchPaneSuggestionsRequestedEventArgs {
  
  inline def apply(
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: String,
    request: SearchPaneSuggestionsRequest
  ): SearchPaneSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneSuggestionsRequestedEventArgs]
  }
  
  extension [Self <: SearchPaneSuggestionsRequestedEventArgs](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: SearchPaneSuggestionsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
