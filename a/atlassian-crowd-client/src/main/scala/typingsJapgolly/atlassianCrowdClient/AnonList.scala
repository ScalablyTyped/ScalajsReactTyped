package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonList extends js.Object {
  var password: AnonReset
  var username: AnonRequest
  def list(username: String): js.Promise[^]
  def remove(username: String, attributename: String): js.Promise[Unit]
  def set(username: String, attributes: ^): js.Promise[^]
}

object AnonList {
  @scala.inline
  def apply(
    list: String => CallbackTo[js.Promise[^]],
    password: AnonReset,
    remove: (String, String) => CallbackTo[js.Promise[Unit]],
    set: (String, ^) => CallbackTo[js.Promise[^]],
    username: AnonRequest
  ): AnonList = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.atlassianCrowdClient.attributesMod.^) => set(t0, t1).runNow()))
    __obj.asInstanceOf[AnonList]
  }
}

