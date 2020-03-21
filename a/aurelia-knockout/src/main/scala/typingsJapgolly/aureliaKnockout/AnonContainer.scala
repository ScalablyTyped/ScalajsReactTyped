package typingsJapgolly.aureliaKnockout

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: Container
  def globalResources(resources: String*): js.Any
}

object AnonContainer {
  @scala.inline
  def apply(container: Container, globalResources: /* repeated */ String => CallbackTo[js.Any]): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.updateDynamic("globalResources")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => globalResources(t0).runNow()))
    __obj.asInstanceOf[AnonContainer]
  }
}

