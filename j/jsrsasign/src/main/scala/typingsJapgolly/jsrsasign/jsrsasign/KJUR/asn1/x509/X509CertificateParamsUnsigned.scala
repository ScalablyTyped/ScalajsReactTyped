package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.anon.ArrayIdentityArray
import typingsJapgolly.jsrsasign.anon.Bigint
import typingsJapgolly.jsrsasign.anon.Dictx
import typingsJapgolly.jsrsasign.anon.E
import typingsJapgolly.jsrsasign.anon.IntNumber
import typingsJapgolly.jsrsasign.anon.Str
import typingsJapgolly.jsrsasign.anon.StrString
import typingsJapgolly.jsrsasign.jsrsasign.CertificateTBSParams
import typingsJapgolly.jsrsasign.jsrsasign.ECCPrivateKey
import typingsJapgolly.jsrsasign.jsrsasign.Hex
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typingsJapgolly.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateParamsUnsigned
  extends StObject
     with CertificateTBSParams
     with X509CertificateParams {
  
  var cakey: String | RSAKey | DSA | ECDSA
  
  @JSName("sigalg")
  var sigalg_X509CertificateParamsUnsigned: String
}
object X509CertificateParamsUnsigned {
  
  inline def apply(
    cakey: String | RSAKey | DSA | ECDSA,
    ext: js.Array[Dictx],
    issuer: ArrayIdentityArray | Str | StrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String,
    serial: Hex | IntNumber | Bigint | Double,
    sigalg: String,
    subject: ArrayIdentityArray | Str | StrString
  ): X509CertificateParamsUnsigned = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateParamsUnsigned]
  }
  
  extension [Self <: X509CertificateParamsUnsigned](x: Self) {
    
    inline def setCakey(value: String | RSAKey | DSA | ECDSA): Self = StObject.set(x, "cakey", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
  }
}
