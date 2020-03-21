package typingsJapgolly.pouchdbCore.PouchDB.Core

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import typingsJapgolly.pouchdbCore.AnonRev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetOptions extends Options {
  var attachments: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[Boolean] = js.undefined
  var docs: js.Array[AnonRev]
  var revs: js.UndefOr[Boolean] = js.undefined
}

object BulkGetOptions {
  @scala.inline
  def apply(
    docs: js.Array[AnonRev],
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[org.scalajs.dom.experimental.Response]] = null,
    revs: js.UndefOr[Boolean] = js.undefined
  ): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetOptions]
  }
}

