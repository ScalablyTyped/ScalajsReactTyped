package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.tuyaPanelKit.anon.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDate
  extends StObject
     with TYFlatListData {
  
  /**
    * @language zh-CN
    * @description 列表项图标
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description List item icon
    * @defaultValue undefined
    */
  var Icon: js.UndefOr[ElementType] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项各部分样式
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description List item style
    * @defaultValue {}
    */
  var styles: js.UndefOr[Container] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项类型值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description List item type value
    * @defaultValue undefined
    */
  var value: Any
}
object ListDate {
  
  inline def apply(value: Any): ListDate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDate]
  }
  
  extension [Self <: ListDate](x: Self) {
    
    inline def setIcon(value: ElementType): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setStyles(value: Container): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
