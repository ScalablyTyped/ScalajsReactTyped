package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginatorPublicKeyJson extends StObject {
  
  var algorithm: AlgorithmIdentifierJson
  
  var publicKey: BitStringJson
}
object OriginatorPublicKeyJson {
  
  inline def apply(algorithm: AlgorithmIdentifierJson, publicKey: BitStringJson): OriginatorPublicKeyJson = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginatorPublicKeyJson]
  }
  
  extension [Self <: OriginatorPublicKeyJson](x: Self) {
    
    inline def setAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: BitStringJson): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
