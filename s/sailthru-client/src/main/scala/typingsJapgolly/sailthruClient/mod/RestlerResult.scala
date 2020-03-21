package typingsJapgolly.sailthruClient.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestlerResult extends js.Object {
  def on(
    eventName: String,
    listener: js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]
  ): RestlerResult
}

object RestlerResult {
  @scala.inline
  def apply(
    on: (String, js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]) => CallbackTo[RestlerResult]
  ): RestlerResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* data */ js.UndefOr[js.Any], 
  /* response */ js.UndefOr[typingsJapgolly.node.httpMod.ServerResponse], 
  scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[RestlerResult]
  }
}

