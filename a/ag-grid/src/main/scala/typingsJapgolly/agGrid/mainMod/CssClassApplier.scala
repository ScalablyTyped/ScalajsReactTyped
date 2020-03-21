package typingsJapgolly.agGrid.mainMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.colDefMod.AbstractColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "CssClassApplier")
@js.native
class CssClassApplier ()
  extends typingsJapgolly.agGrid.cssClassApplierMod.CssClassApplier

/* static members */
@JSImport("ag-grid/dist/lib/main", "CssClassApplier")
@js.native
object CssClassApplier extends js.Object {
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addHeaderClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addToolPanelClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsJapgolly.agGrid.columnMod.Column,
    columnGroup: typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
}

