package typingsJapgolly.semanticUiPopup.anon

import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popup'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl>> */
trait PickImplpopupPartialPickILoading
  extends StObject
     with Param {
  
  var loading: js.UndefOr[String] = js.undefined
  
  var popup: String & js.UndefOr[String]
  
  var popupVisible: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplpopupPartialPickILoading {
  
  inline def apply(popup: String & js.UndefOr[String]): PickImplpopupPartialPickILoading = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupPartialPickILoading]
  }
  
  extension [Self <: PickImplpopupPartialPickILoading](x: Self) {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setPopup(value: String & js.UndefOr[String]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
    
    inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
