package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.Id
import typingsJapgolly.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenPrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromotionsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: Promotion): Request[Promotion] = js.native
  /** Inserts a promotion for your Merchant Center account. If the promotion already exists, then it updates the promotion instead. */
  def create(request: MerchantIdOauthtokenPrettyPrintQuotaUser): Request[Promotion] = js.native
  
  /** Retrieves a promotion from your Merchant Center account. */
  def get(): Request[Promotion] = js.native
  def get(request: Id): Request[Promotion] = js.native
}
