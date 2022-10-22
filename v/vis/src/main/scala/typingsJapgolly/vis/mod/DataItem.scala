package typingsJapgolly.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataItem extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: String
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[DateType] = js.undefined
  
  var group: js.UndefOr[Any] = js.undefined
  
  var id: js.UndefOr[IdType] = js.undefined
  
  var start: DateType
  
  var style: js.UndefOr[String] = js.undefined
  
  var subgroup: js.UndefOr[SubgroupType] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataItem {
  
  inline def apply(content: String, start: DateType): DataItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
  
  extension [Self <: DataItem](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setId(value: IdType): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubgroup(value: SubgroupType): Self = StObject.set(x, "subgroup", value.asInstanceOf[js.Any])
    
    inline def setSubgroupUndefined: Self = StObject.set(x, "subgroup", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
