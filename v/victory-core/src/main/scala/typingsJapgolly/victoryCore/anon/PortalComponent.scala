package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalComponent extends StObject {
  
  var className: String
  
  var portalComponent: Element
  
  var portalZIndex: Double
  
  var responsive: Boolean
  
  var role: String
}
object PortalComponent {
  
  inline def apply(
    className: String,
    portalComponent: VdomElement,
    portalZIndex: Double,
    responsive: Boolean,
    role: String
  ): PortalComponent = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], portalComponent = portalComponent.rawElement.asInstanceOf[js.Any], portalZIndex = portalZIndex.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalComponent]
  }
  
  extension [Self <: PortalComponent](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setPortalComponent(value: VdomElement): Self = StObject.set(x, "portalComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPortalZIndex(value: Double): Self = StObject.set(x, "portalZIndex", value.asInstanceOf[js.Any])
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
