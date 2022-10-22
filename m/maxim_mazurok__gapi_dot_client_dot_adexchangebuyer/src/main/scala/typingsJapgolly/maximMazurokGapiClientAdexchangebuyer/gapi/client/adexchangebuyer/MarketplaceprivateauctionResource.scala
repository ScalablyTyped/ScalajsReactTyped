package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon.PrivateAuctionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceprivateauctionResource extends StObject {
  
  def updateproposal(request: FieldsKey, body: UpdatePrivateAuctionProposalRequest): Request[Unit] = js.native
  /** Update a given private auction proposal */
  def updateproposal(request: PrivateAuctionId): Request[Unit] = js.native
}
