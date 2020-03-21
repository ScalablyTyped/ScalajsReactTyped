package typingsJapgolly.angularLoad.angular.load

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularLoadService extends js.Object {
  def loadCSS(url: String): IPromise[_]
  def loadScript(url: String): IPromise[_]
}

object IAngularLoadService {
  @scala.inline
  def apply(
    loadCSS: String => CallbackTo[IPromise[js.Any]],
    loadScript: String => CallbackTo[IPromise[js.Any]]
  ): IAngularLoadService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadCSS")(js.Any.fromFunction1((t0: java.lang.String) => loadCSS(t0).runNow()))
    __obj.updateDynamic("loadScript")(js.Any.fromFunction1((t0: java.lang.String) => loadScript(t0).runNow()))
    __obj.asInstanceOf[IAngularLoadService]
  }
}

