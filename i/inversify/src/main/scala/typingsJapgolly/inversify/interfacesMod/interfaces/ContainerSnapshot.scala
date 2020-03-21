package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSnapshot extends js.Object {
  var bindings: Lookup[Binding[_]]
  var middleware: Next | Null
}

object ContainerSnapshot {
  @scala.inline
  def apply(
    bindings: Lookup[Binding[_]],
    middleware: /* args */ NextArgs => CallbackTo[js.Any | js.Array[js.Any]] = null
  ): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.inversify.interfacesMod.interfaces.NextArgs) => middleware(t0).runNow()))
    __obj.asInstanceOf[ContainerSnapshot]
  }
}

