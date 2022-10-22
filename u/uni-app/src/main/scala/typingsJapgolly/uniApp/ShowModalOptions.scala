package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowModalOptions extends StObject {
  
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[String] = js.undefined
  
  /**
    * 取消按钮的文字，默认为"取消"
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[String] = js.undefined
  
  /**
    * 确定按钮的文字，默认为"确定"
    */
  var confirmText: js.UndefOr[String] = js.undefined
  
  /**
    * 提示的内容
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowModalRes, Unit]] = js.undefined
  
  /**
    * 提示的标题
    */
  var title: js.UndefOr[String] = js.undefined
}
object ShowModalOptions {
  
  inline def apply(): ShowModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowModalOptions]
  }
  
  extension [Self <: ShowModalOptions](x: Self) {
    
    inline def setCancelColor(value: String): Self = StObject.set(x, "cancelColor", value.asInstanceOf[js.Any])
    
    inline def setCancelColorUndefined: Self = StObject.set(x, "cancelColor", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setConfirmColor(value: String): Self = StObject.set(x, "confirmColor", value.asInstanceOf[js.Any])
    
    inline def setConfirmColorUndefined: Self = StObject.set(x, "confirmColor", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    inline def setSuccess(value: /* result */ ShowModalRes => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ ShowModalRes) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
