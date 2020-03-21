package typingsJapgolly.minecraftScriptingTypesClient

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClient extends js.Object {
  def log(message: String): Unit
  def registerSystem[TSystem /* <: IClientSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem
}

object IClient {
  @scala.inline
  def apply(log: String => Callback, registerSystem: (Double, Double) => CallbackTo[js.Any]): IClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("registerSystem")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => registerSystem(t0, t1).runNow()))
    __obj.asInstanceOf[IClient]
  }
}

