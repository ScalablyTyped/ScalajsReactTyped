package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.PersistenceInternal
import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.PersistenceType
import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.PersistenceValue
import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.StorageEventListener
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Persistence
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.LOCAL
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.NONE
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.SESSION
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCorePersistenceInMemoryMod {
  
  @JSImport("@firebase/auth/dist/src/core/persistence/in_memory", "InMemoryPersistence")
  @js.native
  open class InMemoryPersistence_ ()
    extends StObject
       with PersistenceInternal {
    
    /* CompleteClass */
    override def _addListener(key: String, listener: StorageEventListener): Unit = js.native
    
    /* CompleteClass */
    override def _get[T /* <: PersistenceValue */](key: String): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def _isAvailable(): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    override def _remove(key: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def _removeListener(key: String, listener: StorageEventListener): Unit = js.native
    
    /* CompleteClass */
    override def _set(key: String, value: PersistenceValue): js.Promise[Unit] = js.native
    
    var storage: Record[String, PersistenceValue] = js.native
    
    /**
      * Type of Persistence.
      * - 'SESSION' is used for temporary persistence such as `sessionStorage`.
      * - 'LOCAL' is used for long term persistence such as `localStorage` or `IndexedDB`.
      * - 'NONE' is used for in-memory, or no persistence.
      */
    /* CompleteClass */
    override val `type`: SESSION | LOCAL | NONE = js.native
    @JSName("type")
    val type_InMemoryPersistence_ : String | Double = js.native
    /* CompleteClass */
    @JSName("type")
    var type_PersistenceInternal: PersistenceType = js.native
  }
  /* static members */
  object InMemoryPersistence_ {
    
    @JSImport("@firebase/auth/dist/src/core/persistence/in_memory", "InMemoryPersistence.type")
    @js.native
    val `type`: NONE = js.native
  }
  
  @JSImport("@firebase/auth/dist/src/core/persistence/in_memory", "inMemoryPersistence")
  @js.native
  val inMemoryPersistence: Persistence = js.native
}
