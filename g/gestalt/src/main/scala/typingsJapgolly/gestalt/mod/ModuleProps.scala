package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleProps extends StObject {
  
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var iconAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var iconButton: js.UndefOr[Element] = js.undefined
  
  var id: String
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[error | info] = js.undefined
}
object ModuleProps {
  
  inline def apply(id: String): ModuleProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleProps]
  }
  
  extension [Self <: ModuleProps](x: Self) {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setIconAccessibilityLabelUndefined: Self = StObject.set(x, "iconAccessibilityLabel", js.undefined)
    
    inline def setIconButton(value: VdomElement): Self = StObject.set(x, "iconButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIconButtonUndefined: Self = StObject.set(x, "iconButton", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: error | info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
