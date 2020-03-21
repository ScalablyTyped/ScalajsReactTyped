package typingsJapgolly.firebaseFirestore.persistenceMod

import typingsJapgolly.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/persistence", "PersistenceTransaction")
@js.native
abstract class PersistenceTransaction () extends js.Object {
  val currentSequenceNumber: ListenSequenceNumber = js.native
  val onCommittedListeners: js.Any = js.native
  def addOnCommittedListener(listener: js.Function0[Unit]): Unit = js.native
  def raiseOnCommittedEvent(): Unit = js.native
}

