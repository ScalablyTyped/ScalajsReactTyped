package typingsJapgolly.sixRuntime.Six_.plugins.upm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sixRuntime.Six_.next
import typingsJapgolly.sixRuntime.Six_.plugins.whiteList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait upmConf extends js.Object {
  var clientId: String
  var clientSecret: String
  var domain: String
  var enableMock: Boolean
  var path: String
  var skipOffline: Boolean
  var whiteList: String | js.RegExp | js.Array[String] | typingsJapgolly.sixRuntime.Six_.plugins.whiteList
  def failHook(err: js.Error, ctx: js.Object, next: next): js.Any
  def getPath(ctx: js.Object): String
}

object upmConf {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    domain: String,
    enableMock: Boolean,
    failHook: (js.Error, js.Object, next) => CallbackTo[js.Any],
    getPath: js.Object => CallbackTo[String],
    path: String,
    skipOffline: Boolean,
    whiteList: String | js.RegExp | js.Array[String] | whiteList
  ): upmConf = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.updateDynamic("failHook")(js.Any.fromFunction3((t0: js.Error, t1: js.Object, t2: typingsJapgolly.sixRuntime.Six_.next) => failHook(t0, t1, t2).runNow()))
    __obj.updateDynamic("getPath")(js.Any.fromFunction1((t0: js.Object) => getPath(t0).runNow()))
    __obj.asInstanceOf[upmConf]
  }
}

