package typingsJapgolly.mangopay2NodejsSdk.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create`
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account
*/
trait ApiMethod extends js.Object

object ApiMethod {
  @scala.inline
  def authentication_oauth: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth = this.cast("authentication_oauth")
  @scala.inline
  def banking_aliases_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all = this.cast("banking_aliases_all")
  @scala.inline
  def banking_aliases_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get = this.cast("banking_aliases_get")
  @scala.inline
  def banking_aliases_iban_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create = this.cast("banking_aliases_iban_create")
  @scala.inline
  def banking_aliases_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update = this.cast("banking_aliases_update")
  @scala.inline
  def card_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get = this.cast("card_get")
  @scala.inline
  def card_get_preauthorizations: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations = this.cast("card_get_preauthorizations")
  @scala.inline
  def card_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save = this.cast("card_save")
  @scala.inline
  def cardregistration_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create = this.cast("cardregistration_create")
  @scala.inline
  def cardregistration_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get = this.cast("cardregistration_get")
  @scala.inline
  def cardregistration_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save = this.cast("cardregistration_save")
  @scala.inline
  def cards_get_by_fingerprint: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint = this.cast("cards_get_by_fingerprint")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_wallets_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all = this.cast("client_wallets_all")
  @scala.inline
  def client_wallets_by_fundsType: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType = this.cast("client_wallets_by_fundsType")
  @scala.inline
  def client_wallets_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get = this.cast("client_wallets_get")
  @scala.inline
  def client_wallets_transactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions = this.cast("client_wallets_transactions")
  @scala.inline
  def clients_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get = this.cast("clients_get")
  @scala.inline
  def clients_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update = this.cast("clients_update")
  @scala.inline
  def clients_upload_logo: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo = this.cast("clients_upload_logo")
  @scala.inline
  def dispute_save_close: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close = this.cast("dispute_save_close")
  @scala.inline
  def disputes_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all = this.cast("disputes_all")
  @scala.inline
  def disputes_document_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all = this.cast("disputes_document_all")
  @scala.inline
  def disputes_document_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create = this.cast("disputes_document_create")
  @scala.inline
  def disputes_document_create_consult: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult = this.cast("disputes_document_create_consult")
  @scala.inline
  def disputes_document_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get = this.cast("disputes_document_get")
  @scala.inline
  def disputes_document_get_for_dispute: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute = this.cast("disputes_document_get_for_dispute")
  @scala.inline
  def disputes_document_page_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create = this.cast("disputes_document_page_create")
  @scala.inline
  def disputes_document_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save = this.cast("disputes_document_save")
  @scala.inline
  def disputes_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get = this.cast("disputes_get")
  @scala.inline
  def disputes_get_for_user: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user = this.cast("disputes_get_for_user")
  @scala.inline
  def disputes_get_for_wallet: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet = this.cast("disputes_get_for_wallet")
  @scala.inline
  def disputes_get_transactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions = this.cast("disputes_get_transactions")
  @scala.inline
  def disputes_pending_settlement: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement = this.cast("disputes_pending_settlement")
  @scala.inline
  def disputes_repudiation_create_settlement: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement = this.cast("disputes_repudiation_create_settlement")
  @scala.inline
  def disputes_repudiation_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get = this.cast("disputes_repudiation_get")
  @scala.inline
  def disputes_repudiation_get_settlement: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement = this.cast("disputes_repudiation_get_settlement")
  @scala.inline
  def disputes_save_contest_funds: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds = this.cast("disputes_save_contest_funds")
  @scala.inline
  def disputes_save_tag: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag = this.cast("disputes_save_tag")
  @scala.inline
  def events_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all = this.cast("events_all")
  @scala.inline
  def hooks_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all = this.cast("hooks_all")
  @scala.inline
  def hooks_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create = this.cast("hooks_create")
  @scala.inline
  def hooks_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get = this.cast("hooks_get")
  @scala.inline
  def hooks_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save = this.cast("hooks_save")
  @scala.inline
  def kyc_documents_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all = this.cast("kyc_documents_all")
  @scala.inline
  def kyc_documents_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create = this.cast("kyc_documents_create")
  @scala.inline
  def kyc_documents_create_consult: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult = this.cast("kyc_documents_create_consult")
  @scala.inline
  def kyc_documents_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get = this.cast("kyc_documents_get")
  @scala.inline
  def kyc_documents_get_alt: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt = this.cast("kyc_documents_get_alt")
  @scala.inline
  def kyc_documents_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save = this.cast("kyc_documents_save")
  @scala.inline
  def kyc_page_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create = this.cast("kyc_page_create")
  @scala.inline
  def mandates_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all = this.cast("mandates_all")
  @scala.inline
  def mandates_cancel: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel = this.cast("mandates_cancel")
  @scala.inline
  def `mandates_directdebit-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create` = this.cast("mandates_directdebit-web_create")
  @scala.inline
  def mandates_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get = this.cast("mandates_get")
  @scala.inline
  def mandates_get_for_bank_account: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account = this.cast("mandates_get_for_bank_account")
  @scala.inline
  def mandates_get_for_user: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user = this.cast("mandates_get_for_user")
  @scala.inline
  def `payins_bankwire-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create` = this.cast("payins_bankwire-direct_create")
  @scala.inline
  def `payins_card-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create` = this.cast("payins_card-direct_create")
  @scala.inline
  def `payins_card-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create` = this.cast("payins_card-web_create")
  @scala.inline
  def payins_createrefunds: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds = this.cast("payins_createrefunds")
  @scala.inline
  def `payins_directdebit-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create` = this.cast("payins_directdebit-direct_create")
  @scala.inline
  def `payins_directdebit-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create` = this.cast("payins_directdebit-web_create")
  @scala.inline
  def payins_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get = this.cast("payins_get")
  @scala.inline
  def `payins_paypal-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create` = this.cast("payins_paypal-web_create")
  @scala.inline
  def `payins_preauthorized-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create` = this.cast("payins_preauthorized-direct_create")
  @scala.inline
  def payouts_bankwire_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create = this.cast("payouts_bankwire_create")
  @scala.inline
  def payouts_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get = this.cast("payouts_get")
  @scala.inline
  def preauthorization_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create = this.cast("preauthorization_create")
  @scala.inline
  def preauthorization_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get = this.cast("preauthorization_get")
  @scala.inline
  def preauthorization_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save = this.cast("preauthorization_save")
  @scala.inline
  def preauthorizations_get_for_user: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user = this.cast("preauthorizations_get_for_user")
  @scala.inline
  def refunds_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get = this.cast("refunds_get")
  @scala.inline
  def refunds_get_for_payin: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin = this.cast("refunds_get_for_payin")
  @scala.inline
  def refunds_get_for_payout: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout = this.cast("refunds_get_for_payout")
  @scala.inline
  def refunds_get_for_repudiation: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation = this.cast("refunds_get_for_repudiation")
  @scala.inline
  def refunds_get_for_transfer: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer = this.cast("refunds_get_for_transfer")
  @scala.inline
  def reports_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all = this.cast("reports_all")
  @scala.inline
  def reports_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get = this.cast("reports_get")
  @scala.inline
  def reports_transaction_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create = this.cast("reports_transaction_create")
  @scala.inline
  def reports_wallet_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create = this.cast("reports_wallet_create")
  @scala.inline
  def responses_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get = this.cast("responses_get")
  @scala.inline
  def transactions_get_for_bank_account: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account = this.cast("transactions_get_for_bank_account")
  @scala.inline
  def transactions_get_for_card: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card = this.cast("transactions_get_for_card")
  @scala.inline
  def transactions_get_for_mandate: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate = this.cast("transactions_get_for_mandate")
  @scala.inline
  def transfers_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create = this.cast("transfers_create")
  @scala.inline
  def transfers_createrefunds: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds = this.cast("transfers_createrefunds")
  @scala.inline
  def transfers_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get = this.cast("transfers_get")
  @scala.inline
  def ubo_declaration_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create = this.cast("ubo_declaration_create")
  @scala.inline
  def ubo_declaration_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get = this.cast("ubo_declaration_get")
  @scala.inline
  def ubo_declaration_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update = this.cast("ubo_declaration_update")
  @scala.inline
  def users_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all = this.cast("users_all")
  @scala.inline
  def users_allbankaccount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount = this.cast("users_allbankaccount")
  @scala.inline
  def users_allcards: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards = this.cast("users_allcards")
  @scala.inline
  def users_allkycdocuments: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments = this.cast("users_allkycdocuments")
  @scala.inline
  def users_alltransactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions = this.cast("users_alltransactions")
  @scala.inline
  def users_allwallets: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets = this.cast("users_allwallets")
  @scala.inline
  def users_createbankaccounts_ca: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca = this.cast("users_createbankaccounts_ca")
  @scala.inline
  def users_createbankaccounts_gb: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb = this.cast("users_createbankaccounts_gb")
  @scala.inline
  def users_createbankaccounts_iban: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban = this.cast("users_createbankaccounts_iban")
  @scala.inline
  def users_createbankaccounts_other: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other = this.cast("users_createbankaccounts_other")
  @scala.inline
  def users_createbankaccounts_us: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us = this.cast("users_createbankaccounts_us")
  @scala.inline
  def users_createlegals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals = this.cast("users_createlegals")
  @scala.inline
  def users_createnaturals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals = this.cast("users_createnaturals")
  @scala.inline
  def users_deactivate_bankaccount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount = this.cast("users_deactivate_bankaccount")
  @scala.inline
  def users_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get = this.cast("users_get")
  @scala.inline
  def users_getbankaccount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount = this.cast("users_getbankaccount")
  @scala.inline
  def users_getemoney: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney = this.cast("users_getemoney")
  @scala.inline
  def users_getlegals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals = this.cast("users_getlegals")
  @scala.inline
  def users_getnaturals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals = this.cast("users_getnaturals")
  @scala.inline
  def users_savelegals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals = this.cast("users_savelegals")
  @scala.inline
  def users_savenaturals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals = this.cast("users_savenaturals")
  @scala.inline
  def wallets_alltransactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions = this.cast("wallets_alltransactions")
  @scala.inline
  def wallets_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create = this.cast("wallets_create")
  @scala.inline
  def wallets_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get = this.cast("wallets_get")
  @scala.inline
  def wallets_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save = this.cast("wallets_save")
}

