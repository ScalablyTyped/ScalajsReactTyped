package typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsensehost.anon.Dimension
import typingsJapgolly.maximMazurokGapiClientAdsensehost.anon.EndDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query
    * parameter.
    */
  def generate(): Request[Report] = js.native
  def generate(request: Dimension): Request[Report] = js.native
  def generate(request: EndDate): Request[Report] = js.native
}
