package typingsJapgolly.pouchdbCore.PouchDB.Core

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends Options {
  /** Include attachment data. */
  var attachments: js.UndefOr[Boolean] = js.undefined
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[Boolean] = js.undefined
  /** Include list of conflicting leaf revisions. */
  var conflicts: js.UndefOr[Boolean] = js.undefined
  /** Forces retrieving latest “leaf” revision, no matter what rev was requested. */
  var latest: js.UndefOr[Boolean] = js.undefined
  /** Specific revision to fetch */
  var rev: js.UndefOr[RevisionId] = js.undefined
  /** Include revision history of the document. */
  var revs: js.UndefOr[Boolean] = js.undefined
  /**
    * Include a list of revisions of the document, and their
    * availability.
    */
  var revs_info: js.UndefOr[Boolean] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    conflicts: js.UndefOr[Boolean] = js.undefined,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[org.scalajs.dom.experimental.Response]] = null,
    latest: js.UndefOr[Boolean] = js.undefined,
    rev: RevisionId = null,
    revs: js.UndefOr[Boolean] = js.undefined,
    revs_info: js.UndefOr[Boolean] = js.undefined
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs.asInstanceOf[js.Any])
    if (!js.isUndefined(revs_info)) __obj.updateDynamic("revs_info")(revs_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

