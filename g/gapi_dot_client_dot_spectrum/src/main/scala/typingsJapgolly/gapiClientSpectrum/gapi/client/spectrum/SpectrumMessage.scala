package typingsJapgolly.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpectrumMessage extends js.Object {
  /**
    * The bandwidth (in Hertz) for which permissible power levels are specified. For example, FCC regulation would require only one spectrum specification at
    * 6MHz bandwidth, but Ofcom regulation would require two specifications, at 0.1MHz and 8MHz. This parameter may be empty if there is no available
    * spectrum. It will be present otherwise.
    */
  var bandwidth: js.UndefOr[Double] = js.undefined
  /** The list of frequency ranges and permissible power levels. The list may be empty if there is no available spectrum, otherwise it will be present. */
  var frequencyRanges: js.UndefOr[js.Array[FrequencyRange]] = js.undefined
}

object SpectrumMessage {
  @scala.inline
  def apply(bandwidth: Int | Double = null, frequencyRanges: js.Array[FrequencyRange] = null): SpectrumMessage = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (frequencyRanges != null) __obj.updateDynamic("frequencyRanges")(frequencyRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpectrumMessage]
  }
}

