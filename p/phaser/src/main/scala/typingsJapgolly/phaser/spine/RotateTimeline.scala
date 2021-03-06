package typingsJapgolly.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.RotateTimeline")
@js.native
class RotateTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var boneIndex: Double = js.native
  var frames: ArrayLike[Double] = js.native
  def setFrame(frameIndex: Double, time: Double, degrees: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.RotateTimeline")
@js.native
object RotateTimeline extends js.Object {
  var ENTRIES: Double = js.native
  var PREV_ROTATION: Double = js.native
  var PREV_TIME: Double = js.native
  var ROTATION: Double = js.native
}

