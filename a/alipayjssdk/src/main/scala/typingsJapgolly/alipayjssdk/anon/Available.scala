package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  /** 蓝牙模块是否可用(需支持 BLE 并且蓝牙是打开状态) */
  var available: Boolean
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 是否正在搜索设备 */
  var discovering: Boolean
}
object Available {
  
  inline def apply(available: Boolean, discovering: Boolean): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  extension [Self <: Available](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
