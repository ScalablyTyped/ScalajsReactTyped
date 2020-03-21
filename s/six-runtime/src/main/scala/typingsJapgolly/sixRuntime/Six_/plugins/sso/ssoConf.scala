package typingsJapgolly.sixRuntime.Six_.plugins.sso

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sixRuntime.Six_.plugins.whiteList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoConf extends js.Object {
  var enableCache: Boolean
  var hasLoginCacheMaxAge: Double
  var ssoConf: ssoClientConf
  var whiteList: String | js.RegExp | js.Array[String] | typingsJapgolly.sixRuntime.Six_.plugins.whiteList
  def adapter(user: js.Object): js.Object
}

object ssoConf {
  @scala.inline
  def apply(
    adapter: js.Object => CallbackTo[js.Object],
    enableCache: Boolean,
    hasLoginCacheMaxAge: Double,
    ssoConf: ssoClientConf,
    whiteList: String | js.RegExp | js.Array[String] | whiteList
  ): ssoConf = {
    val __obj = js.Dynamic.literal(enableCache = enableCache.asInstanceOf[js.Any], hasLoginCacheMaxAge = hasLoginCacheMaxAge.asInstanceOf[js.Any], ssoConf = ssoConf.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.updateDynamic("adapter")(js.Any.fromFunction1((t0: js.Object) => adapter(t0).runNow()))
    __obj.asInstanceOf[ssoConf]
  }
}

