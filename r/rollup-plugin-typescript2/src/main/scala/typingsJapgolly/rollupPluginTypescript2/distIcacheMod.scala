package typingsJapgolly.rollupPluginTypescript2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIcacheMod {
  
  trait ICache[DataType] extends StObject {
    
    def exists(name: String): Boolean
    
    def `match`(names: js.Array[String]): Boolean
    
    def path(name: String): String
    
    def read(name: String): js.UndefOr[DataType | Null]
    
    def roll(): Unit
    
    def touch(name: String): Unit
    
    def write(name: String, data: DataType): Unit
  }
  object ICache {
    
    inline def apply[DataType](
      exists: String => Boolean,
      `match`: js.Array[String] => Boolean,
      path: String => String,
      read: String => js.UndefOr[DataType | Null],
      roll: Callback,
      touch: String => Callback,
      write: (String, DataType) => Callback
    ): ICache[DataType] = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction1(exists), path = js.Any.fromFunction1(path), read = js.Any.fromFunction1(read), roll = roll.toJsFn, touch = js.Any.fromFunction1((t0: String) => touch(t0).runNow()), write = js.Any.fromFunction2((t0: String, t1: DataType) => (write(t0, t1)).runNow()))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[ICache[DataType]]
    }
    
    extension [Self <: ICache[?], DataType](x: Self & ICache[DataType]) {
      
      inline def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setMatch(value: js.Array[String] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setPath(value: String => String): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      inline def setRead(value: String => js.UndefOr[DataType | Null]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setRoll(value: Callback): Self = StObject.set(x, "roll", value.toJsFn)
      
      inline def setTouch(value: String => Callback): Self = StObject.set(x, "touch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWrite(value: (String, DataType) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction2((t0: String, t1: DataType) => (value(t0, t1)).runNow()))
    }
  }
}
