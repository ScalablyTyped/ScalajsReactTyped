package typingsJapgolly.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacImportParams
  extends StObject
     with Algorithm {
  
  var hash: HashAlgorithmIdentifier
  
  var length: js.UndefOr[Double] = js.undefined
}
object HmacImportParams {
  
  inline def apply(hash: HashAlgorithmIdentifier, name: String): HmacImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacImportParams]
  }
  
  extension [Self <: HmacImportParams](x: Self) {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
