package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRequestIdResource
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PriorityProject
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserSecurityPolicy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdSecurityPolicy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceSecurityPolicy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.SecurityPolicyUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPoliciesResource extends StObject {
  
  def addRule(request: QuotaUserSecurityPolicy, body: SecurityPolicyRule): Request[Operation] = js.native
  /** Inserts a rule into a security policy. */
  def addRule(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.SecurityPolicy): Request[Operation] = js.native
  
  /** Deletes the specified policy. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdSecurityPolicy): Request[Operation] = js.native
  
  /** List all of the ordered rules present in a single specified policy. */
  def get(): Request[SecurityPolicy] = js.native
  def get(request: QuotaUserSecurityPolicy): Request[SecurityPolicy] = js.native
  
  /** Gets a rule at the specified priority. */
  def getRule(): Request[SecurityPolicyRule] = js.native
  def getRule(request: PriorityProject): Request[SecurityPolicyRule] = js.native
  
  /** Creates a new policy in the specified project using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  def insert(request: Xgafv, body: SecurityPolicy): Request[Operation] = js.native
  
  /** List all the policies that have been configured for the specified project. */
  def list(): Request[SecurityPolicyList] = js.native
  def list(request: MaxResults): Request[SecurityPolicyList] = js.native
  
  /** Gets the current list of preconfigured Web Application Firewall (WAF) expressions. */
  def listPreconfiguredExpressionSets(): Request[SecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  def listPreconfiguredExpressionSets(request: MaxResults): Request[SecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  
  def patch(request: RequestIdSecurityPolicy, body: SecurityPolicy): Request[Operation] = js.native
  /**
    * Patches the specified policy with the data included in the request. This cannot be used to be update the rules in the policy. Please use the per rule methods like addRule,
    * patchRule, and removeRule instead.
    */
  def patch(request: ResourceSecurityPolicy): Request[Operation] = js.native
  
  def patchRule(request: PriorityProject, body: SecurityPolicyRule): Request[Operation] = js.native
  /** Patches a rule at the specified priority. */
  def patchRule(request: SecurityPolicyUploadType): Request[Operation] = js.native
  
  /** Deletes a rule at the specified priority. */
  def removeRule(): Request[Operation] = js.native
  def removeRule(request: PriorityProject): Request[Operation] = js.native
}
