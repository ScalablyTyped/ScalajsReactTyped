package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 所有Menu中的相关接口的请求参数
  */
trait WxBaseMenuRequestConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 监听Menu中的按钮点击时触发的方法
    */
  var trigger: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object WxBaseMenuRequestConfig {
  
  inline def apply(): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
  
  extension [Self <: WxBaseMenuRequestConfig](x: Self) {
    
    inline def setTrigger(value: Callback): Self = StObject.set(x, "trigger", value.toJsFn)
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
