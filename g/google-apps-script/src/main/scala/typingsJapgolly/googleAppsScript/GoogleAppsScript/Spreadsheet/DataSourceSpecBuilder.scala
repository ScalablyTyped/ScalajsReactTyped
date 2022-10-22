package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for DataSourceSpec. To create a specification for certain type, use as...() method. To create a new builder, use SpreadsheetApp.newDataSourceSpec(). To use the specification, see DataSourceTable.
  *
  * This examples show how to build a BigQuery data source specification.
  *
  *     var spec = SpreadsheetApp.newDataSourceSpec()
  *                .asBigQuery()
  *                .setProjectId('big_query_project')
  *                .setRawQuery('select @FIELD from table limit @LIMIT')
  *                .setParameterFromCell('FIELD', 'Sheet1!A1')
  *                .setParameterFromCell('LIMIT', 'namedRangeCell')
  *                .build();
  */
trait DataSourceSpecBuilder extends StObject {
  
  def asBigQuery(): BigQueryDataSourceSpecBuilder
  
  def build(): DataSourceSpec
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getType(): DataSourceType
  
  def removeAllParameters(): DataSourceSpecBuilder
  
  def removeParameter(parameterName: String): DataSourceSpecBuilder
  
  def setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder
}
object DataSourceSpecBuilder {
  
  inline def apply(
    asBigQuery: CallbackTo[BigQueryDataSourceSpecBuilder],
    build: CallbackTo[DataSourceSpec],
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getType: CallbackTo[DataSourceType],
    removeAllParameters: CallbackTo[DataSourceSpecBuilder],
    removeParameter: String => DataSourceSpecBuilder,
    setParameterFromCell: (String, String) => DataSourceSpecBuilder
  ): DataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(asBigQuery = asBigQuery.toJsFn, build = build.toJsFn, copy = copy.toJsFn, getParameters = getParameters.toJsFn, getType = getType.toJsFn, removeAllParameters = removeAllParameters.toJsFn, removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell))
    __obj.asInstanceOf[DataSourceSpecBuilder]
  }
  
  extension [Self <: DataSourceSpecBuilder](x: Self) {
    
    inline def setAsBigQuery(value: CallbackTo[BigQueryDataSourceSpecBuilder]): Self = StObject.set(x, "asBigQuery", value.toJsFn)
    
    inline def setBuild(value: CallbackTo[DataSourceSpec]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setCopy(value: CallbackTo[DataSourceSpecBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[js.Array[DataSourceParameter]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[DataSourceType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setRemoveAllParameters(value: CallbackTo[DataSourceSpecBuilder]): Self = StObject.set(x, "removeAllParameters", value.toJsFn)
    
    inline def setRemoveParameter(value: String => DataSourceSpecBuilder): Self = StObject.set(x, "removeParameter", js.Any.fromFunction1(value))
    
    inline def setSetParameterFromCell(value: (String, String) => DataSourceSpecBuilder): Self = StObject.set(x, "setParameterFromCell", js.Any.fromFunction2(value))
  }
}
