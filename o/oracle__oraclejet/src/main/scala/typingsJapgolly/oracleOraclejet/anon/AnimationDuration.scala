package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDuration extends StObject {
  
  var animationDuration: Double
  
  var hoverBehaviorDelay: Double
  
  var linkDefaults: EndConnectorType
  
  var nodeDefaults: Icon
  
  var promotedLink: StartConnectorType
}
object AnimationDuration {
  
  inline def apply(
    animationDuration: Double,
    hoverBehaviorDelay: Double,
    linkDefaults: EndConnectorType,
    nodeDefaults: Icon,
    promotedLink: StartConnectorType
  ): AnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], linkDefaults = linkDefaults.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], promotedLink = promotedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
  
  extension [Self <: AnimationDuration](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setLinkDefaults(value: EndConnectorType): Self = StObject.set(x, "linkDefaults", value.asInstanceOf[js.Any])
    
    inline def setNodeDefaults(value: Icon): Self = StObject.set(x, "nodeDefaults", value.asInstanceOf[js.Any])
    
    inline def setPromotedLink(value: StartConnectorType): Self = StObject.set(x, "promotedLink", value.asInstanceOf[js.Any])
  }
}
