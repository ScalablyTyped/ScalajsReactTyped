package typingsJapgolly.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAssociationsListElement extends StObject {
  
  /**
    *  The Amazon Web Services account email. 
    */
  var AccountEmail: js.UndefOr[typingsJapgolly.awsSdk.clientsBillingconductorMod.AccountEmail] = js.undefined
  
  /**
    *  The associating array of account IDs. 
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsBillingconductorMod.AccountId] = js.undefined
  
  /**
    *  The Amazon Web Services account name. 
    */
  var AccountName: js.UndefOr[typingsJapgolly.awsSdk.clientsBillingconductorMod.AccountName] = js.undefined
  
  /**
    *  The Billing Group Arn that the linked account is associated to. 
    */
  var BillingGroupArn: js.UndefOr[typingsJapgolly.awsSdk.clientsBillingconductorMod.BillingGroupArn] = js.undefined
}
object AccountAssociationsListElement {
  
  inline def apply(): AccountAssociationsListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAssociationsListElement]
  }
  
  extension [Self <: AccountAssociationsListElement](x: Self) {
    
    inline def setAccountEmail(value: AccountEmail): Self = StObject.set(x, "AccountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "AccountEmail", js.undefined)
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAccountName(value: AccountName): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "AccountName", js.undefined)
    
    inline def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "BillingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnUndefined: Self = StObject.set(x, "BillingGroupArn", js.undefined)
  }
}
