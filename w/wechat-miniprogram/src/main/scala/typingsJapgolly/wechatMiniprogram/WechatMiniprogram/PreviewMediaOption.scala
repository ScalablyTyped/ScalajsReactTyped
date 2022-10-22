package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewMediaOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PreviewMediaCompleteCallback] = js.undefined
  
  /** 当前显示的资源序号 */
  var current: js.UndefOr[Double] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PreviewMediaFailCallback] = js.undefined
  
  /** 是否显示长按菜单
    *
    * 最低基础库： `2.13.0` */
  var showmenu: js.UndefOr[Boolean] = js.undefined
  
  /** 需要预览的资源列表 */
  var sources: js.Array[MediaSource]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PreviewMediaSuccessCallback] = js.undefined
}
object PreviewMediaOption {
  
  inline def apply(sources: js.Array[MediaSource]): PreviewMediaOption = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewMediaOption]
  }
  
  extension [Self <: PreviewMediaOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setShowmenu(value: Boolean): Self = StObject.set(x, "showmenu", value.asInstanceOf[js.Any])
    
    inline def setShowmenuUndefined: Self = StObject.set(x, "showmenu", js.undefined)
    
    inline def setSources(value: js.Array[MediaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: MediaSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
