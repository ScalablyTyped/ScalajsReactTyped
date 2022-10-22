package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.anon.kinkeyofPickIDetailsRowSt
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowFieldsDottypesMod.IDetailsRowFieldsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DetailsRowFields {
  
  inline def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt
  ): Builder = {
    val __props = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsRowFieldsProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DetailsRowFields")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def enableUpdateAnimations(value: Boolean): this.type = set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    inline def getCellValueKey(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): this.type = set("getCellValueKey", js.Any.fromFunction3(value))
    
    inline def onRenderItemColumn(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => Node
    ): this.type = set("onRenderItemColumn", js.Any.fromFunction3(value))
    
    inline def rowHeaderId(value: String): this.type = set("rowHeaderId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsRowFieldsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
