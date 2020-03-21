package typingsJapgolly.winrt.Windows.Storage.Pickers

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
@js.native
class FilePickerSelectedFilesArray () extends IVectorView[StorageFile] {
  /* CompleteClass */
  override def first(): IIterator[StorageFile] = js.native
}

