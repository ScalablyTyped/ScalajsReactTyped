package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionImageInsertionFramerate extends js.Object {
  /**
    * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 1.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max17895697] = js.native
  /**
    * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 24.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483640] = js.native
}

object MotionImageInsertionFramerate {
  @scala.inline
  def apply(FramerateDenominator: Int | Double = null, FramerateNumerator: Int | Double = null): MotionImageInsertionFramerate = {
    val __obj = js.Dynamic.literal()
    if (FramerateDenominator != null) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.asInstanceOf[js.Any])
    if (FramerateNumerator != null) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionImageInsertionFramerate]
  }
}

