package typingsJapgolly.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingConfig extends StObject {
  
  /** Name of the billing account. For example `billingAccounts/012345-567890-ABCDEF`. */
  var billingAccount: js.UndefOr[String] = js.undefined
}
object BillingConfig {
  
  inline def apply(): BillingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingConfig]
  }
  
  extension [Self <: BillingConfig](x: Self) {
    
    inline def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
  }
}
