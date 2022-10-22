package typingsJapgolly.vis.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineGroup extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: String | HTMLElement
  
  var id: IdType
  
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.undefined
  
  var order: js.UndefOr[Double] = js.undefined
  
  var showNested: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var subgroupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object TimelineGroup {
  
  inline def apply(content: String | HTMLElement, id: IdType): TimelineGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroup]
  }
  
  extension [Self <: TimelineGroup](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setId(value: IdType): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNestedGroups(value: js.Array[IdType]): Self = StObject.set(x, "nestedGroups", value.asInstanceOf[js.Any])
    
    inline def setNestedGroupsUndefined: Self = StObject.set(x, "nestedGroups", js.undefined)
    
    inline def setNestedGroupsVarargs(value: IdType*): Self = StObject.set(x, "nestedGroups", js.Array(value*))
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setShowNested(value: Boolean): Self = StObject.set(x, "showNested", value.asInstanceOf[js.Any])
    
    inline def setShowNestedUndefined: Self = StObject.set(x, "showNested", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubgroupOrder(value: TimelineOptionsGroupOrderType): Self = StObject.set(x, "subgroupOrder", value.asInstanceOf[js.Any])
    
    inline def setSubgroupOrderFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "subgroupOrder", js.Any.fromFunction2(value))
    
    inline def setSubgroupOrderUndefined: Self = StObject.set(x, "subgroupOrder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
