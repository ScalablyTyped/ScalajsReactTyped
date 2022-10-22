package typingsJapgolly.azureMsalNode

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheItokencacheMod {
  
  trait ITokenCache extends StObject {
    
    /** Returns the signed in account matching homeAccountId */
    def getAccountByHomeId(homeAccountId: String): js.Promise[AccountInfo | Null]
    
    /** Returns the signed in account matching localAccountId */
    def getAccountByLocalId(localAccountId: String): js.Promise[AccountInfo | Null]
    
    /** API that retrieves all accounts currently in cache to the user */
    def getAllAccounts(): js.Promise[js.Array[AccountInfo]]
    
    /** API to remove a specific account and the relevant data from cache */
    def removeAccount(account: AccountInfo): js.Promise[Unit]
  }
  object ITokenCache {
    
    inline def apply(
      getAccountByHomeId: String => js.Promise[AccountInfo | Null],
      getAccountByLocalId: String => js.Promise[AccountInfo | Null],
      getAllAccounts: CallbackTo[js.Promise[js.Array[AccountInfo]]],
      removeAccount: AccountInfo => js.Promise[Unit]
    ): ITokenCache = {
      val __obj = js.Dynamic.literal(getAccountByHomeId = js.Any.fromFunction1(getAccountByHomeId), getAccountByLocalId = js.Any.fromFunction1(getAccountByLocalId), getAllAccounts = getAllAccounts.toJsFn, removeAccount = js.Any.fromFunction1(removeAccount))
      __obj.asInstanceOf[ITokenCache]
    }
    
    extension [Self <: ITokenCache](x: Self) {
      
      inline def setGetAccountByHomeId(value: String => js.Promise[AccountInfo | Null]): Self = StObject.set(x, "getAccountByHomeId", js.Any.fromFunction1(value))
      
      inline def setGetAccountByLocalId(value: String => js.Promise[AccountInfo | Null]): Self = StObject.set(x, "getAccountByLocalId", js.Any.fromFunction1(value))
      
      inline def setGetAllAccounts(value: CallbackTo[js.Promise[js.Array[AccountInfo]]]): Self = StObject.set(x, "getAllAccounts", value.toJsFn)
      
      inline def setRemoveAccount(value: AccountInfo => js.Promise[Unit]): Self = StObject.set(x, "removeAccount", js.Any.fromFunction1(value))
    }
  }
}
