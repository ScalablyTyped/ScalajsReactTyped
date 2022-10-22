package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accounts {
  
  @JSImport("azdata", "accounts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def accountUpdated(updatedAccount: Account): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accountUpdated")(updatedAccount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def beginAutoOAuthDeviceCode(providerId: String, title: String, message: String, userCode: String, uri: String): Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginAutoOAuthDeviceCode")(providerId.asInstanceOf[js.Any], title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], userCode.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Thenable[Unit]]
  
  inline def endAutoOAuthDeviceCode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endAutoOAuthDeviceCode")().asInstanceOf[Unit]
  
  inline def getAccountSecurityToken(account: Account, tenantId: String, resource: AzureResource): Thenable[js.UndefOr[AccountSecurityToken]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccountSecurityToken")(account.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[AccountSecurityToken]]]
  
  inline def getAllAccounts(): Thenable[js.Array[Account]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAccounts")().asInstanceOf[Thenable[js.Array[Account]]]
  
  inline def getSecurityToken(account: Account): Thenable[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityToken")(account.asInstanceOf[js.Any]).asInstanceOf[Thenable[StringDictionary[Any]]]
  inline def getSecurityToken(account: Account, resource: AzureResource): Thenable[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityToken")(account.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[Thenable[StringDictionary[Any]]]
  
  @JSImport("azdata", "accounts.onDidChangeAccounts")
  @js.native
  val onDidChangeAccounts: Event[DidChangeAccountsParams] = js.native
  
  inline def registerAccountProvider(providerMetadata: AccountProviderMetadata, provider: AccountProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAccountProvider")(providerMetadata.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait AccountSecurityToken extends StObject {
    
    /**
      * The token to use
      */
    var token: String
    
    /**
      * What type of token this is (such as Bearer)
      */
    var tokenType: js.UndefOr[String] = js.undefined
  }
  object AccountSecurityToken {
    
    inline def apply(token: String): AccountSecurityToken = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountSecurityToken]
    }
    
    extension [Self <: AccountSecurityToken](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
}
