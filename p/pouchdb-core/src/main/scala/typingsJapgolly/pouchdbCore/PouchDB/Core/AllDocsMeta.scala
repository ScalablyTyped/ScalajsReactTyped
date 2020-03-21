package typingsJapgolly.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsMeta extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.undefined
  /** Only present if `conflicts` is `true` */
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.undefined
}

object AllDocsMeta {
  @scala.inline
  def apply(_attachments: Attachments = null, _conflicts: js.Array[RevisionId] = null): AllDocsMeta = {
    val __obj = js.Dynamic.literal()
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_conflicts != null) __obj.updateDynamic("_conflicts")(_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsMeta]
  }
}

