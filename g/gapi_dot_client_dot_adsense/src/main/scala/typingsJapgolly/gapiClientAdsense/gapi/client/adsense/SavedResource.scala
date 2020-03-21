package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonAccountId
import typingsJapgolly.gapiClientAdsense.AnonAlt
import typingsJapgolly.gapiClientAdsense.AnonSavedReportId
import typingsJapgolly.gapiClientAdsense.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonSavedReportId): Request_[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonStartIndex): Request_[AdsenseReportsGenerateResponse] = js.native
  /** List all saved reports in the specified AdSense account. */
  def list(request: AnonAccountId): Request_[SavedReports] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: AnonAlt): Request_[SavedReports] = js.native
}

