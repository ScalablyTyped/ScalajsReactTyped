package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamReferenceStatics extends js.Object {
  def createFromFile(file: IStorageFile): RandomAccessStreamReference
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference
  def createFromUri(uri: Uri): RandomAccessStreamReference
}

object IRandomAccessStreamReferenceStatics {
  @scala.inline
  def apply(
    createFromFile: IStorageFile => CallbackTo[RandomAccessStreamReference],
    createFromStream: IRandomAccessStream => CallbackTo[RandomAccessStreamReference],
    createFromUri: Uri => CallbackTo[RandomAccessStreamReference]
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFromFile")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => createFromFile(t0).runNow()))
    __obj.updateDynamic("createFromStream")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => createFromStream(t0).runNow()))
    __obj.updateDynamic("createFromUri")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => createFromUri(t0).runNow()))
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
}

