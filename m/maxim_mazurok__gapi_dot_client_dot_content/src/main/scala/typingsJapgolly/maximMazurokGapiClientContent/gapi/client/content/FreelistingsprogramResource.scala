package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.AltCallbackFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreelistingsprogramResource extends StObject {
  
  /** Retrieves the status and review eligibility for the free listing program. */
  def get(): Request[FreeListingsProgramStatus] = js.native
  def get(request: AccesstokenAlt): Request[FreeListingsProgramStatus] = js.native
  
  def requestreview(request: AccesstokenAlt, body: RequestReviewFreeListingsRequest): Request[Unit] = js.native
  /** Requests a review of free listings in a specific region. This method is only available to selected merchants. */
  def requestreview(request: AltCallbackFields): Request[Unit] = js.native
}
