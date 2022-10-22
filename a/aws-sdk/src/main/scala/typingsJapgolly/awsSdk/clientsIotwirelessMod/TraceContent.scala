package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceContent extends StObject {
  
  var LogLevel: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.LogLevel] = js.undefined
  
  var WirelessDeviceFrameInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.WirelessDeviceFrameInfo] = js.undefined
}
object TraceContent {
  
  inline def apply(): TraceContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceContent]
  }
  
  extension [Self <: TraceContent](x: Self) {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    inline def setWirelessDeviceFrameInfo(value: WirelessDeviceFrameInfo): Self = StObject.set(x, "WirelessDeviceFrameInfo", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceFrameInfoUndefined: Self = StObject.set(x, "WirelessDeviceFrameInfo", js.undefined)
  }
}
