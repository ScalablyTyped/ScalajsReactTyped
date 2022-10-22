package typingsJapgolly.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents process memory usage at a single point in time. */
trait ProcessMemoryReport extends StObject {
  
  /** Gets the process' private working set usage. */
  var privateWorkingSetUsage: Double
  
  /** Gets the process' total working set usage. */
  var totalWorkingSetUsage: Double
}
object ProcessMemoryReport {
  
  inline def apply(privateWorkingSetUsage: Double, totalWorkingSetUsage: Double): ProcessMemoryReport = {
    val __obj = js.Dynamic.literal(privateWorkingSetUsage = privateWorkingSetUsage.asInstanceOf[js.Any], totalWorkingSetUsage = totalWorkingSetUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryReport]
  }
  
  extension [Self <: ProcessMemoryReport](x: Self) {
    
    inline def setPrivateWorkingSetUsage(value: Double): Self = StObject.set(x, "privateWorkingSetUsage", value.asInstanceOf[js.Any])
    
    inline def setTotalWorkingSetUsage(value: Double): Self = StObject.set(x, "totalWorkingSetUsage", value.asInstanceOf[js.Any])
  }
}
