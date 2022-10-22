package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'}
    */
  var success: js.UndefOr[js.Function1[/* result */ SaveFileSuccess, Unit]] = js.undefined
  
  /**
    * 需要保存的文件的临时路径
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}
object SaveFileOptions {
  
  inline def apply(): SaveFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveFileOptions]
  }
  
  extension [Self <: SaveFileOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ SaveFileSuccess => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ SaveFileSuccess) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
