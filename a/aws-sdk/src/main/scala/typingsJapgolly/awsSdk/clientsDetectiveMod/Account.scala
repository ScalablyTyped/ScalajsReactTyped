package typingsJapgolly.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * The account identifier of the Amazon Web Services account.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsDetectiveMod.AccountId
  
  /**
    * The Amazon Web Services account root user email address for the Amazon Web Services account.
    */
  var EmailAddress: typingsJapgolly.awsSdk.clientsDetectiveMod.EmailAddress
}
object Account {
  
  inline def apply(AccountId: AccountId, EmailAddress: EmailAddress): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
