package typingsJapgolly.angularSignalrHub

import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.jquery.JQueryPromise
import typingsJapgolly.signalr.SignalR.Connection
import typingsJapgolly.signalr.SignalR.Hub.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ngSignalr {
    
    @JSGlobal("ngSignalr.Hub")
    @js.native
    open class Hub ()
      extends StObject
         with typingsJapgolly.angularSignalrHub.ngSignalr.Hub {
      
      /* CompleteClass */
      override def connect(): JQueryPromise[Any] = js.native
      
      /* CompleteClass */
      var connection: Connection = js.native
      
      /* CompleteClass */
      override def disconnect(): Unit = js.native
      
      /* CompleteClass */
      var hubName: String = js.native
      
      /* CompleteClass */
      override def invoke(method: String, args: Any*): JQueryDeferred[Any] = js.native
      
      /* CompleteClass */
      override def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
      
      /* CompleteClass */
      var proxy: Proxy = js.native
    }
  }
}
