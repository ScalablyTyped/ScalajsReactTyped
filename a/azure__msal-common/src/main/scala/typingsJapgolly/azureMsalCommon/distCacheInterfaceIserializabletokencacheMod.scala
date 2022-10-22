package typingsJapgolly.azureMsalCommon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheInterfaceIserializabletokencacheMod {
  
  trait ISerializableTokenCache extends StObject {
    
    def deserialize(cache: String): Unit
    
    def serialize(): String
  }
  object ISerializableTokenCache {
    
    inline def apply(deserialize: String => Callback, serialize: CallbackTo[String]): ISerializableTokenCache = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1((t0: String) => deserialize(t0).runNow()), serialize = serialize.toJsFn)
      __obj.asInstanceOf[ISerializableTokenCache]
    }
    
    extension [Self <: ISerializableTokenCache](x: Self) {
      
      inline def setDeserialize(value: String => Callback): Self = StObject.set(x, "deserialize", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSerialize(value: CallbackTo[String]): Self = StObject.set(x, "serialize", value.toJsFn)
    }
  }
}
