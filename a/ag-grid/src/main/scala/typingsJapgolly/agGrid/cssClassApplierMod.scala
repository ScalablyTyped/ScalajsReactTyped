package typingsJapgolly.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.colDefMod.AbstractColDef
import typingsJapgolly.agGrid.columnGroupMod.ColumnGroup
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/cssClassApplier", JSImport.Namespace)
@js.native
object cssClassApplierMod extends js.Object {
  @js.native
  class CssClassApplier () extends js.Object
  
  /* static members */
  @js.native
  object CssClassApplier extends js.Object {
    def addColumnClassesFromCollDef(
      classesOrFunc: String,
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: String,
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Array[String],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Array[String],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
    def addHeaderClassesFromColDef(
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addToolPanelClassesFromColDef(
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
  }
  
}

