package typingsJapgolly.semanticUiPopup.anon

import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'visible'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl>> */
trait PickImplvisiblePartialPic
  extends StObject
     with Param {
  
  var loading: js.UndefOr[String] = js.undefined
  
  var popup: js.UndefOr[String] = js.undefined
  
  var popupVisible: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var visible: String & js.UndefOr[String]
}
object PickImplvisiblePartialPic {
  
  inline def apply(visible: String & js.UndefOr[String]): PickImplvisiblePartialPic = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvisiblePartialPic]
  }
  
  extension [Self <: PickImplvisiblePartialPic](x: Self) {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
    
    inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: String & js.UndefOr[String]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
