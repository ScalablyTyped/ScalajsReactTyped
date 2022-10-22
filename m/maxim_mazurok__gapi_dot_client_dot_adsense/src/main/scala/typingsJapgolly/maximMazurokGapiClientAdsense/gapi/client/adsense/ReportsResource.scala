package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /** Generates an ad hoc report. */
  def generate(): Request[ReportResult] = js.native
  def generate(request: typingsJapgolly.maximMazurokGapiClientAdsense.anon.Account): Request[ReportResult] = js.native
  
  /** Generates a csv formatted ad hoc report. */
  def generateCsv(): Request[HttpBody] = js.native
  def generateCsv(request: typingsJapgolly.maximMazurokGapiClientAdsense.anon.Account): Request[HttpBody] = js.native
  
  /** Gets the saved report from the given resource name. */
  def getSaved(): Request[SavedReport] = js.native
  def getSaved(request: Accesstoken): Request[SavedReport] = js.native
  
  var saved: SavedResource = js.native
}
