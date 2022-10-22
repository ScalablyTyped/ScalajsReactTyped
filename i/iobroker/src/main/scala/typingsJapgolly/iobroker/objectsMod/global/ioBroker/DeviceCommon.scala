package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCommon
  extends StObject
     with ObjectCommon {
  
  // TODO: any other definition for device?
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
}
object DeviceCommon {
  
  inline def apply(custom: Unit, name: StringOrTranslated): DeviceCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCommon]
  }
  
  extension [Self <: DeviceCommon](x: Self) {
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
  }
}
