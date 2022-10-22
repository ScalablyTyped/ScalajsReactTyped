package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
import typingsJapgolly.ionicAngular.ionicAngularStrings.contentId
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.maxEdgeStart
import typingsJapgolly.ionicAngular.ionicAngularStrings.menuId
import typingsJapgolly.ionicAngular.ionicAngularStrings.side
import typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentId extends StObject {
  
  var contentId: typingsJapgolly.ionicAngular.ionicAngularStrings.contentId
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var maxEdgeStart: typingsJapgolly.ionicAngular.ionicAngularStrings.maxEdgeStart
  
  var menuId: typingsJapgolly.ionicAngular.ionicAngularStrings.menuId
  
  var side: typingsJapgolly.ionicAngular.ionicAngularStrings.side
  
  var swipeGesture: typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
  
  var `type`: typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
}
object ContentId {
  
  inline def apply(): ContentId = {
    val __obj = js.Dynamic.literal(contentId = "contentId", disabled = "disabled", maxEdgeStart = "maxEdgeStart", menuId = "menuId", side = "side", swipeGesture = "swipeGesture")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[ContentId]
  }
  
  extension [Self <: ContentId](x: Self) {
    
    inline def setContentId(value: contentId): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMaxEdgeStart(value: maxEdgeStart): Self = StObject.set(x, "maxEdgeStart", value.asInstanceOf[js.Any])
    
    inline def setMenuId(value: menuId): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    inline def setSide(value: side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSwipeGesture(value: swipeGesture): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
