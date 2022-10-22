package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to update the usage of plan data. */
trait ProfileUsage extends StObject {
  
  /** The last time UsageInMegabytes was updated. */
  var lastSyncTime: js.Date
  
  /** Updates the usage in megabytes. */
  var usageInMegabytes: Double
}
object ProfileUsage {
  
  inline def apply(lastSyncTime: js.Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], usageInMegabytes = usageInMegabytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileUsage]
  }
  
  extension [Self <: ProfileUsage](x: Self) {
    
    inline def setLastSyncTime(value: js.Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setUsageInMegabytes(value: Double): Self = StObject.set(x, "usageInMegabytes", value.asInstanceOf[js.Any])
  }
}
