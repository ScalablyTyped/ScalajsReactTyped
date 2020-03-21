package typingsJapgolly.gapiClientSpectrum.gapi.client.spectrum

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSpectrum.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsResource extends js.Object {
  /**
    * Requests information about the available spectrum for a device at a location. Requests from a fixed-mode device must include owner information so the
    * device can be registered with the database.
    */
  def getSpectrum(request: AnonAlt): Request_[PawsGetSpectrumResponse]
  /** The Google Spectrum Database does not support batch requests, so this method always yields an UNIMPLEMENTED error. */
  def getSpectrumBatch(request: AnonAlt): Request_[PawsGetSpectrumBatchResponse]
  /** Initializes the connection between a white space device and the database. */
  def init(request: AnonAlt): Request_[PawsInitResponse]
  /**
    * Notifies the database that the device has selected certain frequency ranges for transmission. Only to be invoked when required by the regulator. The
    * Google Spectrum Database does not operate in domains that require notification, so this always yields an UNIMPLEMENTED error.
    */
  def notifySpectrumUse(request: AnonAlt): Request_[PawsNotifySpectrumUseResponse]
  /** The Google Spectrum Database implements registration in the getSpectrum method. As such this always returns an UNIMPLEMENTED error. */
  def register(request: AnonAlt): Request_[PawsRegisterResponse]
  /**
    * Validates a device for white space use in accordance with regulatory rules. The Google Spectrum Database does not support master/slave configurations,
    * so this always yields an UNIMPLEMENTED error.
    */
  def verifyDevice(request: AnonAlt): Request_[PawsVerifyDeviceResponse]
}

object PawsResource {
  @scala.inline
  def apply(
    getSpectrum: AnonAlt => CallbackTo[Request_[PawsGetSpectrumResponse]],
    getSpectrumBatch: AnonAlt => CallbackTo[Request_[PawsGetSpectrumBatchResponse]],
    init: AnonAlt => CallbackTo[Request_[PawsInitResponse]],
    notifySpectrumUse: AnonAlt => CallbackTo[Request_[PawsNotifySpectrumUseResponse]],
    register: AnonAlt => CallbackTo[Request_[PawsRegisterResponse]],
    verifyDevice: AnonAlt => CallbackTo[Request_[PawsVerifyDeviceResponse]]
  ): PawsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSpectrum")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpectrum.AnonAlt) => getSpectrum(t0).runNow()))
    __obj.updateDynamic("getSpectrumBatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpectrum.AnonAlt) => getSpectrumBatch(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpectrum.AnonAlt) => init(t0).runNow()))
    __obj.updateDynamic("notifySpectrumUse")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpectrum.AnonAlt) => notifySpectrumUse(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpectrum.AnonAlt) => register(t0).runNow()))
    __obj.updateDynamic("verifyDevice")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpectrum.AnonAlt) => verifyDevice(t0).runNow()))
    __obj.asInstanceOf[PawsResource]
  }
}

