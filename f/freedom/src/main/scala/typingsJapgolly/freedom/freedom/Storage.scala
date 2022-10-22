package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Storage {
  
  trait Storage extends StObject {
    
    // Remove all data from storage.
    def clear(): js.Promise[Unit]
    
    // Fetch a value for a key.
    def get(key: String): js.Promise[String]
    
    // Fetch array of all keys.
    def keys(): js.Promise[js.Array[String]]
    
    // Remove a single key. Fulfills promise with previous value, if exists.
    def remove(key: String): js.Promise[String]
    
    // Sets a value to a key. Fulfills promise with the previous value, if it
    // exists.
    def set(key: String, value: String): js.Promise[String]
  }
  object Storage {
    
    inline def apply(
      clear: CallbackTo[js.Promise[Unit]],
      get: String => js.Promise[String],
      keys: CallbackTo[js.Promise[js.Array[String]]],
      remove: String => js.Promise[String],
      set: (String, String) => js.Promise[String]
    ): typingsJapgolly.freedom.freedom.Storage.Storage = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = js.Any.fromFunction1(get), keys = keys.toJsFn, remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[typingsJapgolly.freedom.freedom.Storage.Storage]
    }
    
    extension [Self <: typingsJapgolly.freedom.freedom.Storage.Storage](x: Self) {
      
      inline def setClear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGet(value: String => js.Promise[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setRemove(value: String => js.Promise[String]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => js.Promise[String]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
