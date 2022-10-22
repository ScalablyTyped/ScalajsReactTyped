package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsForwardingRule
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ForwardingRuleKey
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRegion
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionRequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRulesResource extends StObject {
  
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(): Request[ForwardingRuleAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[ForwardingRuleAggregatedList] = js.native
  
  /** Deletes the specified ForwardingRule resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.ForwardingRule): Request[Operation] = js.native
  
  /** Returns the specified ForwardingRule resource. */
  def get(): Request[ForwardingRule] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.Region): Request[ForwardingRule] = js.native
  
  def insert(request: Oauthtoken, body: ForwardingRule): Request[Operation] = js.native
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: QuotaUserRegion): Request[Operation] = js.native
  
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(): Request[ForwardingRuleList] = js.native
  def list(request: Filter): Request[ForwardingRuleList] = js.native
  
  /**
    * Updates the specified forwarding rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
    * Currently, you can only patch the network_tier field.
    */
  def patch(request: FieldsForwardingRule): Request[Operation] = js.native
  def patch(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.ForwardingRule, body: ForwardingRule): Request[Operation] = js.native
  
  /** Sets the labels on the specified resource. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: RegionRequestId, body: RegionSetLabelsRequest): Request[Operation] = js.native
  
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: ForwardingRuleKey): Request[Operation] = js.native
  def setTarget(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.ForwardingRule, body: TargetReference): Request[Operation] = js.native
}
