package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B extends StObject {
  
  var b: int
  
  var g: int
  
  var r: int
}
object B {
  
  inline def apply(b: int, g: int, r: int): B = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  
  extension [Self <: B](x: Self) {
    
    inline def setB(value: int): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: int): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: int): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
