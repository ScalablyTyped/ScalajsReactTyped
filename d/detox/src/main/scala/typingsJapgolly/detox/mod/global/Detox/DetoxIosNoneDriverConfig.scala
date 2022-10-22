package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.PartialIosSimulatorQuery
import typingsJapgolly.detox.detoxStrings.iosDotnone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxIosNoneDriverConfig
  extends StObject
     with DetoxBuiltInDeviceConfig {
  
  // TODO: check if we need it at all?
  var device: js.UndefOr[String | PartialIosSimulatorQuery] = js.undefined
  
  var `type`: iosDotnone
}
object DetoxIosNoneDriverConfig {
  
  inline def apply(): DetoxIosNoneDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ios.none")
    __obj.asInstanceOf[DetoxIosNoneDriverConfig]
  }
  
  extension [Self <: DetoxIosNoneDriverConfig](x: Self) {
    
    inline def setDevice(value: String | PartialIosSimulatorQuery): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setType(value: iosDotnone): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
