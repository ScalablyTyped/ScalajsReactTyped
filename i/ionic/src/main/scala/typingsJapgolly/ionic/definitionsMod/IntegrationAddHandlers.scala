package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationAddHandlers extends js.Object {
  var conflictHandler: js.UndefOr[js.Function2[/* f */ String, /* stats */ Stats, js.Promise[Boolean]]] = js.undefined
  var onFileCreate: js.UndefOr[js.Function1[/* f */ String, Unit]] = js.undefined
}

object IntegrationAddHandlers {
  @scala.inline
  def apply(
    conflictHandler: (/* f */ String, /* stats */ Stats) => CallbackTo[js.Promise[Boolean]] = null,
    onFileCreate: /* f */ String => Callback = null
  ): IntegrationAddHandlers = {
    val __obj = js.Dynamic.literal()
    if (conflictHandler != null) __obj.updateDynamic("conflictHandler")(js.Any.fromFunction2((t0: /* f */ java.lang.String, t1: /* stats */ typingsJapgolly.node.fsMod.Stats) => conflictHandler(t0, t1).runNow()))
    if (onFileCreate != null) __obj.updateDynamic("onFileCreate")(js.Any.fromFunction1((t0: /* f */ java.lang.String) => onFileCreate(t0).runNow()))
    __obj.asInstanceOf[IntegrationAddHandlers]
  }
}

