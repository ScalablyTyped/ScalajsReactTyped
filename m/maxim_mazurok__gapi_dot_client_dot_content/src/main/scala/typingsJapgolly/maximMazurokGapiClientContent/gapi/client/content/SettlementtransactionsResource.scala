package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.TransactionIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementtransactionsResource extends StObject {
  
  /** Retrieves a list of transactions for the settlement. */
  def list(): Request[SettlementtransactionsListResponse] = js.native
  def list(request: TransactionIds): Request[SettlementtransactionsListResponse] = js.native
}
