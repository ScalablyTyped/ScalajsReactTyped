package typingsJapgolly.webpackDevServer.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpackDevServer.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListeningApp extends js.Object {
  def address(): AnonPort
}

object ListeningApp {
  @scala.inline
  def apply(address: CallbackTo[AnonPort]): ListeningApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address.toJsFn)
    __obj.asInstanceOf[ListeningApp]
  }
}

