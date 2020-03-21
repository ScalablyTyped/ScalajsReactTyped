package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** Account ID of this project. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this project. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Audience age group of this project. */
  var audienceAgeGroup: js.UndefOr[String] = js.undefined
  /** Audience gender of this project. */
  var audienceGender: js.UndefOr[String] = js.undefined
  /**
    * Budget of this project in the currency specified by the current account. The value stored in this field represents only the non-fractional amount. For
    * example, for USD, the smallest value that can be represented by this field is 1 US dollar.
    */
  var budget: js.UndefOr[String] = js.undefined
  /** Client billing code of this project. */
  var clientBillingCode: js.UndefOr[String] = js.undefined
  /** Name of the project client. */
  var clientName: js.UndefOr[String] = js.undefined
  /** End date of the project. */
  var endDate: js.UndefOr[String] = js.undefined
  /** ID of this project. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#project". */
  var kind: js.UndefOr[String] = js.undefined
  /** Information about the most recent modification of this project. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this project. */
  var name: js.UndefOr[String] = js.undefined
  /** Overview of this project. */
  var overview: js.UndefOr[String] = js.undefined
  /** Start date of the project. */
  var startDate: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this project. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Number of clicks that the advertiser is targeting. */
  var targetClicks: js.UndefOr[String] = js.undefined
  /** Number of conversions that the advertiser is targeting. */
  var targetConversions: js.UndefOr[String] = js.undefined
  /** CPA that the advertiser is targeting. */
  var targetCpaNanos: js.UndefOr[String] = js.undefined
  /** CPC that the advertiser is targeting. */
  var targetCpcNanos: js.UndefOr[String] = js.undefined
  /** vCPM from Active View that the advertiser is targeting. */
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.undefined
  /** CPM that the advertiser is targeting. */
  var targetCpmNanos: js.UndefOr[String] = js.undefined
  /** Number of impressions that the advertiser is targeting. */
  var targetImpressions: js.UndefOr[String] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    audienceAgeGroup: String = null,
    audienceGender: String = null,
    budget: String = null,
    clientBillingCode: String = null,
    clientName: String = null,
    endDate: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    overview: String = null,
    startDate: String = null,
    subaccountId: String = null,
    targetClicks: String = null,
    targetConversions: String = null,
    targetCpaNanos: String = null,
    targetCpcNanos: String = null,
    targetCpmActiveViewNanos: String = null,
    targetCpmNanos: String = null,
    targetImpressions: String = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (audienceAgeGroup != null) __obj.updateDynamic("audienceAgeGroup")(audienceAgeGroup.asInstanceOf[js.Any])
    if (audienceGender != null) __obj.updateDynamic("audienceGender")(audienceGender.asInstanceOf[js.Any])
    if (budget != null) __obj.updateDynamic("budget")(budget.asInstanceOf[js.Any])
    if (clientBillingCode != null) __obj.updateDynamic("clientBillingCode")(clientBillingCode.asInstanceOf[js.Any])
    if (clientName != null) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (targetClicks != null) __obj.updateDynamic("targetClicks")(targetClicks.asInstanceOf[js.Any])
    if (targetConversions != null) __obj.updateDynamic("targetConversions")(targetConversions.asInstanceOf[js.Any])
    if (targetCpaNanos != null) __obj.updateDynamic("targetCpaNanos")(targetCpaNanos.asInstanceOf[js.Any])
    if (targetCpcNanos != null) __obj.updateDynamic("targetCpcNanos")(targetCpcNanos.asInstanceOf[js.Any])
    if (targetCpmActiveViewNanos != null) __obj.updateDynamic("targetCpmActiveViewNanos")(targetCpmActiveViewNanos.asInstanceOf[js.Any])
    if (targetCpmNanos != null) __obj.updateDynamic("targetCpmNanos")(targetCpmNanos.asInstanceOf[js.Any])
    if (targetImpressions != null) __obj.updateDynamic("targetImpressions")(targetImpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

