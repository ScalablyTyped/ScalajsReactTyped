package typingsJapgolly.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppTargeting extends StObject {
  
  /** Lists of included and excluded mobile app categories as defined in https://developers.google.com/adwords/api/docs/appendix/mobileappcategories.csv. */
  var mobileAppCategoryTargeting: js.UndefOr[NumericTargetingDimension] = js.undefined
  
  /** Targeted app IDs. App IDs can refer to those found in an app store or ones that are not published in an app store. A maximum of 30,000 app IDs can be targeted. */
  var mobileAppTargeting: js.UndefOr[StringTargetingDimension] = js.undefined
}
object AppTargeting {
  
  inline def apply(): AppTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppTargeting]
  }
  
  extension [Self <: AppTargeting](x: Self) {
    
    inline def setMobileAppCategoryTargeting(value: NumericTargetingDimension): Self = StObject.set(x, "mobileAppCategoryTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileAppCategoryTargetingUndefined: Self = StObject.set(x, "mobileAppCategoryTargeting", js.undefined)
    
    inline def setMobileAppTargeting(value: StringTargetingDimension): Self = StObject.set(x, "mobileAppTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileAppTargetingUndefined: Self = StObject.set(x, "mobileAppTargeting", js.undefined)
  }
}
