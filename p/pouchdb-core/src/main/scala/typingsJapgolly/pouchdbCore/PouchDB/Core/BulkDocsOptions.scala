package typingsJapgolly.pouchdbCore.PouchDB.Core

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkDocsOptions extends Options {
  var new_edits: js.UndefOr[Boolean] = js.undefined
}

object BulkDocsOptions {
  @scala.inline
  def apply(
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[org.scalajs.dom.experimental.Response]] = null,
    new_edits: js.UndefOr[Boolean] = js.undefined
  ): BulkDocsOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (!js.isUndefined(new_edits)) __obj.updateDynamic("new_edits")(new_edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkDocsOptions]
  }
}

