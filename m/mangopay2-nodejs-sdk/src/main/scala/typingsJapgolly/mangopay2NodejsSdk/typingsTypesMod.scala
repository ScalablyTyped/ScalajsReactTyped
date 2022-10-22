package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.anon.Type
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsTypesMod {
  
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
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_applepay-direct_create`
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_googlepay-direct_create`
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration_get
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration_put
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_create_recurring_card_direct
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_payconiq-web_create`
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_get
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
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declarations_get
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_create
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_update
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_get
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.idempotency_response_get
  */
  trait ApiMethod extends StObject
  object ApiMethod {
    
    inline def authentication_oauth: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth = "authentication_oauth".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth]
    
    inline def banking_aliases_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all = "banking_aliases_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all]
    
    inline def banking_aliases_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get = "banking_aliases_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get]
    
    inline def banking_aliases_iban_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create = "banking_aliases_iban_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create]
    
    inline def banking_aliases_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update = "banking_aliases_update".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update]
    
    inline def card_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get = "card_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get]
    
    inline def card_get_preauthorizations: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations = "card_get_preauthorizations".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations]
    
    inline def card_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save = "card_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save]
    
    inline def cardregistration_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create = "cardregistration_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create]
    
    inline def cardregistration_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get = "cardregistration_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get]
    
    inline def cardregistration_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save = "cardregistration_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save]
    
    inline def cards_get_by_fingerprint: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint = "cards_get_by_fingerprint".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint]
    
    inline def client_wallets_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all = "client_wallets_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all]
    
    inline def client_wallets_by_fundsType: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType = "client_wallets_by_fundsType".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType]
    
    inline def client_wallets_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get = "client_wallets_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get]
    
    inline def client_wallets_transactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions = "client_wallets_transactions".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions]
    
    inline def clients_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get = "clients_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get]
    
    inline def clients_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update = "clients_update".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update]
    
    inline def clients_upload_logo: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo = "clients_upload_logo".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo]
    
    inline def dispute_save_close: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close = "dispute_save_close".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close]
    
    inline def disputes_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all = "disputes_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all]
    
    inline def disputes_document_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all = "disputes_document_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all]
    
    inline def disputes_document_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create = "disputes_document_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create]
    
    inline def disputes_document_create_consult: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult = "disputes_document_create_consult".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult]
    
    inline def disputes_document_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get = "disputes_document_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get]
    
    inline def disputes_document_get_for_dispute: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute = "disputes_document_get_for_dispute".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute]
    
    inline def disputes_document_page_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create = "disputes_document_page_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create]
    
    inline def disputes_document_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save = "disputes_document_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save]
    
    inline def disputes_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get = "disputes_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get]
    
    inline def disputes_get_for_user: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user = "disputes_get_for_user".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user]
    
    inline def disputes_get_for_wallet: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet = "disputes_get_for_wallet".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet]
    
    inline def disputes_get_transactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions = "disputes_get_transactions".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions]
    
    inline def disputes_pending_settlement: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement = "disputes_pending_settlement".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement]
    
    inline def disputes_repudiation_create_settlement: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement = "disputes_repudiation_create_settlement".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement]
    
    inline def disputes_repudiation_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get = "disputes_repudiation_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get]
    
    inline def disputes_repudiation_get_settlement: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement = "disputes_repudiation_get_settlement".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement]
    
    inline def disputes_save_contest_funds: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds = "disputes_save_contest_funds".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds]
    
    inline def disputes_save_tag: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag = "disputes_save_tag".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag]
    
    inline def events_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all = "events_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all]
    
    inline def hooks_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all = "hooks_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all]
    
    inline def hooks_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create = "hooks_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create]
    
    inline def hooks_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get = "hooks_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get]
    
    inline def hooks_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save = "hooks_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save]
    
    inline def idempotency_response_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.idempotency_response_get = "idempotency_response_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.idempotency_response_get]
    
    inline def kyc_documents_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all = "kyc_documents_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all]
    
    inline def kyc_documents_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create = "kyc_documents_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create]
    
    inline def kyc_documents_create_consult: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult = "kyc_documents_create_consult".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult]
    
    inline def kyc_documents_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get = "kyc_documents_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get]
    
    inline def kyc_documents_get_alt: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt = "kyc_documents_get_alt".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt]
    
    inline def kyc_documents_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save = "kyc_documents_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save]
    
    inline def kyc_page_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create = "kyc_page_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create]
    
    inline def mandates_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all = "mandates_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all]
    
    inline def mandates_cancel: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel = "mandates_cancel".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel]
    
    inline def `mandates_directdebit-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create` = "mandates_directdebit-web_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create`]
    
    inline def mandates_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get = "mandates_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get]
    
    inline def mandates_get_for_bank_account: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account = "mandates_get_for_bank_account".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account]
    
    inline def mandates_get_for_user: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user = "mandates_get_for_user".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user]
    
    inline def `payins_applepay-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_applepay-direct_create` = "payins_applepay-direct_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_applepay-direct_create`]
    
    inline def `payins_bankwire-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create` = "payins_bankwire-direct_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create`]
    
    inline def `payins_card-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create` = "payins_card-direct_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create`]
    
    inline def `payins_card-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create` = "payins_card-web_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create`]
    
    inline def payins_create_recurring_card_direct: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_create_recurring_card_direct = "payins_create_recurring_card_direct".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_create_recurring_card_direct]
    
    inline def payins_createrefunds: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds = "payins_createrefunds".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds]
    
    inline def `payins_directdebit-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create` = "payins_directdebit-direct_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create`]
    
    inline def `payins_directdebit-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create` = "payins_directdebit-web_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create`]
    
    inline def payins_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get = "payins_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get]
    
    inline def `payins_googlepay-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_googlepay-direct_create` = "payins_googlepay-direct_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_googlepay-direct_create`]
    
    inline def `payins_payconiq-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_payconiq-web_create` = "payins_payconiq-web_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_payconiq-web_create`]
    
    inline def `payins_paypal-web_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create` = "payins_paypal-web_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create`]
    
    inline def `payins_preauthorized-direct_create`: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create` = "payins_preauthorized-direct_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create`]
    
    inline def payins_recurring_registration: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration = "payins_recurring_registration".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration]
    
    inline def payins_recurring_registration_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration_get = "payins_recurring_registration_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration_get]
    
    inline def payins_recurring_registration_put: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration_put = "payins_recurring_registration_put".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_recurring_registration_put]
    
    inline def payouts_bankwire_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create = "payouts_bankwire_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create]
    
    inline def payouts_bankwire_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_get = "payouts_bankwire_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_get]
    
    inline def payouts_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get = "payouts_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get]
    
    inline def preauthorization_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create = "preauthorization_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create]
    
    inline def preauthorization_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get = "preauthorization_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get]
    
    inline def preauthorization_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save = "preauthorization_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save]
    
    inline def preauthorizations_get_for_user: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user = "preauthorizations_get_for_user".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user]
    
    inline def refunds_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get = "refunds_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get]
    
    inline def refunds_get_for_payin: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin = "refunds_get_for_payin".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin]
    
    inline def refunds_get_for_payout: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout = "refunds_get_for_payout".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout]
    
    inline def refunds_get_for_repudiation: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation = "refunds_get_for_repudiation".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation]
    
    inline def refunds_get_for_transfer: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer = "refunds_get_for_transfer".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer]
    
    inline def reports_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all = "reports_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all]
    
    inline def reports_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get = "reports_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get]
    
    inline def reports_transaction_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create = "reports_transaction_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create]
    
    inline def reports_wallet_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create = "reports_wallet_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create]
    
    inline def responses_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get = "responses_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get]
    
    inline def transactions_get_for_bank_account: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account = "transactions_get_for_bank_account".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account]
    
    inline def transactions_get_for_card: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card = "transactions_get_for_card".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card]
    
    inline def transactions_get_for_mandate: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate = "transactions_get_for_mandate".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate]
    
    inline def transfers_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create = "transfers_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create]
    
    inline def transfers_createrefunds: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds = "transfers_createrefunds".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds]
    
    inline def transfers_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get = "transfers_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get]
    
    inline def ubo_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_create = "ubo_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_create]
    
    inline def ubo_declaration_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create = "ubo_declaration_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create]
    
    inline def ubo_declaration_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get = "ubo_declaration_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get]
    
    inline def ubo_declaration_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update = "ubo_declaration_update".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update]
    
    inline def ubo_declarations_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declarations_get = "ubo_declarations_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declarations_get]
    
    inline def ubo_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_get = "ubo_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_get]
    
    inline def ubo_update: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_update = "ubo_update".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_update]
    
    inline def users_all: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all = "users_all".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all]
    
    inline def users_allbankaccount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount = "users_allbankaccount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount]
    
    inline def users_allcards: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards = "users_allcards".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards]
    
    inline def users_allkycdocuments: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments = "users_allkycdocuments".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments]
    
    inline def users_alltransactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions = "users_alltransactions".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions]
    
    inline def users_allwallets: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets = "users_allwallets".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets]
    
    inline def users_createbankaccounts_ca: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca = "users_createbankaccounts_ca".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca]
    
    inline def users_createbankaccounts_gb: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb = "users_createbankaccounts_gb".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb]
    
    inline def users_createbankaccounts_iban: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban = "users_createbankaccounts_iban".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban]
    
    inline def users_createbankaccounts_other: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other = "users_createbankaccounts_other".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other]
    
    inline def users_createbankaccounts_us: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us = "users_createbankaccounts_us".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us]
    
    inline def users_createlegals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals = "users_createlegals".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals]
    
    inline def users_createnaturals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals = "users_createnaturals".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals]
    
    inline def users_deactivate_bankaccount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount = "users_deactivate_bankaccount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount]
    
    inline def users_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get = "users_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get]
    
    inline def users_getbankaccount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount = "users_getbankaccount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount]
    
    inline def users_getemoney: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney = "users_getemoney".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney]
    
    inline def users_getlegals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals = "users_getlegals".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals]
    
    inline def users_getnaturals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals = "users_getnaturals".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals]
    
    inline def users_savelegals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals = "users_savelegals".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals]
    
    inline def users_savenaturals: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals = "users_savenaturals".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals]
    
    inline def wallets_alltransactions: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions = "wallets_alltransactions".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions]
    
    inline def wallets_create: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create = "wallets_create".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create]
    
    inline def wallets_get: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get = "wallets_get".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get]
    
    inline def wallets_save: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save = "wallets_save".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW
  */
  trait CountryISO extends StObject
  object CountryISO {
    
    inline def AD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD = "AD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD]
    
    inline def AE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE = "AE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE]
    
    inline def AF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF = "AF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF]
    
    inline def AG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG = "AG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG]
    
    inline def AI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI = "AI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI]
    
    inline def AL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL = "AL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL]
    
    inline def AM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM = "AM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM]
    
    inline def AO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO = "AO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO]
    
    inline def AQ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ = "AQ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ]
    
    inline def AR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR = "AR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR]
    
    inline def AS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS = "AS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS]
    
    inline def AT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT = "AT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT]
    
    inline def AU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU = "AU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU]
    
    inline def AW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW = "AW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW]
    
    inline def AX: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX = "AX".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX]
    
    inline def AZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ = "AZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ]
    
    inline def BA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA = "BA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA]
    
    inline def BB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB = "BB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB]
    
    inline def BD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD = "BD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD]
    
    inline def BE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE = "BE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE]
    
    inline def BF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF = "BF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF]
    
    inline def BG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG = "BG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG]
    
    inline def BH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH = "BH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH]
    
    inline def BI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI = "BI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI]
    
    inline def BJ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ = "BJ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ]
    
    inline def BL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL = "BL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL]
    
    inline def BM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM = "BM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM]
    
    inline def BN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN = "BN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN]
    
    inline def BO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO = "BO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO]
    
    inline def BQ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ = "BQ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ]
    
    inline def BR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR = "BR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR]
    
    inline def BS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS = "BS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS]
    
    inline def BT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT = "BT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT]
    
    inline def BV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV = "BV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV]
    
    inline def BW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW = "BW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW]
    
    inline def BY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY = "BY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY]
    
    inline def BZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ = "BZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ]
    
    inline def CA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = "CA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA]
    
    inline def CC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC = "CC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC]
    
    inline def CD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD = "CD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD]
    
    inline def CF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF = "CF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF]
    
    inline def CG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG = "CG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG]
    
    inline def CH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH = "CH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH]
    
    inline def CI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI = "CI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI]
    
    inline def CK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK = "CK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK]
    
    inline def CL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL = "CL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL]
    
    inline def CM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM = "CM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM]
    
    inline def CN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN = "CN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN]
    
    inline def CO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO = "CO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO]
    
    inline def CR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR = "CR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR]
    
    inline def CS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CS = "CS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CS]
    
    inline def CU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU = "CU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU]
    
    inline def CV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV = "CV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV]
    
    inline def CW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW = "CW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW]
    
    inline def CX: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX = "CX".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX]
    
    inline def CY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY = "CY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY]
    
    inline def CZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ = "CZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ]
    
    inline def DA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DA = "DA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DA]
    
    inline def DE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE = "DE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE]
    
    inline def DJ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ = "DJ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ]
    
    inline def DK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK = "DK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK]
    
    inline def DM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM = "DM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM]
    
    inline def DO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO = "DO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO]
    
    inline def DZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ = "DZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ]
    
    inline def EC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC = "EC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC]
    
    inline def EE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE = "EE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE]
    
    inline def EG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG = "EG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG]
    
    inline def EH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH = "EH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH]
    
    inline def EL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EL = "EL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EL]
    
    inline def EN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EN = "EN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EN]
    
    inline def ER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER = "ER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER]
    
    inline def ES: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES = "ES".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES]
    
    inline def ET: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET = "ET".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET]
    
    inline def FI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI = "FI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI]
    
    inline def FJ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ = "FJ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ]
    
    inline def FK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK = "FK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK]
    
    inline def FM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM = "FM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM]
    
    inline def FO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO = "FO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO]
    
    inline def FR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR = "FR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR]
    
    inline def GA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA = "GA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA]
    
    inline def GB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = "GB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB]
    
    inline def GD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD = "GD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD]
    
    inline def GE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE = "GE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE]
    
    inline def GF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF = "GF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF]
    
    inline def GG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG = "GG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG]
    
    inline def GH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH = "GH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH]
    
    inline def GI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI = "GI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI]
    
    inline def GL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL = "GL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL]
    
    inline def GM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM = "GM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM]
    
    inline def GN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN = "GN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN]
    
    inline def GP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP = "GP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP]
    
    inline def GQ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ = "GQ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ]
    
    inline def GR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR = "GR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR]
    
    inline def GS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS = "GS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS]
    
    inline def GT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT = "GT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT]
    
    inline def GU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU = "GU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU]
    
    inline def GW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW = "GW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW]
    
    inline def GY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY = "GY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY]
    
    inline def HK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK = "HK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK]
    
    inline def HM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM = "HM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM]
    
    inline def HN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN = "HN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN]
    
    inline def HR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR = "HR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR]
    
    inline def HT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT = "HT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT]
    
    inline def HU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU = "HU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU]
    
    inline def ID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID = "ID".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID]
    
    inline def IE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE = "IE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE]
    
    inline def IL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL = "IL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL]
    
    inline def IM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM = "IM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM]
    
    inline def IN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN = "IN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN]
    
    inline def IO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO = "IO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO]
    
    inline def IQ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ = "IQ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ]
    
    inline def IR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR = "IR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR]
    
    inline def IS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS = "IS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS]
    
    inline def IT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT = "IT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT]
    
    inline def JE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE = "JE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE]
    
    inline def JM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM = "JM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM]
    
    inline def JO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO = "JO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO]
    
    inline def JP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP = "JP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP]
    
    inline def KE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE = "KE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE]
    
    inline def KG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG = "KG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG]
    
    inline def KH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH = "KH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH]
    
    inline def KI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI = "KI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI]
    
    inline def KM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM = "KM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM]
    
    inline def KN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN = "KN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN]
    
    inline def KP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP = "KP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP]
    
    inline def KR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR = "KR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR]
    
    inline def KW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW = "KW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW]
    
    inline def KY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY = "KY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY]
    
    inline def KZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ = "KZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ]
    
    inline def LA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA = "LA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA]
    
    inline def LB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB = "LB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB]
    
    inline def LC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC = "LC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC]
    
    inline def LI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI = "LI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI]
    
    inline def LK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK = "LK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK]
    
    inline def LR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR = "LR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR]
    
    inline def LS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS = "LS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS]
    
    inline def LT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT = "LT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT]
    
    inline def LU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU = "LU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU]
    
    inline def LV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV = "LV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV]
    
    inline def LY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY = "LY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY]
    
    inline def MA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA = "MA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA]
    
    inline def MC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC = "MC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC]
    
    inline def MD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD = "MD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD]
    
    inline def ME: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME = "ME".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME]
    
    inline def MF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF = "MF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF]
    
    inline def MG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG = "MG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG]
    
    inline def MH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH = "MH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH]
    
    inline def MK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK = "MK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK]
    
    inline def ML: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML = "ML".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML]
    
    inline def MM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM = "MM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM]
    
    inline def MN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN = "MN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN]
    
    inline def MO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO = "MO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO]
    
    inline def MP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP = "MP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP]
    
    inline def MQ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ = "MQ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ]
    
    inline def MR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR = "MR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR]
    
    inline def MS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS = "MS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS]
    
    inline def MT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT = "MT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT]
    
    inline def MU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU = "MU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU]
    
    inline def MV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV = "MV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV]
    
    inline def MW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW = "MW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW]
    
    inline def MX: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX = "MX".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX]
    
    inline def MY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY = "MY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY]
    
    inline def MZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ = "MZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ]
    
    inline def NA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA = "NA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA]
    
    inline def NC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC = "NC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC]
    
    inline def NE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE = "NE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE]
    
    inline def NF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF = "NF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF]
    
    inline def NG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG = "NG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG]
    
    inline def NI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI = "NI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI]
    
    inline def NL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL = "NL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL]
    
    inline def NO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO = "NO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO]
    
    inline def NP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP = "NP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP]
    
    inline def NR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR = "NR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR]
    
    inline def NU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU = "NU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU]
    
    inline def NZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ = "NZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ]
    
    inline def OM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM = "OM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM]
    
    inline def PA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA = "PA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA]
    
    inline def PE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE = "PE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE]
    
    inline def PF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF = "PF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF]
    
    inline def PG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG = "PG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG]
    
    inline def PH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH = "PH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH]
    
    inline def PK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK = "PK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK]
    
    inline def PL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL = "PL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL]
    
    inline def PM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM = "PM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM]
    
    inline def PN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN = "PN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN]
    
    inline def PR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR = "PR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR]
    
    inline def PS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS = "PS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS]
    
    inline def PT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT = "PT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT]
    
    inline def PW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW = "PW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW]
    
    inline def PY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY = "PY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY]
    
    inline def QA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA = "QA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA]
    
    inline def RE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE = "RE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE]
    
    inline def RO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO = "RO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO]
    
    inline def RS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS = "RS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS]
    
    inline def RU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU = "RU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU]
    
    inline def RW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW = "RW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW]
    
    inline def SA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA = "SA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA]
    
    inline def SB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB = "SB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB]
    
    inline def SC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC = "SC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC]
    
    inline def SD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD = "SD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD]
    
    inline def SE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE = "SE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE]
    
    inline def SG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG = "SG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG]
    
    inline def SH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH = "SH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH]
    
    inline def SI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI = "SI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI]
    
    inline def SJ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ = "SJ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ]
    
    inline def SK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK = "SK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK]
    
    inline def SL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL = "SL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL]
    
    inline def SM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM = "SM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM]
    
    inline def SN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN = "SN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN]
    
    inline def SO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO = "SO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO]
    
    inline def SR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR = "SR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR]
    
    inline def SS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS = "SS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS]
    
    inline def ST: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST = "ST".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST]
    
    inline def SV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV = "SV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV]
    
    inline def SX: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX = "SX".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX]
    
    inline def SY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY = "SY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY]
    
    inline def SZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ = "SZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ]
    
    inline def TC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC = "TC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC]
    
    inline def TD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD = "TD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD]
    
    inline def TF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF = "TF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF]
    
    inline def TG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG = "TG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG]
    
    inline def TH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH = "TH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH]
    
    inline def TJ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ = "TJ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ]
    
    inline def TK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK = "TK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK]
    
    inline def TL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL = "TL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL]
    
    inline def TM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM = "TM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM]
    
    inline def TN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN = "TN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN]
    
    inline def TO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO = "TO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO]
    
    inline def TR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR = "TR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR]
    
    inline def TT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT = "TT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT]
    
    inline def TV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV = "TV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV]
    
    inline def TW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW = "TW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW]
    
    inline def TZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ = "TZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ]
    
    inline def UA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA = "UA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA]
    
    inline def UG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG = "UG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG]
    
    inline def UM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM = "UM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM]
    
    inline def US: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = "US".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US]
    
    inline def UY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY = "UY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY]
    
    inline def UZ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ = "UZ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ]
    
    inline def VA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA = "VA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA]
    
    inline def VC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC = "VC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC]
    
    inline def VE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE = "VE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE]
    
    inline def VG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG = "VG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG]
    
    inline def VI: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI = "VI".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI]
    
    inline def VN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN = "VN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN]
    
    inline def VU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU = "VU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU]
    
    inline def WF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF = "WF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF]
    
    inline def WS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS = "WS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS]
    
    inline def YE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE = "YE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE]
    
    inline def YT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT = "YT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT]
    
    inline def ZA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA = "ZA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA]
    
    inline def ZM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM = "ZM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM]
    
    inline def ZW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW = "ZW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD
  */
  trait CurrencyISO extends StObject
  object CurrencyISO {
    
    inline def AED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED = "AED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED]
    
    inline def AFN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN = "AFN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN]
    
    inline def ALL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL = "ALL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL]
    
    inline def AMD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD = "AMD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD]
    
    inline def ANG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG = "ANG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG]
    
    inline def AOA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA = "AOA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA]
    
    inline def ARS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS = "ARS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS]
    
    inline def AUD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD = "AUD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD]
    
    inline def AWG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG = "AWG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG]
    
    inline def AZN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN = "AZN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN]
    
    inline def BAM: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM = "BAM".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM]
    
    inline def BBD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD = "BBD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD]
    
    inline def BDT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT = "BDT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT]
    
    inline def BGN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN = "BGN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN]
    
    inline def BHD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD = "BHD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD]
    
    inline def BIF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF = "BIF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF]
    
    inline def BMD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD = "BMD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD]
    
    inline def BND: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND = "BND".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND]
    
    inline def BOB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB = "BOB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB]
    
    inline def BRL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL = "BRL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL]
    
    inline def BSD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD = "BSD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD]
    
    inline def BTN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN = "BTN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN]
    
    inline def BWP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP = "BWP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP]
    
    inline def BYN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN = "BYN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN]
    
    inline def BZD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD = "BZD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD]
    
    inline def CAD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD = "CAD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD]
    
    inline def CDF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF = "CDF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF]
    
    inline def CHF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF = "CHF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF]
    
    inline def CLP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP = "CLP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP]
    
    inline def CNY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY = "CNY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY]
    
    inline def COP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP = "COP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP]
    
    inline def CRC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC = "CRC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC]
    
    inline def CUC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC = "CUC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC]
    
    inline def CUP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP = "CUP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP]
    
    inline def CVE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE = "CVE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE]
    
    inline def CZK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK = "CZK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK]
    
    inline def DJF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF = "DJF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF]
    
    inline def DKK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK = "DKK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK]
    
    inline def DOP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP = "DOP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP]
    
    inline def DZD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD = "DZD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD]
    
    inline def EGP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP = "EGP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP]
    
    inline def ERN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN = "ERN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN]
    
    inline def ETB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB = "ETB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB]
    
    inline def EUR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR = "EUR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR]
    
    inline def FJD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD = "FJD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD]
    
    inline def FKP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP = "FKP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP]
    
    inline def GBP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP = "GBP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP]
    
    inline def GEL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL = "GEL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL]
    
    inline def GGP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP = "GGP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP]
    
    inline def GHS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS = "GHS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS]
    
    inline def GIP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP = "GIP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP]
    
    inline def GMD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD = "GMD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD]
    
    inline def GNF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF = "GNF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF]
    
    inline def GTQ: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ = "GTQ".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ]
    
    inline def GYD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD = "GYD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD]
    
    inline def HKD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD = "HKD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD]
    
    inline def HNL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL = "HNL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL]
    
    inline def HRK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK = "HRK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK]
    
    inline def HTG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG = "HTG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG]
    
    inline def HUF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF = "HUF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF]
    
    inline def IDR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR = "IDR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR]
    
    inline def ILS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS = "ILS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS]
    
    inline def IMP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP = "IMP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP]
    
    inline def INR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR = "INR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR]
    
    inline def IQD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD = "IQD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD]
    
    inline def IRR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR = "IRR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR]
    
    inline def ISK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK = "ISK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK]
    
    inline def JEP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP = "JEP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP]
    
    inline def JMD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD = "JMD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD]
    
    inline def JOD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD = "JOD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD]
    
    inline def JPY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY = "JPY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY]
    
    inline def KES: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES = "KES".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES]
    
    inline def KGS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS = "KGS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS]
    
    inline def KHR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR = "KHR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR]
    
    inline def KMF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF = "KMF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF]
    
    inline def KPW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW = "KPW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW]
    
    inline def KRW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW = "KRW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW]
    
    inline def KWD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD = "KWD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD]
    
    inline def KYD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD = "KYD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD]
    
    inline def KZT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT = "KZT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT]
    
    inline def LAK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK = "LAK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK]
    
    inline def LBP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP = "LBP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP]
    
    inline def LKR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR = "LKR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR]
    
    inline def LRD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD = "LRD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD]
    
    inline def LSL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL = "LSL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL]
    
    inline def LYD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD = "LYD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD]
    
    inline def MAD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD = "MAD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD]
    
    inline def MDL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL = "MDL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL]
    
    inline def MGA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA = "MGA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA]
    
    inline def MKD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD = "MKD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD]
    
    inline def MMK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK = "MMK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK]
    
    inline def MNT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT = "MNT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT]
    
    inline def MOP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP = "MOP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP]
    
    inline def MRU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU = "MRU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU]
    
    inline def MUR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR = "MUR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR]
    
    inline def MVR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR = "MVR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR]
    
    inline def MWK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK = "MWK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK]
    
    inline def MXN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN = "MXN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN]
    
    inline def MYR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR = "MYR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR]
    
    inline def MZN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN = "MZN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN]
    
    inline def NAD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD = "NAD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD]
    
    inline def NGN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN = "NGN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN]
    
    inline def NIO: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO = "NIO".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO]
    
    inline def NOK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK = "NOK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK]
    
    inline def NPR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR = "NPR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR]
    
    inline def NZD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD = "NZD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD]
    
    inline def OMR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR = "OMR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR]
    
    inline def PAB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB = "PAB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB]
    
    inline def PEN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN = "PEN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN]
    
    inline def PGK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK = "PGK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK]
    
    inline def PHP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP = "PHP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP]
    
    inline def PKR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR = "PKR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR]
    
    inline def PLN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN = "PLN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN]
    
    inline def PYG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG = "PYG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG]
    
    inline def QAR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR = "QAR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR]
    
    inline def RON: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON = "RON".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON]
    
    inline def RSD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD = "RSD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD]
    
    inline def RUB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB = "RUB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB]
    
    inline def RWF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF = "RWF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF]
    
    inline def SAR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR = "SAR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR]
    
    inline def SBD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD = "SBD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD]
    
    inline def SCR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR = "SCR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR]
    
    inline def SDG: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG = "SDG".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG]
    
    inline def SEK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK = "SEK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK]
    
    inline def SGD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD = "SGD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD]
    
    inline def SHP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP = "SHP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP]
    
    inline def SLL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL = "SLL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL]
    
    inline def SOS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS = "SOS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS]
    
    inline def SPL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL = "SPL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL]
    
    inline def SRD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD = "SRD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD]
    
    inline def STN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN = "STN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN]
    
    inline def SVC: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC = "SVC".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC]
    
    inline def SYP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP = "SYP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP]
    
    inline def SZL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL = "SZL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL]
    
    inline def THB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB = "THB".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB]
    
    inline def TJS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS = "TJS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS]
    
    inline def TMT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT = "TMT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT]
    
    inline def TND: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND = "TND".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND]
    
    inline def TOP: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP = "TOP".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP]
    
    inline def TRY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY = "TRY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY]
    
    inline def TTD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD = "TTD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD]
    
    inline def TVD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD = "TVD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD]
    
    inline def TWD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD = "TWD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD]
    
    inline def TZS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS = "TZS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS]
    
    inline def UAH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH = "UAH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH]
    
    inline def UGX: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX = "UGX".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX]
    
    inline def USD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD = "USD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD]
    
    inline def UYU: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU = "UYU".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU]
    
    inline def UZS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS = "UZS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS]
    
    inline def VEF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF = "VEF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF]
    
    inline def VND: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND = "VND".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND]
    
    inline def VUV: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV = "VUV".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV]
    
    inline def WST: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST = "WST".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST]
    
    inline def XAF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF = "XAF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF]
    
    inline def XCD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD = "XCD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD]
    
    inline def XDR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR = "XDR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR]
    
    inline def XOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF = "XOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF]
    
    inline def XPF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF = "XPF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF]
    
    inline def YER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER = "YER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER]
    
    inline def ZAR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR = "ZAR".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR]
    
    inline def ZMW: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW = "ZMW".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW]
    
    inline def ZWD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD = "ZWD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD]
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  type MakeKeysNullable[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in T2 ]: T1[P] | null} */ js.Any)
  
  type MakeKeysOptional[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) & (Partial[Pick[T1, T2]])
  
  type MakeKeysRequired[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) & (Required[Pick[T1, T2]])
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OmitType[T /* <: Type */] = Omit[T, typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
  
  type PickPartial[T, Par /* <: /* keyof T */ String */] = Pick[Partial[T], Par]
  
  type PickPartialRequired[T, Par /* <: /* keyof T */ String */, Req /* <: /* keyof T */ String */] = (Pick[Partial[T], Par]) & (Pick[Required[T], Req])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FORCE
    - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHOICE
  */
  trait SecureMode extends StObject
  object SecureMode {
    
    inline def DEFAULT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT = "DEFAULT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT]
    
    inline def FORCE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FORCE = "FORCE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FORCE]
    
    inline def NO_CHOICE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHOICE = "NO_CHOICE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHOICE]
  }
  
  type Timestamp = Double
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
