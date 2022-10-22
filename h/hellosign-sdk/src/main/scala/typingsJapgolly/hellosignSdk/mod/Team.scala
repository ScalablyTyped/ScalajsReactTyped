package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.hellosignSdk.anon.Accountid
import typingsJapgolly.hellosignSdk.anon.Islocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Team extends StObject {
  
  var accounts: js.Array[Islocked]
  
  var invited_accounts: js.Array[Accountid]
  
  var name: String
}
object Team {
  
  inline def apply(accounts: js.Array[Islocked], invited_accounts: js.Array[Accountid], name: String): Team = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], invited_accounts = invited_accounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Team]
  }
  
  extension [Self <: Team](x: Self) {
    
    inline def setAccounts(value: js.Array[Islocked]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Islocked*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setInvited_accounts(value: js.Array[Accountid]): Self = StObject.set(x, "invited_accounts", value.asInstanceOf[js.Any])
    
    inline def setInvited_accountsVarargs(value: Accountid*): Self = StObject.set(x, "invited_accounts", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
