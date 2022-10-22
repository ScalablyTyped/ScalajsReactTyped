package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.Data
import typingsJapgolly.baseui.anon.LoadingMessage
import typingsJapgolly.baseui.anon.SVGAttributesSVGElementch
import typingsJapgolly.baseui.anon.isFocusVisiblebooleanStyl
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.table
import typingsJapgolly.baseui.baseuiStrings.tbody
import typingsJapgolly.baseui.baseuiStrings.td_
import typingsJapgolly.baseui.baseuiStrings.th_
import typingsJapgolly.baseui.baseuiStrings.thead
import typingsJapgolly.baseui.baseuiStrings.tr_
import typingsJapgolly.baseui.tableSemanticStyledComponentsMod.StyledRootProps
import typingsJapgolly.baseui.tableSemanticStyledComponentsMod.StyledTableBodyCellProps
import typingsJapgolly.baseui.tableSemanticStyledComponentsMod.StyledTableBodyRowProps
import typingsJapgolly.baseui.tableSemanticStyledComponentsMod.StyledTableHeadCellProps
import typingsJapgolly.baseui.tableSemanticStyledComponentsMod.StyledTableProps
import typingsJapgolly.baseui.tableSemanticTableMod.default
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticMod {
  
  /* Inlined std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical',  readonly grid :'grid',  readonly clean :'clean'}> */
  object DIVIDER {
    
    @JSImport("baseui/table-semantic", "DIVIDER.clean")
    @js.native
    val clean: typingsJapgolly.baseui.baseuiStrings.clean = js.native
    
    @JSImport("baseui/table-semantic", "DIVIDER.grid")
    @js.native
    val grid: typingsJapgolly.baseui.baseuiStrings.grid = js.native
    
    @JSImport("baseui/table-semantic", "DIVIDER.horizontal")
    @js.native
    val horizontal: typingsJapgolly.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/table-semantic", "DIVIDER.vertical")
    @js.native
    val vertical: typingsJapgolly.baseui.baseuiStrings.vertical = js.native
  }
  
  /* Inlined std.Readonly<{ readonly compact :'compact',  readonly default :'default',  readonly spacious :'spacious'}> */
  object SIZE extends Shortcut {
    
    @JSImport("baseui/table-semantic", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/table-semantic", "SIZE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/table-semantic", "SIZE.spacious")
    @js.native
    val spacious: typingsJapgolly.baseui.baseuiStrings.spacious = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/table-semantic", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, StyledRootProps] = js.native
  
  @JSImport("baseui/table-semantic", "StyledSortAscIcon")
  @js.native
  val StyledSortAscIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledSortDescIcon")
  @js.native
  val StyledSortDescIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledSortNoneIcon")
  @js.native
  val StyledSortNoneIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[table, StyledTableProps] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableBody")
  @js.native
  val StyledTableBody: StyletronComponent[tbody, js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableBodyCell")
  @js.native
  val StyledTableBodyCell: StyletronComponent[td_, StyledTableBodyCellProps] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableBodyRow")
  @js.native
  val StyledTableBodyRow: StyletronComponent[tr_, StyledTableBodyRowProps] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableEmptyMessage")
  @js.native
  val StyledTableEmptyMessage: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHead")
  @js.native
  val StyledTableHead: StyletronComponent[thead, js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHeadCell")
  @js.native
  val StyledTableHeadCell: StyletronComponent[th_, StyledTableHeadCellProps] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHeadCellSortable")
  @js.native
  val StyledTableHeadCellSortable: StyletronComponent[th_, isFocusVisiblebooleanStyl] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHeadRow")
  @js.native
  val StyledTableHeadRow: StyletronComponent[tr_, js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableLoadingMessage")
  @js.native
  val StyledTableLoadingMessage: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table-semantic", "Table")
  @js.native
  open class Table () extends default
  /* static members */
  object Table {
    
    @JSImport("baseui/table-semantic", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/table-semantic", "Table.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    inline def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  open class TableBuilder[T] ()
    extends typingsJapgolly.baseui.tableSemanticTableBuilderMod.default[T]
  /* static members */
  object TableBuilder {
    
    @JSImport("baseui/table-semantic", "TableBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/table-semantic", "TableBuilder.defaultProps")
    @js.native
    def defaultProps: LoadingMessage = js.native
    inline def defaultProps_=(x: LoadingMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/table-semantic", "TableBuilderColumn")
  @js.native
  open class TableBuilderColumn[T] ()
    extends typingsJapgolly.baseui.tableSemanticTableBuilderColumnMod.default[T]
}
