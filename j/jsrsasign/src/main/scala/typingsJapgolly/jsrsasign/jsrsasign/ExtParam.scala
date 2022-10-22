package typingsJapgolly.jsrsasign.jsrsasign

import typingsJapgolly.jsrsasign.anon.Caissuer
import typingsJapgolly.jsrsasign.anon.Ocsp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsrsasign.anon.Dictkey
  - typingsJapgolly.jsrsasign.jsrsasign.ExtSubjectKeyIdentifier
  - typingsJapgolly.jsrsasign.jsrsasign.ExtKeyUsage
  - typingsJapgolly.jsrsasign.jsrsasign.ExtSubjectAltName
  - typingsJapgolly.jsrsasign.jsrsasign.ExtIssuerAltName
  - typingsJapgolly.jsrsasign.jsrsasign.ExtBasicConstraints
  - typingsJapgolly.jsrsasign.jsrsasign.ExtNameConstraints
  - typingsJapgolly.jsrsasign.jsrsasign.ExtCRLDistributionPoints
  - typingsJapgolly.jsrsasign.jsrsasign.ExtCertificatePolicies
  - typingsJapgolly.jsrsasign.jsrsasign.ExtAuthorityKeyIdentifier
  - typingsJapgolly.jsrsasign.jsrsasign.ExtExtKeyUsage
  - typingsJapgolly.jsrsasign.jsrsasign.ExtAuthorityInfoAccess
  - typingsJapgolly.jsrsasign.jsrsasign.ExtCRLNumber
  - typingsJapgolly.jsrsasign.jsrsasign.ExtCRLReason
  - typingsJapgolly.jsrsasign.jsrsasign.ExtOcspNonce
  - typingsJapgolly.jsrsasign.jsrsasign.ExtOcspNoCheck
  - typingsJapgolly.jsrsasign.jsrsasign.ExtAdobeTimeStamp
*/
trait ExtParam extends StObject
object ExtParam {
  
  inline def Dictkey(extn: String, extname: String): typingsJapgolly.jsrsasign.anon.Dictkey = {
    val __obj = js.Dynamic.literal(extn = extn.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Dictkey]
  }
  
  inline def Exclude(exclude: js.Array[GeneralSubtree]): typingsJapgolly.jsrsasign.anon.Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extname = "nameConstraints")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Exclude]
  }
  
  inline def ExtAdobeTimeStamp(): typingsJapgolly.jsrsasign.jsrsasign.ExtAdobeTimeStamp = {
    val __obj = js.Dynamic.literal(extname = "adobeTimeStamp")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtAdobeTimeStamp]
  }
  
  inline def ExtAuthorityInfoAccess(array: js.Array[Ocsp | Caissuer]): typingsJapgolly.jsrsasign.jsrsasign.ExtAuthorityInfoAccess = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "authorityInfoAccess")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtAuthorityInfoAccess]
  }
  
  inline def ExtAuthorityKeyIdentifier(kid: Hex): typingsJapgolly.jsrsasign.jsrsasign.ExtAuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtAuthorityKeyIdentifier]
  }
  
  inline def ExtBasicConstraints(): typingsJapgolly.jsrsasign.jsrsasign.ExtBasicConstraints = {
    val __obj = js.Dynamic.literal(extname = "basicConstraints")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtBasicConstraints]
  }
  
  inline def ExtCRLDistributionPoints(array: js.Array[DistributionPoint]): typingsJapgolly.jsrsasign.jsrsasign.ExtCRLDistributionPoints = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "cRLDistributionPoints")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtCRLDistributionPoints]
  }
  
  inline def ExtCRLNumber(): typingsJapgolly.jsrsasign.jsrsasign.ExtCRLNumber = {
    val __obj = js.Dynamic.literal(extname = "cRLNumber")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtCRLNumber]
  }
  
  inline def ExtCRLReason(): typingsJapgolly.jsrsasign.jsrsasign.ExtCRLReason = {
    val __obj = js.Dynamic.literal(extname = "cRLReason")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtCRLReason]
  }
  
  inline def ExtCertificatePolicies(array: js.Array[PolicyInformation]): typingsJapgolly.jsrsasign.jsrsasign.ExtCertificatePolicies = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "certificatePolicies")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtCertificatePolicies]
  }
  
  inline def ExtExtKeyUsage(array: js.Array[String]): typingsJapgolly.jsrsasign.jsrsasign.ExtExtKeyUsage = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "extKeyUsage")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtExtKeyUsage]
  }
  
  inline def ExtIssuerAltName(array: js.Array[GeneralName]): typingsJapgolly.jsrsasign.jsrsasign.ExtIssuerAltName = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "issuerAltName")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtIssuerAltName]
  }
  
  inline def ExtKeyUsage(names: js.Array[String]): typingsJapgolly.jsrsasign.jsrsasign.ExtKeyUsage = {
    val __obj = js.Dynamic.literal(extname = "keyUsage", names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtKeyUsage]
  }
  
  inline def ExtOcspNoCheck(): typingsJapgolly.jsrsasign.jsrsasign.ExtOcspNoCheck = {
    val __obj = js.Dynamic.literal(extname = "ocspNoCheck")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtOcspNoCheck]
  }
  
  inline def ExtOcspNonce(hex: String): typingsJapgolly.jsrsasign.jsrsasign.ExtOcspNonce = {
    val __obj = js.Dynamic.literal(extname = "ocspNonce", hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtOcspNonce]
  }
  
  inline def ExtSubjectAltName(array: js.Array[GeneralName]): typingsJapgolly.jsrsasign.jsrsasign.ExtSubjectAltName = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "subjectAltName")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtSubjectAltName]
  }
  
  inline def ExtSubjectKeyIdentifier(kid: Hex): typingsJapgolly.jsrsasign.jsrsasign.ExtSubjectKeyIdentifier = {
    val __obj = js.Dynamic.literal(extname = "subjectKeyIdentifier", kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.ExtSubjectKeyIdentifier]
  }
  
  inline def Permit(permit: js.Array[GeneralSubtree]): typingsJapgolly.jsrsasign.anon.Permit = {
    val __obj = js.Dynamic.literal(extname = "nameConstraints", permit = permit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Permit]
  }
}
