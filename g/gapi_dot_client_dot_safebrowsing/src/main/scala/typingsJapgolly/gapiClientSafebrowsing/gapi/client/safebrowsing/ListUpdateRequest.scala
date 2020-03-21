package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUpdateRequest extends js.Object {
  /** The constraints associated with this request. */
  var constraints: js.UndefOr[Constraints] = js.undefined
  /** The type of platform at risk by entries present in the list. */
  var platformType: js.UndefOr[String] = js.undefined
  /**
    * The current state of the client for the requested list (the encrypted
    * client state that was received from the last successful list update).
    */
  var state: js.UndefOr[String] = js.undefined
  /** The types of entries present in the list. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  /** The type of threat posed by entries present in the list. */
  var threatType: js.UndefOr[String] = js.undefined
}

object ListUpdateRequest {
  @scala.inline
  def apply(
    constraints: Constraints = null,
    platformType: String = null,
    state: String = null,
    threatEntryType: String = null,
    threatType: String = null
  ): ListUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUpdateRequest]
  }
}

