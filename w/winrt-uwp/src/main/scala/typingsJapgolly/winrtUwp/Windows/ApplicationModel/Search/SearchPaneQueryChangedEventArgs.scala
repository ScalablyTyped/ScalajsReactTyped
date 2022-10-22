package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a querychanged event that is associated with a searchPane object. */
trait SearchPaneQueryChangedEventArgs extends StObject {
  
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String
  
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails
  
  /** The text in the search box when the querychanged event fired. */
  var queryText: String
}
object SearchPaneQueryChangedEventArgs {
  
  inline def apply(language: String, linguisticDetails: SearchPaneQueryLinguisticDetails, queryText: String): SearchPaneQueryChangedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQueryChangedEventArgs]
  }
  
  extension [Self <: SearchPaneQueryChangedEventArgs](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
  }
}
