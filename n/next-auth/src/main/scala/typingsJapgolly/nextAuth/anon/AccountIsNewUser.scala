package typingsJapgolly.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIsNewUser extends StObject {
  
  var account: typingsJapgolly.nextAuth.coreTypesMod.Account
  
  var isNewUser: Unit
  
  var session: Unit
  
  var user: typingsJapgolly.nextAuth.coreTypesMod.User
}
object AccountIsNewUser {
  
  inline def apply(
    account: typingsJapgolly.nextAuth.coreTypesMod.Account,
    isNewUser: Unit,
    session: Unit,
    user: typingsJapgolly.nextAuth.coreTypesMod.User
  ): AccountIsNewUser = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], isNewUser = isNewUser.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIsNewUser]
  }
  
  extension [Self <: AccountIsNewUser](x: Self) {
    
    inline def setAccount(value: typingsJapgolly.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setIsNewUser(value: Unit): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Unit): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUser(value: typingsJapgolly.nextAuth.coreTypesMod.User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
