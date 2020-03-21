package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationAlgorithmProvider extends js.Object {
  var algorithmName: String
  def createKey(keyMaterial: IBuffer): CryptographicKey
}

object IKeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CallbackTo[CryptographicKey]): IKeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any])
    __obj.updateDynamic("createKey")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => createKey(t0).runNow()))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProvider]
  }
}

