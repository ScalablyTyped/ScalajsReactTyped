package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.IntegerJson
import typingsJapgolly.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertIDJson extends StObject {
  
  var hashAlgorithm: AlgorithmIdentifierJson
  
  var issuerKeyHash: OctetStringJson
  
  var issuerNameHash: OctetStringJson
  
  var serialNumber: IntegerJson
}
object CertIDJson {
  
  inline def apply(
    hashAlgorithm: AlgorithmIdentifierJson,
    issuerKeyHash: OctetStringJson,
    issuerNameHash: OctetStringJson,
    serialNumber: IntegerJson
  ): CertIDJson = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerKeyHash = issuerKeyHash.asInstanceOf[js.Any], issuerNameHash = issuerNameHash.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertIDJson]
  }
  
  extension [Self <: CertIDJson](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIssuerKeyHash(value: OctetStringJson): Self = StObject.set(x, "issuerKeyHash", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameHash(value: OctetStringJson): Self = StObject.set(x, "issuerNameHash", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
