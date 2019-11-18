package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSider extends js.Object {
  def addSider(id: String): Unit
  def removeSider(id: String): Unit
}

object Anon_AddSider {
  @scala.inline
  def apply(addSider: String => Callback, removeSider: String => Callback): Anon_AddSider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSider")(js.Any.fromFunction1((t0: java.lang.String) => addSider(t0).runNow()))
    __obj.updateDynamic("removeSider")(js.Any.fromFunction1((t0: java.lang.String) => removeSider(t0).runNow()))
    __obj.asInstanceOf[Anon_AddSider]
  }
}

