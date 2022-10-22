package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.CurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedResource extends StObject {
  
  /** Generates a saved report. */
  def generate(): Request[ReportResult] = js.native
  def generate(request: CurrencyCode): Request[ReportResult] = js.native
  
  /** Generates a csv formatted saved report. */
  def generateCsv(): Request[HttpBody] = js.native
  def generateCsv(request: CurrencyCode): Request[HttpBody] = js.native
  
  /** Lists saved reports. */
  def list(): Request[ListSavedReportsResponse] = js.native
  def list(request: Alt): Request[ListSavedReportsResponse] = js.native
}
