package typingsJapgolly.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsNotifySpectrumUseRequest extends js.Object {
  /** Device descriptor information is required in the spectrum-use notification message. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /**
    * The geolocation of the master device (the device that is sending the spectrum-use notification) to the database is required in the spectrum-use
    * notification message.
    */
  var location: js.UndefOr[GeoLocation] = js.undefined
  /**
    * A spectrum list is required in the spectrum-use notification. The list specifies the spectrum that the device expects to use, which includes frequency
    * ranges and maximum power levels. The list may be empty if the device decides not to use any of spectrum. For consistency, the psdBandwidthHz value
    * should match that from one of the spectrum elements in the corresponding available spectrum response previously sent to the device by the database.
    * Note that maximum power levels in the spectrum element must be expressed as power spectral density over the specified psdBandwidthHz value. The actual
    * bandwidth to be used (as computed from the start and stop frequencies) may be different from the psdBandwidthHz value. As an example, when regulatory
    * rules express maximum power spectral density in terms of maximum power over any 100 kHz band, then the psdBandwidthHz value should be set to 100 kHz,
    * even though the actual bandwidth used can be 20 kHz.
    */
  var spectra: js.UndefOr[js.Array[SpectrumMessage]] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PawsNotifySpectrumUseRequest {
  @scala.inline
  def apply(
    deviceDesc: DeviceDescriptor = null,
    location: GeoLocation = null,
    spectra: js.Array[SpectrumMessage] = null,
    `type`: String = null,
    version: String = null
  ): PawsNotifySpectrumUseRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (spectra != null) __obj.updateDynamic("spectra")(spectra.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PawsNotifySpectrumUseRequest]
  }
}

