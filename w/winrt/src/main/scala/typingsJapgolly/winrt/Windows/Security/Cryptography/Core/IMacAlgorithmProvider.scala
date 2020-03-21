package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmProvider extends js.Object {
  var algorithmName: String
  var macLength: Double
  def createKey(keyMaterial: IBuffer): CryptographicKey
}

object IMacAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CallbackTo[CryptographicKey], macLength: Double): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], macLength = macLength.asInstanceOf[js.Any])
    __obj.updateDynamic("createKey")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => createKey(t0).runNow()))
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
}

