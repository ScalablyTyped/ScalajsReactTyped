package typingsJapgolly.setLink.mod.expressAugmentingMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  def setLink(link: String, rel: String): Unit
}

object Response {
  @scala.inline
  def apply(setLink: (String, String) => Callback): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setLink")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setLink(t0, t1).runNow()))
    __obj.asInstanceOf[Response]
  }
}

