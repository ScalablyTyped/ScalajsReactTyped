package typingsJapgolly.baseui.mapMarkerTypesMod

import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeEnhancer extends StObject {
  
  var badgeEnhancerContent: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var badgeEnhancerSize: js.UndefOr[BadgeEnhancerSize | Null] = js.undefined
}
object BadgeEnhancer {
  
  inline def apply(): BadgeEnhancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeEnhancer]
  }
  
  extension [Self <: BadgeEnhancer](x: Self) {
    
    inline def setBadgeEnhancerContent(value: ComponentType[SizeNumber]): Self = StObject.set(x, "badgeEnhancerContent", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnhancerContentUndefined: Self = StObject.set(x, "badgeEnhancerContent", js.undefined)
    
    inline def setBadgeEnhancerSize(value: BadgeEnhancerSize): Self = StObject.set(x, "badgeEnhancerSize", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnhancerSizeNull: Self = StObject.set(x, "badgeEnhancerSize", null)
    
    inline def setBadgeEnhancerSizeUndefined: Self = StObject.set(x, "badgeEnhancerSize", js.undefined)
  }
}
