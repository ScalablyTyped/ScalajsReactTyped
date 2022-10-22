package typingsJapgolly.chrome.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestAction extends StObject {
  
  var default_icon: js.UndefOr[ManifestIcons] = js.undefined
  
  var default_popup: js.UndefOr[String] = js.undefined
  
  var default_title: js.UndefOr[String] = js.undefined
}
object ManifestAction {
  
  inline def apply(): ManifestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestAction]
  }
  
  extension [Self <: ManifestAction](x: Self) {
    
    inline def setDefault_icon(value: ManifestIcons): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
  }
}
