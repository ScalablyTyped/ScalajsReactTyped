package typingsJapgolly.dojo.dojox.drawing.manager

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/_registry.html
  *
  *
  */
trait registry extends js.Object {
  /**
    *
    * @param type
    * @param id
    */
  def getRegistered(`type`: js.Any, id: js.Any): js.Any
  /**
    *
    * @param item
    * @param type
    */
  def register(item: js.Any, `type`: js.Any): Unit
}

object registry {
  @scala.inline
  def apply(getRegistered: (js.Any, js.Any) => CallbackTo[js.Any], register: (js.Any, js.Any) => Callback): registry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRegistered")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getRegistered(t0, t1).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => register(t0, t1).runNow()))
    __obj.asInstanceOf[registry]
  }
}

