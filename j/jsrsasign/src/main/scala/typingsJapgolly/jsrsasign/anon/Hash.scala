package typingsJapgolly.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: Alg
  
  var oid: String
}
object Hash {
  
  inline def apply(hash: Alg, oid: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setHash(value: Alg): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
