package typingsJapgolly.chrome.global.chrome

import org.scalajs.dom.CryptoKey
import org.scalajs.dom.SubtleCrypto
import typingsJapgolly.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typingsJapgolly.chrome.chrome.platformKeys.Match
import typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Platform Keys
////////////////////
/**
  * Use the chrome.platformKeys API to access client certificates managed by the platform. If the user or policy grants the permission, an extension can use such a certficate in its custom authentication protocol. E.g. this allows usage of platform managed certificates in third party VPNs (see chrome.vpnProvider).
  * Permissions:  "platformKeys"
  * Important: This API works only on Chrome OS.
  * @since Chrome 45.
  */
object platformKeys {
  
  @JSGlobal("chrome.platformKeys")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPair")(certificate.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getKeyPairBySpki(
    publicKeySpkiDer: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairBySpki")(publicKeySpkiDer.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectClientCertificates")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def subtleCrypto(): SubtleCrypto = ^.asInstanceOf[js.Dynamic].applyDynamic("subtleCrypto")().asInstanceOf[SubtleCrypto]
  
  inline def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLSServerCertificate")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
