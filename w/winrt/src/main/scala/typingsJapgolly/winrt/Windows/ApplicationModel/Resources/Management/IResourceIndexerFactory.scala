package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceIndexerFactory extends js.Object {
  def createResourceIndexer(projectRoot: Uri): ResourceIndexer
}

object IResourceIndexerFactory {
  @scala.inline
  def apply(createResourceIndexer: Uri => CallbackTo[ResourceIndexer]): IResourceIndexerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResourceIndexer")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => createResourceIndexer(t0).runNow()))
    __obj.asInstanceOf[IResourceIndexerFactory]
  }
}

