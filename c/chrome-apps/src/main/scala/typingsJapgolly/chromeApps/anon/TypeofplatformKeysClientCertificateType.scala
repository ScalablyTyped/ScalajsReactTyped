package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CryptoKey
import org.scalajs.dom.SubtleCrypto
import typingsJapgolly.chromeApps.chrome.platformKeys.Match
import typingsJapgolly.chromeApps.chrome.platformKeys.SelectDetails
import typingsJapgolly.chromeApps.chrome.platformKeys.VerificationDetails
import typingsJapgolly.chromeApps.chrome.platformKeys.VerificationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofplatformKeysClientCertificateType extends StObject {
  
  /**
    * @enum
    */
  val ClientCertificateType: ECDSASIGN
  
  /**
    * @description
    * Passes the key pair of *certificate* for usage with
    * platformKeys.subtleCrypto to *callback*.
    *
    * ❗ Note:
    * Currently, this function only supports the "RSASSA-PKCS1-v1_5"
    * algorithm with one of the hashing algorithms "none", "SHA-1", "SHA-256",
    * "SHA-384", and "SHA-512"
    *
    * @param certificate The certificate of a *Match* returned by *selectClientCertificates*.
    * @param parameters Determines signature/hash algorithm parameters additionally to the parameters fixed by the key itself.
    *   The same parameters are accepted as by WebCrypto's importKey (see docs).
    *   function, e.g. *RsaHashedImportParams* for a RSASSA-PKCS1-v1_5
    *   key. For RSASSA-PKCS1-v1_5 keys, additionally the parameters *{
    *   "hash": { "name": "none" } }* are supported. The sign function will
    *   then apply PKCS#1 v1.5 padding and but not hash the given data.
    * @param callback The public and private CryptoKey of a certificate which can only be used with *subleCrypto*.
    * @param callback.privateKey Might be *null* if this app does not have access to it.
    * @param callback.privateKey
    * @see[WebCrypto's importKey docs]{@link http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-importKey}
    * @see[CryptoKey docs]{@link http://www.w3.org/TR/WebCryptoAPI/#dfn-CryptoKey}
    */
  def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  
  /**
    * This function filters from a list of client certificates the ones that
    * are known to the platform, match *request* and for which the
    * app has permission to access the certificate and its private key.
    * If *interactive* is true, the user is presented a dialog where
    * they can select from matching certificates and grant the app access
    * to the certificate.
    * The selected / filtered client certificates will be passed to *callback*.
    * @param callback Will provide *matches*: The list of certificates that match the request, that the
    *                 app has permission for and, if *interactive* is true, that were selected by the user.
    */
  def selectClientCertificates(details: SelectDetails, callback: js.Function1[/* matches */ js.Array[Match], Unit]): Unit
  
  /**
    * An implementation of WebCrypto's SubtleCrypto
    * that allows crypto operations on keys of client
    * certificates that are available to this app.
    * @see[SubtleCrypto]{@link http://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface}
    */
  def subtleCrypto(): SubtleCrypto
  
  /**
    * Checks whether *details.serverCertificateChain* can be trusted
    * for *details.hostname* according to the trust settings of the
    * platform.
    * Note: The actual behavior of the trust verification is not fully
    * specified and might change in the future.
    * The API implementation verifies certificate expiration, validates the
    * certification path and checks trust by a known CA.
    * The implementation is supposed to respect the EKU serverAuth and to
    * support subject alternative names.
    */
  def verifyTLSServerCertificate(details: VerificationDetails, callback: js.Function1[/* result */ VerificationResult, Unit]): Unit
}
object TypeofplatformKeysClientCertificateType {
  
  inline def apply(
    ClientCertificateType: ECDSASIGN,
    getKeyPair: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback,
    selectClientCertificates: (SelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Callback,
    subtleCrypto: CallbackTo[SubtleCrypto],
    verifyTLSServerCertificate: (VerificationDetails, js.Function1[/* result */ VerificationResult, Unit]) => Callback
  ): TypeofplatformKeysClientCertificateType = {
    val __obj = js.Dynamic.literal(ClientCertificateType = ClientCertificateType.asInstanceOf[js.Any], getKeyPair = js.Any.fromFunction3((t0: js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => (getKeyPair(t0, t1, t2)).runNow()), selectClientCertificates = js.Any.fromFunction2((t0: SelectDetails, t1: js.Function1[/* matches */ js.Array[Match], Unit]) => (selectClientCertificates(t0, t1)).runNow()), subtleCrypto = subtleCrypto.toJsFn, verifyTLSServerCertificate = js.Any.fromFunction2((t0: VerificationDetails, t1: js.Function1[/* result */ VerificationResult, Unit]) => (verifyTLSServerCertificate(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofplatformKeysClientCertificateType]
  }
  
  extension [Self <: TypeofplatformKeysClientCertificateType](x: Self) {
    
    inline def setClientCertificateType(value: ECDSASIGN): Self = StObject.set(x, "ClientCertificateType", value.asInstanceOf[js.Any])
    
    inline def setGetKeyPair(
      value: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback
    ): Self = StObject.set(x, "getKeyPair", js.Any.fromFunction3((t0: js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSelectClientCertificates(value: (SelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Callback): Self = StObject.set(x, "selectClientCertificates", js.Any.fromFunction2((t0: SelectDetails, t1: js.Function1[/* matches */ js.Array[Match], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSubtleCrypto(value: CallbackTo[SubtleCrypto]): Self = StObject.set(x, "subtleCrypto", value.toJsFn)
    
    inline def setVerifyTLSServerCertificate(value: (VerificationDetails, js.Function1[/* result */ VerificationResult, Unit]) => Callback): Self = StObject.set(x, "verifyTLSServerCertificate", js.Any.fromFunction2((t0: VerificationDetails, t1: js.Function1[/* result */ VerificationResult, Unit]) => (value(t0, t1)).runNow()))
  }
}
