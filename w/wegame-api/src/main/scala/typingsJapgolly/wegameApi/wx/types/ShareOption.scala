package typingsJapgolly.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareOption extends StObject {
  
  /**
    * 转发显示图片的链接，可以是网络图片路径或本地图片文件路径或相对代码包根目录的图片文件路径。显示图片长宽比是 5:4
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 查询字符串，必须是 key1=val1&key2=val2 的格式。从这条转发消息进入后，可通过 wx.getLaunchOptionsSync() 或 wx.onShow 获取启动参数中的 query。
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * 转发标题，不传则默认使用当前小游戏的昵称。
    */
  var title: js.UndefOr[String] = js.undefined
}
object ShareOption {
  
  inline def apply(): ShareOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareOption]
  }
  
  extension [Self <: ShareOption](x: Self) {
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
