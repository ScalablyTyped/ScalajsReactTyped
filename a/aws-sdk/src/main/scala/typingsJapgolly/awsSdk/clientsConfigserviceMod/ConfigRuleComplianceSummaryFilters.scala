package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRuleComplianceSummaryFilters extends StObject {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * The source region where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.AwsRegion] = js.undefined
}
object ConfigRuleComplianceSummaryFilters {
  
  inline def apply(): ConfigRuleComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
  }
  
  extension [Self <: ConfigRuleComplianceSummaryFilters](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
  }
}
