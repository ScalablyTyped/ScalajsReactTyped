package typingsJapgolly.node.tlsMod

import typingsJapgolly.node.NodeJS.Dict
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerCertificate extends StObject {
  
  var exponent: String
  
  var ext_key_usage: js.Array[String]
  
  var fingerprint: String
  
  var fingerprint256: String
  
  var infoAccess: Dict[js.Array[String]]
  
  var issuer: Certificate
  
  var modulus: String
  
  var raw: Buffer
  
  var serialNumber: String
  
  var subject: Certificate
  
  var subjectaltname: String
  
  var valid_from: String
  
  var valid_to: String
}
object PeerCertificate {
  
  inline def apply(
    exponent: String,
    ext_key_usage: js.Array[String],
    fingerprint: String,
    fingerprint256: String,
    infoAccess: Dict[js.Array[String]],
    issuer: Certificate,
    modulus: String,
    raw: Buffer,
    serialNumber: String,
    subject: Certificate,
    subjectaltname: String,
    valid_from: String,
    valid_to: String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], ext_key_usage = ext_key_usage.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], infoAccess = infoAccess.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectaltname = subjectaltname.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerCertificate]
  }
  
  extension [Self <: PeerCertificate](x: Self) {
    
    inline def setExponent(value: String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExt_key_usage(value: js.Array[String]): Self = StObject.set(x, "ext_key_usage", value.asInstanceOf[js.Any])
    
    inline def setExt_key_usageVarargs(value: String*): Self = StObject.set(x, "ext_key_usage", js.Array(value*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprint256(value: String): Self = StObject.set(x, "fingerprint256", value.asInstanceOf[js.Any])
    
    inline def setInfoAccess(value: Dict[js.Array[String]]): Self = StObject.set(x, "infoAccess", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: Certificate): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setModulus(value: String): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Certificate): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectaltname(value: String): Self = StObject.set(x, "subjectaltname", value.asInstanceOf[js.Any])
    
    inline def setValid_from(value: String): Self = StObject.set(x, "valid_from", value.asInstanceOf[js.Any])
    
    inline def setValid_to(value: String): Self = StObject.set(x, "valid_to", value.asInstanceOf[js.Any])
  }
}
