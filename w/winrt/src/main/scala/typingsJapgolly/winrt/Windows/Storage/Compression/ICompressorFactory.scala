package typingsJapgolly.winrt.Windows.Storage.Compression

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressorFactory extends js.Object {
  def createCompressor(underlyingStream: IOutputStream): Compressor
  def createCompressorEx(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double): Compressor
}

object ICompressorFactory {
  @scala.inline
  def apply(
    createCompressor: IOutputStream => CallbackTo[Compressor],
    createCompressorEx: (IOutputStream, CompressAlgorithm, Double) => CallbackTo[Compressor]
  ): ICompressorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCompressor")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream) => createCompressor(t0).runNow()))
    __obj.updateDynamic("createCompressorEx")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream, t1: typingsJapgolly.winrt.Windows.Storage.Compression.CompressAlgorithm, t2: scala.Double) => createCompressorEx(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ICompressorFactory]
  }
}

