package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedTextStyle extends StObject {
  
  /**
    * A TextStyle that only includes the changes made in this suggestion. This can be used along with the text_style_suggestion_state to see which fields have changed and their new
    * values.
    */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  
  /** A mask that indicates which of the fields on the base TextStyle have been changed in this suggestion. */
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
}
object SuggestedTextStyle {
  
  inline def apply(): SuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTextStyle]
  }
  
  extension [Self <: SuggestedTextStyle](x: Self) {
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
