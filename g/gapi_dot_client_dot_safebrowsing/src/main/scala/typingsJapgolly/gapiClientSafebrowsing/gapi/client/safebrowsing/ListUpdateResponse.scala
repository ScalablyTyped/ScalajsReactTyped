package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUpdateResponse extends js.Object {
  /**
    * A set of entries to add to a local threat type's list. Repeated to allow
    * for a combination of compressed and raw data to be sent in a single
    * response.
    */
  var additions: js.UndefOr[js.Array[ThreatEntrySet]] = js.undefined
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list
    * of all hashes present in the database after applying the provided update.
    * If the client state doesn't match the expected state, the client must
    * disregard this update and retry later.
    */
  var checksum: js.UndefOr[Checksum] = js.undefined
  /** The new client state, in encrypted format. Opaque to clients. */
  var newClientState: js.UndefOr[String] = js.undefined
  /** The platform type for which data is returned. */
  var platformType: js.UndefOr[String] = js.undefined
  /**
    * A set of entries to remove from a local threat type's list. In practice,
    * this field is empty or contains exactly one ThreatEntrySet.
    */
  var removals: js.UndefOr[js.Array[ThreatEntrySet]] = js.undefined
  /**
    * The type of response. This may indicate that an action is required by the
    * client when the response is received.
    */
  var responseType: js.UndefOr[String] = js.undefined
  /** The format of the threats. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  /** The threat type for which data is returned. */
  var threatType: js.UndefOr[String] = js.undefined
}

object ListUpdateResponse {
  @scala.inline
  def apply(
    additions: js.Array[ThreatEntrySet] = null,
    checksum: Checksum = null,
    newClientState: String = null,
    platformType: String = null,
    removals: js.Array[ThreatEntrySet] = null,
    responseType: String = null,
    threatEntryType: String = null,
    threatType: String = null
  ): ListUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (additions != null) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (newClientState != null) __obj.updateDynamic("newClientState")(newClientState.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (removals != null) __obj.updateDynamic("removals")(removals.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUpdateResponse]
  }
}

