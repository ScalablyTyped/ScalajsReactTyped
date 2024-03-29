package typingsJapgolly.html5plus

import typingsJapgolly.html5plus.html5plusStrings.ImageSlider
import typingsJapgolly.html5plus.html5plusStrings.NView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 窗口原生子View控件样式
  * 可设置原生控件的标识、大小、位置以及绘制的内容等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewSubNViewStyles extends StObject {
  
  /**
    * 原生子View控件的标识
    * 可通过plus.nativeObj.View.getViewById(id)方法传入此标识来获取子View控件对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子View控件的样式
    * 可设置原生控件的位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var styles: js.UndefOr[PlusNativeObjViewStyles] = js.undefined
  
  /**
    * 原生子View控件初始绘制内容
    * 可设置绘制图片、矩形区域、文本等内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var tags: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 原生子View控件类型
    * 可取值：
    *         "NView" - 原生子View控件（plus.nativeObj.NView）；
    *         "ImageSlider" - 原生图片轮播控件（plus.nativeObj.ImageSlider）。
    *     默认值为"NView"。
    * - NView: 
    *     原生子View控件（plus.nativeObj.NView）
    *                                 
    * - ImageSlider: 
    *     原生图片轮播控件（plus.nativeObj.ImageSlider）                            
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[NView | ImageSlider] = js.undefined
}
object PlusWebviewWebviewSubNViewStyles {
  
  inline def apply(): PlusWebviewWebviewSubNViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewSubNViewStyles]
  }
  
  extension [Self <: PlusWebviewWebviewSubNViewStyles](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStyles(value: PlusNativeObjViewStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTags(value: js.Array[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Any*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: NView | ImageSlider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
