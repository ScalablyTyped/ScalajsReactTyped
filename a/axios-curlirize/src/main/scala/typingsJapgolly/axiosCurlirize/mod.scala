package typingsJapgolly.axiosCurlirize

import typingsJapgolly.axios.mod.AxiosInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(instance: AxiosInstance): Unit = ^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(instance: AxiosInstance, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("axios-curlirize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* result */ Result, /* error */ js.Error, Unit]
  
  trait Result extends StObject {
    
    var command: String
  }
  object Result {
    
    inline def apply(command: String): Result = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
}
