package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.ActiveDisabled
import typingsJapgolly.baseui.anon.ColumnsData
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.tableStyledComponentsMod.CellStyledProps
import typingsJapgolly.baseui.tableStyledComponentsMod.HorizontalStyleProps
import typingsJapgolly.baseui.tableTableMod.default
import typingsJapgolly.baseui.tableTypesMod.FilterProps
import typingsJapgolly.baseui.tableTypesMod.HeadCellProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("baseui/table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Filter(props: FilterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Filter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{ readonly ASC :'ASC',  readonly DESC :'DESC'}> */
  object SORT_DIRECTION {
    
    @JSImport("baseui/table", "SORT_DIRECTION.ASC")
    @js.native
    val ASC: typingsJapgolly.baseui.baseuiStrings.ASC = js.native
    
    @JSImport("baseui/table", "SORT_DIRECTION.DESC")
    @js.native
    val DESC: typingsJapgolly.baseui.baseuiStrings.DESC = js.native
  }
  
  inline def SortableHeadCell(props: HeadCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHeadCell")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SortableHeadCellFactory(): js.Function1[/* props */ HeadCellProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHeadCellFactory")().asInstanceOf[js.Function1[/* props */ HeadCellProps, Element]]
  inline def SortableHeadCellFactory(CustomHeadCell: ComponentType[HeadCellProps]): js.Function1[/* props */ HeadCellProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHeadCellFactory")(CustomHeadCell.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ HeadCellProps, Element]]
  
  @JSImport("baseui/table", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[button, js.Object] = js.native
  
  @JSImport("baseui/table", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, HorizontalStyleProps] = js.native
  
  @JSImport("baseui/table", "StyledCell")
  @js.native
  val StyledCell: StyletronComponent[div, CellStyledProps] = js.native
  
  @JSImport("baseui/table", "StyledFilterButton")
  @js.native
  val StyledFilterButton: StyletronComponent[button, ActiveDisabled] = js.native
  
  @JSImport("baseui/table", "StyledFilterContent")
  @js.native
  val StyledFilterContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table", "StyledFilterFooter")
  @js.native
  val StyledFilterFooter: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table", "StyledFilterHeading")
  @js.native
  val StyledFilterHeading: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table", "StyledHead")
  @js.native
  val StyledHead: StyletronComponent[div, HorizontalStyleProps] = js.native
  
  @JSImport("baseui/table", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[div, HorizontalStyleProps] = js.native
  
  @JSImport("baseui/table", "StyledRow")
  @js.native
  val StyledRow: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table", "StyledSortableLabel")
  @js.native
  val StyledSortableLabel: StyletronComponent[button, js.Object] = js.native
  
  @JSImport("baseui/table", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table", "Table")
  @js.native
  open class Table () extends default
  /* static members */
  object Table {
    
    @JSImport("baseui/table", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/table", "Table.defaultProps")
    @js.native
    def defaultProps: ColumnsData = js.native
    inline def defaultProps_=(x: ColumnsData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
