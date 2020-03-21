package typingsJapgolly.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsGetSpectrumResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.undefined
  /**
    * The database must return, in its available spectrum response, the device descriptor information it received in the master device's available spectrum
    * request.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsGetSpectrumResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The database may return a constraint on the allowed maximum contiguous bandwidth (in Hertz). A regulatory domain may require the database to return
    * this parameter. When this parameter is present in the response, the device must apply this constraint to its spectrum-selection logic to ensure that no
    * single block of spectrum has bandwidth that exceeds this value.
    */
  var maxContiguousBwHz: js.UndefOr[Double] = js.undefined
  /**
    * The database may return a constraint on the allowed maximum total bandwidth (in Hertz), which need not be contiguous. A regulatory domain may require
    * the database to return this parameter. When this parameter is present in the available spectrum response, the device must apply this constraint to its
    * spectrum-selection logic to ensure that total bandwidth does not exceed this value.
    */
  var maxTotalBwHz: js.UndefOr[Double] = js.undefined
  /**
    * For regulatory domains that require a spectrum-usage report from devices, the database must return true for this parameter if the spectrum schedule
    * list is not empty; otherwise, the database will either return false or omit this parameter. If this parameter is present and its value is true, the
    * device must send a spectrum use notify message to the database; otherwise, the device must not send the notification.
    */
  var needsSpectrumReport: js.UndefOr[Boolean] = js.undefined
  /**
    * The database should return ruleset information, which identifies the applicable regulatory authority and ruleset for the available spectrum response.
    * If included, the device must use the corresponding ruleset to interpret the response. Values provided in the returned ruleset information, such as
    * maxLocationChange, take precedence over any conflicting values provided in the ruleset information returned in a prior initialization response sent by
    * the database to the device.
    */
  var rulesetInfo: js.UndefOr[RulesetInfo] = js.undefined
  /**
    * The available spectrum response must contain a spectrum schedule list. The list may be empty if spectrum is not available. The database may return more
    * than one spectrum schedule to represent future changes to the available spectrum. How far in advance a schedule may be provided depends on the
    * applicable regulatory domain.
    */
  var spectrumSchedules: js.UndefOr[js.Array[SpectrumSchedule]] = js.undefined
  /**
    * The database includes a timestamp of the form YYYY-MM-DDThh:mm:ssZ (Internet timestamp format per RFC3339) in its available spectrum response. The
    * timestamp should be used by the device as a reference for the start and stop times specified in the response spectrum schedules.
    */
  var timestamp: js.UndefOr[String] = js.undefined
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

object PawsGetSpectrumResponse {
  @scala.inline
  def apply(
    databaseChange: DbUpdateSpec = null,
    deviceDesc: DeviceDescriptor = null,
    kind: String = null,
    maxContiguousBwHz: Int | Double = null,
    maxTotalBwHz: Int | Double = null,
    needsSpectrumReport: js.UndefOr[Boolean] = js.undefined,
    rulesetInfo: RulesetInfo = null,
    spectrumSchedules: js.Array[SpectrumSchedule] = null,
    timestamp: String = null,
    `type`: String = null,
    version: String = null
  ): PawsGetSpectrumResponse = {
    val __obj = js.Dynamic.literal()
    if (databaseChange != null) __obj.updateDynamic("databaseChange")(databaseChange.asInstanceOf[js.Any])
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxContiguousBwHz != null) __obj.updateDynamic("maxContiguousBwHz")(maxContiguousBwHz.asInstanceOf[js.Any])
    if (maxTotalBwHz != null) __obj.updateDynamic("maxTotalBwHz")(maxTotalBwHz.asInstanceOf[js.Any])
    if (!js.isUndefined(needsSpectrumReport)) __obj.updateDynamic("needsSpectrumReport")(needsSpectrumReport.asInstanceOf[js.Any])
    if (rulesetInfo != null) __obj.updateDynamic("rulesetInfo")(rulesetInfo.asInstanceOf[js.Any])
    if (spectrumSchedules != null) __obj.updateDynamic("spectrumSchedules")(spectrumSchedules.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PawsGetSpectrumResponse]
  }
}

