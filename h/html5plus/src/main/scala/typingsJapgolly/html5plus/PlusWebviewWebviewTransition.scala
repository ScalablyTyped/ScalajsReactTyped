package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一组用于定义页面或控件转换效果的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewTransition extends StObject {
  
  /**
    * 变换持续的时间
    * 默认值为0，即无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * 产生变换效果的属性
    * 默认值为"all"，暂不支持其它值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * 窗口变换效果
    * 可取值：
    *     "linear"：匀速变化，匀速动画效果；
    *     "ease-in"：匀加速变化，逐渐变快的动画效果；
    *     "ease-out"：匀减速变化，逐渐变慢的动画效果；
    *     "ease-in-out"：先加速后减速变化，先变快后变慢的动画效果。
    *     默认值为"ease-in-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var timingfunction: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewTransition {
  
  inline def apply(): PlusWebviewWebviewTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewTransition]
  }
  
  extension [Self <: PlusWebviewWebviewTransition](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setTimingfunction(value: String): Self = StObject.set(x, "timingfunction", value.asInstanceOf[js.Any])
    
    inline def setTimingfunctionUndefined: Self = StObject.set(x, "timingfunction", js.undefined)
  }
}
