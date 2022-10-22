package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Alt
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserTargetInstance
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceUploadTypeUploadprotocolUserIpXgafvZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInstancesResource extends StObject {
  
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(): Request[TargetInstanceAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[TargetInstanceAggregatedList] = js.native
  
  /** Deletes the specified TargetInstance resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetInstance): Request[Operation] = js.native
  
  /** Returns the specified TargetInstance resource. Gets a list of available target instances by making a list() request. */
  def get(): Request[TargetInstance] = js.native
  def get(request: QuotaUserTargetInstance): Request[TargetInstance] = js.native
  
  def insert(request: QuotaUser, body: TargetInstance): Request[Operation] = js.native
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: ResourceUploadTypeUploadprotocolUserIpXgafvZone): Request[Operation] = js.native
  
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(): Request[TargetInstanceList] = js.native
  def list(request: Alt): Request[TargetInstanceList] = js.native
}
