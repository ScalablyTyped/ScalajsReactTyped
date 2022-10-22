package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.Filter
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.PrettyPrintProposalId
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.ProposalIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.anon.ResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProposalsResource extends StObject {
  
  def accept(request: AccountIdAlt, body: AcceptProposalRequest): Request[Proposal] = js.native
  /**
    * Mark the proposal as accepted at the given revision number. If the number does not match the server's revision number an `ABORTED` error message will be returned. This call updates
    * the proposal_state from `PROPOSED` to `BUYER_ACCEPTED`, or from `SELLER_ACCEPTED` to `FINALIZED`. Upon calling this endpoint, the buyer implicitly agrees to the terms and conditions
    * optionally set within the proposal by the publisher.
    */
  def accept(request: FieldsKey): Request[Proposal] = js.native
  
  def addNote(request: AccountIdAlt, body: AddNoteRequest): Request[Note] = js.native
  /** Create a new note and attach it to the proposal. The note is assigned a unique ID by the server. The proposal revision number will not increase when associated with a new note. */
  def addNote(request: KeyOauthtoken): Request[Note] = js.native
  
  def cancelNegotiation(request: AccountIdAlt, body: CancelNegotiationRequest): Request[Proposal] = js.native
  /** Cancel an ongoing negotiation on a proposal. This does not cancel or end serving for the deals if the proposal has been finalized, but only cancels a negotiation unilaterally. */
  def cancelNegotiation(request: OauthtokenPrettyPrint): Request[Proposal] = js.native
  
  def completeSetup(request: AccountIdAlt, body: CompleteSetupRequest): Request[Proposal] = js.native
  /**
    * You can opt-in to manually update proposals to indicate that setup is complete. By default, proposal setup is automatically completed after their deals are finalized. Contact your
    * Technical Account Manager to opt in. Buyers can call this method when the proposal has been finalized, and all the required creatives have been uploaded using the Creatives API.
    * This call updates the `is_setup_completed` field on the deals in the proposal, and notifies the seller. The server then advances the revision number of the most recent proposal. To
    * mark an individual deal as ready to serve, call `buyers.finalizedDeals.setReadyToServe` in the Marketplace API.
    */
  def completeSetup(request: PrettyPrintProposalId): Request[Proposal] = js.native
  
  def create(request: Oauthtoken, body: Proposal): Request[Proposal] = js.native
  /** Create the given proposal. Each created proposal and any deals it contains are assigned a unique ID by the server. */
  def create(request: PrettyPrintQuotaUser): Request[Proposal] = js.native
  
  /** Gets a proposal given its ID. The proposal is returned at its head revision. */
  def get(): Request[Proposal] = js.native
  def get(request: AccountIdAlt): Request[Proposal] = js.native
  
  /**
    * List proposals. A filter expression (PQL query) may be specified to filter the results. To retrieve all finalized proposals, regardless if a proposal is being renegotiated, see the
    * FinalizedProposals resource. Note that Bidder/ChildSeat relationships differ from the usual behavior. A Bidder account can only see its child seats' proposals by specifying the
    * ChildSeat's accountId in the request path.
    */
  def list(): Request[ListProposalsResponse] = js.native
  def list(request: Filter): Request[ListProposalsResponse] = js.native
  
  def pause(request: AccountIdAlt, body: PauseProposalRequest): Request[Proposal] = js.native
  /**
    * Update the given proposal to pause serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true for all deals in the proposal. It is a no-op
    * to pause an already-paused proposal. It is an error to call PauseProposal for a proposal that is not finalized or renegotiating.
    */
  def pause(request: ProposalIdQuotaUser): Request[Proposal] = js.native
  
  def resume(request: AccountIdAlt, body: ResumeProposalRequest): Request[Proposal] = js.native
  /**
    * Update the given proposal to resume serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false for all deals in the proposal. Note that if
    * the `has_seller_paused` bit is also set, serving will not resume until the seller also resumes. It is a no-op to resume an already-running proposal. It is an error to call
    * ResumeProposal for a proposal that is not finalized or renegotiating.
    */
  def resume(request: QuotaUserResource): Request[Proposal] = js.native
  
  def update(request: AccountIdAlt, body: Proposal): Request[Proposal] = js.native
  /**
    * Update the given proposal at the client known revision number. If the server revision has advanced since the passed-in `proposal.proposal_revision`, an `ABORTED` error message will
    * be returned. Only the buyer-modifiable fields of the proposal will be updated. Note that the deals in the proposal will be updated to match the passed-in copy. If a passed-in deal
    * does not have a `deal_id`, the server will assign a new unique ID and create the deal. If passed-in deal has a `deal_id`, it will be updated to match the passed-in copy. Any
    * existing deals not present in the passed-in proposal will be deleted. It is an error to pass in a deal with a `deal_id` not present at head.
    */
  def update(request: ResourceUploadType): Request[Proposal] = js.native
}
