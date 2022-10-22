package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
  */
trait CSINodeSpecPatch extends StObject {
  
  /**
    * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
    */
  var drivers: js.UndefOr[Input[js.Array[Input[CSINodeDriverPatch]]]] = js.undefined
}
object CSINodeSpecPatch {
  
  inline def apply(): CSINodeSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSINodeSpecPatch]
  }
  
  extension [Self <: CSINodeSpecPatch](x: Self) {
    
    inline def setDrivers(value: Input[js.Array[Input[CSINodeDriverPatch]]]): Self = StObject.set(x, "drivers", value.asInstanceOf[js.Any])
    
    inline def setDriversUndefined: Self = StObject.set(x, "drivers", js.undefined)
    
    inline def setDriversVarargs(value: Input[CSINodeDriverPatch]*): Self = StObject.set(x, "drivers", js.Array(value*))
  }
}
