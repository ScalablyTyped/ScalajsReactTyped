package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableExpandButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExpandButton {
  
  inline def apply(
    areAllRowsExpanded: CallbackTo[Boolean],
    buttonClass: String,
    expandableRowsHeader: Boolean,
    iconClass: String,
    iconIndeterminateClass: String,
    isHeaderCell: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(areAllRowsExpanded = areAllRowsExpanded.toJsFn, buttonClass = buttonClass.asInstanceOf[js.Any], expandableRowsHeader = expandableRowsHeader.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconIndeterminateClass = iconIndeterminateClass.asInstanceOf[js.Any], isHeaderCell = isHeaderCell.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableExpandButton]))
  }
  
  @JSImport("mui-datatables", "ExpandButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dataIndex(value: Double): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    
    inline def expandedRows(value: Any): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    inline def onExpand(value: /* args */ Any => Any): this.type = set("onExpand", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableExpandButton): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
