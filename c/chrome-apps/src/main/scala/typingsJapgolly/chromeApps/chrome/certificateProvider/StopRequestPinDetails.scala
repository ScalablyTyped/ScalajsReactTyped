package typingsJapgolly.chromeApps.chrome.certificateProvider

import typingsJapgolly.chromeApps.AnonINVALIDPIN
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRequestPinDetails extends js.Object {
  /**
    * The error template. If present it is displayed to user. Intended to
    * contain the reason for stopping the flow if it was caused by an error,
    * e.g. MAX_ATTEMPTS_EXCEEDED.
    * @see PinRequestErrorType
    */
  var errorType: js.UndefOr[
    ToStringLiteral[
      AnonINVALIDPIN, 
      String, 
      Exclude[String, INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR]
    ]
  ] = js.undefined
  /**
    * The ID given by Chrome in SignRequest
    */
  var signRequestId: Double
}

object StopRequestPinDetails {
  @scala.inline
  def apply(
    signRequestId: Double,
    errorType: ToStringLiteral[
      AnonINVALIDPIN, 
      String, 
      Exclude[String, INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR]
    ] = null
  ): StopRequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequestPinDetails]
  }
}

