package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder to create a getData() response for your script project.
  *
  *     function getFields() {...}
  *     function getData() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *
  *       return cc.newGetDataResponse()
  *         .setFields(getFields())
  *         .addRow(['3', 'Foobar.com'])
  *         .addRow(['4', 'Foobaz.com'])
  *         .addRows([
  *           ['5', 'Fizzbuz.com'],
  *           ['6', 'Fizzbaz.com']
  *          ])
  *         .build();
  *     }
  */
trait GetDataResponse extends StObject {
  
  def addAllRows(rows: js.Array[js.Array[String]]): GetDataResponse
  
  def addRow(row: js.Array[String]): GetDataResponse
  
  def build(): Any
  
  def setFields(fields: Fields): GetDataResponse
  
  def setFiltersApplied(filtersApplied: Boolean): GetDataResponse
}
object GetDataResponse {
  
  inline def apply(
    addAllRows: js.Array[js.Array[String]] => GetDataResponse,
    addRow: js.Array[String] => GetDataResponse,
    build: CallbackTo[Any],
    setFields: Fields => GetDataResponse,
    setFiltersApplied: Boolean => GetDataResponse
  ): GetDataResponse = {
    val __obj = js.Dynamic.literal(addAllRows = js.Any.fromFunction1(addAllRows), addRow = js.Any.fromFunction1(addRow), build = build.toJsFn, setFields = js.Any.fromFunction1(setFields), setFiltersApplied = js.Any.fromFunction1(setFiltersApplied))
    __obj.asInstanceOf[GetDataResponse]
  }
  
  extension [Self <: GetDataResponse](x: Self) {
    
    inline def setAddAllRows(value: js.Array[js.Array[String]] => GetDataResponse): Self = StObject.set(x, "addAllRows", js.Any.fromFunction1(value))
    
    inline def setAddRow(value: js.Array[String] => GetDataResponse): Self = StObject.set(x, "addRow", js.Any.fromFunction1(value))
    
    inline def setBuild(value: CallbackTo[Any]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetFields(value: Fields => GetDataResponse): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
    
    inline def setSetFiltersApplied(value: Boolean => GetDataResponse): Self = StObject.set(x, "setFiltersApplied", js.Any.fromFunction1(value))
  }
}
