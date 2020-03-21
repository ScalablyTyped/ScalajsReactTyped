package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLossBehavior extends js.Object {
  /**
    * Documentation update needed
    */
  var BlackFrameMsec: js.UndefOr[integerMin0Max1000000] = js.native
  /**
    * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing the values of RGB.
    */
  var InputLossImageColor: js.UndefOr[stringMin6Max6] = js.native
  /**
    * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
    */
  var InputLossImageSlate: js.UndefOr[InputLocation] = js.native
  /**
    * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
    */
  var InputLossImageType: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.InputLossImageType] = js.native
  /**
    * Documentation update needed
    */
  var RepeatFrameMsec: js.UndefOr[integerMin0Max1000000] = js.native
}

object InputLossBehavior {
  @scala.inline
  def apply(
    BlackFrameMsec: Int | Double = null,
    InputLossImageColor: stringMin6Max6 = null,
    InputLossImageSlate: InputLocation = null,
    InputLossImageType: InputLossImageType = null,
    RepeatFrameMsec: Int | Double = null
  ): InputLossBehavior = {
    val __obj = js.Dynamic.literal()
    if (BlackFrameMsec != null) __obj.updateDynamic("BlackFrameMsec")(BlackFrameMsec.asInstanceOf[js.Any])
    if (InputLossImageColor != null) __obj.updateDynamic("InputLossImageColor")(InputLossImageColor.asInstanceOf[js.Any])
    if (InputLossImageSlate != null) __obj.updateDynamic("InputLossImageSlate")(InputLossImageSlate.asInstanceOf[js.Any])
    if (InputLossImageType != null) __obj.updateDynamic("InputLossImageType")(InputLossImageType.asInstanceOf[js.Any])
    if (RepeatFrameMsec != null) __obj.updateDynamic("RepeatFrameMsec")(RepeatFrameMsec.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLossBehavior]
  }
}

