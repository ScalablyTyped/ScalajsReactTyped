package typingsJapgolly.openidClient.mod

import org.scalajs.dom.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceFlowPollOptions extends StObject {
  
  // @ts-ignore
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object DeviceFlowPollOptions {
  
  inline def apply(): DeviceFlowPollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFlowPollOptions]
  }
  
  extension [Self <: DeviceFlowPollOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
