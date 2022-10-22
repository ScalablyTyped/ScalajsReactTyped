package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.braintreeStrings.authorization_expired
import typingsJapgolly.braintree.braintreeStrings.authorized
import typingsJapgolly.braintree.braintreeStrings.authorizing
import typingsJapgolly.braintree.braintreeStrings.failed
import typingsJapgolly.braintree.braintreeStrings.gateway_rejected
import typingsJapgolly.braintree.braintreeStrings.processor_declined
import typingsJapgolly.braintree.braintreeStrings.settled
import typingsJapgolly.braintree.braintreeStrings.settlement_confirmed
import typingsJapgolly.braintree.braintreeStrings.settlement_declined
import typingsJapgolly.braintree.braintreeStrings.settlement_pending
import typingsJapgolly.braintree.braintreeStrings.settling
import typingsJapgolly.braintree.braintreeStrings.submitted_for_settlement
import typingsJapgolly.braintree.braintreeStrings.voided
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationExpired extends StObject {
  
  def All(): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Status * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Status * / any, 'All'>] */ js.Any
  ]
  
  var AuthorizationExpired: authorization_expired
  
  var Authorized: authorized
  
  var Authorizing: authorizing
  
  var Failed: failed
  
  var GatewayRejected: gateway_rejected
  
  var ProcessorDeclined: processor_declined
  
  var Settled: settled
  
  var SettlementConfirmed: settlement_confirmed
  
  var SettlementDeclined: settlement_declined
  
  var SettlementPending: settlement_pending
  
  var Settling: settling
  
  var SubmittedForSettlement: submitted_for_settlement
  
  var Voided: voided
}
object AuthorizationExpired {
  
  inline def apply(
    All: CallbackTo[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Status * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Status * / any, 'All'>] */ js.Any
      ]
    ]
  ): AuthorizationExpired = {
    val __obj = js.Dynamic.literal(All = All.toJsFn, AuthorizationExpired = "authorization_expired", Authorized = "authorized", Authorizing = "authorizing", Failed = "failed", GatewayRejected = "gateway_rejected", ProcessorDeclined = "processor_declined", Settled = "settled", SettlementConfirmed = "settlement_confirmed", SettlementDeclined = "settlement_declined", SettlementPending = "settlement_pending", Settling = "settling", SubmittedForSettlement = "submitted_for_settlement", Voided = "voided")
    __obj.asInstanceOf[AuthorizationExpired]
  }
  
  extension [Self <: AuthorizationExpired](x: Self) {
    
    inline def setAll(
      value: CallbackTo[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Status * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Status * / any, 'All'>] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "All", value.toJsFn)
    
    inline def setAuthorizationExpired(value: authorization_expired): Self = StObject.set(x, "AuthorizationExpired", value.asInstanceOf[js.Any])
    
    inline def setAuthorized(value: authorized): Self = StObject.set(x, "Authorized", value.asInstanceOf[js.Any])
    
    inline def setAuthorizing(value: authorizing): Self = StObject.set(x, "Authorizing", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: failed): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setGatewayRejected(value: gateway_rejected): Self = StObject.set(x, "GatewayRejected", value.asInstanceOf[js.Any])
    
    inline def setProcessorDeclined(value: processor_declined): Self = StObject.set(x, "ProcessorDeclined", value.asInstanceOf[js.Any])
    
    inline def setSettled(value: settled): Self = StObject.set(x, "Settled", value.asInstanceOf[js.Any])
    
    inline def setSettlementConfirmed(value: settlement_confirmed): Self = StObject.set(x, "SettlementConfirmed", value.asInstanceOf[js.Any])
    
    inline def setSettlementDeclined(value: settlement_declined): Self = StObject.set(x, "SettlementDeclined", value.asInstanceOf[js.Any])
    
    inline def setSettlementPending(value: settlement_pending): Self = StObject.set(x, "SettlementPending", value.asInstanceOf[js.Any])
    
    inline def setSettling(value: settling): Self = StObject.set(x, "Settling", value.asInstanceOf[js.Any])
    
    inline def setSubmittedForSettlement(value: submitted_for_settlement): Self = StObject.set(x, "SubmittedForSettlement", value.asInstanceOf[js.Any])
    
    inline def setVoided(value: voided): Self = StObject.set(x, "Voided", value.asInstanceOf[js.Any])
  }
}
