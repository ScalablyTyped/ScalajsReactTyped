package typingsJapgolly.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text[ExtraData]
  extends StObject
     with Marker[ExtraData] {
  
  /**
    * 标记显示的文本内容
    */
  def getText(): String = js.native
  
  /**
    * 设置文本样式
    * @param style 文本样式
    */
  def setStyle(style: js.Object): Unit = js.native
  
  /**
    * 修改文本内容
    * @param text 文本内容
    */
  def setText(text: String): Unit = js.native
}
object Text {
  
  type EventMap[I] = typingsJapgolly.amapJsApi.AMap.Marker.EventMap[I]
  
  trait Options
    extends StObject
       with typingsJapgolly.amapJsApi.AMap.Marker.Options[Any] {
    
    /**
      * 文本内容
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * 对齐方式
      */
    var textAlign: js.UndefOr[TextAlign] = js.undefined
    
    var verticalAlign: js.UndefOr[VerticalAlign] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVerticalAlign(value: VerticalAlign): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amapJsApi.amapJsApiStrings.left
    - typingsJapgolly.amapJsApi.amapJsApiStrings.right
    - typingsJapgolly.amapJsApi.amapJsApiStrings.center
  */
  trait TextAlign extends StObject
  object TextAlign {
    
    inline def center: typingsJapgolly.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.center]
    
    inline def left: typingsJapgolly.amapJsApi.amapJsApiStrings.left = "left".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.left]
    
    inline def right: typingsJapgolly.amapJsApi.amapJsApiStrings.right = "right".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amapJsApi.amapJsApiStrings.top
    - typingsJapgolly.amapJsApi.amapJsApiStrings.middle
    - typingsJapgolly.amapJsApi.amapJsApiStrings.bottom
  */
  trait VerticalAlign extends StObject
  object VerticalAlign {
    
    inline def bottom: typingsJapgolly.amapJsApi.amapJsApiStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.bottom]
    
    inline def middle: typingsJapgolly.amapJsApi.amapJsApiStrings.middle = "middle".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.middle]
    
    inline def top: typingsJapgolly.amapJsApi.amapJsApiStrings.top = "top".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.top]
  }
}
