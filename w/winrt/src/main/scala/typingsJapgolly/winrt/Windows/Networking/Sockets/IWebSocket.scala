package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebSocket
  extends StObject
     with IClosable {
  
  def close(code: Double, reason: String): Unit = js.native
  
  def connectAsync(uri: Uri): IAsyncAction = js.native
  
  var onclosed: Any = js.native
  
  var outputStream: IOutputStream = js.native
  
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}
