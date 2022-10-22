package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 图片轮播控件样式
  * 从ViewStyles继承而来，扩展支持轮播图片等配置。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjImageSliderStyles extends StObject {
  
  /**
    * 是否自动播放
    * 可取值：
    *         "true" - 自动播放；
    *         "false" - 不自动播放。
    *     默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否可全屏显示
    * 可取值：
    *         "true" - 表示可全屏显示，用户点击轮播图片时全屏显示；
    *         "false" - 表示不可全屏显示，用户点击轮播图片时无响应。
    *     默认值为"true"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 轮播的图片
    * 至少必须设置一张图片的地址信息，否则可能导致图片轮播控件显示不正常。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var images: js.UndefOr[js.Array[PlusNativeObj]] = js.undefined
  
  /**
    * 自动播放切换时间
    * 当autoplay属性值为true时生效，单位为毫秒。默认值为3000（3秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * 是否可循环轮播
    * 可取值：
    *         "true" - 支持循环轮播；
    *         "false" - 不支持循环轮播。
    *     默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var loop: js.UndefOr[Boolean] = js.undefined
}
object PlusNativeObjImageSliderStyles {
  
  inline def apply(): PlusNativeObjImageSliderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjImageSliderStyles]
  }
  
  extension [Self <: PlusNativeObjImageSliderStyles](x: Self) {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setImages(value: js.Array[PlusNativeObj]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: PlusNativeObj*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
