package typingsJapgolly.firebaseAuth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Persistence
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCorePersistenceMod {
  
  @JSImport("@firebase/auth/dist/src/core/persistence", "STORAGE_AVAILABLE_KEY")
  @js.native
  val STORAGE_AVAILABLE_KEY: /* "__sak" */ String = js.native
  
  type Instantiator[T] = js.Function1[/* blob */ PersistedBlob, T]
  
  type PersistedBlob = Record[String, Any]
  
  trait PersistenceInternal
    extends StObject
       with Persistence {
    
    def _addListener(key: String, listener: StorageEventListener): Unit
    
    def _get[T /* <: PersistenceValue */](key: String): js.Promise[T | Null]
    
    def _isAvailable(): js.Promise[Boolean]
    
    def _remove(key: String): js.Promise[Unit]
    
    def _removeListener(key: String, listener: StorageEventListener): Unit
    
    def _set(key: String, value: PersistenceValue): js.Promise[Unit]
    
    var _shouldAllowMigration: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_PersistenceInternal: PersistenceType
  }
  object PersistenceInternal {
    
    inline def apply(
      _addListener: (String, StorageEventListener) => Callback,
      _get: String => js.Promise[Any | Null],
      _isAvailable: CallbackTo[js.Promise[Boolean]],
      _remove: String => js.Promise[Unit],
      _removeListener: (String, StorageEventListener) => Callback,
      _set: (String, PersistenceValue) => js.Promise[Unit],
      `type`: PersistenceType
    ): PersistenceInternal = {
      val __obj = js.Dynamic.literal(_addListener = js.Any.fromFunction2((t0: String, t1: StorageEventListener) => (_addListener(t0, t1)).runNow()), _get = js.Any.fromFunction1(_get), _isAvailable = _isAvailable.toJsFn, _remove = js.Any.fromFunction1(_remove), _removeListener = js.Any.fromFunction2((t0: String, t1: StorageEventListener) => (_removeListener(t0, t1)).runNow()), _set = js.Any.fromFunction2(_set))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistenceInternal]
    }
    
    extension [Self <: PersistenceInternal](x: Self) {
      
      inline def setType(value: PersistenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_addListener(value: (String, StorageEventListener) => Callback): Self = StObject.set(x, "_addListener", js.Any.fromFunction2((t0: String, t1: StorageEventListener) => (value(t0, t1)).runNow()))
      
      inline def set_get(value: String => js.Promise[Any | Null]): Self = StObject.set(x, "_get", js.Any.fromFunction1(value))
      
      inline def set_isAvailable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "_isAvailable", value.toJsFn)
      
      inline def set_remove(value: String => js.Promise[Unit]): Self = StObject.set(x, "_remove", js.Any.fromFunction1(value))
      
      inline def set_removeListener(value: (String, StorageEventListener) => Callback): Self = StObject.set(x, "_removeListener", js.Any.fromFunction2((t0: String, t1: StorageEventListener) => (value(t0, t1)).runNow()))
      
      inline def set_set(value: (String, PersistenceValue) => js.Promise[Unit]): Self = StObject.set(x, "_set", js.Any.fromFunction2(value))
      
      inline def set_shouldAllowMigration(value: Boolean): Self = StObject.set(x, "_shouldAllowMigration", value.asInstanceOf[js.Any])
      
      inline def set_shouldAllowMigrationUndefined: Self = StObject.set(x, "_shouldAllowMigration", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.SESSION
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.LOCAL
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.NONE
  */
  trait PersistenceType extends StObject
  object PersistenceType {
    
    inline def LOCAL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.LOCAL = "LOCAL".asInstanceOf[typingsJapgolly.firebaseAuth.firebaseAuthStrings.LOCAL]
    
    inline def NONE: typingsJapgolly.firebaseAuth.firebaseAuthStrings.NONE = "NONE".asInstanceOf[typingsJapgolly.firebaseAuth.firebaseAuthStrings.NONE]
    
    inline def SESSION: typingsJapgolly.firebaseAuth.firebaseAuthStrings.SESSION = "SESSION".asInstanceOf[typingsJapgolly.firebaseAuth.firebaseAuthStrings.SESSION]
  }
  
  type PersistenceValue = PersistedBlob | String
  
  type StorageEventListener = js.Function1[/* value */ PersistenceValue | Null, Unit]
}
