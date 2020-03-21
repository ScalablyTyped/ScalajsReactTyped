package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionChannel extends js.Object {
  def onSession(session: Session): js.Any
  def sendSession(session: Session): Unit
}

object ISessionChannel {
  @scala.inline
  def apply(onSession: Session => CallbackTo[js.Any], sendSession: Session => Callback): ISessionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSession")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Session) => onSession(t0).runNow()))
    __obj.updateDynamic("sendSession")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Session) => sendSession(t0).runNow()))
    __obj.asInstanceOf[ISessionChannel]
  }
}

