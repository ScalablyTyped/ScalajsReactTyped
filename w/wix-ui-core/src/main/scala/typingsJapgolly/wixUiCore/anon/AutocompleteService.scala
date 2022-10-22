package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteService extends StObject {
  
  def AutocompleteService(): Any
  
  var AutocompleteServiceStatus: ERROR
  
  def PlacesService(): Any
  
  var PlacesServiceStatus: OK
}
object AutocompleteService {
  
  inline def apply(
    AutocompleteService: CallbackTo[Any],
    AutocompleteServiceStatus: ERROR,
    PlacesService: CallbackTo[Any],
    PlacesServiceStatus: OK
  ): AutocompleteService = {
    val __obj = js.Dynamic.literal(AutocompleteService = AutocompleteService.toJsFn, AutocompleteServiceStatus = AutocompleteServiceStatus.asInstanceOf[js.Any], PlacesService = PlacesService.toJsFn, PlacesServiceStatus = PlacesServiceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteService]
  }
  
  extension [Self <: AutocompleteService](x: Self) {
    
    inline def setAutocompleteService(value: CallbackTo[Any]): Self = StObject.set(x, "AutocompleteService", value.toJsFn)
    
    inline def setAutocompleteServiceStatus(value: ERROR): Self = StObject.set(x, "AutocompleteServiceStatus", value.asInstanceOf[js.Any])
    
    inline def setPlacesService(value: CallbackTo[Any]): Self = StObject.set(x, "PlacesService", value.toJsFn)
    
    inline def setPlacesServiceStatus(value: OK): Self = StObject.set(x, "PlacesServiceStatus", value.asInstanceOf[js.Any])
  }
}
