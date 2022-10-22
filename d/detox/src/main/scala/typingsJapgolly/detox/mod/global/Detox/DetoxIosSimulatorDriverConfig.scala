package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.PartialIosSimulatorQuery
import typingsJapgolly.detox.detoxStrings.iosDotsimulator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxIosSimulatorDriverConfig
  extends StObject
     with DetoxBuiltInDeviceConfig {
  
  var bootArgs: js.UndefOr[String] = js.undefined
  
  var device: String | PartialIosSimulatorQuery
  
  var `type`: iosDotsimulator
}
object DetoxIosSimulatorDriverConfig {
  
  inline def apply(device: String | PartialIosSimulatorQuery): DetoxIosSimulatorDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ios.simulator")
    __obj.asInstanceOf[DetoxIosSimulatorDriverConfig]
  }
  
  extension [Self <: DetoxIosSimulatorDriverConfig](x: Self) {
    
    inline def setBootArgs(value: String): Self = StObject.set(x, "bootArgs", value.asInstanceOf[js.Any])
    
    inline def setBootArgsUndefined: Self = StObject.set(x, "bootArgs", js.undefined)
    
    inline def setDevice(value: String | PartialIosSimulatorQuery): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: iosDotsimulator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
