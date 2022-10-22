package typingsJapgolly.vis.anon

import typingsJapgolly.vis.mod.DataGroup
import typingsJapgolly.vis.mod.DataGroupCollectionType
import typingsJapgolly.vis.mod.DataItem
import typingsJapgolly.vis.mod.DataItemCollectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: js.UndefOr[DataGroupCollectionType] = js.undefined
  
  var items: js.UndefOr[DataItemCollectionType] = js.undefined
}
object Groups {
  
  inline def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: DataGroupCollectionType): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: DataGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setItems(value: DataItemCollectionType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DataItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
