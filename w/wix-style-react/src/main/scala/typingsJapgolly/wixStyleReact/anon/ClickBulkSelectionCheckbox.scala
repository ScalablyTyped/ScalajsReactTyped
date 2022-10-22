package typingsJapgolly.wixStyleReact.anon

import typingsJapgolly.reactDom.testUtilsMod.SyntheticEventData
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixStyleReact.distTypesCheckboxCheckboxDotuniDotdriverMod.CheckboxUniDriver
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.ALL
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.NONE
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.SOME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickBulkSelectionCheckbox extends StObject {
  
  def click(): js.Promise[Unit] = js.native
  
  def clickBulkSelectionCheckbox(): js.Promise[Unit] = js.native
  
  def clickRow(index: Double): js.Promise[Unit] = js.native
  def clickRow(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
  
  def clickRowCheckbox(index: Double): js.Promise[Unit] = js.native
  
  def clickSort(index: Double): js.Promise[Unit] = js.native
  def clickSort(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
  
  def element(): js.Promise[Any] = js.native
  
  def exists(): js.Promise[Boolean] = js.native
  
  def getBulkSelectionCheckboxDriver(): js.Promise[CheckboxUniDriver] = js.native
  
  def getBulkSelectionState(): js.Promise[ALL | SOME | NONE] = js.native
  
  def getCell(rowIndex: Double, cellIndex: Double): js.Promise[Any] = js.native
  
  def getCellStyle(rowIndex: Double, colIndex: Double): js.Promise[String | Null] = js.native
  
  def getCellTextValue(): js.Promise[String] = js.native
  def getCellTextValue(row: Double): js.Promise[String] = js.native
  def getCellTextValue(row: Double, column: Double): js.Promise[String] = js.native
  def getCellTextValue(row: Unit, column: Double): js.Promise[String] = js.native
  
  def getCellWidth(rowIndex: Double, colIndex: Double): js.Promise[String | Null] = js.native
  
  def getHeaderCell(index: Double): js.Promise[Any] = js.native
  
  def getHeaderCellStyle(index: Double): js.Promise[String | Null] = js.native
  
  def getHeaderCellWidth(index: Double): js.Promise[String | Null] = js.native
  
  def getInnerHtml(): Any = js.native
  
  def getRow(rowIndex: Double): UniDriver[Any] = js.native
  
  def getRowCheckboxDriver(index: Double): js.Promise[CheckboxUniDriver] = js.native
  
  def getRowClasses(index: Double): js.Promise[js.Array[String]] = js.native
  
  def getRowDetails(index: Double): js.Promise[Any] = js.native
  
  def getRowDetailsText(index: Double): js.Promise[String] = js.native
  
  def getRowText(index: Double): js.Promise[js.Array[String]] = js.native
  
  def getRowWithDataHook(dataHookName: String): js.Promise[Any] = js.native
  
  def getRowsCount(): js.Promise[Double] = js.native
  
  def getRowsWithClassCount(className: String): js.Promise[Double] = js.native
  
  def getRowsWithDataHook(dataHookName: String): js.Promise[js.Array[Any]] = js.native
  
  def getSelectionTooltipContent(index: Double): js.Promise[String] = js.native
  
  def getTitlebar(): js.Promise[UniDriver[Any] | Null] = js.native
  
  def getTitles(): js.Promise[js.Array[String]] = js.native
  
  def hasChildWithId(id: String): js.Promise[Boolean] = js.native
  
  def hasInfoIcon(index: Double): js.Promise[Boolean] = js.native
  
  def hasRowDetails(index: Double): js.Promise[Double] = js.native
  
  def hasSortDescending(index: Double): js.Promise[Boolean] = js.native
  
  def hasSortableTitle(index: Double): js.Promise[Boolean] = js.native
  
  def isBulkSelectionDisabled(): js.Promise[Boolean] = js.native
  
  def isCellMasked(rowIndex: Double, colIndex: Double): js.Promise[Boolean] = js.native
  
  def isDisplayingHeader(): js.Promise[Boolean] = js.native
  
  def isDisplayingHeaderOnly(): js.Promise[Boolean] = js.native
  
  def isDisplayingNothing(): js.Promise[Boolean] = js.native
  
  def isHeaderVisible(): js.Promise[Boolean] = js.native
  
  def isRowAnimated(index: Double): js.Promise[Boolean] = js.native
  
  def isRowClickable(index: Double): js.Promise[Boolean] = js.native
  
  def isRowSelected(index: Double): js.Promise[Boolean] = js.native
  
  def isRowSelectionDisabled(index: Double): js.Promise[Boolean] = js.native
  
  def isSelectionTooltipEnabled(index: Double): js.Promise[Boolean] = js.native
  
  def mouseEnterRow(index: Double): js.Promise[Unit] = js.native
  def mouseEnterRow(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
  
  def mouseLeaveRow(index: Double): js.Promise[Unit] = js.native
  def mouseLeaveRow(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
}
