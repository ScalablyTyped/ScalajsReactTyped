package typingsJapgolly.openfin.mod.fin

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinFrameStatic extends js.Object {
  def getCurrent(): OpenFinFrame
  def wrap(uuid: String, name: String): OpenFinFrame
}

object OpenFinFrameStatic {
  @scala.inline
  def apply(getCurrent: CallbackTo[OpenFinFrame], wrap: (String, String) => CallbackTo[OpenFinFrame]): OpenFinFrameStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrent")(getCurrent.toJsFn)
    __obj.updateDynamic("wrap")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => wrap(t0, t1).runNow()))
    __obj.asInstanceOf[OpenFinFrameStatic]
  }
}

