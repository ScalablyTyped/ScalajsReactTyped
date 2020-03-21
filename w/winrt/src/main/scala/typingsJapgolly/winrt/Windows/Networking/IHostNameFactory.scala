package typingsJapgolly.winrt.Windows.Networking

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostNameFactory extends js.Object {
  def createHostName(hostName: String): HostName
}

object IHostNameFactory {
  @scala.inline
  def apply(createHostName: String => CallbackTo[HostName]): IHostNameFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHostName")(js.Any.fromFunction1((t0: java.lang.String) => createHostName(t0).runNow()))
    __obj.asInstanceOf[IHostNameFactory]
  }
}

