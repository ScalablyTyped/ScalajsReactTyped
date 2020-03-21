package typingsJapgolly.doubleclickGpt.googletag

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMappingBuilder extends js.Object {
  def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder
  def build(): SizeMappingArray
}

object SizeMappingBuilder {
  @scala.inline
  def apply(
    addSize: (SingleSizeArray, GeneralSize) => CallbackTo[SizeMappingBuilder],
    build: CallbackTo[SizeMappingArray]
  ): SizeMappingBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSize")(js.Any.fromFunction2((t0: typingsJapgolly.doubleclickGpt.googletag.SingleSizeArray, t1: typingsJapgolly.doubleclickGpt.googletag.GeneralSize) => addSize(t0, t1).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.asInstanceOf[SizeMappingBuilder]
  }
}

