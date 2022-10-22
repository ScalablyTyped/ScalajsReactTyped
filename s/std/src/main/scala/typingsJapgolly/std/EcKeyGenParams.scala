package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcKeyGenParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var namedCurve: NamedCurve
}
object EcKeyGenParams {
  
  inline def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyGenParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyGenParams]
  }
  
  extension [Self <: EcKeyGenParams](x: Self) {
    
    inline def setNamedCurve(value: NamedCurve): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
  }
}
