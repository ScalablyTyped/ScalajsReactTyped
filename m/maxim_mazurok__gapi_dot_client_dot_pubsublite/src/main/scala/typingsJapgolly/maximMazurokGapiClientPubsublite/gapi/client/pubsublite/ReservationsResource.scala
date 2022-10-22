package typingsJapgolly.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Alt
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Parent
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.ReservationId
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationsResource extends StObject {
  
  /** Creates a new reservation. */
  def create(request: Parent): Request[Reservation] = js.native
  def create(request: ReservationId, body: Reservation): Request[Reservation] = js.native
  
  /** Deletes the specified reservation. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns the reservation configuration. */
  def get(): Request[Reservation] = js.native
  def get(request: Alt): Request[Reservation] = js.native
  
  /** Returns the list of reservations for the given project. */
  def list(): Request[ListReservationsResponse] = js.native
  def list(request: PageSize): Request[ListReservationsResponse] = js.native
  
  def patch(request: PrettyPrint, body: Reservation): Request[Reservation] = js.native
  /** Updates properties of the specified reservation. */
  def patch(request: UpdateMask): Request[Reservation] = js.native
  
  var topics: TopicsResource = js.native
}
