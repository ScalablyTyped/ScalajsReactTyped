package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowHeight extends StObject {
  
  var arrowHeight: Double
  
  var arrowWidth: Double
}
object ArrowHeight {
  
  inline def apply(arrowHeight: Double, arrowWidth: Double): ArrowHeight = {
    val __obj = js.Dynamic.literal(arrowHeight = arrowHeight.asInstanceOf[js.Any], arrowWidth = arrowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowHeight]
  }
  
  extension [Self <: ArrowHeight](x: Self) {
    
    inline def setArrowHeight(value: Double): Self = StObject.set(x, "arrowHeight", value.asInstanceOf[js.Any])
    
    inline def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
  }
}
