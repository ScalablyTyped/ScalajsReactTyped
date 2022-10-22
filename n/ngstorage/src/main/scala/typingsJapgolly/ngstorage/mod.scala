package typingsJapgolly.ngstorage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ngStorage {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ trait StorageProvider extends StObject {
      
      def get[T](key: String): T | Boolean
      
      def remove(key: String): Unit
      
      def set[T](key: String, value: T): T | Boolean
      
      def setDeserializer(deserializer: js.Function1[/* value */ String, Any]): Unit
      
      def setKeyPrefix(prefix: String): Unit
      
      def setSerializer(serializer: js.Function1[/* value */ Any, String]): Unit
      
      def supported(): Boolean
    }
    object StorageProvider {
      
      inline def apply(
        get: String => Any | Boolean,
        remove: String => Callback,
        set: (String, Any) => Any | Boolean,
        setDeserializer: js.Function1[/* value */ String, Any] => Callback,
        setKeyPrefix: String => Callback,
        setSerializer: js.Function1[/* value */ Any, String] => Callback,
        supported: CallbackTo[Boolean]
      ): StorageProvider = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1((t0: js.Function1[/* value */ String, Any]) => setDeserializer(t0).runNow()), setKeyPrefix = js.Any.fromFunction1((t0: String) => setKeyPrefix(t0).runNow()), setSerializer = js.Any.fromFunction1((t0: js.Function1[/* value */ Any, String]) => setSerializer(t0).runNow()), supported = supported.toJsFn)
        __obj.asInstanceOf[StorageProvider]
      }
      
      extension [Self <: StorageProvider](x: Self) {
        
        inline def setGet(value: String => Any | Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSet(value: (String, Any) => Any | Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
        
        inline def setSetDeserializer(value: js.Function1[/* value */ String, Any] => Callback): Self = StObject.set(x, "setDeserializer", js.Any.fromFunction1((t0: js.Function1[/* value */ String, Any]) => value(t0).runNow()))
        
        inline def setSetKeyPrefix(value: String => Callback): Self = StObject.set(x, "setKeyPrefix", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSetSerializer(value: js.Function1[/* value */ Any, String] => Callback): Self = StObject.set(x, "setSerializer", js.Any.fromFunction1((t0: js.Function1[/* value */ Any, String]) => value(t0).runNow()))
        
        inline def setSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "supported", value.toJsFn)
      }
    }
    
    @js.native
    trait StorageService
      extends StObject
         with /**
      * Access to the properties of the store.
      */
    /* key */ StringDictionary[Any] {
      
      @JSName("$apply")
      def $apply(): Unit = js.native
      
      /**
        * Adds default values to the store.
        * Copies all properties of the default items to the store.
        * If the store already has one of these properties it will skip it.
        *
        * @param items object holding the default values.
        * @return the modified storage service.
        */
      @JSName("$default")
      def $default[T](items: T): StorageService & T = js.native
      
      /**
        * Removes all properties from the store.
        *
        * @param items optional object holding the default values to initialize the store after reset.
        * @return the modified storage service.
        */
      @JSName("$reset")
      def $reset[T](): StorageService & T = js.native
      @JSName("$reset")
      def $reset[T](items: T): StorageService & T = js.native
      
      /**
        * @return true if the storage service is supported by the browser.
        */
      @JSName("$supported")
      def $supported(): Boolean = js.native
      
      @JSName("$sync")
      def $sync(): Unit = js.native
    }
  }
}
