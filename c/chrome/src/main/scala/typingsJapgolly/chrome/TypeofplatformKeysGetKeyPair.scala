package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.SubtleCrypto
import typingsJapgolly.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typingsJapgolly.chrome.chrome.platformKeys.Match
import typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofplatformKeysGetKeyPair extends js.Object {
  def getKeyPair(
    certificate: scala.scalajs.js.typedarray.ArrayBuffer,
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
  @scala.inline
  def apply(
    getKeyPair: (scala.scalajs.js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Callback,
    selectClientCertificates: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Callback,
    subtleCrypto: CallbackTo[SubtleCrypto],
    verifyTLSServerCertificate: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Callback
  ): TypeofplatformKeysGetKeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getKeyPair")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.ArrayBuffer, t1: js.Object, t2: js.Function2[
  /* publicKey */ org.scalajs.dom.crypto.CryptoKey, 
  /* privateKey */ org.scalajs.dom.crypto.CryptoKey | scala.Null, 
  scala.Unit]) => getKeyPair(t0, t1, t2).runNow()))
    __obj.updateDynamic("selectClientCertificates")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.platformKeys.ClientCertificateSelectDetails, t1: js.Function1[
  /* matches */ js.Array[typingsJapgolly.chrome.chrome.platformKeys.Match], 
  scala.Unit]) => selectClientCertificates(t0, t1).runNow()))
    __obj.updateDynamic("subtleCrypto")(subtleCrypto.toJsFn)
    __obj.updateDynamic("verifyTLSServerCertificate")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationDetails, t1: js.Function1[
  /* result */ typingsJapgolly.chrome.chrome.platformKeys.ServerCertificateVerificationResult, 
  scala.Unit]) => verifyTLSServerCertificate(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofplatformKeysGetKeyPair]
  }
}

