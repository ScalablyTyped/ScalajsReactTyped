package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CryptoKey
import org.scalajs.dom.SubtleCrypto
import typingsJapgolly.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typingsJapgolly.chrome.chrome.platformKeys.Match
import typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofplatformKeysGetKeyPair extends StObject {
  
  def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  
  def getKeyPairBySpki(
    publicKeySpkiDer: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit
  
  def subtleCrypto(): SubtleCrypto
  
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit
}
object TypeofplatformKeysGetKeyPair {
  
  inline def apply(
    getKeyPair: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback,
    getKeyPairBySpki: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback,
    selectClientCertificates: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Callback,
    subtleCrypto: CallbackTo[SubtleCrypto],
    verifyTLSServerCertificate: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Callback
  ): TypeofplatformKeysGetKeyPair = {
    val __obj = js.Dynamic.literal(getKeyPair = js.Any.fromFunction3((t0: js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => (getKeyPair(t0, t1, t2)).runNow()), getKeyPairBySpki = js.Any.fromFunction3((t0: js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => (getKeyPairBySpki(t0, t1, t2)).runNow()), selectClientCertificates = js.Any.fromFunction2((t0: ClientCertificateSelectDetails, t1: js.Function1[/* matches */ js.Array[Match], Unit]) => (selectClientCertificates(t0, t1)).runNow()), subtleCrypto = subtleCrypto.toJsFn, verifyTLSServerCertificate = js.Any.fromFunction2((t0: ServerCertificateVerificationDetails, t1: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => (verifyTLSServerCertificate(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofplatformKeysGetKeyPair]
  }
  
  extension [Self <: TypeofplatformKeysGetKeyPair](x: Self) {
    
    inline def setGetKeyPair(
      value: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback
    ): Self = StObject.set(x, "getKeyPair", js.Any.fromFunction3((t0: js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetKeyPairBySpki(
      value: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback
    ): Self = StObject.set(x, "getKeyPairBySpki", js.Any.fromFunction3((t0: js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSelectClientCertificates(
      value: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Callback
    ): Self = StObject.set(x, "selectClientCertificates", js.Any.fromFunction2((t0: ClientCertificateSelectDetails, t1: js.Function1[/* matches */ js.Array[Match], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSubtleCrypto(value: CallbackTo[SubtleCrypto]): Self = StObject.set(x, "subtleCrypto", value.toJsFn)
    
    inline def setVerifyTLSServerCertificate(
      value: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Callback
    ): Self = StObject.set(x, "verifyTLSServerCertificate", js.Any.fromFunction2((t0: ServerCertificateVerificationDetails, t1: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => (value(t0, t1)).runNow()))
  }
}
