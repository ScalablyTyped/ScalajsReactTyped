package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReaderFactory extends js.Object {
  def createDataReader(inputStream: IInputStream): DataReader
}

object IDataReaderFactory {
  @scala.inline
  def apply(createDataReader: IInputStream => CallbackTo[DataReader]): IDataReaderFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDataReader")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream) => createDataReader(t0).runNow()))
    __obj.asInstanceOf[IDataReaderFactory]
  }
}

