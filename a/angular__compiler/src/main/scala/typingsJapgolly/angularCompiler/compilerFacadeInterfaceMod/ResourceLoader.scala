package typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoader extends js.Object {
  def get(url: String): js.Promise[String] | String
}

object ResourceLoader {
  @scala.inline
  def apply(get: String => CallbackTo[js.Promise[String] | String]): ResourceLoader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[ResourceLoader]
  }
}

