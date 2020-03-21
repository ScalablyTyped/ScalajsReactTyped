package typingsJapgolly.winrt.Windows.Networking

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEndpointPairFactory extends js.Object {
  def createEndpointPair(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair
}

object IEndpointPairFactory {
  @scala.inline
  def apply(createEndpointPair: (HostName, String, HostName, String) => CallbackTo[EndpointPair]): IEndpointPairFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createEndpointPair")(js.Any.fromFunction4((t0: typingsJapgolly.winrt.Windows.Networking.HostName, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.Networking.HostName, t3: java.lang.String) => createEndpointPair(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IEndpointPairFactory]
  }
}

