package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I extends StObject {
  
  var i: Double
  
  var r: BigInteger
  
  var s: BigInteger
}
object I {
  
  inline def apply(i: Double, r: BigInteger, s: BigInteger): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  extension [Self <: I](x: Self) {
    
    inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setR(value: BigInteger): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: BigInteger): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
