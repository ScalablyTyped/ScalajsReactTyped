package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.KeyNodeTemplate
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegion
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRegionResource
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTemplatesResource extends StObject {
  
  /** Retrieves an aggregated list of node templates. */
  def aggregatedList(): Request[NodeTemplateAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[NodeTemplateAggregatedList] = js.native
  
  /** Deletes the specified NodeTemplate resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.NodeTemplate): Request[Operation] = js.native
  
  /** Returns the specified node template. Gets a list of available node templates by making a list() request. */
  def get(): Request[NodeTemplate] = js.native
  def get(request: KeyNodeTemplate): Request[NodeTemplate] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: RegionResource): Request[Policy] = js.native
  
  def insert(request: Oauthtoken, body: NodeTemplate): Request[Operation] = js.native
  /** Creates a NodeTemplate resource in the specified project using the data included in the request. */
  def insert(request: ProjectQuotaUserRegion): Request[Operation] = js.native
  
  /** Retrieves a list of node templates available to the specified project. */
  def list(): Request[NodeTemplateList] = js.native
  def list(request: Filter): Request[NodeTemplateList] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserRegionResource, body: RegionSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserRegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
