package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distSrcCoreStorageDomstoragewrapperMod.DOMStorageWrapper
import typingsJapgolly.firebaseDatabase.distSrcCoreStorageMemoryStorageMod.MemoryStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreStorageStorageMod {
  
  @JSImport("@firebase/database/dist/src/core/storage/storage", "PersistentStorage")
  @js.native
  val PersistentStorage: DOMStorageWrapper | MemoryStorage = js.native
  
  @JSImport("@firebase/database/dist/src/core/storage/storage", "SessionStorage")
  @js.native
  val SessionStorage: DOMStorageWrapper | MemoryStorage = js.native
}
