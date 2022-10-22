package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.EndDate
import typingsJapgolly.maximMazurokGapiClientContent.anon.RuleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingreportsResource extends StObject {
  
  /** Lists the metrics report for a given Repricing product. */
  /** Lists the metrics report for a given Repricing rule. */
  def list(): Request[ListRepricingProductReportsResponse] = js.native
  def list(request: EndDate): Request[ListRepricingProductReportsResponse] = js.native
  def list(request: RuleId): Request[ListRepricingRuleReportsResponse] = js.native
}
