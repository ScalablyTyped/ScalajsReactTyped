package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixColumnOwner
  extends StObject
     with ILocalizableOwner {
  
  def getCellType(): String
  
  def getCustomCellType(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, cellType: String): String
  
  def getRequiredText(): String
  
  def hasChoices(): Boolean
  
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit
  
  def onColumnItemValuePropertyChanged(
    column: MatrixDropdownColumn,
    propertyName: String,
    obj: ItemValue,
    name: String,
    newValue: Any,
    oldValue: Any
  ): Unit
  
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: Any): Unit
  
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit
}
object IMatrixColumnOwner {
  
  inline def apply(
    getCellType: CallbackTo[String],
    getCustomCellType: (MatrixDropdownColumn, MatrixDropdownRowModelBase, String) => String,
    getLocale: CallbackTo[String],
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any,
    getRequiredText: CallbackTo[String],
    hasChoices: CallbackTo[Boolean],
    onColumnCellTypeChanged: MatrixDropdownColumn => Callback,
    onColumnItemValuePropertyChanged: (MatrixDropdownColumn, String, ItemValue, String, Any, Any) => Callback,
    onColumnPropertyChanged: (MatrixDropdownColumn, String, Any) => Callback,
    onShowInMultipleColumnsChanged: MatrixDropdownColumn => Callback
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = getCellType.toJsFn, getCustomCellType = js.Any.fromFunction3(getCustomCellType), getLocale = getLocale.toJsFn, getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext), getRequiredText = getRequiredText.toJsFn, hasChoices = hasChoices.toJsFn, onColumnCellTypeChanged = js.Any.fromFunction1((t0: MatrixDropdownColumn) => onColumnCellTypeChanged(t0).runNow()), onColumnItemValuePropertyChanged = js.Any.fromFunction6((t0: MatrixDropdownColumn, t1: String, t2: ItemValue, t3: String, t4: Any, t5: Any) => (onColumnItemValuePropertyChanged(t0, t1, t2, t3, t4, t5)).runNow()), onColumnPropertyChanged = js.Any.fromFunction3((t0: MatrixDropdownColumn, t1: String, t2: Any) => (onColumnPropertyChanged(t0, t1, t2)).runNow()), onShowInMultipleColumnsChanged = js.Any.fromFunction1((t0: MatrixDropdownColumn) => onShowInMultipleColumnsChanged(t0).runNow()))
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
  
  extension [Self <: IMatrixColumnOwner](x: Self) {
    
    inline def setGetCellType(value: CallbackTo[String]): Self = StObject.set(x, "getCellType", value.toJsFn)
    
    inline def setGetCustomCellType(value: (MatrixDropdownColumn, MatrixDropdownRowModelBase, String) => String): Self = StObject.set(x, "getCustomCellType", js.Any.fromFunction3(value))
    
    inline def setGetRequiredText(value: CallbackTo[String]): Self = StObject.set(x, "getRequiredText", value.toJsFn)
    
    inline def setHasChoices(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChoices", value.toJsFn)
    
    inline def setOnColumnCellTypeChanged(value: MatrixDropdownColumn => Callback): Self = StObject.set(x, "onColumnCellTypeChanged", js.Any.fromFunction1((t0: MatrixDropdownColumn) => value(t0).runNow()))
    
    inline def setOnColumnItemValuePropertyChanged(value: (MatrixDropdownColumn, String, ItemValue, String, Any, Any) => Callback): Self = StObject.set(x, "onColumnItemValuePropertyChanged", js.Any.fromFunction6((t0: MatrixDropdownColumn, t1: String, t2: ItemValue, t3: String, t4: Any, t5: Any) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setOnColumnPropertyChanged(value: (MatrixDropdownColumn, String, Any) => Callback): Self = StObject.set(x, "onColumnPropertyChanged", js.Any.fromFunction3((t0: MatrixDropdownColumn, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnShowInMultipleColumnsChanged(value: MatrixDropdownColumn => Callback): Self = StObject.set(x, "onShowInMultipleColumnsChanged", js.Any.fromFunction1((t0: MatrixDropdownColumn) => value(t0).runNow()))
  }
}
