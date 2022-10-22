package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一组用于定义页面或控件关闭的动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewAnimationTypeClose extends StObject {
  
  /**
    * 自动选择动画效果
    * 自动选择显示窗口相对于的动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var auto: js.UndefOr[String] = js.undefined
  
  /**
    * 从不透明到透明逐渐隐藏动画
    * 页面从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-out`: js.UndefOr[String] = js.undefined
  
  /**
    * 无动画
    * 立即关闭页面，无任何动画效果。
    *     此效果忽略动画时间参数，立即关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.undefined
  
  /**
    * 从右侧平移出栈动画效果
    * 页面从屏幕右侧滑出消失，同时上一个页面带阴影效果从屏幕左侧滑入显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-out`: js.UndefOr[String] = js.undefined
  
  /**
    * 竖向向下侧滑出屏幕动画
    * 页面从屏幕中竖向向下侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-bottom`: js.UndefOr[String] = js.undefined
  
  /**
    * 横向向左侧滑出屏幕动画
    * 页面从屏幕中横向向左侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-left`: js.UndefOr[String] = js.undefined
  
  /**
    * 横向向右侧滑出屏幕动画
    * 页面从屏幕中横向向右侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-right`: js.UndefOr[String] = js.undefined
  
  /**
    * 竖向向上侧滑出屏幕动画
    * 页面从屏幕中竖向向上侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-top`: js.UndefOr[String] = js.undefined
  
  /**
    * 从大逐渐缩小并且从不透明到透明逐渐隐藏关闭动画
    * 页面逐渐向页面中心缩小并且从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-in`: js.UndefOr[String] = js.undefined
  
  /**
    * 从大逐渐缩小关闭动画
    * 页面逐渐向页面中心缩小关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-in`: js.UndefOr[String] = js.undefined
}
object PlusWebviewAnimationTypeClose {
  
  inline def apply(): PlusWebviewAnimationTypeClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewAnimationTypeClose]
  }
  
  extension [Self <: PlusWebviewAnimationTypeClose](x: Self) {
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    inline def `setFade-out`(value: String): Self = StObject.set(x, "fade-out", value.asInstanceOf[js.Any])
    
    inline def `setFade-outUndefined`: Self = StObject.set(x, "fade-out", js.undefined)
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def `setPop-out`(value: String): Self = StObject.set(x, "pop-out", value.asInstanceOf[js.Any])
    
    inline def `setPop-outUndefined`: Self = StObject.set(x, "pop-out", js.undefined)
    
    inline def `setSlide-out-bottom`(value: String): Self = StObject.set(x, "slide-out-bottom", value.asInstanceOf[js.Any])
    
    inline def `setSlide-out-bottomUndefined`: Self = StObject.set(x, "slide-out-bottom", js.undefined)
    
    inline def `setSlide-out-left`(value: String): Self = StObject.set(x, "slide-out-left", value.asInstanceOf[js.Any])
    
    inline def `setSlide-out-leftUndefined`: Self = StObject.set(x, "slide-out-left", js.undefined)
    
    inline def `setSlide-out-right`(value: String): Self = StObject.set(x, "slide-out-right", value.asInstanceOf[js.Any])
    
    inline def `setSlide-out-rightUndefined`: Self = StObject.set(x, "slide-out-right", js.undefined)
    
    inline def `setSlide-out-top`(value: String): Self = StObject.set(x, "slide-out-top", value.asInstanceOf[js.Any])
    
    inline def `setSlide-out-topUndefined`: Self = StObject.set(x, "slide-out-top", js.undefined)
    
    inline def `setZoom-fade-in`(value: String): Self = StObject.set(x, "zoom-fade-in", value.asInstanceOf[js.Any])
    
    inline def `setZoom-fade-inUndefined`: Self = StObject.set(x, "zoom-fade-in", js.undefined)
    
    inline def `setZoom-in`(value: String): Self = StObject.set(x, "zoom-in", value.asInstanceOf[js.Any])
    
    inline def `setZoom-inUndefined`: Self = StObject.set(x, "zoom-in", js.undefined)
  }
}
