package typingsJapgolly.stripe.anon

import typingsJapgolly.stripe.mod.Stripe.FinancialConnections.AccountsResource
import typingsJapgolly.stripe.mod.Stripe.FinancialConnections.SessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accounts extends StObject {
  
  var accounts: AccountsResource
  
  var sessions: SessionsResource
}
object Accounts {
  
  inline def apply(accounts: AccountsResource, sessions: SessionsResource): Accounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
  
  extension [Self <: Accounts](x: Self) {
    
    inline def setAccounts(value: AccountsResource): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setSessions(value: SessionsResource): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
  }
}
