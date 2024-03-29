package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.CountryCode
import typingsJapgolly.maximMazurokGapiClientContent.anon.QuotaUserResourceRuleId
import typingsJapgolly.maximMazurokGapiClientContent.anon.QuotaUserRuleId
import typingsJapgolly.maximMazurokGapiClientContent.anon.ResourceRuleId
import typingsJapgolly.maximMazurokGapiClientContent.anon.RuleIdUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingrulesResource extends StObject {
  
  def create(request: QuotaUserRuleId, body: RepricingRule): Request[RepricingRule] = js.native
  /** Creates a repricing rule for your Merchant Center account. */
  def create(request: ResourceRuleId): Request[RepricingRule] = js.native
  
  /** Deletes a repricing rule in your Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: RuleIdUploadType): Request[Unit] = js.native
  
  /** Retrieves a repricing rule from your Merchant Center account. */
  def get(): Request[RepricingRule] = js.native
  def get(request: RuleIdUploadType): Request[RepricingRule] = js.native
  
  /** Lists the repricing rules in your Merchant Center account. */
  def list(): Request[ListRepricingRulesResponse] = js.native
  def list(request: CountryCode): Request[ListRepricingRulesResponse] = js.native
  
  /**
    * Updates a repricing rule in your Merchant Center account. All mutable fields will be overwritten in each update request. In each update, you must provide all required mutable
    * fields, or an error will be thrown. If you do not provide an optional field in the update request, if that field currently exists, it will be deleted from the rule.
    */
  def patch(request: QuotaUserResourceRuleId): Request[RepricingRule] = js.native
  def patch(request: RuleIdUploadType, body: RepricingRule): Request[RepricingRule] = js.native
  
  var repricingreports: RepricingreportsResource = js.native
}
