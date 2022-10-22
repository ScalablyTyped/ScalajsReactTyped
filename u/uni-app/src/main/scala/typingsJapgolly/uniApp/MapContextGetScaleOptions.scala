package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextGetScaleOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数，res = {scale}
    */
  var success: js.UndefOr[js.Function1[/* result */ MapContextGetScaleResult, Unit]] = js.undefined
}
object MapContextGetScaleOptions {
  
  inline def apply(): MapContextGetScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetScaleOptions]
  }
  
  extension [Self <: MapContextGetScaleOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ MapContextGetScaleResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ MapContextGetScaleResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
