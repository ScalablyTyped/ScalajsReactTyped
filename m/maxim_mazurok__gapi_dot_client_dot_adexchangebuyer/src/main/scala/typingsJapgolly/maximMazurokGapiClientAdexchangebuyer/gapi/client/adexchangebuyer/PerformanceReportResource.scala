package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.EndDateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceReportResource extends StObject {
  
  /** Retrieves the authenticated user's list of performance metrics. */
  def list(): Request[PerformanceReportList] = js.native
  def list(request: EndDateTime): Request[PerformanceReportList] = js.native
}
