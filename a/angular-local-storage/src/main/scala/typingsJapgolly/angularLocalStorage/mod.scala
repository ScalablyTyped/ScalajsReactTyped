package typingsJapgolly.angularLocalStorage

import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.angular.mod.IServiceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ICookie = typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ICookie
  
  type ILocalStorageService = typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageService
  
  type ILocalStorageServiceProvider = typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
  
  /* augmented module */
  object angularAugmentingMod {
    
    object local {
      
      object storage {
        
        // tslint:disable-next-line interface-name
        @js.native
        trait ICookie extends StObject {
          
          /**
            * Remove all data for this app from cookie.
            */
          def clearAll(): Any = js.native
          
          /**
            * Directly get a value from a cookie.
            */
          def get(key: String): String = js.native
          
          /**
            * Checks if cookies are enabled in the browser.
            * Returns: Boolean
            */
          val isSupported: Boolean = js.native
          
          /**
            * Remove directly value from a cookie.
            */
          def remove(key: String): Boolean = js.native
          
          /**
            * Directly adds a value to cookies.
            * Note: Typically used as a fallback if local storage is not supported.
            */
          def set(key: String, `val`: String): Boolean = js.native
          def set(key: String, `val`: String, daysToExpiry: Double): Boolean = js.native
        }
        
        // tslint:disable-next-line interface-name
        @js.native
        trait ILocalStorageService extends StObject {
          
          /**
            * Bind $scope key to localStorageService.
            * Usage: localStorageService.bind(scope, property, value[optional], key[optional])
            * Returns: deregistration function for this listener.
            */
          def bind(scope: IScope, property: String): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Any): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Any, key: String): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Any, key: String, storageType: StorageType): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Any, key: Unit, storageType: StorageType): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Unit, key: String): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Unit, key: String, storageType: StorageType): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: Unit, key: Unit, storageType: StorageType): js.Function0[Unit] = js.native
          
          /**
            * Change the local storage prefix during execution
            */
          def changePrefix(newPrefix: String): Unit = js.native
          
          /**
            * Remove all data for this app from local storage.
            * If local storage is not supported, use cookies instead.
            * Note: Optionally takes a regular expression string and removes matching.
            */
          def clearAll(): Boolean = js.native
          def clearAll(regularExpression: js.RegExp): Boolean = js.native
          def clearAll(regularExpression: js.RegExp, storageType: StorageType): Boolean = js.native
          def clearAll(regularExpression: Unit, storageType: StorageType): Boolean = js.native
          
          /**
            * Deal with browser's cookies directly.
            */
          var cookie: typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ICookie = js.native
          
          /**
            * Return the derive key
            */
          def deriveKey(key: String): String = js.native
          
          /**
            * Directly get a value from local storage.
            * If local storage is not supported, use cookies instead.
            * Returns: value from local storage
            */
          def get(key: String): Any = js.native
          def get(key: String, storageType: StorageType): Any = js.native
          
          /**
            * Returns: String
            */
          def getStorageType(): String = js.native
          
          /**
            * Checks if the browser support the current storage type(e.g: localStorage, sessionStorage).
            * Returns: Boolean
            */
          var isSupported: Boolean = js.native
          
          /**
            * Return array of keys for local storage, ignore keys that not owned.
            * Returns: value from local storage
            */
          def keys(): js.Array[String] = js.native
          def keys(storageType: StorageType): js.Array[String] = js.native
          
          /**
            * Return localStorageService.length, ignore keys that not owned.
            */
          def length(): Double = js.native
          def length(storageType: StorageType): Double = js.native
          
          /**
            * Remove a list of items from the local storage by their given keys.
            * The last item in the variable argument list can optionally be the StorageType.
            * Which specifies whether to remove from the session storage or the local storage.
            * If the last argument is not a valid storage type it is considered to be a key,
            * and localStorage is used by default .
            * If local storage is not supported, use cookies instead.
            * Returns: Boolean
            * @param key
            */
          def remove(args: String*): Boolean = js.native
          
          /**
            * Directly adds a value to local storage.
            * If local storage is not supported, use cookies instead.
            */
          def set(key: String, value: Any): Boolean = js.native
          def set(key: String, value: Any, storageType: StorageType): Boolean = js.native
        }
        
        // tslint:disable-next-line interface-name
        trait ILocalStorageServiceProvider
          extends StObject
             with IServiceProvider {
          
          /**
            * If localStorage is not supported, the library will default to cookies instead. This behavior can be disabled
            * default: true
            */
          def setDefaultToCookie(shouldDefault: Boolean): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          
          /**
            * Send signals for each of the following actions:
            * @param setItem default: true
            * @param removeItem default: false
            */
          def setNotify(setItem: Boolean, removeItem: Boolean): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          
          /**
            * Setter for the prefix
            * You should set a prefix to avoid overwriting any local storage variables from the rest of your app
            * e.g. localStorageServiceProvider.setPrefix('youAppName');
            * With provider you can use config as this:
            * myApp.config(function (localStorageServiceProvider) {
            *  localStorageServiceProvider.prefix = 'yourAppName';
            * });
            * @param prefix default: ls.<your-key>
            */
          def setPrefix(prefix: String): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          
          /**
            * Setter for cookie config
            * @param exp number of days before cookies expire (0 = does not expire). default: 30
            * @param path the web path the cookie represents. default: '/'
            * @param secure to store cookies as secure. default: false
            */
          def setStorageCookie(exp: Double, path: String, secure: Boolean): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          
          /**
            * Set the cookie domain, since this runs inside a the config() block,
            * only providers and constants can be injected.
            * As a result, $location service can't be used here,
            * use a hardcoded string or window.location.
            * No default value
            */
          def setStorageCookieDomain(domain: String): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          
          /**
            * Setter for the storageType
            * localstorage or sessionStorage. default: localStorage
            */
          def setStorageType(storageType: String): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
        }
        object ILocalStorageServiceProvider {
          
          inline def apply(
            $get: Any,
            setDefaultToCookie: Boolean => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setNotify: (Boolean, Boolean) => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setPrefix: String => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setStorageCookie: (Double, String, Boolean) => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setStorageCookieDomain: String => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setStorageType: String => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          ): typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = {
            val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], setDefaultToCookie = js.Any.fromFunction1(setDefaultToCookie), setNotify = js.Any.fromFunction2(setNotify), setPrefix = js.Any.fromFunction1(setPrefix), setStorageCookie = js.Any.fromFunction3(setStorageCookie), setStorageCookieDomain = js.Any.fromFunction1(setStorageCookieDomain), setStorageType = js.Any.fromFunction1(setStorageType))
            __obj.asInstanceOf[typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider]
          }
          
          extension [Self <: typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider](x: Self) {
            
            inline def setSetDefaultToCookie(
              value: Boolean => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setDefaultToCookie", js.Any.fromFunction1(value))
            
            inline def setSetNotify(
              value: (Boolean, Boolean) => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setNotify", js.Any.fromFunction2(value))
            
            inline def setSetPrefix(
              value: String => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setPrefix", js.Any.fromFunction1(value))
            
            inline def setSetStorageCookie(
              value: (Double, String, Boolean) => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setStorageCookie", js.Any.fromFunction3(value))
            
            inline def setSetStorageCookieDomain(
              value: String => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setStorageCookieDomain", js.Any.fromFunction1(value))
            
            inline def setSetStorageType(
              value: String => typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setStorageType", js.Any.fromFunction1(value))
          }
        }
        
        /* Rewritten from type alias, can be one of: 
          - typingsJapgolly.angularLocalStorage.angularLocalStorageStrings.localStorage
          - typingsJapgolly.angularLocalStorage.angularLocalStorageStrings.sessionStorage
        */
        trait StorageType extends StObject
        object StorageType {
          
          inline def localStorage: typingsJapgolly.angularLocalStorage.angularLocalStorageStrings.localStorage = "localStorage".asInstanceOf[typingsJapgolly.angularLocalStorage.angularLocalStorageStrings.localStorage]
          
          inline def sessionStorage: typingsJapgolly.angularLocalStorage.angularLocalStorageStrings.sessionStorage = "sessionStorage".asInstanceOf[typingsJapgolly.angularLocalStorage.angularLocalStorageStrings.sessionStorage]
        }
      }
    }
  }
}
