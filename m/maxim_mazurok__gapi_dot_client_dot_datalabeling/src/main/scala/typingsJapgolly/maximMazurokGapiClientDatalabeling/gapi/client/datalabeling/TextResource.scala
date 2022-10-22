package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDatalabeling.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDatalabeling.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextResource extends StObject {
  
  def label(request: Alt, body: GoogleCloudDatalabelingV1beta1LabelTextRequest): Request[GoogleLongrunningOperation] = js.native
  /** Starts a labeling task for text. The type of text labeling task is configured by feature in the request. */
  def label(request: QuotaUser): Request[GoogleLongrunningOperation] = js.native
}
