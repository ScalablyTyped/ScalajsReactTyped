package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixDropdownData extends StObject {
  
  def checkIfValueInRowDuplicated(checkedRow: MatrixDropdownRowModelBase, cellQuestion: Question): Boolean
  
  var columns: Any
  
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question
  
  def createRowDetailPanel(row: MatrixDropdownRowModelBase): PanelModel
  
  def getIsDetailPanelShowing(row: MatrixDropdownRowModelBase): Boolean
  
  def getLocale(): String
  
  def getMarkdownHtml(text: String, name: String): String
  
  def getParentTextProcessor(): ITextProcessor
  
  def getProcessedText(text: String): String
  
  def getRenderer(name: String): String
  
  def getRendererContext(locStr: LocalizableString): Any
  
  def getRowIndex(row: MatrixDropdownRowModelBase): Double
  
  def getRowValue(rowIndex: Double): Any
  
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question
  
  def getSurvey(): ISurvey
  
  def hasDetailPanel(row: MatrixDropdownRowModelBase): Boolean
  
  var isValidateOnValueChanging: Boolean
  
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: Any, isDeletingValue: Boolean): Unit
  
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: Any): Any
  
  def onTotalValueChanged(): Any
  
  def setIsDetailPanelShowing(row: MatrixDropdownRowModelBase, `val`: Boolean): Unit
  
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: Any): SurveyError
  
  var value: Any
}
object IMatrixDropdownData {
  
