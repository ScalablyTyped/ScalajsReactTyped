package typingsJapgolly.nodeOsUtils.memMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mem extends js.Object {
  def free(): js.Promise[MemFreeInfo]
  def info(): js.Promise[MemInfo]
  def totalMem(): Double
  def used(): js.Promise[MemUsedInfo]
}

object Mem {
  @scala.inline
  def apply(
    free: CallbackTo[js.Promise[MemFreeInfo]],
    info: CallbackTo[js.Promise[MemInfo]],
    totalMem: CallbackTo[Double],
    used: CallbackTo[js.Promise[MemUsedInfo]]
  ): Mem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("free")(free.toJsFn)
    __obj.updateDynamic("info")(info.toJsFn)
    __obj.updateDynamic("totalMem")(totalMem.toJsFn)
    __obj.updateDynamic("used")(used.toJsFn)
    __obj.asInstanceOf[Mem]
  }
}

