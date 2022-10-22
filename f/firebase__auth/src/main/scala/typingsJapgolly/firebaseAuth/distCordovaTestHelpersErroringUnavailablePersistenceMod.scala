package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distCordovaSrcCorePersistenceMod.PersistenceInternal
import typingsJapgolly.firebaseAuth.distCordovaSrcCorePersistenceMod.PersistenceType
import typingsJapgolly.firebaseAuth.distCordovaSrcCorePersistenceMod.PersistenceValue
import typingsJapgolly.firebaseAuth.distCordovaSrcCorePersistenceMod.StorageEventListener
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.LOCAL
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.NONE
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.SESSION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaTestHelpersErroringUnavailablePersistenceMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/erroring_unavailable_persistence", "ErroringUnavailablePersistence")
  @js.native
  open class ErroringUnavailablePersistence ()
    extends StObject
       with PersistenceInternal {
    
    def _addListener(): Unit = js.native
    /* CompleteClass */
    override def _addListener(key: String, listener: StorageEventListener): Unit = js.native
    
    def _get[T /* <: PersistenceValue */](): js.Promise[T | Null] = js.native
    /* CompleteClass */
    override def _get[T /* <: PersistenceValue */](key: String): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def _isAvailable(): js.Promise[Boolean] = js.native
    
    def _remove(): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def _remove(key: String): js.Promise[Unit] = js.native
    
    def _removeListener(): Unit = js.native
    /* CompleteClass */
    override def _removeListener(key: String, listener: StorageEventListener): Unit = js.native
    
    def _set(): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def _set(key: String, value: PersistenceValue): js.Promise[Unit] = js.native
    
    @JSName("_shouldAllowMigration")
    var _shouldAllowMigration_ErroringUnavailablePersistence: Boolean = js.native
    
    /**
      * Type of Persistence.
      * - 'SESSION' is used for temporary persistence such as `sessionStorage`.
      * - 'LOCAL' is used for long term persistence such as `localStorage` or `IndexedDB`.
      * - 'NONE' is used for in-memory, or no persistence.
      */
    /* CompleteClass */
    override val `type`: SESSION | LOCAL | NONE = js.native
    /* CompleteClass */
    @JSName("type")
    var type_PersistenceInternal: PersistenceType = js.native
  }
}
