package typingsJapgolly.keytar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Account extends StObject {
    
    var account: String
    
    var password: String
  }
  object Account {
    
    inline def apply(account: String, password: String): Account = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    extension [Self <: Account](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
}
