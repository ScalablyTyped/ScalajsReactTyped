package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixCellsOwner
  extends StObject
     with ILocalizableOwner {
  
  def getColumns(): js.Array[Any]
  
  def getRows(): js.Array[Any]
}
object IMatrixCellsOwner {
  
  inline def apply(
    getColumns: CallbackTo[js.Array[Any]],
    getLocale: CallbackTo[String],
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any,
    getRows: CallbackTo[js.Array[Any]]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal(getColumns = getColumns.toJsFn, getLocale = getLocale.toJsFn, getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext), getRows = getRows.toJsFn)
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
  
  extension [Self <: IMatrixCellsOwner](x: Self) {
    
    inline def setGetColumns(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setGetRows(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getRows", value.toJsFn)
  }
}
