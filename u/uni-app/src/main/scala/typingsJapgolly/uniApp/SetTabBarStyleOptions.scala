package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTabBarStyleOptions extends StObject {
  
  /**
    * tab 的背景色
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * tabbar上边框的颜色
    */
  var borderStyle: js.UndefOr[String] = js.undefined
  
  /**
    * tab 上的文字默认颜色
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * tab 上的文字选中时的颜色
    */
  var selectedColor: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SetTabBarStyleOptions {
  
  inline def apply(): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
  
  extension [Self <: SetTabBarStyleOptions](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
