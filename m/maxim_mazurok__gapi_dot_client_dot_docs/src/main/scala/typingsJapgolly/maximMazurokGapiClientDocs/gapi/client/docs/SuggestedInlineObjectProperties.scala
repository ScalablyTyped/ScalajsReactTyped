package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedInlineObjectProperties extends StObject {
  
  /**
    * An InlineObjectProperties that only includes the changes made in this suggestion. This can be used along with the inline_object_properties_suggestion_state to see which fields have
    * changed and their new values.
    */
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
  
  /** A mask that indicates which of the fields on the base InlineObjectProperties have been changed in this suggestion. */
  var inlineObjectPropertiesSuggestionState: js.UndefOr[InlineObjectPropertiesSuggestionState] = js.undefined
}
object SuggestedInlineObjectProperties {
  
  inline def apply(): SuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedInlineObjectProperties]
  }
  
  extension [Self <: SuggestedInlineObjectProperties](x: Self) {
    
    inline def setInlineObjectProperties(value: InlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectPropertiesSuggestionState(value: InlineObjectPropertiesSuggestionState): Self = StObject.set(x, "inlineObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectPropertiesSuggestionStateUndefined: Self = StObject.set(x, "inlineObjectPropertiesSuggestionState", js.undefined)
    
    inline def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
  }
}
