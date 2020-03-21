package typingsJapgolly.pouchdbCore.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Core {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.pouchdbCore.Blob
    - typingsJapgolly.pouchdbCore.Buffer
  */
  type AttachmentData = typingsJapgolly.pouchdbCore.PouchDB.Core._AttachmentData | java.lang.String
  type AttachmentId = java.lang.String
  type Attachments = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.pouchdbCore.PouchDB.Core.Attachment]
  type Callback[R] = js.Function2[
    /* error */ typingsJapgolly.pouchdbCore.PouchDB.Core.Error | scala.Null, 
    /* result */ R | scala.Null, 
    scala.Unit
  ]
  type Document[Content /* <: js.Object */] = Content with typingsJapgolly.pouchdbCore.PouchDB.Core.IdMeta
  type DocumentId = java.lang.String
  type DocumentKey = java.lang.String
  type ExistingDocument[Content /* <: js.Object */] = typingsJapgolly.pouchdbCore.PouchDB.Core.Document[Content] with typingsJapgolly.pouchdbCore.PouchDB.Core.RevisionIdMeta
  type NewDocument[Content /* <: js.Object */] = Content
  type PostDocument[Content /* <: js.Object */] = typingsJapgolly.pouchdbCore.PouchDB.Core.NewDocument[Content] with typingsJapgolly.pouchdbCore.AnonAttachments
  type PutDocument[Content /* <: js.Object */] = typingsJapgolly.pouchdbCore.PouchDB.Core.PostDocument[Content] with typingsJapgolly.pouchdbCore.PouchDB.Core.ChangesMeta with typingsJapgolly.pouchdbCore.AnonId
  /** Existing doc or just object with `_id` and `_rev` */
  type RemoveDocument = typingsJapgolly.pouchdbCore.PouchDB.Core.IdMeta with typingsJapgolly.pouchdbCore.PouchDB.Core.RevisionIdMeta
  type RevisionDiffOptions = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type RevisionDiffResponse = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.pouchdbCore.PouchDB.Core.RevisionDiff]
  type RevisionId = java.lang.String
}
