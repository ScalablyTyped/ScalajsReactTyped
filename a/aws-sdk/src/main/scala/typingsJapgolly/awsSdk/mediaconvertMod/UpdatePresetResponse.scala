package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePresetResponse extends js.Object {
  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  var Preset: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.Preset] = js.native
}

object UpdatePresetResponse {
  @scala.inline
  def apply(Preset: Preset = null): UpdatePresetResponse = {
    val __obj = js.Dynamic.literal()
    if (Preset != null) __obj.updateDynamic("Preset")(Preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePresetResponse]
  }
}

