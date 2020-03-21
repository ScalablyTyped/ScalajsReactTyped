package typingsJapgolly.sixRuntime.Six_.plugins.uac

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sixRuntime.Six_.next
import typingsJapgolly.sixRuntime.Six_.plugins.whiteList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uacConf extends js.Object {
  var client_id: String
  var client_secret: String
  var enableMock: Boolean
  var skipOffline: Boolean
  var whiteList: String | js.RegExp | js.Array[String] | typingsJapgolly.sixRuntime.Six_.plugins.whiteList
  def failHook(err: js.Error, ctx: js.Object, next: next): js.Any
  def getPath(ctx: js.Object): String
}

object uacConf {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    enableMock: Boolean,
    failHook: (js.Error, js.Object, next) => CallbackTo[js.Any],
    getPath: js.Object => CallbackTo[String],
    skipOffline: Boolean,
    whiteList: String | js.RegExp | js.Array[String] | whiteList
  ): uacConf = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.updateDynamic("failHook")(js.Any.fromFunction3((t0: js.Error, t1: js.Object, t2: typingsJapgolly.sixRuntime.Six_.next) => failHook(t0, t1, t2).runNow()))
    __obj.updateDynamic("getPath")(js.Any.fromFunction1((t0: js.Object) => getPath(t0).runNow()))
    __obj.asInstanceOf[uacConf]
  }
}

