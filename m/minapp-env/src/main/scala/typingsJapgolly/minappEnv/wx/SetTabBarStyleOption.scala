package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTabBarStyleOption extends StObject {
  
  /** tab 的背景色，HexColor */
  var backgroundColor: String
  
  /** tabBar上边框的颜色， 仅支持 black/white */
  var borderStyle: String
  
  /** tab 上的文字默认颜色，HexColor */
  var color: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetTabBarStyleCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetTabBarStyleFailCallback] = js.undefined
  
  /** tab 上的文字选中时的颜色，HexColor */
  var selectedColor: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetTabBarStyleSuccessCallback] = js.undefined
}
object SetTabBarStyleOption {
  
  inline def apply(backgroundColor: String, borderStyle: String, color: String, selectedColor: String): SetTabBarStyleOption = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarStyleOption]
  }
  
  extension [Self <: SetTabBarStyleOption](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
