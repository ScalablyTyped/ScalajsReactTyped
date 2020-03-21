package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReaderStatics extends js.Object {
  def fromBuffer(buffer: IBuffer): DataReader
}

object IDataReaderStatics {
  @scala.inline
  def apply(fromBuffer: IBuffer => CallbackTo[DataReader]): IDataReaderStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromBuffer")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => fromBuffer(t0).runNow()))
    __obj.asInstanceOf[IDataReaderStatics]
  }
}

