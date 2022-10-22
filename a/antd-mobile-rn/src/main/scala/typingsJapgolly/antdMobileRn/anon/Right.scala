package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Right extends StObject {
  
  var bottom: Double
  
  var right: Double
  
  var top: Double
}
object Right {
  
  inline def apply(bottom: Double, right: Double, top: Double): Right = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  extension [Self <: Right](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
