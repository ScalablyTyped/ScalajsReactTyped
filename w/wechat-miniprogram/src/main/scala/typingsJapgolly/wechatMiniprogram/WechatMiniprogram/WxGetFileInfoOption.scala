package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.md5_
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.sha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WxGetFileInfoOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetFileInfoCompleteCallback] = js.undefined
  
  /** 计算文件摘要的算法
    *
    * 可选值：
    * - 'md5': md5 算法;
    * - 'sha1': sha1 算法; */
  var digestAlgorithm: js.UndefOr[md5_ | sha1] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WxGetFileInfoFailCallback] = js.undefined
  
  /** 本地文件路径 (本地路径) */
  var filePath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WxGetFileInfoSuccessCallback] = js.undefined
}
object WxGetFileInfoOption {
  
  inline def apply(filePath: String): WxGetFileInfoOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetFileInfoOption]
  }
  
  extension [Self <: WxGetFileInfoOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDigestAlgorithm(value: md5_ | sha1): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ WxGetFileInfoSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ WxGetFileInfoSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
