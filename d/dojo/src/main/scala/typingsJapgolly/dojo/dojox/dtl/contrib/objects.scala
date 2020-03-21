package typingsJapgolly.dojo.dojox.dtl.contrib

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/objects.html
  *
  *
  */
trait objects extends js.Object {
  /**
    *
    * @param value
    * @param arg
    */
  def key(value: js.Any, arg: js.Any): js.Any
}

object objects {
  @scala.inline
  def apply(key: (js.Any, js.Any) => CallbackTo[js.Any]): objects = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => key(t0, t1).runNow()))
    __obj.asInstanceOf[objects]
  }
}

