package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.CallbackFailoverRatio
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FailoverRatio
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegionRequestIdResourceUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionTargetPool
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetPool
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdTargetPool
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceTargetPool
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceTargetPoolUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetPoolUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPoolsResource extends StObject {
  
  def addHealthCheck(request: RequestIdTargetPool, body: TargetPoolsAddHealthCheckRequest): Request[Operation] = js.native
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  
  def addInstance(request: RequestIdTargetPool, body: TargetPoolsAddInstanceRequest): Request[Operation] = js.native
  /** Adds an instance to a target pool. */
  def addInstance(request: ResourceTargetPool): Request[Operation] = js.native
  
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(): Request[TargetPoolAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[TargetPoolAggregatedList] = js.native
  
  /** Deletes the specified target pool. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdTargetPool): Request[Operation] = js.native
  
  /** Returns the specified target pool. Gets a list of available target pools by making a list() request. */
  def get(): Request[TargetPool] = js.native
  def get(request: RegionTargetPool): Request[TargetPool] = js.native
  
  def getHealth(request: RegionTargetPool, body: InstanceReference): Request[TargetPoolInstanceHealth] = js.native
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: TargetPoolUploadType): Request[TargetPoolInstanceHealth] = js.native
  
  def insert(request: Oauthtoken, body: TargetPool): Request[Operation] = js.native
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: ProjectQuotaUserRegionRequestIdResourceUploadType): Request[Operation] = js.native
  
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(): Request[TargetPoolList] = js.native
  def list(request: Filter): Request[TargetPoolList] = js.native
  
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: RequestIdResourceTargetPool): Request[Operation] = js.native
  def removeHealthCheck(request: RequestIdTargetPool, body: TargetPoolsRemoveHealthCheckRequest): Request[Operation] = js.native
  
  def removeInstance(request: RequestIdTargetPool, body: TargetPoolsRemoveInstanceRequest): Request[Operation] = js.native
  /** Removes instance URL from a target pool. */
  def removeInstance(request: ResourceTargetPoolUploadType): Request[Operation] = js.native
  
  def setBackup(request: CallbackFailoverRatio, body: TargetReference): Request[Operation] = js.native
  /** Changes a backup target pool's configurations. */
  def setBackup(request: FailoverRatio): Request[Operation] = js.native
}
