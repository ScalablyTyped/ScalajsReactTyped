package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.ComponentRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsAtlasTypesMod {
  
  type ClientAutocompleteRequest = String | ComponentRestrictions
  
  trait ClientGeocodeRequest extends StObject {
    
    var placeId: String
  }
  object ClientGeocodeRequest {
    
    inline def apply(placeId: String): ClientGeocodeRequest = {
      val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientGeocodeRequest]
    }
    
    extension [Self <: ClientGeocodeRequest](x: Self) {
      
      inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Suggestion extends StObject {
    
    var description: String
    
    var place_id: String
    
    var types: js.Array[String]
  }
  object Suggestion {
    
    inline def apply(description: String, place_id: String, types: js.Array[String]): Suggestion = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggestion]
    }
    
    extension [Self <: Suggestion](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}
