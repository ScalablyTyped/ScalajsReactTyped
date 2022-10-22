package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
  */
trait CSINodeSpec extends StObject {
  
  /**
    * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
    */
  var drivers: js.Array[CSINodeDriver]
}
object CSINodeSpec {
  
  inline def apply(drivers: js.Array[CSINodeDriver]): CSINodeSpec = {
    val __obj = js.Dynamic.literal(drivers = drivers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSINodeSpec]
  }
  
  extension [Self <: CSINodeSpec](x: Self) {
    
    inline def setDrivers(value: js.Array[CSINodeDriver]): Self = StObject.set(x, "drivers", value.asInstanceOf[js.Any])
    
    inline def setDriversVarargs(value: CSINodeDriver*): Self = StObject.set(x, "drivers", js.Array(value*))
  }
}
