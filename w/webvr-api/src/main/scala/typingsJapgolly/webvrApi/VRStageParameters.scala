package typingsJapgolly.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRStageParameters extends js.Object {
  var sittingToStandingTransform: js.UndefOr[scala.scalajs.js.typedarray.Float32Array] = js.undefined
  var sizeX: js.UndefOr[Double] = js.undefined
  var sizeY: js.UndefOr[Double] = js.undefined
}

object VRStageParameters {
  @scala.inline
  def apply(
    sittingToStandingTransform: scala.scalajs.js.typedarray.Float32Array = null,
    sizeX: Int | Double = null,
    sizeY: Int | Double = null
  ): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    if (sittingToStandingTransform != null) __obj.updateDynamic("sittingToStandingTransform")(sittingToStandingTransform.asInstanceOf[js.Any])
    if (sizeX != null) __obj.updateDynamic("sizeX")(sizeX.asInstanceOf[js.Any])
    if (sizeY != null) __obj.updateDynamic("sizeY")(sizeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRStageParameters]
  }
}

