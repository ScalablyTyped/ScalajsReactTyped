package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityMetrics extends StObject {
  
  /**
    * A container for whether the activity metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typingsJapgolly.awsSdk.clientsS3controlMod.IsEnabled] = js.undefined
}
object ActivityMetrics {
  
  inline def apply(): ActivityMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityMetrics]
  }
  
  extension [Self <: ActivityMetrics](x: Self) {
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
  }
}
