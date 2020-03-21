package typingsJapgolly.nodeZendesk.mod.Users.Fields

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def create(field: js.Any, cb: ZendeskCallback[_, _]): js.Any
  def delete(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def list(cb: ZendeskCallback[_, _]): js.Any
  def show(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def update(fieldId: ZendeskID, field: js.Any, cb: ZendeskCallback[_, _]): js.Any
}

object Methods {
  @scala.inline
  def apply(
    create: (js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    delete: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    list: ZendeskCallback[js.Any, js.Any] => CallbackTo[js.Any],
    show: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    update: (ZendeskID, js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => create(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => delete(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => list(t0).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => show(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: js.Any, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

