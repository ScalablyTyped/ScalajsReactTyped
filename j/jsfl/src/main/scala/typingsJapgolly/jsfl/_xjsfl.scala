package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _xjsfl extends js.Object {
  var uri: String
  def init(_this: js.Any): Unit
}

object _xjsfl {
  @scala.inline
  def apply(init: js.Any => Callback, uri: String): _xjsfl = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.asInstanceOf[_xjsfl]
  }
}

