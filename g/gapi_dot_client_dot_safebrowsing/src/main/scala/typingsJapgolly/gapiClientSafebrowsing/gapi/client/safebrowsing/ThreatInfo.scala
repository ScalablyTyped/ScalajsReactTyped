package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatInfo extends js.Object {
  /** The platform types to be checked. */
  var platformTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** The threat entries to be checked. */
  var threatEntries: js.UndefOr[js.Array[ThreatEntry]] = js.undefined
  /** The entry types to be checked. */
  var threatEntryTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** The threat types to be checked. */
  var threatTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ThreatInfo {
  @scala.inline
  def apply(
    platformTypes: js.Array[String] = null,
    threatEntries: js.Array[ThreatEntry] = null,
    threatEntryTypes: js.Array[String] = null,
    threatTypes: js.Array[String] = null
  ): ThreatInfo = {
    val __obj = js.Dynamic.literal()
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    if (threatEntries != null) __obj.updateDynamic("threatEntries")(threatEntries.asInstanceOf[js.Any])
    if (threatEntryTypes != null) __obj.updateDynamic("threatEntryTypes")(threatEntryTypes.asInstanceOf[js.Any])
    if (threatTypes != null) __obj.updateDynamic("threatTypes")(threatTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatInfo]
  }
}

