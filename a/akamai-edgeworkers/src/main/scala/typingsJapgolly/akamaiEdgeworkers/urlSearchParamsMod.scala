package typingsJapgolly.akamaiEdgeworkers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query, add, and remove parameters from the query string.
  */
object urlSearchParamsMod {
  
  @JSImport("url-search-params", JSImport.Default)
  @js.native
  /**
    * Create a new URLSearchParams object.
    */
  open class default ()
    extends StObject
       with URLSearchParams {
    def this(init: String) = this()
    def this(init: URLSearchParams) = this()
    
    /**
      * Add a new name/value to the receiver.
      */
    /* CompleteClass */
    override def append(name: String, value: String): Unit = js.native
    
    /**
      * Remove the given name/value from the receiver.
      */
    /* CompleteClass */
    override def delete(name: String): Unit = js.native
    
    /**
      * Iterate through the name/value pairs.
      */
    /* CompleteClass */
    override def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    /**
      * Return the first value with the specified name.
      */
    /* CompleteClass */
    override def get(name: String): String | Null = js.native
    
    /**
      * Return *all* values association with the specified name.
      */
    /* CompleteClass */
    override def getAll(name: String): js.Array[String] = js.native
    
    /**
      * Check if the given name exists.
      */
    /* CompleteClass */
    override def has(name: String): Boolean = js.native
    
    /**
      * Iterate through the names.
      */
    /* CompleteClass */
    override def keys(): IterableIterator[String] = js.native
    
    /**
      * Replace all instances of `name` with a single name/value pair.
      */
    /* CompleteClass */
    override def set(name: String, value: String): Unit = js.native
    
    /**
      * Iterate through the values.
      */
    /* CompleteClass */
    override def values(): IterableIterator[String] = js.native
  }
  
  trait URLSearchParams extends StObject {
    
    /**
      * Add a new name/value to the receiver.
      */
    def append(name: String, value: String): Unit
    
    /**
      * Remove the given name/value from the receiver.
      */
    def delete(name: String): Unit
    
    /**
      * Iterate through the name/value pairs.
      */
    def entries(): IterableIterator[js.Tuple2[String, String]]
    
    /**
      * Return the first value with the specified name.
      */
    def get(name: String): String | Null
    
    /**
      * Return *all* values association with the specified name.
      */
    def getAll(name: String): js.Array[String]
    
    /**
      * Check if the given name exists.
      */
    def has(name: String): Boolean
    
    /**
      * Iterate through the names.
      */
    def keys(): IterableIterator[String]
    
    /**
      * Replace all instances of `name` with a single name/value pair.
      */
    def set(name: String, value: String): Unit
    
    /**
      * Iterate through the values.
      */
    def values(): IterableIterator[String]
  }
  object URLSearchParams {
    
    inline def apply(
      append: (String, String) => Callback,
      delete: String => Callback,
      entries: CallbackTo[IterableIterator[js.Tuple2[String, String]]],
      get: String => String | Null,
      getAll: String => js.Array[String],
      has: String => Boolean,
      keys: CallbackTo[IterableIterator[String]],
      set: (String, String) => Callback,
      values: CallbackTo[IterableIterator[String]]
    ): URLSearchParams = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2((t0: String, t1: String) => (append(t0, t1)).runNow()), delete = js.Any.fromFunction1((t0: String) => delete(t0).runNow()), entries = entries.toJsFn, get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), keys = keys.toJsFn, set = js.Any.fromFunction2((t0: String, t1: String) => (set(t0, t1)).runNow()), values = values.toJsFn)
      __obj.asInstanceOf[URLSearchParams]
    }
    
    extension [Self <: URLSearchParams](x: Self) {
      
      inline def setAppend(value: (String, String) => Callback): Self = StObject.set(x, "append", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setDelete(value: String => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[String, String]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: String => js.Array[String]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[String]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSet(value: (String, String) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setValues(value: CallbackTo[IterableIterator[String]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
}
