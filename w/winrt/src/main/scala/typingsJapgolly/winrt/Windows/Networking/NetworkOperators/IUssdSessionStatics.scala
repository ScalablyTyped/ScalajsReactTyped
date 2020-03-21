package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSessionStatics extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): UssdSession
  def createFromNetworkInterfaceId(networkInterfaceId: String): UssdSession
}

object IUssdSessionStatics {
  @scala.inline
  def apply(
    createFromNetworkAccountId: String => CallbackTo[UssdSession],
    createFromNetworkInterfaceId: String => CallbackTo[UssdSession]
  ): IUssdSessionStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFromNetworkAccountId")(js.Any.fromFunction1((t0: java.lang.String) => createFromNetworkAccountId(t0).runNow()))
    __obj.updateDynamic("createFromNetworkInterfaceId")(js.Any.fromFunction1((t0: java.lang.String) => createFromNetworkInterfaceId(t0).runNow()))
    __obj.asInstanceOf[IUssdSessionStatics]
  }
}

