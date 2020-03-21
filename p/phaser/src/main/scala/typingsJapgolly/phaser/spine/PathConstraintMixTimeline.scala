package typingsJapgolly.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.PathConstraintMixTimeline")
@js.native
class PathConstraintMixTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var frames: ArrayLike[Double] = js.native
  var pathConstraintIndex: Double = js.native
  def setFrame(frameIndex: Double, time: Double, rotateMix: Double, translateMix: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.PathConstraintMixTimeline")
@js.native
object PathConstraintMixTimeline extends js.Object {
  var ENTRIES: Double = js.native
  var PREV_ROTATE: Double = js.native
  var PREV_TIME: Double = js.native
  var PREV_TRANSLATE: Double = js.native
  var ROTATE: Double = js.native
  var TRANSLATE: Double = js.native
}

