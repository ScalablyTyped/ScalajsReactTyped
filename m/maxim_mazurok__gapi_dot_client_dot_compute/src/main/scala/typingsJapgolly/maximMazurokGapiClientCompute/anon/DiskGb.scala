package typingsJapgolly.maximMazurokGapiClientCompute.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskGb extends StObject {
  
  /** Size of the scratch disk, defined in GB. */
  var diskGb: js.UndefOr[Double] = js.undefined
}
object DiskGb {
  
  inline def apply(): DiskGb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskGb]
  }
  
  extension [Self <: DiskGb](x: Self) {
    
    inline def setDiskGb(value: Double): Self = StObject.set(x, "diskGb", value.asInstanceOf[js.Any])
    
    inline def setDiskGbUndefined: Self = StObject.set(x, "diskGb", js.undefined)
  }
}
