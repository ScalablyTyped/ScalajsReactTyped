package typingsJapgolly.bidirectionalMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bidirectional-map", JSImport.Default)
  @js.native
  open class default[TValue] ()
    extends StObject
       with BiMap[TValue] {
    def this(`object`: StringDictionary[TValue]) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(key: String): Unit = js.native
    
    /* CompleteClass */
    override def deleteValue(value: TValue): Unit = js.native
    
    /* CompleteClass */
    override def entries(): IterableIterator[js.Tuple2[String, TValue]] = js.native
    
    /* CompleteClass */
    override def get(key: String): TValue = js.native
    
    /* CompleteClass */
    override def getKey(value: TValue): String = js.native
    
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def hasValue(value: TValue): Boolean = js.native
    
    /* CompleteClass */
    override def keys(): IterableIterator[String] = js.native
    
    /* CompleteClass */
    override def set(key: String, value: TValue): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def values(): IterableIterator[TValue] = js.native
  }
  
  trait BiMap[TValue] extends StObject {
    
    def clear(): Unit
    
    def delete(key: String): Unit
    
    def deleteValue(value: TValue): Unit
    
    def entries(): IterableIterator[js.Tuple2[String, TValue]]
    
    def get(key: String): TValue
    
    def getKey(value: TValue): String
    
    def has(key: String): Boolean
    
    def hasValue(value: TValue): Boolean
    
    def keys(): IterableIterator[String]
    
    def set(key: String, value: TValue): Unit
    
    var size: Double
    
    def values(): IterableIterator[TValue]
  }
  object BiMap {
    
    inline def apply[TValue](
      clear: Callback,
      delete: String => Callback,
      deleteValue: TValue => Callback,
      entries: CallbackTo[IterableIterator[js.Tuple2[String, TValue]]],
      get: String => TValue,
      getKey: TValue => String,
      has: String => Boolean,
      hasValue: TValue => Boolean,
      keys: CallbackTo[IterableIterator[String]],
      set: (String, TValue) => Callback,
      size: Double,
      values: CallbackTo[IterableIterator[TValue]]
    ): BiMap[TValue] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, delete = js.Any.fromFunction1((t0: String) => delete(t0).runNow()), deleteValue = js.Any.fromFunction1((t0: TValue) => deleteValue(t0).runNow()), entries = entries.toJsFn, get = js.Any.fromFunction1(get), getKey = js.Any.fromFunction1(getKey), has = js.Any.fromFunction1(has), hasValue = js.Any.fromFunction1(hasValue), keys = keys.toJsFn, set = js.Any.fromFunction2((t0: String, t1: TValue) => (set(t0, t1)).runNow()), size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[BiMap[TValue]]
    }
    
    extension [Self <: BiMap[?], TValue](x: Self & BiMap[TValue]) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDelete(value: String => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeleteValue(value: TValue => Callback): Self = StObject.set(x, "deleteValue", js.Any.fromFunction1((t0: TValue) => value(t0).runNow()))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[String, TValue]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setGet(value: String => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetKey(value: TValue => String): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setHasValue(value: TValue => Boolean): Self = StObject.set(x, "hasValue", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[String]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSet(value: (String, TValue) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: TValue) => (value(t0, t1)).runNow()))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[TValue]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
}
