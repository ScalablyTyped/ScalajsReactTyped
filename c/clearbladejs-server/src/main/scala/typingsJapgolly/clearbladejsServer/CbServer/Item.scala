package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Object
  def destroy(): Unit
  def refresh(): Unit
  def save(): Unit
}

object Item {
  @scala.inline
  def apply(data: js.Object, destroy: Callback, refresh: Callback, save: Callback): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.asInstanceOf[Item]
  }
}

