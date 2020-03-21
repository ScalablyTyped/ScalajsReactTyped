package typingsJapgolly.nano.mod

import typingsJapgolly.nano.nanoStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
trait DocumentInsertParams extends js.Object {
  // Stores document in batch mode.
  var batch: js.UndefOr[ok] = js.undefined
  // Prevents insertion of a conflicting document. Possible values: true (default) and false. If false, a
  // well-formed _rev must be included in the document. new_edits=false is used by the replicator to insert
  // documents into the target database even if that leads to the creation of conflicts.
  var new_edits: js.UndefOr[Boolean] = js.undefined
  // Document’s revision if updating an existing document. Alternative to If-Match header or document key.
  var rev: js.UndefOr[String] = js.undefined
}

object DocumentInsertParams {
  @scala.inline
  def apply(batch: ok = null, new_edits: js.UndefOr[Boolean] = js.undefined, rev: String = null): DocumentInsertParams = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (!js.isUndefined(new_edits)) __obj.updateDynamic("new_edits")(new_edits.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInsertParams]
  }
}

