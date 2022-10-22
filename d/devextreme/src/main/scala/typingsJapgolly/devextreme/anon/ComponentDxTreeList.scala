package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDxTreeList[TRowData, TKey] extends StObject {
  
  val component: dxTreeList[TRowData, TKey]
  
  val row: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Row[TRowData, TKey]] = js.undefined
}
object ComponentDxTreeList {
  
  inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey]): ComponentDxTreeList[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDxTreeList[TRowData, TKey]]
  }
  
  extension [Self <: ComponentDxTreeList[?, ?], TRowData, TKey](x: Self & (ComponentDxTreeList[TRowData, TKey])) {
    
    inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setRow(value: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
