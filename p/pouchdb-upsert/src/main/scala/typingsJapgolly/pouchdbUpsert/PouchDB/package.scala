package typingsJapgolly.pouchdbUpsert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PouchDB {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pouchdbUpsert.pouchdbUpsertStrings._empty
    - typingsJapgolly.pouchdbUpsert.pouchdbUpsertNumbers.`0`
    - typingsJapgolly.pouchdbUpsert.pouchdbUpsertBooleans.`false`
    - scala.Null
    - `js.undefined`
  */
  type CancelUpsert = js.UndefOr[typingsJapgolly.pouchdbUpsert.PouchDB._CancelUpsert | scala.Null]
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ typingsJapgolly.std.Partial[typingsJapgolly.pouchdbCore.PouchDB.Core.Document[Content]], 
    (Content with typingsJapgolly.pouchdbUpsert.PartialIdMeta) | typingsJapgolly.pouchdbUpsert.PouchDB.CancelUpsert
  ]
}
