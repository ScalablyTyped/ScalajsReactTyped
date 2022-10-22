package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.muiDatatables.anon.PartialCheckboxRenderCust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableProps extends StObject {
  
  var columns: js.Array[MUIDataTableColumnDef]
  
  var components: js.UndefOr[PartialCheckboxRenderCust] = js.undefined
  
  var data: js.Array[js.Object | (js.Array[Double | String])]
  
  var innerRef: js.UndefOr[
    RefHandle[js.UndefOr[(Component[MUIDataTableProps & js.Object, js.Object]) | Null]]
  ] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var title: String | Node
}
object MUIDataTableProps {
  
  inline def apply(columns: js.Array[MUIDataTableColumnDef], data: js.Array[js.Object | (js.Array[Double | String])]): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], title = null)
    __obj.asInstanceOf[MUIDataTableProps]
  }
  
  extension [Self <: MUIDataTableProps](x: Self) {
    
    inline def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setComponents(value: PartialCheckboxRenderCust): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setInnerRef(value: RefHandle[js.UndefOr[(Component[MUIDataTableProps & js.Object, js.Object]) | Null]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTitle(value: String | Node): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
