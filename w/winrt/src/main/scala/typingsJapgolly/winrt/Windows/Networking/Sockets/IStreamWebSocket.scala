package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamWebSocket
  extends StObject
     with IWebSocket {
  
  var control: StreamWebSocketControl = js.native
  
  var information: StreamWebSocketInformation = js.native
  
  var inputStream: IInputStream = js.native
}
