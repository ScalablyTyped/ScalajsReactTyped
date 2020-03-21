package typingsJapgolly.firebaseFirestore.documentMod

import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/document", "NoDocument")
@js.native
class NoDocument protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion) = this()
  def this(key: DocumentKey, version: SnapshotVersion, options: DocumentOptions) = this()
  val hasCommittedMutations: Boolean = js.native
}

