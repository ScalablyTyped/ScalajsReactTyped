package typingsJapgolly.angularStorage

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-storage", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    object a0 {
      
      object storage {
        
        trait INamespacedStoreService extends StObject {
          
          /**
            * Returns the saved value with they key name.
            *
            * @param {String} name - The key name for the location of the value
            * @returns The saved value; if you saved an object, you get an object
            */
          def get(name: String): Any
          
          /**
            * Deletes the saved value with the key name
            *
            * @param {String} name - The key name for the location of the value to remove
            */
          def remove(name: String): Unit
          
          /**
            * Sets a new value to the storage with the key name. It can be any object.
            *
            * @param {String} name - The key name for the location of the value
            * @param value - The value to store
            */
          def set(name: String, value: Any): Unit
        }
        object INamespacedStoreService {
          
          inline def apply(get: String => Any, remove: String => Callback, set: (String, Any) => Callback): INamespacedStoreService = {
            val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()))
            __obj.asInstanceOf[INamespacedStoreService]
          }
          
          extension [Self <: INamespacedStoreService](x: Self) {
            
            inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
            
            inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
            
            inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
          }
        }
        
        trait IStoreProvider extends StObject {
          
          /**
            * Sets the storage.
            *
            * @param {String} storage - The storage name
            */
          def setStore(storage: String): Unit
        }
        object IStoreProvider {
          
          inline def apply(setStore: String => Callback): IStoreProvider = {
            val __obj = js.Dynamic.literal(setStore = js.Any.fromFunction1((t0: String) => setStore(t0).runNow()))
            __obj.asInstanceOf[IStoreProvider]
          }
          
          extension [Self <: IStoreProvider](x: Self) {
            
            inline def setSetStore(value: String => Callback): Self = StObject.set(x, "setStore", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
          }
        }
        
        @js.native
        trait IStoreService
          extends StObject
             with INamespacedStoreService {
          
          /**
            * Returns a namespaced store
            *
            * @param {String} namespace - The namespace
            * @param {String} storage - The name of the storage service. Defaults to local storage.
            * @param {String} delimiter - The delimiter to use to separate the namespace and the keys.
            * @returns {INamespacedStoreService}
            */
          def getNamespacedStore(namespace: String): INamespacedStoreService = js.native
          def getNamespacedStore(namespace: String, storage: String): INamespacedStoreService = js.native
          def getNamespacedStore(namespace: String, storage: String, delimiter: String): INamespacedStoreService = js.native
          def getNamespacedStore(namespace: String, storage: Unit, delimiter: String): INamespacedStoreService = js.native
        }
      }
    }
  }
}
