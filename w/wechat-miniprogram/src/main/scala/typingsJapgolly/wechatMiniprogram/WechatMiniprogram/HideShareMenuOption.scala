package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideShareMenuOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[HideShareMenuCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[HideShareMenuFailCallback] = js.undefined
  
  /** 本接口为 Beta 版本，暂只在 Android 平台支持。需要隐藏的转发按钮名称列表，默认['shareAppMessage', 'shareTimeline']。按钮名称合法值包含 "shareAppMessage"、"shareTimeline" 两种
    *
    * 最低基础库： `2.11.3` */
  var menus: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[HideShareMenuSuccessCallback] = js.undefined
}
object HideShareMenuOption {
  
  inline def apply(): HideShareMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideShareMenuOption]
  }
  
  extension [Self <: HideShareMenuOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMenus(value: js.Array[String]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    inline def setMenusUndefined: Self = StObject.set(x, "menus", js.undefined)
    
    inline def setMenusVarargs(value: String*): Self = StObject.set(x, "menus", js.Array(value*))
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
