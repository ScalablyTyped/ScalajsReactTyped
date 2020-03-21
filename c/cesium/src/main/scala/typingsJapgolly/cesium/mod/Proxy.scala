package typingsJapgolly.cesium.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  def getURL(resource: String): String
}

object Proxy {
  @scala.inline
  def apply(getURL: String => CallbackTo[String]): Proxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getURL")(js.Any.fromFunction1((t0: java.lang.String) => getURL(t0).runNow()))
    __obj.asInstanceOf[Proxy]
  }
}

