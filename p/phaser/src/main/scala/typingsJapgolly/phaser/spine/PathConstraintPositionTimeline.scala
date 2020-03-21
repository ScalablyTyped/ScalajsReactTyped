package typingsJapgolly.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.PathConstraintPositionTimeline")
@js.native
class PathConstraintPositionTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var frames: ArrayLike[Double] = js.native
  var pathConstraintIndex: Double = js.native
  def setFrame(frameIndex: Double, time: Double, value: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.PathConstraintPositionTimeline")
@js.native
object PathConstraintPositionTimeline extends js.Object {
  var ENTRIES: Double = js.native
  var PREV_TIME: Double = js.native
  var PREV_VALUE: Double = js.native
  var VALUE: Double = js.native
}

