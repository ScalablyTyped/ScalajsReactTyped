package typingsJapgolly.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOptions extends StObject {
  
  var device_id: js.UndefOr[String] = js.undefined
}
object DeviceOptions {
  
  inline def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  
  extension [Self <: DeviceOptions](x: Self) {
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
  }
}
