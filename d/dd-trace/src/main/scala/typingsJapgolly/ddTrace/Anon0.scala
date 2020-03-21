package typingsJapgolly.ddTrace

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[ClientRequest], 
      /* res */ js.UndefOr[IncomingMessage], 
      _
    ]
  ] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[ClientRequest], /* res */ js.UndefOr[IncomingMessage]) => CallbackTo[js.Any] = null
  ): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3((t0: /* span */ js.UndefOr[typingsJapgolly.opentracing.mod.Span], t1: /* req */ js.UndefOr[typingsJapgolly.node.httpMod.ClientRequest], t2: /* res */ js.UndefOr[typingsJapgolly.node.httpMod.IncomingMessage]) => request(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon0]
  }
}

