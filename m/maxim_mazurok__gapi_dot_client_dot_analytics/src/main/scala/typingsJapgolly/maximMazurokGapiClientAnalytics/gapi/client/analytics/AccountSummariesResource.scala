package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSummariesResource extends StObject {
  
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(): Request[AccountSummaries] = js.native
  def list(request: Key): Request[AccountSummaries] = js.native
}
