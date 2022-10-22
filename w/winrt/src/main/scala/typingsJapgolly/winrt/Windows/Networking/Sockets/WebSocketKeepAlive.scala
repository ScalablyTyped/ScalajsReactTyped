package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTask
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketKeepAlive
  extends StObject
     with IBackgroundTask
object WebSocketKeepAlive {
  
  inline def apply(run: IBackgroundTaskInstance => Callback): WebSocketKeepAlive = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1((t0: IBackgroundTaskInstance) => run(t0).runNow()))
    __obj.asInstanceOf[WebSocketKeepAlive]
  }
}
