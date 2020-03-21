package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashAlgorithmProvider extends js.Object {
  var algorithmName: String
  var hashLength: Double
  def createHash(): CryptographicHash
  def hashData(data: IBuffer): IBuffer
}

object IHashAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: CallbackTo[CryptographicHash],
    hashData: IBuffer => CallbackTo[IBuffer],
    hashLength: Double
  ): IHashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], hashLength = hashLength.asInstanceOf[js.Any])
    __obj.updateDynamic("createHash")(createHash.toJsFn)
    __obj.updateDynamic("hashData")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => hashData(t0).runNow()))
    __obj.asInstanceOf[IHashAlgorithmProvider]
  }
}

