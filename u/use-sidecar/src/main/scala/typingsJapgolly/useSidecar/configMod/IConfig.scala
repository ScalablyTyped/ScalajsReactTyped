package typingsJapgolly.useSidecar.configMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  def onError(e: js.Error): Unit
}

object IConfig {
  @scala.inline
  def apply(onError: js.Error => Callback): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.asInstanceOf[IConfig]
  }
}

