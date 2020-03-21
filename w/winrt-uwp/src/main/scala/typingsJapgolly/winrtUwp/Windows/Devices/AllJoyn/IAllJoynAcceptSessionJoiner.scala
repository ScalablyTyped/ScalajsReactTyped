package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to accept requests from peers to join a session. */
trait IAllJoynAcceptSessionJoiner extends js.Object {
  /** Accept an incoming request to join the session. */
  def accept(): Unit
}

object IAllJoynAcceptSessionJoiner {
  @scala.inline
  def apply(accept: Callback): IAllJoynAcceptSessionJoiner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.asInstanceOf[IAllJoynAcceptSessionJoiner]
  }
}

