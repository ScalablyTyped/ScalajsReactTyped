package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedPositionedObjectProperties extends StObject {
  
  /**
    * A PositionedObjectProperties that only includes the changes made in this suggestion. This can be used along with the positioned_object_properties_suggestion_state to see which
    * fields have changed and their new values.
    */
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
  
  /** A mask that indicates which of the fields on the base PositionedObjectProperties have been changed in this suggestion. */
  var positionedObjectPropertiesSuggestionState: js.UndefOr[PositionedObjectPropertiesSuggestionState] = js.undefined
}
object SuggestedPositionedObjectProperties {
  
  inline def apply(): SuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedPositionedObjectProperties]
  }
  
  extension [Self <: SuggestedPositionedObjectProperties](x: Self) {
    
    inline def setPositionedObjectProperties(value: PositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
    
    inline def setPositionedObjectPropertiesSuggestionState(value: PositionedObjectPropertiesSuggestionState): Self = StObject.set(x, "positionedObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setPositionedObjectPropertiesSuggestionStateUndefined: Self = StObject.set(x, "positionedObjectPropertiesSuggestionState", js.undefined)
    
    inline def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
  }
}
