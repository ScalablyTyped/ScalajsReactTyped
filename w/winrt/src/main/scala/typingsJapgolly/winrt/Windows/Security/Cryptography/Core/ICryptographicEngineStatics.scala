package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicEngineStatics extends js.Object {
  def decrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer
  def decryptAndAuthenticate(
    key: CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticationTag: IBuffer,
    authenticatedData: IBuffer
  ): IBuffer
  def deriveKeyMaterial(key: CryptographicKey, parameters: KeyDerivationParameters, desiredKeySize: Double): IBuffer
  def encrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer
  def encryptAndAuthenticate(key: CryptographicKey, data: IBuffer, nonce: IBuffer, authenticatedData: IBuffer): EncryptedAndAuthenticatedData
  def sign(key: CryptographicKey, data: IBuffer): IBuffer
  def verifySignature(key: CryptographicKey, data: IBuffer, signature: IBuffer): Boolean
}

object ICryptographicEngineStatics {
  @scala.inline
  def apply(
    decrypt: (CryptographicKey, IBuffer, IBuffer) => CallbackTo[IBuffer],
    decryptAndAuthenticate: (CryptographicKey, IBuffer, IBuffer, IBuffer, IBuffer) => CallbackTo[IBuffer],
    deriveKeyMaterial: (CryptographicKey, KeyDerivationParameters, Double) => CallbackTo[IBuffer],
    encrypt: (CryptographicKey, IBuffer, IBuffer) => CallbackTo[IBuffer],
    encryptAndAuthenticate: (CryptographicKey, IBuffer, IBuffer, IBuffer) => CallbackTo[EncryptedAndAuthenticatedData],
    sign: (CryptographicKey, IBuffer) => CallbackTo[IBuffer],
    verifySignature: (CryptographicKey, IBuffer, IBuffer) => CallbackTo[Boolean]
  ): ICryptographicEngineStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => decrypt(t0, t1, t2).runNow()))
    __obj.updateDynamic("decryptAndAuthenticate")(js.Any.fromFunction5((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t3: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t4: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => decryptAndAuthenticate(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("deriveKeyMaterial")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters, t2: scala.Double) => deriveKeyMaterial(t0, t1, t2).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => encrypt(t0, t1, t2).runNow()))
    __obj.updateDynamic("encryptAndAuthenticate")(js.Any.fromFunction4((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t3: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => encryptAndAuthenticate(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => sign(t0, t1).runNow()))
    __obj.updateDynamic("verifySignature")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Core.CryptographicKey, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => verifySignature(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ICryptographicEngineStatics]
  }
}

