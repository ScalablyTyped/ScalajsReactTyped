package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymmetricKeyAlgorithmProvider extends js.Object {
  var algorithmName: String
  var blockLength: Double
  def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey
}

object ISymmetricKeyAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    blockLength: Double,
    createSymmetricKey: IBuffer => CallbackTo[CryptographicKey]
  ): ISymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any])
    __obj.updateDynamic("createSymmetricKey")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => createSymmetricKey(t0).runNow()))
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProvider]
  }
}

