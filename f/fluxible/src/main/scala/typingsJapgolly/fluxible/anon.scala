package typingsJapgolly.fluxible

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.dispatchr.mod.DispatcherInterface
import typingsJapgolly.fluxible.addonsBaseStoreMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    /**
      * POST request to the server
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param body json request body
      * @param callback
      */
    def create(
      resource: String,
      params: Any,
      body: Any,
      callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]
    ): Unit
    
    /**
      *
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param callback
      */
    def delete(resource: String, params: Any, callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]): Unit
    
    /**
      * GET request to the server
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param callback
      */
    def read(resource: String, params: Any, callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]): Unit
    
    /**
      *
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param body json request body
      * @param callback
      */
    def update(
      resource: String,
      params: Any,
      body: Any,
      callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]
    ): Unit
  }
  object Create {
    
    inline def apply(
      create: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback,
      delete: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback,
      read: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback,
      update: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback
    ): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4((t0: String, t1: Any, t2: Any, t3: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (create(t0, t1, t2, t3)).runNow()), delete = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (delete(t0, t1, t2)).runNow()), read = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (read(t0, t1, t2)).runNow()), update = js.Any.fromFunction4((t0: String, t1: Any, t2: Any, t3: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (update(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: String, t1: Any, t2: Any, t3: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setDelete(value: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRead(value: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback): Self = StObject.set(x, "read", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUpdate(value: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction4((t0: String, t1: Any, t2: Any, t3: js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  @js.native
  trait Instantiable[T /* <: ^[js.Object] */]
    extends StObject
       with Instantiable1[/* dispatcher */ DispatcherInterface, T]
}
