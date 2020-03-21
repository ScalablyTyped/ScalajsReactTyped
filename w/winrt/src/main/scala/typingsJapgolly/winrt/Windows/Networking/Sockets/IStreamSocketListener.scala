package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import typingsJapgolly.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListener extends IClosable {
  var control: StreamSocketListenerControl
  var information: StreamSocketListenerInformation
  var onconnectionreceived: js.Any
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction
  def bindServiceNameAsync(localServiceName: String): IAsyncAction
}

object IStreamSocketListener {
  @scala.inline
  def apply(
    bindEndpointAsync: (HostName, String) => CallbackTo[IAsyncAction],
    bindServiceNameAsync: String => CallbackTo[IAsyncAction],
    close: Callback,
    control: StreamSocketListenerControl,
    information: StreamSocketListenerInformation,
    onconnectionreceived: js.Any
  ): IStreamSocketListener = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], onconnectionreceived = onconnectionreceived.asInstanceOf[js.Any])
    __obj.updateDynamic("bindEndpointAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Networking.HostName, t1: java.lang.String) => bindEndpointAsync(t0, t1).runNow()))
    __obj.updateDynamic("bindServiceNameAsync")(js.Any.fromFunction1((t0: java.lang.String) => bindServiceNameAsync(t0).runNow()))
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[IStreamSocketListener]
  }
}

