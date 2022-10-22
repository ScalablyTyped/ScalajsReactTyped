package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.DisbursementEndDate
import typingsJapgolly.maximMazurokGapiClientContent.anon.DisbursementId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreportsResource extends StObject {
  
  /** Retrieves a report for disbursements from your Merchant Center account. */
  def listdisbursements(): Request[OrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(request: DisbursementEndDate): Request[OrderreportsListDisbursementsResponse] = js.native
  
  /** Retrieves a list of transactions for a disbursement from your Merchant Center account. */
  def listtransactions(): Request[OrderreportsListTransactionsResponse] = js.native
  def listtransactions(request: DisbursementId): Request[OrderreportsListTransactionsResponse] = js.native
}
