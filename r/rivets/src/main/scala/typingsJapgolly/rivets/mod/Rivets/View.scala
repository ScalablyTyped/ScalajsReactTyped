package typingsJapgolly.rivets.mod.Rivets

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  def bind(): Unit
  def build(): Unit
  def unbind(): Unit
}

object View {
  @scala.inline
  def apply(bind: Callback, build: Callback, unbind: Callback): View = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind.toJsFn)
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("unbind")(unbind.toJsFn)
    __obj.asInstanceOf[View]
  }
}

