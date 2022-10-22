package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for BigQueryDataSourceSpecBuilder.
  */
trait BigQueryDataSourceSpecBuilder extends StObject {
  
  def build(): DataSourceSpec
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getProjectId(): String
  
  def getRawQuery(): String
  
  def getType(): DataSourceType
  
  def removeAllParameters(): BigQueryDataSourceSpecBuilder
  
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder
  
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder
  
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder
  
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder
}
object BigQueryDataSourceSpecBuilder {
  
  inline def apply(
    build: CallbackTo[DataSourceSpec],
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getProjectId: CallbackTo[String],
    getRawQuery: CallbackTo[String],
    getType: CallbackTo[DataSourceType],
    removeAllParameters: CallbackTo[BigQueryDataSourceSpecBuilder],
    removeParameter: String => BigQueryDataSourceSpecBuilder,
    setParameterFromCell: (String, String) => BigQueryDataSourceSpecBuilder,
    setProjectId: String => BigQueryDataSourceSpecBuilder,
    setRawQuery: String => BigQueryDataSourceSpecBuilder
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, copy = copy.toJsFn, getParameters = getParameters.toJsFn, getProjectId = getProjectId.toJsFn, getRawQuery = getRawQuery.toJsFn, getType = getType.toJsFn, removeAllParameters = removeAllParameters.toJsFn, removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell), setProjectId = js.Any.fromFunction1(setProjectId), setRawQuery = js.Any.fromFunction1(setRawQuery))
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
  
  extension [Self <: BigQueryDataSourceSpecBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[DataSourceSpec]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setCopy(value: CallbackTo[DataSourceSpecBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[js.Array[DataSourceParameter]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetProjectId(value: CallbackTo[String]): Self = StObject.set(x, "getProjectId", value.toJsFn)
    
    inline def setGetRawQuery(value: CallbackTo[String]): Self = StObject.set(x, "getRawQuery", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[DataSourceType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setRemoveAllParameters(value: CallbackTo[BigQueryDataSourceSpecBuilder]): Self = StObject.set(x, "removeAllParameters", value.toJsFn)
    
    inline def setRemoveParameter(value: String => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "removeParameter", js.Any.fromFunction1(value))
    
    inline def setSetParameterFromCell(value: (String, String) => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "setParameterFromCell", js.Any.fromFunction2(value))
    
    inline def setSetProjectId(value: String => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "setProjectId", js.Any.fromFunction1(value))
    
    inline def setSetRawQuery(value: String => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "setRawQuery", js.Any.fromFunction1(value))
  }
}
