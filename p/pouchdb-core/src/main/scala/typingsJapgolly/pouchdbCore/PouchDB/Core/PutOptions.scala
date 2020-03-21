package typingsJapgolly.pouchdbCore.PouchDB.Core

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions extends Options {
  var force: js.UndefOr[Boolean] = js.undefined
}

object PutOptions {
  @scala.inline
  def apply(
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[org.scalajs.dom.experimental.Response]] = null,
    force: js.UndefOr[Boolean] = js.undefined
  ): PutOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptions]
  }
}

