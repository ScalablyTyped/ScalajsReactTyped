package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var r: BigInteger
  
  var s: BigInteger
}
object R {
  
  inline def apply(r: BigInteger, s: BigInteger): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  extension [Self <: R](x: Self) {
    
    inline def setR(value: BigInteger): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: BigInteger): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
