package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRealtimeLogConfigResult extends StObject {
  
  /**
    * A real-time log configuration.
    */
  var RealtimeLogConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.RealtimeLogConfig] = js.undefined
}
object CreateRealtimeLogConfigResult {
  
  inline def apply(): CreateRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRealtimeLogConfigResult]
  }
  
  extension [Self <: CreateRealtimeLogConfigResult](x: Self) {
    
    inline def setRealtimeLogConfig(value: RealtimeLogConfig): Self = StObject.set(x, "RealtimeLogConfig", value.asInstanceOf[js.Any])
    
    inline def setRealtimeLogConfigUndefined: Self = StObject.set(x, "RealtimeLogConfig", js.undefined)
  }
}
