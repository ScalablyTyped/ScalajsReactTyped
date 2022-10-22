package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUserRegion
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRegionResource
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionResource
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionResourcePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePoliciesResource extends StObject {
  
  /** Retrieves an aggregated list of resource policies. */
  def aggregatedList(): Request[ResourcePolicyAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[ResourcePolicyAggregatedList] = js.native
  
  /** Deletes the specified resource policy. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourcePolicy): Request[Operation] = js.native
  
  /** Retrieves all information of the specified resource policy. */
  def get(): Request[ResourcePolicy] = js.native
  def get(request: RegionResourcePolicy): Request[ResourcePolicy] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: RegionResource): Request[Policy] = js.native
  
  /** Creates a new resource policy. */
  def insert(request: KeyOauthtokenPrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: Oauthtoken, body: ResourcePolicy): Request[Operation] = js.native
  
  /** A list all the resource policies that have been configured for the specified project in specified region. */
  def list(): Request[ResourcePolicyList] = js.native
  def list(request: Filter): Request[ResourcePolicyList] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserRegionResource, body: RegionSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserRegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
