package typingsJapgolly.ibmMobilefirst.WLAuthorizationManager

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestObject extends js.Object {
  def setRequestHeader(header: String, value: String): Unit
}

object RequestObject {
  @scala.inline
  def apply(setRequestHeader: (String, String) => Callback): RequestObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setRequestHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setRequestHeader(t0, t1).runNow()))
    __obj.asInstanceOf[RequestObject]
  }
}

