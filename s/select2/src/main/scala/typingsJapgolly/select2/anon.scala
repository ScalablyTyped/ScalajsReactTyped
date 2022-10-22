package typingsJapgolly.select2

import japgolly.scalajs.react.Callback
import typingsJapgolly.select2.mod.DataFormat
import typingsJapgolly.select2.mod.GroupedDataFormat
import typingsJapgolly.select2.mod.IdTextPair
import typingsJapgolly.select2.mod.Select2Require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: IdTextPair
  }
  object Data {
    
    inline def apply(data: IdTextPair): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: IdTextPair): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait More extends StObject {
    
    var more: Boolean
  }
  object More {
    
    inline def apply(more: Boolean): More = {
      val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
      __obj.asInstanceOf[More]
    }
    
    extension [Self <: More](x: Self) {
      
      inline def setMore(value: Boolean): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: typingsJapgolly.select2.mod.Options[DataFormat | GroupedDataFormat, Any]
  }
  object Options {
    
    inline def apply(options: typingsJapgolly.select2.mod.Options[DataFormat | GroupedDataFormat, Any]): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: typingsJapgolly.select2.mod.Options[DataFormat | GroupedDataFormat, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Require extends StObject {
    
    def require(module: String): Any
    def require(modules: js.Array[String]): Unit
    def require(modules: js.Array[String], ready: js.Function1[/* repeated */ Any, Unit]): Unit
    def require(
      modules: js.Array[String],
      ready: js.Function1[/* repeated */ Any, Unit],
      errback: js.Function1[/* err */ Any, Unit]
    ): Unit
    @JSName("require")
    var require_Original: Select2Require
  }
  object Require {
    
    inline def apply(require: Select2Require): Require = {
      val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Require]
    }
    
    extension [Self <: Require](x: Self) {
      
      inline def setRequire(value: Select2Require): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reset extends StObject {
    
    def reset(): Unit
    
    def set(key: String, value: Any): Unit
  }
  object Reset {
    
    inline def apply(reset: Callback, set: (String, Any) => Callback): Reset = {
      val __obj = js.Dynamic.literal(reset = reset.toJsFn, set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[Reset]
    }
    
    extension [Self <: Reset](x: Self) {
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
}
