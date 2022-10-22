package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Body
import typingsJapgolly.grommet.anon.ColorError
import typingsJapgolly.grommet.anon.Count
import typingsJapgolly.grommet.anon.Direction
import typingsJapgolly.grommet.anon.DirectionProperty
import typingsJapgolly.grommet.anon.Expand
import typingsJapgolly.grommet.es6ComponentsDataTableMod.ColumnConfig
import typingsJapgolly.grommet.es6ComponentsDataTableMod.DataTableExtendedProps
import typingsJapgolly.grommet.es6ComponentsDataTableMod.KeyPress
import typingsJapgolly.grommet.es6ComponentsDataTableMod.MouseClick
import typingsJapgolly.grommet.es6ComponentsDataTableMod.Sections
import typingsJapgolly.grommet.es6ComponentsDataTableMod.VerticalAlignType
import typingsJapgolly.grommet.es6ComponentsPaginationMod.PaginationType
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.grommet.grommetStrings.footer
import typingsJapgolly.grommet.grommetStrings.header
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.select
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTable {
  
  inline def apply[TRowType](): Builder[TRowType] = {
    val __props = js.Dynamic.literal()
    new Builder[TRowType](js.Array(this.component, __props.asInstanceOf[DataTableExtendedProps[TRowType]]))
  }
  
  @JSImport("grommet/es6", "DataTable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TRowType] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.grommet.es6Mod.DataTable[TRowType]] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def background(
      value: BackgroundType | (Sections[
          BackgroundType | js.Array[String], 
          BackgroundType, 
          BackgroundType, 
          BackgroundType | js.Array[String]
        ])
    ): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def border(value: BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderVarargs(value: ColorError*): this.type = set("border", js.Array(value*))
    
    inline def columns(value: js.Array[ColumnConfig[TRowType]]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: ColumnConfig[TRowType]*): this.type = set("columns", js.Array(value*))
    
    inline def data(value: js.Array[TRowType]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: TRowType*): this.type = set("data", js.Array(value*))
    
    inline def disabled(value: js.Array[String | Double]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledVarargs(value: (String | Double)*): this.type = set("disabled", js.Array(value*))
    
    inline def fill(value: Boolean | vertical | horizontal): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def groupBy(value: String | Expand[TRowType]): this.type = set("groupBy", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onClickRow(value: select | (js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit])): this.type = set("onClickRow", value.asInstanceOf[js.Any])
    
    inline def onClickRowFunction1(value: /* event */ MouseClick[TRowType] | KeyPress[TRowType] => Callback): this.type = set("onClickRow", js.Any.fromFunction1((t0: /* event */ MouseClick[TRowType] | KeyPress[TRowType]) => value(t0).runNow()))
    
    inline def onMore(value: Callback): this.type = set("onMore", value.toJsFn)
    
    inline def onSearch(value: /* search */ String => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* search */ String) => value(t0).runNow()))
    
    inline def onSelect(value: (/* select */ js.Array[String | Double], TRowType) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* select */ js.Array[String | Double], t1: TRowType) => (value(t0, t1)).runNow()))
    
    inline def onSort(value: /* sort */ DirectionProperty => Callback): this.type = set("onSort", js.Any.fromFunction1((t0: /* sort */ DirectionProperty) => value(t0).runNow()))
    
    inline def onUpdate(value: /* datatableState */ Count => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* datatableState */ Count) => value(t0).runNow()))
    
    inline def pad(value: PadType | (Sections[PadType, PadType, PadType, PadType])): this.type = set("pad", value.asInstanceOf[js.Any])
    
    inline def paginate(value: Boolean | PaginationType): this.type = set("paginate", value.asInstanceOf[js.Any])
    
    inline def pin(value: Boolean | header | footer): this.type = set("pin", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String | Node): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def primaryKey(value: String | Boolean): this.type = set("primaryKey", value.asInstanceOf[js.Any])
    
    inline def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    
    inline def resizeable(value: Boolean): this.type = set("resizeable", value.asInstanceOf[js.Any])
    
    inline def rowDetails(value: VdomNode): this.type = set("rowDetails", value.rawNode.asInstanceOf[js.Any])
    
    inline def rowDetailsNull: this.type = set("rowDetails", null)
    
    inline def rowDetailsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rowDetails", js.Array(value*))
    
    inline def rowDetailsVdomElement(value: VdomElement): this.type = set("rowDetails", value.rawElement.asInstanceOf[js.Any])
    
    inline def select(value: js.Array[String | Double]): this.type = set("select", value.asInstanceOf[js.Any])
    
    inline def selectVarargs(value: (String | Double)*): this.type = set("select", js.Array(value*))
    
    inline def size(value: small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sort(value: Direction): this.type = set("sort", value.asInstanceOf[js.Any])
    
    inline def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: VerticalAlignType | Body): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make[TRowType](companion: DataTable.type): Builder[TRowType] = new Builder[TRowType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[TRowType](p: DataTableExtendedProps[TRowType]): Builder[TRowType] = new Builder[TRowType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
