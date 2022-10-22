package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReaddirCompleteCallback] = js.undefined
  
  /** 要读取的目录路径 (本地路径) */
  var dirPath: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ReaddirFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReaddirSuccessCallback] = js.undefined
}
object ReaddirOption {
  
  inline def apply(dirPath: String): ReaddirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirOption]
  }
  
  extension [Self <: ReaddirOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* result */ ReaddirFailCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* result */ ReaddirFailCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ ReaddirSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ ReaddirSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
