package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSharingInfo extends StObject {
  
  /**
    * The Amazon Web Services account ID where the current document is shared.
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AccountId] = js.undefined
  
  /**
    * The version of the current document shared with the account.
    */
  var SharedDocumentVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.SharedDocumentVersion] = js.undefined
}
object AccountSharingInfo {
  
  inline def apply(): AccountSharingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSharingInfo]
  }
  
  extension [Self <: AccountSharingInfo](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setSharedDocumentVersion(value: SharedDocumentVersion): Self = StObject.set(x, "SharedDocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setSharedDocumentVersionUndefined: Self = StObject.set(x, "SharedDocumentVersion", js.undefined)
  }
}
