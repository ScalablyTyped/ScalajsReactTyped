package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.domstoragewrapperMod.DOMStorageWrapper
import typingsJapgolly.firebaseDatabase.memoryStorageMod.MemoryStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/storage/storage", JSImport.Namespace)
@js.native
object storageMod extends js.Object {
  val PersistentStorage: DOMStorageWrapper | MemoryStorage = js.native
  val SessionStorage: DOMStorageWrapper | MemoryStorage = js.native
}

