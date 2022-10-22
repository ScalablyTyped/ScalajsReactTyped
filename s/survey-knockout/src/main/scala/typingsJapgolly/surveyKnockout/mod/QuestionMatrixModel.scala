package typingsJapgolly.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixModel")
@js.native
open class QuestionMatrixModel protected ()
  extends QuestionMatrixBaseModel[MatrixRowModel, ItemValue]
     with IMatrixData
     with IMatrixCellsOwner {
  def this(name: String) = this()
  
  def addColumn(value: Any): ItemValue = js.native
  def addColumn(value: Any, text: String): ItemValue = js.native
  
  def cells: MatrixCells = js.native
  
  var cellsValue: MatrixCells = js.native
  
  def cells_=(`val`: MatrixCells): Unit = js.native
  
  var emptyLocalizableString: LocalizableString = js.native
  
  def getCellDisplayLocText(row: Any, column: Any): LocalizableString = js.native
  
  def getCellDisplayText(row: Any, column: Any): String = js.native
  
  def getCellText(row: Any, column: Any): String = js.native
  
  def getColumnHeaderWrapperComponentData(cell: ItemValue): Any = js.native
  
  def getColumnHeaderWrapperComponentName(cell: ItemValue): String = js.native
  
  /* CompleteClass */
  override def getColumns(): js.Array[Any] = js.native
  
  /* CompleteClass */
  override def getCorrectedRowValue(value: Any): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredProperties(): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredValues(): Any = js.native
  
  def getDefaultCellText(column: Any): String = js.native
  
  def getItemClass(row: Any, column: Any): String = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def getRowHeaderWrapperComponentData(cell: ItemValue): Any = js.native
  
  def getRowHeaderWrapperComponentName(cell: ItemValue): String = js.native
  
  /* CompleteClass */
  override def getRows(): js.Array[Any] = js.native
  
  /* InferMemberOverrides */
  override def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  def hasCellText: Boolean = js.native
  
  /*
    * Returns true, if there is at least one row.
    */
  def hasRows: Boolean = js.native
  
  /*
    * Set this property to true to hide the question if there is no visible rows in the matrix.
    */
  def hideIfRowsEmpty: Boolean = js.native
  def hideIfRowsEmpty_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set this property to true, if you want a user to answer all rows.
    */
  def isAllRowRequired: Boolean = js.native
  def isAllRowRequired_=(`val`: Boolean): Unit = js.native
  
  var isRowChanging: Boolean = js.native
  
  def itemSvgIcon: String = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  /* CompleteClass */
  override def onMatrixRowChanged(row: MatrixRowModel): Unit = js.native
  
  /* protected */ def onMatrixRowCreated(row: MatrixRowModel): Unit = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  /*
    * Use this property to render items in a specific order: "random" or "initial". Default is "initial".
    */
  def rowsOrder: String = js.native
  def rowsOrder_=(`val`: String): Unit = js.native
  
  def setCellText(row: Any, column: Any, `val`: String): Unit = js.native
  
  def setDefaultCellText(column: Any, `val`: String): Unit = js.native
  
  /* protected */ def sortVisibleRows(array: Any): js.Array[MatrixRowModel] = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
  
  /* protected */ def updateHasCellText(): Unit = js.native
}
