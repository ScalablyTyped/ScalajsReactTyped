package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Machines extends StObject {
  
  var machines: js.Array[Cpus]
  
  var total_count: Double
}
object Machines {
  
  inline def apply(machines: js.Array[Cpus], total_count: Double): Machines = {
    val __obj = js.Dynamic.literal(machines = machines.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Machines]
  }
  
  extension [Self <: Machines](x: Self) {
    
    inline def setMachines(value: js.Array[Cpus]): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    inline def setMachinesVarargs(value: Cpus*): Self = StObject.set(x, "machines", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
