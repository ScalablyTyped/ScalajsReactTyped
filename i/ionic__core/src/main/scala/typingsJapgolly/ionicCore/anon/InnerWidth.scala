package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerWidth extends StObject {
  
  var innerHeight: Double
  
  var innerWidth: Double
  
  var navigator: UserAgent
}
object InnerWidth {
  
  inline def apply(innerHeight: Double, innerWidth: Double, navigator: UserAgent): InnerWidth = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerWidth]
  }
  
  extension [Self <: InnerWidth](x: Self) {
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setNavigator(value: UserAgent): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
  }
}
