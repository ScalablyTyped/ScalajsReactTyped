package typingsJapgolly.aureliaLoader.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderPlugin extends js.Object {
  /**
    * Fetches the resource.
    * @param address The address of the resource.
    * @return A Promise for the requested resouce.
    */
  def fetch(address: String): js.Promise[_]
}

object LoaderPlugin {
  @scala.inline
  def apply(fetch: String => CallbackTo[js.Promise[js.Any]]): LoaderPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: java.lang.String) => fetch(t0).runNow()))
    __obj.asInstanceOf[LoaderPlugin]
  }
}

