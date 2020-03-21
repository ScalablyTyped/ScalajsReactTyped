package typingsJapgolly.nodeZendesk.mod.Attachments

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.nodeZendesk.AnonFilename
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def request(httpMethod: String, fields: js.Any, config: js.Any, cb: ZendeskCallback[_, _]): js.Any
  def upload(file: PathLike, fileOptions: AnonFilename, cb: ZendeskCallback[_, _]): Unit
}

object Methods {
  @scala.inline
  def apply(
    request: (String, js.Any, js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    upload: (PathLike, AnonFilename, ZendeskCallback[js.Any, js.Any]) => Callback
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: js.Any, t3: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => request(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction3((t0: typingsJapgolly.node.fsMod.PathLike, t1: typingsJapgolly.nodeZendesk.AnonFilename, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => upload(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

