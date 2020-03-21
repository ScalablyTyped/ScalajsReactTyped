package typingsJapgolly.bugsnagJs.clientMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionDelegate extends js.Object {
  def startSession(client: Client): Client
}

object ISessionDelegate {
  @scala.inline
  def apply(startSession: Client => CallbackTo[Client]): ISessionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startSession")(js.Any.fromFunction1((t0: typingsJapgolly.bugsnagJs.clientMod.Client) => startSession(t0).runNow()))
    __obj.asInstanceOf[ISessionDelegate]
  }
}

