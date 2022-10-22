package typingsJapgolly.jsrsasign.jsrsasign

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tom Wu's RSA Key class and extension */
trait RSAKey extends StObject {
  
  /**
    * read an ASN.1 hexadecimal string of X.509 RSA public key certificate
    * @param h hexadecimal string of X.509 RSA public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  def readCertPubKeyHex(h: String, nthPKI: Double): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain RSA private key
    * @param h hexadecimal string of PKCS#1/5 plain RSA private key
    */
  def readPKCS5PrvKeyHex(h: String): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#5 RSA public key
    * @param h hexadecimal string of PKCS#5 public key
    */
  def readPKCS5PubKeyHex(h: String): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain RSA private key
    * @param h hexadecimal string of PKCS#8 plain RSA private key
    */
  def readPKCS8PrvKeyHex(h: String): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 RSA public key
    * @param h hexadecimal string of PKCS#8 public key
    */
  def readPKCS8PubKeyHex(h: String): Unit
  
  /**
    * read PKCS#1 private key from a string
    * @param keyPEM string of PKCS#1 private key.
    */
  def readPrivateKeyFromPEMString(keyPEM: String): Unit
  
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sMsg message string to be verified.
    * @param hSig hexadecimal string of signature.
    *             non-hexadecimal characters including new lines will be ignored.
    * @return returns true if valid, otherwise false
    */
  def verify(sMsg: String, hSig: String): Boolean
}
object RSAKey {
  
  inline def apply(
    readCertPubKeyHex: (String, Double) => Callback,
    readPKCS5PrvKeyHex: String => Callback,
    readPKCS5PubKeyHex: String => Callback,
    readPKCS8PrvKeyHex: String => Callback,
    readPKCS8PubKeyHex: String => Callback,
    readPrivateKeyFromPEMString: String => Callback,
    verify: (String, String) => Boolean
  ): RSAKey = {
    val __obj = js.Dynamic.literal(readCertPubKeyHex = js.Any.fromFunction2((t0: String, t1: Double) => (readCertPubKeyHex(t0, t1)).runNow()), readPKCS5PrvKeyHex = js.Any.fromFunction1((t0: String) => readPKCS5PrvKeyHex(t0).runNow()), readPKCS5PubKeyHex = js.Any.fromFunction1((t0: String) => readPKCS5PubKeyHex(t0).runNow()), readPKCS8PrvKeyHex = js.Any.fromFunction1((t0: String) => readPKCS8PrvKeyHex(t0).runNow()), readPKCS8PubKeyHex = js.Any.fromFunction1((t0: String) => readPKCS8PubKeyHex(t0).runNow()), readPrivateKeyFromPEMString = js.Any.fromFunction1((t0: String) => readPrivateKeyFromPEMString(t0).runNow()), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[RSAKey]
  }
  
  extension [Self <: RSAKey](x: Self) {
    
    inline def setReadCertPubKeyHex(value: (String, Double) => Callback): Self = StObject.set(x, "readCertPubKeyHex", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setReadPKCS5PrvKeyHex(value: String => Callback): Self = StObject.set(x, "readPKCS5PrvKeyHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReadPKCS5PubKeyHex(value: String => Callback): Self = StObject.set(x, "readPKCS5PubKeyHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReadPKCS8PrvKeyHex(value: String => Callback): Self = StObject.set(x, "readPKCS8PrvKeyHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReadPKCS8PubKeyHex(value: String => Callback): Self = StObject.set(x, "readPKCS8PubKeyHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReadPrivateKeyFromPEMString(value: String => Callback): Self = StObject.set(x, "readPrivateKeyFromPEMString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setVerify(value: (String, String) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
  }
}
