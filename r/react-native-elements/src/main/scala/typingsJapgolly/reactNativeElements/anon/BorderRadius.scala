package typingsJapgolly.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadius extends StObject {
  
  var borderRadius: Double
}
object BorderRadius {
  
  inline def apply(borderRadius: Double): BorderRadius = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadius]
  }
  
  extension [Self <: BorderRadius](x: Self) {
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
  }
}
