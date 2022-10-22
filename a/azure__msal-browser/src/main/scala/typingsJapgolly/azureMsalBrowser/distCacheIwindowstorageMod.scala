package typingsJapgolly.azureMsalBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheIwindowstorageMod {
  
  trait IWindowStorage[T] extends StObject {
    
    /**
      * Returns true or false if the given key is present in the cache.
      * @param key
      */
    def containsKey(key: String): Boolean
    
    /**
      * Get the item from the window storage object matching the given key.
      * @param key
      */
    def getItem(key: String): T | Null
    
    /**
      * Get all the keys from the window storage object as an iterable array of strings.
      */
    def getKeys(): js.Array[String]
    
    /**
      * Removes the item in the window storage object matching the given key.
      * @param key
      */
    def removeItem(key: String): Unit
    
    /**
      * Sets the item in the window storage object with the given key.
      * @param key
      * @param value
      */
    def setItem(key: String, value: T): Unit
  }
  object IWindowStorage {
    
    inline def apply[T](
      containsKey: String => Boolean,
      getItem: String => T | Null,
      getKeys: CallbackTo[js.Array[String]],
      removeItem: String => Callback,
      setItem: (String, T) => Callback
    ): IWindowStorage[T] = {
      val __obj = js.Dynamic.literal(containsKey = js.Any.fromFunction1(containsKey), getItem = js.Any.fromFunction1(getItem), getKeys = getKeys.toJsFn, removeItem = js.Any.fromFunction1((t0: String) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2((t0: String, t1: T) => (setItem(t0, t1)).runNow()))
      __obj.asInstanceOf[IWindowStorage[T]]
    }
    
    extension [Self <: IWindowStorage[?], T](x: Self & IWindowStorage[T]) {
      
      inline def setContainsKey(value: String => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      inline def setGetItem(value: String => T | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setGetKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getKeys", value.toJsFn)
      
      inline def setRemoveItem(value: String => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetItem(value: (String, T) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: T) => (value(t0, t1)).runNow()))
    }
  }
}
