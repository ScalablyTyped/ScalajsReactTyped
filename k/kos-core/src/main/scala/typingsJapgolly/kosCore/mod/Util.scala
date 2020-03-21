package typingsJapgolly.kosCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kosCore.AnonNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def getActionType(action: String): AnonNamespace
  def getParam(): js.Any
}

object Util {
  @scala.inline
  def apply(getActionType: String => CallbackTo[AnonNamespace], getParam: CallbackTo[js.Any]): Util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActionType")(js.Any.fromFunction1((t0: java.lang.String) => getActionType(t0).runNow()))
    __obj.updateDynamic("getParam")(getParam.toJsFn)
    __obj.asInstanceOf[Util]
  }
}

