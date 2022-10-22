package typingsJapgolly.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oid extends StObject {
  
  var hash: Alg | typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier
  
  var oid: String
}
object Oid {
  
  inline def apply(
    hash: Alg | typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier,
    oid: String
  ): Oid = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
  
  extension [Self <: Oid](x: Self) {
    
    inline def setHash(value: Alg | typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
