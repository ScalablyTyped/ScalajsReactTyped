package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var driver: js.UndefOr[Input[String]] = js.undefined
}
object AllowedFlexVolumePatch {
  
  inline def apply(): AllowedFlexVolumePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedFlexVolumePatch]
  }
  
  extension [Self <: AllowedFlexVolumePatch](x: Self) {
    
    inline def setDriver(value: Input[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
  }
}
