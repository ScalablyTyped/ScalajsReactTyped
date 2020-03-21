package typingsJapgolly.cordova

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// cordova/urlutil module
trait UrlUtil extends js.Object {
  def makeAbsolute(url: String): String
}

object UrlUtil {
  @scala.inline
  def apply(makeAbsolute: String => CallbackTo[String]): UrlUtil = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("makeAbsolute")(js.Any.fromFunction1((t0: java.lang.String) => makeAbsolute(t0).runNow()))
    __obj.asInstanceOf[UrlUtil]
  }
}

