package typingsJapgolly.pulumiAws

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCore extends js.Object {
  def HTTP_DATA(): Unit = js.native
  def SEND(): Unit = js.native
  def VALIDATE_CREDENTIALS(): Unit = js.native
  def VALIDATE_PARAMETERS(): Unit = js.native
  def VALIDATE_REGION(): Unit = js.native
  def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
}

object TypeofCore {
  @scala.inline
  def apply(
    HTTP_DATA: Callback,
    SEND: Callback,
    VALIDATE_CREDENTIALS: Callback,
    VALIDATE_PARAMETERS: Callback,
    VALIDATE_REGION: Callback,
    removeListener: (String, js.Function) => Callback
  ): TypeofCore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HTTP_DATA")(HTTP_DATA.toJsFn)
    __obj.updateDynamic("SEND")(SEND.toJsFn)
    __obj.updateDynamic("VALIDATE_CREDENTIALS")(VALIDATE_CREDENTIALS.toJsFn)
    __obj.updateDynamic("VALIDATE_PARAMETERS")(VALIDATE_PARAMETERS.toJsFn)
    __obj.updateDynamic("VALIDATE_REGION")(VALIDATE_REGION.toJsFn)
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofCore]
  }
}

