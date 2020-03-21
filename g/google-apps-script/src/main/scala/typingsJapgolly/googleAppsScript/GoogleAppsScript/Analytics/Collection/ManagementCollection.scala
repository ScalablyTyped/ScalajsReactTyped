package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountSummariesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountUserLinksCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ClientIdCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomDataSourcesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomDimensionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomMetricsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ExperimentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.FiltersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.GoalsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfileFilterLinksCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfileUserLinksCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfilesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.RemarketingAudienceCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.SegmentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.UnsampledReportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.UploadsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebPropertyAdWordsLinksCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertiesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertyUserLinksCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementCollection extends js.Object {
  var AccountSummaries: js.UndefOr[AccountSummariesCollection] = js.undefined
  var AccountUserLinks: js.UndefOr[AccountUserLinksCollection] = js.undefined
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var ClientId: js.UndefOr[ClientIdCollection] = js.undefined
  var CustomDataSources: js.UndefOr[CustomDataSourcesCollection] = js.undefined
  var CustomDimensions: js.UndefOr[CustomDimensionsCollection] = js.undefined
  var CustomMetrics: js.UndefOr[CustomMetricsCollection] = js.undefined
  var Experiments: js.UndefOr[ExperimentsCollection] = js.undefined
  var Filters: js.UndefOr[FiltersCollection] = js.undefined
  var Goals: js.UndefOr[GoalsCollection] = js.undefined
  var ProfileFilterLinks: js.UndefOr[ProfileFilterLinksCollection] = js.undefined
  var ProfileUserLinks: js.UndefOr[ProfileUserLinksCollection] = js.undefined
  var Profiles: js.UndefOr[ProfilesCollection] = js.undefined
  var RemarketingAudience: js.UndefOr[RemarketingAudienceCollection] = js.undefined
  var Segments: js.UndefOr[SegmentsCollection] = js.undefined
  var UnsampledReports: js.UndefOr[UnsampledReportsCollection] = js.undefined
  var Uploads: js.UndefOr[UploadsCollection] = js.undefined
  var WebPropertyAdWordsLinks: js.UndefOr[WebPropertyAdWordsLinksCollection] = js.undefined
  var Webproperties: js.UndefOr[WebpropertiesCollection] = js.undefined
  var WebpropertyUserLinks: js.UndefOr[WebpropertyUserLinksCollection] = js.undefined
}

object ManagementCollection {
  @scala.inline
  def apply(
    AccountSummaries: AccountSummariesCollection = null,
    AccountUserLinks: AccountUserLinksCollection = null,
    Accounts: AccountsCollection = null,
    ClientId: ClientIdCollection = null,
    CustomDataSources: CustomDataSourcesCollection = null,
    CustomDimensions: CustomDimensionsCollection = null,
    CustomMetrics: CustomMetricsCollection = null,
    Experiments: ExperimentsCollection = null,
    Filters: FiltersCollection = null,
    Goals: GoalsCollection = null,
    ProfileFilterLinks: ProfileFilterLinksCollection = null,
    ProfileUserLinks: ProfileUserLinksCollection = null,
    Profiles: ProfilesCollection = null,
    RemarketingAudience: RemarketingAudienceCollection = null,
    Segments: SegmentsCollection = null,
    UnsampledReports: UnsampledReportsCollection = null,
    Uploads: UploadsCollection = null,
    WebPropertyAdWordsLinks: WebPropertyAdWordsLinksCollection = null,
    Webproperties: WebpropertiesCollection = null,
    WebpropertyUserLinks: WebpropertyUserLinksCollection = null
  ): ManagementCollection = {
    val __obj = js.Dynamic.literal()
    if (AccountSummaries != null) __obj.updateDynamic("AccountSummaries")(AccountSummaries.asInstanceOf[js.Any])
    if (AccountUserLinks != null) __obj.updateDynamic("AccountUserLinks")(AccountUserLinks.asInstanceOf[js.Any])
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (CustomDataSources != null) __obj.updateDynamic("CustomDataSources")(CustomDataSources.asInstanceOf[js.Any])
    if (CustomDimensions != null) __obj.updateDynamic("CustomDimensions")(CustomDimensions.asInstanceOf[js.Any])
    if (CustomMetrics != null) __obj.updateDynamic("CustomMetrics")(CustomMetrics.asInstanceOf[js.Any])
    if (Experiments != null) __obj.updateDynamic("Experiments")(Experiments.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Goals != null) __obj.updateDynamic("Goals")(Goals.asInstanceOf[js.Any])
    if (ProfileFilterLinks != null) __obj.updateDynamic("ProfileFilterLinks")(ProfileFilterLinks.asInstanceOf[js.Any])
    if (ProfileUserLinks != null) __obj.updateDynamic("ProfileUserLinks")(ProfileUserLinks.asInstanceOf[js.Any])
    if (Profiles != null) __obj.updateDynamic("Profiles")(Profiles.asInstanceOf[js.Any])
    if (RemarketingAudience != null) __obj.updateDynamic("RemarketingAudience")(RemarketingAudience.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    if (UnsampledReports != null) __obj.updateDynamic("UnsampledReports")(UnsampledReports.asInstanceOf[js.Any])
    if (Uploads != null) __obj.updateDynamic("Uploads")(Uploads.asInstanceOf[js.Any])
    if (WebPropertyAdWordsLinks != null) __obj.updateDynamic("WebPropertyAdWordsLinks")(WebPropertyAdWordsLinks.asInstanceOf[js.Any])
    if (Webproperties != null) __obj.updateDynamic("Webproperties")(Webproperties.asInstanceOf[js.Any])
    if (WebpropertyUserLinks != null) __obj.updateDynamic("WebpropertyUserLinks")(WebpropertyUserLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementCollection]
  }
}

