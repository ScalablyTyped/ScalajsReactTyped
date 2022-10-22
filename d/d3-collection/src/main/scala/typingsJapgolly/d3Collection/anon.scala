package typingsJapgolly.d3Collection

import typingsJapgolly.d3Collection.mod.NestedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key[T] extends StObject {
    
    var key: String
    
    var value: T
  }
  object Key {
    
    inline def apply[T](key: String, value: T): Key[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[T]]
    }
    
    extension [Self <: Key[?], T](x: Self & Key[T]) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyValue extends StObject {
    
    var key: String
    
    var value: Any
  }
  object KeyValue {
    
    inline def apply(key: String, value: Any): KeyValue = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyValue]
    }
    
    extension [Self <: KeyValue](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[RollupType] extends StObject {
    
    var key: String
    
    var value: js.UndefOr[RollupType] = js.undefined
    
    var values: Any
  }
  object Value {
    
    inline def apply[RollupType](key: String, values: Any): Value[RollupType] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[RollupType]]
    }
    
    extension [Self <: Value[?], RollupType](x: Self & Value[RollupType]) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: RollupType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait Values[Datum, RollupType] extends StObject {
    
    var key: String
    
    var value: js.UndefOr[RollupType] = js.undefined
    
    var values: js.UndefOr[(NestedArray[Datum, RollupType]) | js.Array[Datum]] = js.undefined
  }
  object Values {
    
    inline def apply[Datum, RollupType](key: String): Values[Datum, RollupType] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values[Datum, RollupType]]
    }
    
    extension [Self <: Values[?, ?], Datum, RollupType](x: Self & (Values[Datum, RollupType])) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: RollupType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValues(value: (NestedArray[Datum, RollupType]) | js.Array[Datum]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (Datum | (Values[Datum, RollupType]))*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
