package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  def list(groupname: String): js.Promise[^]
  def remove(groupname: String, attributename: String): js.Promise[Unit]
  def set(groupname: String, attributes: ^): js.Promise[^]
}

object AnonRemove {
  @scala.inline
  def apply(
    list: String => CallbackTo[js.Promise[^]],
    remove: (String, String) => CallbackTo[js.Promise[Unit]],
    set: (String, ^) => CallbackTo[js.Promise[^]]
  ): AnonRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.atlassianCrowdClient.attributesMod.^) => set(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRemove]
  }
}

