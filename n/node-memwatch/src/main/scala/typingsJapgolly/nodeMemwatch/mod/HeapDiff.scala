package typingsJapgolly.nodeMemwatch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compare the state of your heap between two points in time, telling you what has been allocated, and what has been released.
  */
trait HeapDiff extends js.Object {
  /**
    * Compute the diff.
    */
  def end(): HeapDiffInformation
}

object HeapDiff {
  @scala.inline
  def apply(end: CallbackTo[HeapDiffInformation]): HeapDiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.asInstanceOf[HeapDiff]
  }
}

