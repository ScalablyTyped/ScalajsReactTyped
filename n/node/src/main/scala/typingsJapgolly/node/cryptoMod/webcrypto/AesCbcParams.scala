package typingsJapgolly.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCbcParams
  extends StObject
     with Algorithm {
  
  var iv: BufferSource
}
object AesCbcParams {
  
  inline def apply(iv: BufferSource, name: String): AesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCbcParams]
  }
  
  extension [Self <: AesCbcParams](x: Self) {
    
    inline def setIv(value: BufferSource): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
