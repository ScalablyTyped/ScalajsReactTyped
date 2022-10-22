package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnowballUsageResult extends StObject {
  
  /**
    * The service limit for number of Snow devices this account can have at once. The default service limit is 1 (one).
    */
  var SnowballLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of Snow devices that this account is currently using.
    */
  var SnowballsInUse: js.UndefOr[Integer] = js.undefined
}
object GetSnowballUsageResult {
  
  inline def apply(): GetSnowballUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnowballUsageResult]
  }
  
  extension [Self <: GetSnowballUsageResult](x: Self) {
    
    inline def setSnowballLimit(value: Integer): Self = StObject.set(x, "SnowballLimit", value.asInstanceOf[js.Any])
    
    inline def setSnowballLimitUndefined: Self = StObject.set(x, "SnowballLimit", js.undefined)
    
    inline def setSnowballsInUse(value: Integer): Self = StObject.set(x, "SnowballsInUse", value.asInstanceOf[js.Any])
    
    inline def setSnowballsInUseUndefined: Self = StObject.set(x, "SnowballsInUse", js.undefined)
  }
}
