package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowActionSheetCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowActionSheetFailCallback] = js.undefined
  
  /** 按钮的文字颜色 */
  var itemColor: js.UndefOr[String] = js.undefined
  
  /** 按钮的文字数组，数组长度最大为 6 */
  var itemList: Array[String]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowActionSheetSuccessCallback] = js.undefined
}
object ShowActionSheetOption {
  
  inline def apply(itemList: Array[String]): ShowActionSheetOption = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetOption]
  }
  
  extension [Self <: ShowActionSheetOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
    
    inline def setItemList(value: Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ ShowActionSheetSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ ShowActionSheetSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
