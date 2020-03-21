package typingsJapgolly.winrt.Windows.Storage.Compression

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecompressorFactory extends js.Object {
  def createDecompressor(underlyingStream: IInputStream): Decompressor
}

object IDecompressorFactory {
  @scala.inline
  def apply(createDecompressor: IInputStream => CallbackTo[Decompressor]): IDecompressorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDecompressor")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream) => createDecompressor(t0).runNow()))
    __obj.asInstanceOf[IDecompressorFactory]
  }
}

