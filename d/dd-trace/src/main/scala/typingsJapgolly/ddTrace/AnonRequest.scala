package typingsJapgolly.ddTrace

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[IncomingMessage], 
      /* res */ js.UndefOr[ServerResponse], 
      _
    ]
  ] = js.undefined
}

object AnonRequest {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage], /* res */ js.UndefOr[ServerResponse]) => CallbackTo[js.Any] = null
  ): AnonRequest = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3((t0: /* span */ js.UndefOr[typingsJapgolly.opentracing.mod.Span], t1: /* req */ js.UndefOr[typingsJapgolly.node.httpMod.IncomingMessage], t2: /* res */ js.UndefOr[typingsJapgolly.node.httpMod.ServerResponse]) => request(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonRequest]
  }
}

