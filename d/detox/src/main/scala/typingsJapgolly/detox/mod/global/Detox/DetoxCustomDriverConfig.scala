package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxCustomDriverConfig
  extends StObject
     with /* prop */ StringDictionary[Any]
     with DetoxDeviceConfig {
  
  var `type`: String
}
object DetoxCustomDriverConfig {
  
  inline def apply(`type`: String): DetoxCustomDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxCustomDriverConfig]
  }
  
  extension [Self <: DetoxCustomDriverConfig](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
