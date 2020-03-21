package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceIndexer extends js.Object {
  def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]]
  def indexFilePath(filePath: Uri): IndexedResourceCandidate
}

object IResourceIndexer {
  @scala.inline
  def apply(
    indexFileContentsAsync: Uri => CallbackTo[IAsyncOperation[IVectorView[IndexedResourceCandidate]]],
    indexFilePath: Uri => CallbackTo[IndexedResourceCandidate]
  ): IResourceIndexer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indexFileContentsAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => indexFileContentsAsync(t0).runNow()))
    __obj.updateDynamic("indexFilePath")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => indexFilePath(t0).runNow()))
    __obj.asInstanceOf[IResourceIndexer]
  }
}

