package typingsJapgolly.winrt.Windows.ApplicationModel.Resources

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoaderFactory extends js.Object {
  def createResourceLoaderByName(name: String): ResourceLoader
}

object IResourceLoaderFactory {
  @scala.inline
  def apply(createResourceLoaderByName: String => CallbackTo[ResourceLoader]): IResourceLoaderFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResourceLoaderByName")(js.Any.fromFunction1((t0: java.lang.String) => createResourceLoaderByName(t0).runNow()))
    __obj.asInstanceOf[IResourceLoaderFactory]
  }
}

