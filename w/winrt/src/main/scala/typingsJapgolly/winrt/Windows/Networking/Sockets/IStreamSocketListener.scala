package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import typingsJapgolly.winrt.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamSocketListener
  extends StObject
     with IClosable {
  
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction
  
  def bindServiceNameAsync(localServiceName: String): IAsyncAction
  
  var control: StreamSocketListenerControl
  
  var information: StreamSocketListenerInformation
  
  var onconnectionreceived: Any
}
object IStreamSocketListener {
  
  inline def apply(
    bindEndpointAsync: (HostName, String) => IAsyncAction,
    bindServiceNameAsync: String => IAsyncAction,
    close: Callback,
    control: StreamSocketListenerControl,
    information: StreamSocketListenerInformation,
    onconnectionreceived: Any
  ): IStreamSocketListener = {
    val __obj = js.Dynamic.literal(bindEndpointAsync = js.Any.fromFunction2(bindEndpointAsync), bindServiceNameAsync = js.Any.fromFunction1(bindServiceNameAsync), close = close.toJsFn, control = control.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], onconnectionreceived = onconnectionreceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListener]
  }
  
  extension [Self <: IStreamSocketListener](x: Self) {
    
    inline def setBindEndpointAsync(value: (HostName, String) => IAsyncAction): Self = StObject.set(x, "bindEndpointAsync", js.Any.fromFunction2(value))
    
    inline def setBindServiceNameAsync(value: String => IAsyncAction): Self = StObject.set(x, "bindServiceNameAsync", js.Any.fromFunction1(value))
    
    inline def setControl(value: StreamSocketListenerControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: StreamSocketListenerInformation): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setOnconnectionreceived(value: Any): Self = StObject.set(x, "onconnectionreceived", value.asInstanceOf[js.Any])
  }
}
