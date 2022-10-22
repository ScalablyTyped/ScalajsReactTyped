package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcdhKeyDeriveParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var public: org.scalajs.dom.CryptoKey
}
object EcdhKeyDeriveParams {
  
  inline def apply(name: java.lang.String, public: org.scalajs.dom.CryptoKey): EcdhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdhKeyDeriveParams]
  }
  
  extension [Self <: EcdhKeyDeriveParams](x: Self) {
    
    inline def setPublic(value: org.scalajs.dom.CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
