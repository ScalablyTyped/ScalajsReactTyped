package typingsJapgolly.tabris

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Storage
/**
  * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
  * are stored as strings.
  * In addition Tabris.js adds support for a `secureStorage` available in the global scope. This is a
  * drop-in replacement for `localStorage` that keeps data encrypted using the Keychain on iOS and the
  * AndroidKeyStore on Android 6+. Note that on Android 5 the store is encrypted but does not use
  * hardware encryption.
  * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
  * it is recommended to use the [FileSystem](./fs.html) API.
  */
trait Storage extends StObject {
  
  /**
    * Remove all key/value pairs from the storage.
    */
  def clear(): Unit
  
  /**
    * Retrieves the value associated with the given key.
    * @param key
    */
  def getItem(key: String): String | Null
  
  /**
    * Returns the name of the key at the given index in the storage. The order of keys is platform
    * dependent, you should not rely on it to be deterministic
    * @param index
    */
  def key(index: Double): String
  
  /**
    * The number of items in the storage.
    * @constant
    */
  val length: Double
  
  /**
    * Removes the given key/value pair from the storage.
    * @param key
    */
  def removeItem(key: String): Unit
  
  /**
    * Stores a string value using the given key.
    * @param key
    * @param value
    */
  def setItem(key: String, value: String): Unit
}
object Storage {
  
  inline def apply(
    clear: Callback,
    getItem: String => String | Null,
    key: Double => String,
    length: Double,
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1((t0: String) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2((t0: String, t1: String) => (setItem(t0, t1)).runNow()))
    __obj.asInstanceOf[Storage]
  }
  
  extension [Self <: Storage](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetItem(value: String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: String => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetItem(value: (String, String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
