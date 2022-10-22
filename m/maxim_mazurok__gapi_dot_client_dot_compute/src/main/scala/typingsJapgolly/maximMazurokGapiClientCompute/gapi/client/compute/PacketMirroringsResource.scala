package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OauthtokenPacketMirroring
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PacketMirroringPrettyPrint
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestId
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRegionResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringsResource extends StObject {
  
  /** Retrieves an aggregated list of packetMirrorings. */
  def aggregatedList(): Request[PacketMirroringAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[PacketMirroringAggregatedList] = js.native
  
  /** Deletes the specified PacketMirroring resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.PacketMirroring): Request[Operation] = js.native
  
  /** Returns the specified PacketMirroring resource. */
  def get(): Request[PacketMirroring] = js.native
  def get(request: OauthtokenPacketMirroring): Request[PacketMirroring] = js.native
  
  def insert(request: Oauthtoken, body: PacketMirroring): Request[Operation] = js.native
  /** Creates a PacketMirroring resource in the specified project and region using the data included in the request. */
  def insert(request: QuotaUserRegionRequestId): Request[Operation] = js.native
  
  /** Retrieves a list of PacketMirroring resources available to the specified project and region. */
  def list(): Request[PacketMirroringList] = js.native
  def list(request: Filter): Request[PacketMirroringList] = js.native
  
  /** Patches the specified PacketMirroring resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: PacketMirroringPrettyPrint): Request[Operation] = js.native
  def patch(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.PacketMirroring, body: PacketMirroring): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserRegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
