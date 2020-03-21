package typingsJapgolly.resourceLoader.mod.MiniSignal

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniSignalBinding extends js.Object {
  def detach(): Boolean
}

object MiniSignalBinding {
  @scala.inline
  def apply(detach: CallbackTo[Boolean]): MiniSignalBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.asInstanceOf[MiniSignalBinding]
  }
}

