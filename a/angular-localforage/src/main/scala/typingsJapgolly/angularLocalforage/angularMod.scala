package typingsJapgolly.angularLocalforage

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.angularLocalforage.anon.DefaultValue
import typingsJapgolly.localforage.LocalForageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object localForage {
    
    trait ILocalForageProvider extends StObject {
      
      def config(config: LocalForageConfig): Unit
      
      def setNotify(onItemSet: Boolean, onItemRemove: Boolean): Unit
    }
    object ILocalForageProvider {
      
      inline def apply(config: LocalForageConfig => Callback, setNotify: (Boolean, Boolean) => Callback): ILocalForageProvider = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1((t0: LocalForageConfig) => config(t0).runNow()), setNotify = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (setNotify(t0, t1)).runNow()))
        __obj.asInstanceOf[ILocalForageProvider]
      }
      
      extension [Self <: ILocalForageProvider](x: Self) {
        
        inline def setConfig(value: LocalForageConfig => Callback): Self = StObject.set(x, "config", js.Any.fromFunction1((t0: LocalForageConfig) => value(t0).runNow()))
        
        inline def setSetNotify(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "setNotify", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
      }
    }
    
    @js.native
    trait ILocalForageService extends StObject {
      
      def bind($scope: IScope, config: DefaultValue): IPromise[Any] = js.native
      def bind($scope: IScope, key: String): IPromise[Any] = js.native
      
      def clear(): IPromise[Unit] = js.native
      
      def createInstance(config: LocalForageConfig): ILocalForageService = js.native
      
      def driver(): LocalForageDriver = js.native
      
      def getItem(key: String): IPromise[Any] = js.native
      def getItem(keys: js.Array[String]): IPromise[js.Array[Any]] = js.native
      
      def instance(name: String): ILocalForageService = js.native
      
      def iterate[T](iteratorCallback: js.Function2[/* value */ String | Double, /* key */ String, T]): IPromise[T] = js.native
      
      def key(n: Double): IPromise[String] = js.native
      
      def keys(): IPromise[String] = js.native
      
      def length(): IPromise[Double] = js.native
      
      def pull(key: String): IPromise[Any] = js.native
      def pull(keys: js.Array[String]): IPromise[js.Array[Any]] = js.native
      
      def removeItem(key: String): IPromise[Unit] = js.native
      def removeItem(key: js.Array[String]): IPromise[Unit] = js.native
      
      def setDriver(name: String): IPromise[Unit] = js.native
      def setDriver(name: js.Array[String]): IPromise[Unit] = js.native
      
      def setItem(key: String, value: Any): IPromise[Unit] = js.native
      def setItem(keys: js.Array[String], values: js.Array[Any]): IPromise[Unit] = js.native
      
      def unbind($scope: IScope, key: String): Unit = js.native
      def unbind($scope: IScope, key: String, scopeKey: String): Unit = js.native
    }
    
    trait LocalForageConfig extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var driver: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String | Double] = js.undefined
      
      var storeName: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[Double] = js.undefined
    }
    object LocalForageConfig {
      
      inline def apply(): LocalForageConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocalForageConfig]
      }
      
      extension [Self <: LocalForageConfig](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
        
        inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
        
        inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
        
        inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
        
        inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
  }
}
