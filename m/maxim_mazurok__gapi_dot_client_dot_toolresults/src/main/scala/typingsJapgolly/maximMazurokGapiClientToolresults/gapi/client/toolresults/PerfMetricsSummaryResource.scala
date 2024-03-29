package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.Fields
import typingsJapgolly.maximMazurokGapiClientToolresults.anon.HistoryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfMetricsSummaryResource extends StObject {
  
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created. May return any of the following error code(s): - NOT_FOUND - The containing Step does
    * not exist
    */
  def create(request: Fields): Request[PerfMetricsSummary] = js.native
  def create(request: HistoryId, body: PerfMetricsSummary): Request[PerfMetricsSummary] = js.native
}
