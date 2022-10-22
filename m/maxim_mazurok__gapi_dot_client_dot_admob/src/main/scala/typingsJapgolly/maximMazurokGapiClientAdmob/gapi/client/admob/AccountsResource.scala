package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdmob.anon.Key
import typingsJapgolly.maximMazurokGapiClientAdmob.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  var adUnits: AdUnitsResource = js.native
  
  var apps: AppsResource = js.native
  
  /** Gets information about the specified AdMob publisher account. */
  def get(): Request[PublisherAccount] = js.native
  def get(request: Key): Request[PublisherAccount] = js.native
  
  /** Lists the AdMob publisher account that was most recently signed in to from the AdMob UI. For more information, see https://support.google.com/admob/answer/10243672. */
  def list(): Request[ListPublisherAccountsResponse] = js.native
  def list(request: Oauthtoken): Request[ListPublisherAccountsResponse] = js.native
  
  var mediationReport: MediationReportResource = js.native
  
  var networkReport: NetworkReportResource = js.native
}
