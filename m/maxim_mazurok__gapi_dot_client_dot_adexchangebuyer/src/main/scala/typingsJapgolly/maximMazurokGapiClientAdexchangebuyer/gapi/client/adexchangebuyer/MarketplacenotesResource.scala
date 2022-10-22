package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.AltFields
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.PqlQuery
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplacenotesResource extends StObject {
  
  /** Add notes to the proposal */
  def insert(request: AltFields): Request[AddOrderNotesResponse] = js.native
  def insert(request: QuotaUser, body: AddOrderNotesRequest): Request[AddOrderNotesResponse] = js.native
  
  /** Get all the notes associated with a proposal */
  def list(): Request[GetOrderNotesResponse] = js.native
  def list(request: PqlQuery): Request[GetOrderNotesResponse] = js.native
}
