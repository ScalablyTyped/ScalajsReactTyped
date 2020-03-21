package typingsJapgolly.initPackageJson.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ StringDictionary[js.Any] {
  def get(k: String): js.Any
}

object Config {
  @scala.inline
  def apply(get: String => CallbackTo[js.Any], StringDictionary: /* key */ StringDictionary[js.Any] = null): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Config]
  }
}

