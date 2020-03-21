package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TtmlDestinationSettings extends js.Object {
  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
    */
  var StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.native
}

object TtmlDestinationSettings {
  @scala.inline
  def apply(StylePassthrough: TtmlStylePassthrough = null): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (StylePassthrough != null) __obj.updateDynamic("StylePassthrough")(StylePassthrough.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
}

