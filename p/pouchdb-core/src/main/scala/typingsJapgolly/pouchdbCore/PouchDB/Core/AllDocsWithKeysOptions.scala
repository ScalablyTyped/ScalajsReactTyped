package typingsJapgolly.pouchdbCore.PouchDB.Core

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsWithKeysOptions extends AllDocsOptions {
  /** Constrains results to documents matching any of these keys. */
  var keys: js.Array[DocumentId]
}

object AllDocsWithKeysOptions {
  @scala.inline
  def apply(
    keys: js.Array[DocumentId],
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    conflicts: js.UndefOr[Boolean] = js.undefined,
    descending: js.UndefOr[Boolean] = js.undefined,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[org.scalajs.dom.experimental.Response]] = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    skip: Int | Double = null,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): AllDocsWithKeysOptions = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithKeysOptions]
  }
}

