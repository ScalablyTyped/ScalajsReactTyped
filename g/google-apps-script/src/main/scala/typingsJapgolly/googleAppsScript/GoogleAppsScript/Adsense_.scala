package typingsJapgolly.googleAppsScript.GoogleAppsScript

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.AccountsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdclientsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdunitsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.AlertsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.CustomchannelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.MetadataCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.PaymentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.ReportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.SavedadstylesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.UrlchannelsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adsense_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var Adclients: js.UndefOr[AdclientsCollection] = js.undefined
  var Adunits: js.UndefOr[AdunitsCollection] = js.undefined
  var Alerts: js.UndefOr[AlertsCollection] = js.undefined
  var Customchannels: js.UndefOr[CustomchannelsCollection] = js.undefined
  var Metadata: js.UndefOr[MetadataCollection] = js.undefined
  var Payments: js.UndefOr[PaymentsCollection] = js.undefined
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  var Savedadstyles: js.UndefOr[SavedadstylesCollection] = js.undefined
  var Urlchannels: js.UndefOr[UrlchannelsCollection] = js.undefined
}

object Adsense_ {
  @scala.inline
  def apply(
    Accounts: AccountsCollection = null,
    Adclients: AdclientsCollection = null,
    Adunits: AdunitsCollection = null,
    Alerts: AlertsCollection = null,
    Customchannels: CustomchannelsCollection = null,
    Metadata: MetadataCollection = null,
    Payments: PaymentsCollection = null,
    Reports: ReportsCollection = null,
    Savedadstyles: SavedadstylesCollection = null,
    Urlchannels: UrlchannelsCollection = null
  ): Adsense_ = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (Adclients != null) __obj.updateDynamic("Adclients")(Adclients.asInstanceOf[js.Any])
    if (Adunits != null) __obj.updateDynamic("Adunits")(Adunits.asInstanceOf[js.Any])
    if (Alerts != null) __obj.updateDynamic("Alerts")(Alerts.asInstanceOf[js.Any])
    if (Customchannels != null) __obj.updateDynamic("Customchannels")(Customchannels.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (Payments != null) __obj.updateDynamic("Payments")(Payments.asInstanceOf[js.Any])
    if (Reports != null) __obj.updateDynamic("Reports")(Reports.asInstanceOf[js.Any])
    if (Savedadstyles != null) __obj.updateDynamic("Savedadstyles")(Savedadstyles.asInstanceOf[js.Any])
    if (Urlchannels != null) __obj.updateDynamic("Urlchannels")(Urlchannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adsense_]
  }
}