  inline def apply(
    checkIfValueInRowDuplicated: (MatrixDropdownRowModelBase, Question) => Boolean,
    columns: Any,
    createQuestion: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question,
    createRowDetailPanel: MatrixDropdownRowModelBase => PanelModel,
    getIsDetailPanelShowing: MatrixDropdownRowModelBase => Boolean,
    getLocale: CallbackTo[String],
    getMarkdownHtml: (String, String) => String,
    getParentTextProcessor: CallbackTo[ITextProcessor],
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any,
    getRowIndex: MatrixDropdownRowModelBase => Double,
    getRowValue: Double => Any,
    getSharedQuestionByName: (String, MatrixDropdownRowModelBase) => Question,
    getSurvey: CallbackTo[ISurvey],
    hasDetailPanel: MatrixDropdownRowModelBase => Boolean,
    isValidateOnValueChanging: Boolean,
    onRowChanged: (MatrixDropdownRowModelBase, String, Any, Boolean) => Callback,
    onRowChanging: (MatrixDropdownRowModelBase, String, Any) => Any,
    onTotalValueChanged: CallbackTo[Any],
    setIsDetailPanelShowing: (MatrixDropdownRowModelBase, Boolean) => Callback,
    validateCell: (MatrixDropdownRowModelBase, String, Any) => SurveyError,
    value: Any
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(checkIfValueInRowDuplicated = js.Any.fromFunction2(checkIfValueInRowDuplicated), columns = columns.asInstanceOf[js.Any], createQuestion = js.Any.fromFunction2(createQuestion), createRowDetailPanel = js.Any.fromFunction1(createRowDetailPanel), getIsDetailPanelShowing = js.Any.fromFunction1(getIsDetailPanelShowing), getLocale = getLocale.toJsFn, getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getParentTextProcessor = getParentTextProcessor.toJsFn, getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext), getRowIndex = js.Any.fromFunction1(getRowIndex), getRowValue = js.Any.fromFunction1(getRowValue), getSharedQuestionByName = js.Any.fromFunction2(getSharedQuestionByName), getSurvey = getSurvey.toJsFn, hasDetailPanel = js.Any.fromFunction1(hasDetailPanel), isValidateOnValueChanging = isValidateOnValueChanging.asInstanceOf[js.Any], onRowChanged = js.Any.fromFunction4((t0: MatrixDropdownRowModelBase, t1: String, t2: Any, t3: Boolean) => (onRowChanged(t0, t1, t2, t3)).runNow()), onRowChanging = js.Any.fromFunction3(onRowChanging), onTotalValueChanged = onTotalValueChanged.toJsFn, setIsDetailPanelShowing = js.Any.fromFunction2((t0: MatrixDropdownRowModelBase, t1: Boolean) => (setIsDetailPanelShowing(t0, t1)).runNow()), validateCell = js.Any.fromFunction3(validateCell), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixDropdownData]
  }
  
  extension [Self <: IMatrixDropdownData](x: Self) {
    
    inline def setCheckIfValueInRowDuplicated(value: (MatrixDropdownRowModelBase, Question) => Boolean): Self = StObject.set(x, "checkIfValueInRowDuplicated", js.Any.fromFunction2(value))
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setCreateQuestion(value: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question): Self = StObject.set(x, "createQuestion", js.Any.fromFunction2(value))
    
    inline def setCreateRowDetailPanel(value: MatrixDropdownRowModelBase => PanelModel): Self = StObject.set(x, "createRowDetailPanel", js.Any.fromFunction1(value))
    
    inline def setGetIsDetailPanelShowing(value: MatrixDropdownRowModelBase => Boolean): Self = StObject.set(x, "getIsDetailPanelShowing", js.Any.fromFunction1(value))
    
    inline def setGetLocale(value: CallbackTo[String]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setGetMarkdownHtml(value: (String, String) => String): Self = StObject.set(x, "getMarkdownHtml", js.Any.fromFunction2(value))
    
    inline def setGetParentTextProcessor(value: CallbackTo[ITextProcessor]): Self = StObject.set(x, "getParentTextProcessor", value.toJsFn)
    
    inline def setGetProcessedText(value: String => String): Self = StObject.set(x, "getProcessedText", js.Any.fromFunction1(value))
    
    inline def setGetRenderer(value: String => String): Self = StObject.set(x, "getRenderer", js.Any.fromFunction1(value))
    
    inline def setGetRendererContext(value: LocalizableString => Any): Self = StObject.set(x, "getRendererContext", js.Any.fromFunction1(value))
    
    inline def setGetRowIndex(value: MatrixDropdownRowModelBase => Double): Self = StObject.set(x, "getRowIndex", js.Any.fromFunction1(value))
    
    inline def setGetRowValue(value: Double => Any): Self = StObject.set(x, "getRowValue", js.Any.fromFunction1(value))
    
    inline def setGetSharedQuestionByName(value: (String, MatrixDropdownRowModelBase) => Question): Self = StObject.set(x, "getSharedQuestionByName", js.Any.fromFunction2(value))
    
    inline def setGetSurvey(value: CallbackTo[ISurvey]): Self = StObject.set(x, "getSurvey", value.toJsFn)
    
    inline def setHasDetailPanel(value: MatrixDropdownRowModelBase => Boolean): Self = StObject.set(x, "hasDetailPanel", js.Any.fromFunction1(value))
    
    inline def setIsValidateOnValueChanging(value: Boolean): Self = StObject.set(x, "isValidateOnValueChanging", value.asInstanceOf[js.Any])
    
    inline def setOnRowChanged(value: (MatrixDropdownRowModelBase, String, Any, Boolean) => Callback): Self = StObject.set(x, "onRowChanged", js.Any.fromFunction4((t0: MatrixDropdownRowModelBase, t1: String, t2: Any, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnRowChanging(value: (MatrixDropdownRowModelBase, String, Any) => Any): Self = StObject.set(x, "onRowChanging", js.Any.fromFunction3(value))
    
    inline def setOnTotalValueChanged(value: CallbackTo[Any]): Self = StObject.set(x, "onTotalValueChanged", value.toJsFn)
    
    inline def setSetIsDetailPanelShowing(value: (MatrixDropdownRowModelBase, Boolean) => Callback): Self = StObject.set(x, "setIsDetailPanelShowing", js.Any.fromFunction2((t0: MatrixDropdownRowModelBase, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setValidateCell(value: (MatrixDropdownRowModelBase, String, Any) => SurveyError): Self = StObject.set(x, "validateCell", js.Any.fromFunction3(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
