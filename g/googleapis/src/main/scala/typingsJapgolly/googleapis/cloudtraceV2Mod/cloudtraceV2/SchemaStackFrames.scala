package typingsJapgolly.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of stack frames, which can be truncated.
  */
@js.native
trait SchemaStackFrames extends js.Object {
  /**
    * The number of stack frames that were dropped because there were too many
    * stack frames. If this value is 0, then no stack frames were dropped.
    */
  var droppedFramesCount: js.UndefOr[Double] = js.native
  /**
    * Stack frames in this call stack.
    */
  var frame: js.UndefOr[js.Array[SchemaStackFrame]] = js.native
}

object SchemaStackFrames {
  @scala.inline
  def apply(droppedFramesCount: Int | Double = null, frame: js.Array[SchemaStackFrame] = null): SchemaStackFrames = {
    val __obj = js.Dynamic.literal()
    if (droppedFramesCount != null) __obj.updateDynamic("droppedFramesCount")(droppedFramesCount.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStackFrames]
  }
}

