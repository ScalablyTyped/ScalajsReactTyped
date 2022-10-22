package typingsJapgolly.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoSequencesResource extends StObject {
  
  /** Lists all the PhotoSequences that belong to the user, in descending CreatePhotoSequence timestamp order. */
  def list(): Request[ListPhotoSequencesResponse] = js.native
  def list(request: PageSize): Request[ListPhotoSequencesResponse] = js.native
}
