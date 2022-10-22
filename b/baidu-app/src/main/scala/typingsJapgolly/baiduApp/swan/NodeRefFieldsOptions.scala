package typingsJapgolly.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRefFieldsOptions extends StObject {
  
  var computedStyle: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 是否返回节点dataset */
  var dataset: js.UndefOr[Boolean] = js.undefined
  
  /** 是否返回节点id */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 指定属性名列表
    * 返回节点对应属性名的当前属性值（只能获得组件文档中标注的常规属性值， id class style 和事件绑定的属性值不可获取
    */
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 是否返回节点布局位置（left right top bottom */
  var rect: js.UndefOr[Boolean] = js.undefined
  
  /** 是否返回节点的 scrollLeft scrollTop ，节点必须是scroll-view或者viewport */
  var scrollOffset: js.UndefOr[Boolean] = js.undefined
  
  /** 是否返回节点尺寸（width height） */
  var size: js.UndefOr[Boolean] = js.undefined
}
object NodeRefFieldsOptions {
  
  inline def apply(): NodeRefFieldsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeRefFieldsOptions]
  }
  
  extension [Self <: NodeRefFieldsOptions](x: Self) {
    
    inline def setComputedStyle(value: js.Array[String]): Self = StObject.set(x, "computedStyle", value.asInstanceOf[js.Any])
    
    inline def setComputedStyleUndefined: Self = StObject.set(x, "computedStyle", js.undefined)
    
    inline def setComputedStyleVarargs(value: String*): Self = StObject.set(x, "computedStyle", js.Array(value*))
    
    inline def setDataset(value: Boolean): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRect(value: Boolean): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setScrollOffset(value: Boolean): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
