package typingsJapgolly.winrt.Windows.ApplicationModel.Resources

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoader extends js.Object {
  def getString(resource: String): String
}

object IResourceLoader {
  @scala.inline
  def apply(getString: String => CallbackTo[String]): IResourceLoader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getString")(js.Any.fromFunction1((t0: java.lang.String) => getString(t0).runNow()))
    __obj.asInstanceOf[IResourceLoader]
  }
}

