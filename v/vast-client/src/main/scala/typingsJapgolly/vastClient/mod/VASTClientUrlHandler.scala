package typingsJapgolly.vastClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vastClient.AnonTimeout
import typingsJapgolly.vastClient.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: AnonTimeout, cb: FnCall): Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, AnonTimeout, FnCall) => Callback): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.vastClient.AnonTimeout, t2: typingsJapgolly.vastClient.FnCall) => get(t0, t1, t2).runNow()))
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

