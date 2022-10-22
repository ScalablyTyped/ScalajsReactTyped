package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountCustomizationRequest extends StObject {
  
  /**
    * The Amazon QuickSight customizations you're updating in the current Amazon Web Services Region. 
    */
  var AccountCustomization: typingsJapgolly.awsSdk.clientsQuicksightMod.AccountCustomization
  
  /**
    * The ID for the Amazon Web Services account that you want to update Amazon QuickSight customizations for.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The namespace that you want to update Amazon QuickSight customizations for.
    */
  var Namespace: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
}
object UpdateAccountCustomizationRequest {
  
  inline def apply(AccountCustomization: AccountCustomization, AwsAccountId: AwsAccountId): UpdateAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AccountCustomization = AccountCustomization.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountCustomizationRequest]
  }
  
  extension [Self <: UpdateAccountCustomizationRequest](x: Self) {
    
    inline def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
