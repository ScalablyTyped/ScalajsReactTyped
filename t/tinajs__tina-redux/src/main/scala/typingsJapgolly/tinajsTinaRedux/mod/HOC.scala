package typingsJapgolly.tinajsTinaRedux.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOC extends js.Object {
  var methods: js.Object
  def onLoad(): Unit
  def onUnload(): Unit
}

object HOC {
  @scala.inline
  def apply(methods: js.Object, onLoad: Callback, onUnload: Callback): HOC = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.updateDynamic("onLoad")(onLoad.toJsFn)
    __obj.updateDynamic("onUnload")(onUnload.toJsFn)
    __obj.asInstanceOf[HOC]
  }
}

