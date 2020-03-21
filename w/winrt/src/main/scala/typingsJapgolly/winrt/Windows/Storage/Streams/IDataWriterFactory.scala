package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataWriterFactory extends js.Object {
  def createDataWriter(outputStream: IOutputStream): DataWriter
}

object IDataWriterFactory {
  @scala.inline
  def apply(createDataWriter: IOutputStream => CallbackTo[DataWriter]): IDataWriterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDataWriter")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream) => createDataWriter(t0).runNow()))
    __obj.asInstanceOf[IDataWriterFactory]
  }
}

