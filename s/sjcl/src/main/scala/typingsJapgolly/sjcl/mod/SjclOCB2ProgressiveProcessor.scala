package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclOCB2ProgressiveProcessor extends js.Object {
  def process(data: BitArray_): BitArray_
}

object SjclOCB2ProgressiveProcessor {
  @scala.inline
  def apply(process: BitArray_ => CallbackTo[BitArray_]): SjclOCB2ProgressiveProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: typingsJapgolly.sjcl.mod.BitArray_) => process(t0).runNow()))
    __obj.asInstanceOf[SjclOCB2ProgressiveProcessor]
  }
}

