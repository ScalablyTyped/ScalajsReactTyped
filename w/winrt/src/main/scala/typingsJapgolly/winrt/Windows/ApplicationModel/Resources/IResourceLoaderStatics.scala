package typingsJapgolly.winrt.Windows.ApplicationModel.Resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoaderStatics extends js.Object {
  def getStringForReference(uri: Uri): String
}

object IResourceLoaderStatics {
  @scala.inline
  def apply(getStringForReference: Uri => CallbackTo[String]): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStringForReference")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => getStringForReference(t0).runNow()))
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
}

