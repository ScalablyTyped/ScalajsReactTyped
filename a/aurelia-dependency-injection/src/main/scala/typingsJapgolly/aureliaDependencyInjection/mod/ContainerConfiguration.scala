package typingsJapgolly.aureliaDependencyInjection.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerConfiguration extends js.Object {
  var handlers: js.UndefOr[Map[_, _]] = js.undefined
  var onHandlerCreated: js.UndefOr[
    js.Function1[/* handler */ InvocationHandler[_, _, _], InvocationHandler[_, _, _]]
  ] = js.undefined
}

object ContainerConfiguration {
  @scala.inline
  def apply(
    handlers: Map[_, _] = null,
    onHandlerCreated: /* handler */ InvocationHandler[js.Any, js.Any, js.Any] => CallbackTo[InvocationHandler[js.Any, js.Any, js.Any]] = null
  ): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (onHandlerCreated != null) __obj.updateDynamic("onHandlerCreated")(js.Any.fromFunction1((t0: /* handler */ typingsJapgolly.aureliaDependencyInjection.mod.InvocationHandler[js.Any, js.Any, js.Any]) => onHandlerCreated(t0).runNow()))
    __obj.asInstanceOf[ContainerConfiguration]
  }
}

