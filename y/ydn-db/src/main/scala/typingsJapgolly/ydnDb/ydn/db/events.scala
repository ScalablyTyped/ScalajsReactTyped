package typingsJapgolly.ydnDb.ydn.db

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  trait Event extends StObject {
    
    var name: String
    
    var `type`: EventType
  }
  object Event {
    
    inline def apply(name: String, `type`: EventType): Event = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordEvent
    extends StObject
       with Event {
    
    def getKey(): Any
    
    def getStoreName(): String
    
    def getValue(): Any
  }
  object RecordEvent {
    
    inline def apply(
      getKey: CallbackTo[Any],
      getStoreName: CallbackTo[String],
      getValue: CallbackTo[Any],
      name: String,
      `type`: EventType
    ): RecordEvent = {
      val __obj = js.Dynamic.literal(getKey = getKey.toJsFn, getStoreName = getStoreName.toJsFn, getValue = getValue.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEvent]
    }
    
    extension [Self <: RecordEvent](x: Self) {
      
      inline def setGetKey(value: CallbackTo[Any]): Self = StObject.set(x, "getKey", value.toJsFn)
      
      inline def setGetStoreName(value: CallbackTo[String]): Self = StObject.set(x, "getStoreName", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    }
  }
  
  trait StorageEvent
    extends StObject
       with Event {
    
    def getError(): js.Error
    
    def getOldVersion(): Double
    
    def getVersion(): Double
  }
  object StorageEvent {
    
    inline def apply(
      getError: CallbackTo[js.Error],
      getOldVersion: CallbackTo[Double],
      getVersion: CallbackTo[Double],
      name: String,
      `type`: EventType
    ): StorageEvent = {
      val __obj = js.Dynamic.literal(getError = getError.toJsFn, getOldVersion = getOldVersion.toJsFn, getVersion = getVersion.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageEvent]
    }
    
    extension [Self <: StorageEvent](x: Self) {
      
      inline def setGetError(value: CallbackTo[js.Error]): Self = StObject.set(x, "getError", value.toJsFn)
      
      inline def setGetOldVersion(value: CallbackTo[Double]): Self = StObject.set(x, "getOldVersion", value.toJsFn)
      
      inline def setGetVersion(value: CallbackTo[Double]): Self = StObject.set(x, "getVersion", value.toJsFn)
    }
  }
  
  trait StoreEvent
    extends StObject
       with Event {
    
    def getKeys(): js.Array[Any]
    
    def getStoreName(): String
    
    def getValues(): js.Array[Any]
  }
  object StoreEvent {
    
    inline def apply(
      getKeys: CallbackTo[js.Array[Any]],
      getStoreName: CallbackTo[String],
      getValues: CallbackTo[js.Array[Any]],
      name: String,
      `type`: EventType
    ): StoreEvent = {
      val __obj = js.Dynamic.literal(getKeys = getKeys.toJsFn, getStoreName = getStoreName.toJsFn, getValues = getValues.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreEvent]
    }
    
    extension [Self <: StoreEvent](x: Self) {
      
      inline def setGetKeys(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getKeys", value.toJsFn)
      
      inline def setGetStoreName(value: CallbackTo[String]): Self = StObject.set(x, "getStoreName", value.toJsFn)
      
      inline def setGetValues(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getValues", value.toJsFn)
    }
  }
}
