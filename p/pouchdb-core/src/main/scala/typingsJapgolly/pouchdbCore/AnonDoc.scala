package typingsJapgolly.pouchdbCore

import typingsJapgolly.pouchdbCore.PouchDB.Core.AllDocsMeta
import typingsJapgolly.pouchdbCore.PouchDB.Core.DocumentId
import typingsJapgolly.pouchdbCore.PouchDB.Core.DocumentKey
import typingsJapgolly.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.undefined
  var id: DocumentId
  var key: DocumentKey
  var value: AnonDeleted
}

object AnonDoc {
  @scala.inline
  def apply[Content /* <: js.Object */](
    id: DocumentId,
    key: DocumentKey,
    value: AnonDeleted,
    doc: ExistingDocument[Content with AllDocsMeta] = null
  ): AnonDoc[Content] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoc[Content]]
  }
}

