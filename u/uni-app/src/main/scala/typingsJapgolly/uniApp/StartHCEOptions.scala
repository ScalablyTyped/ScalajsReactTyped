package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartHCEOptions extends StObject {
  
  /**
    * 需要注册到系统的 AID 列表，每个 AID 为 String 类型
    */
  var aid_list: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object StartHCEOptions {
  
  inline def apply(): StartHCEOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartHCEOptions]
  }
  
  extension [Self <: StartHCEOptions](x: Self) {
    
    inline def setAid_list(value: js.Array[Any]): Self = StObject.set(x, "aid_list", value.asInstanceOf[js.Any])
    
    inline def setAid_listUndefined: Self = StObject.set(x, "aid_list", js.undefined)
    
    inline def setAid_listVarargs(value: Any*): Self = StObject.set(x, "aid_list", js.Array(value*))
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
