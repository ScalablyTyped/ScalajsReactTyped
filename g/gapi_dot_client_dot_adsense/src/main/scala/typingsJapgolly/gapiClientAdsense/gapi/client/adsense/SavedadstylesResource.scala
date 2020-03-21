package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonAccountId
import typingsJapgolly.gapiClientAdsense.AnonAlt
import typingsJapgolly.gapiClientAdsense.AnonKeyOauthtoken
import typingsJapgolly.gapiClientAdsense.AnonSavedAdStyleId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesResource extends js.Object {
  /** Get a specific saved ad style from the user's account. */
  def get(request: AnonKeyOauthtoken): Request_[SavedAdStyle] = js.native
  /** List a specific saved ad style for the specified account. */
  def get(request: AnonSavedAdStyleId): Request_[SavedAdStyle] = js.native
  /** List all saved ad styles in the specified account. */
  def list(request: AnonAccountId): Request_[SavedAdStyles] = js.native
  /** List all saved ad styles in the user's account. */
  def list(request: AnonAlt): Request_[SavedAdStyles] = js.native
}

