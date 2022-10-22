package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDatalabeling.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDatalabeling.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResource extends StObject {
  
  def label(request: Alt, body: GoogleCloudDatalabelingV1beta1LabelImageRequest): Request[GoogleLongrunningOperation] = js.native
  /** Starts a labeling task for image. The type of image labeling task is configured by feature in the request. */
  def label(request: PrettyPrint): Request[GoogleLongrunningOperation] = js.native
}
