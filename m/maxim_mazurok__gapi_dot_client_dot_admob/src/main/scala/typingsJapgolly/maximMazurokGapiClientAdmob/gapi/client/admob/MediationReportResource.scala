package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdmob.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAdmob.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediationReportResource extends StObject {
  
  /** Generates an AdMob Mediation report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses. */
  def generate(request: Alt): Request[GenerateMediationReportResponse] = js.native
  def generate(request: Callback, body: GenerateMediationReportRequest): Request[GenerateMediationReportResponse] = js.native
}
