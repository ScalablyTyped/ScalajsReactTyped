package typingsJapgolly.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A extends StObject {
  
  var a: Double
  
  var b: Any
  
  var g: Any
  
  var r: Any
}
object A {
  
  inline def apply(a: Double, b: Any, g: Any, r: Any): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  extension [Self <: A](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Any): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: Any): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
