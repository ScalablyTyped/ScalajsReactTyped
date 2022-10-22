package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Alt
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersion
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserReservation
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdReservation
import typingsJapgolly.maximMazurokGapiClientCompute.anon.UploadTypeUploadprotocolUserIpXgafvZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationsResource extends StObject {
  
  /** Retrieves an aggregated list of reservations. */
  def aggregatedList(): Request[ReservationAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[ReservationAggregatedList] = js.native
  
  /** Deletes the specified reservation. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.Reservation): Request[Operation] = js.native
  
  /** Retrieves information about the specified reservation. */
  def get(): Request[Reservation] = js.native
  def get(request: QuotaUserReservation): Request[Reservation] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  def insert(request: QuotaUser, body: Reservation): Request[Operation] = js.native
  /** Creates a new reservation. For more information, read Reserving zonal resources. */
  def insert(request: UploadTypeUploadprotocolUserIpXgafvZone): Request[Operation] = js.native
  
  /** A list of all the reservations that have been configured for the specified project in specified zone. */
  def list(): Request[ReservationList] = js.native
  def list(request: Alt): Request[ReservationList] = js.native
  
  /** Resizes the reservation (applicable to standalone reservations only). For more information, read Modifying reservations. */
  def resize(request: RequestIdReservation): Request[Operation] = js.native
  def resize(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.Reservation,
    body: ReservationsResizeRequest
  ): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserResource, body: ZoneSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
