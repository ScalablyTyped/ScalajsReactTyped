package typingsJapgolly.semanticUiPopup.anon

import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'cannotPlace'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl>> */
trait PickImplcannotPlacePartia
  extends StObject
     with Param {
  
  var cannotPlace: String & js.UndefOr[String]
  
  var invalidPosition: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var noTransition: js.UndefOr[String] = js.undefined
  
  var notFound: js.UndefOr[String] = js.undefined
}
object PickImplcannotPlacePartia {
  
  inline def apply(cannotPlace: String & js.UndefOr[String]): PickImplcannotPlacePartia = {
    val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcannotPlacePartia]
  }
  
  extension [Self <: PickImplcannotPlacePartia](x: Self) {
    
    inline def setCannotPlace(value: String & js.UndefOr[String]): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
    
    inline def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
    
    inline def setInvalidPositionUndefined: Self = StObject.set(x, "invalidPosition", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
    
    inline def setNoTransitionUndefined: Self = StObject.set(x, "noTransition", js.undefined)
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
  }
}
