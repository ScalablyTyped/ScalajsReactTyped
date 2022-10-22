package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used. Deprecated: use AllowedFlexVolume from policy API Group instead.
  */
trait AllowedFlexVolumePatch extends StObject {
  
  /**
    * driver is the name of the Flexvolume driver.
    */
  var driver: String
}
object AllowedFlexVolumePatch {
  
  inline def apply(driver: String): AllowedFlexVolumePatch = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedFlexVolumePatch]
  }
  
  extension [Self <: AllowedFlexVolumePatch](x: Self) {
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
  }
}
