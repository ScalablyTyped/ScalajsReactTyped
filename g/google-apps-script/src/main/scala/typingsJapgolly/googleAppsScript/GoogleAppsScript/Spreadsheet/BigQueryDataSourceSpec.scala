package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the existing BigQuery data source specification. To create a new data source
  * specification, use SpreadsheetApp.newDataSourceSpec().
  */
trait BigQueryDataSourceSpec extends StObject {
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getProjectId(): String
  
  def getRawQuery(): String
  
  def getType(): DataSourceType
}
object BigQueryDataSourceSpec {
  
  inline def apply(
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getProjectId: CallbackTo[String],
    getRawQuery: CallbackTo[String],
    getType: CallbackTo[DataSourceType]
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, getParameters = getParameters.toJsFn, getProjectId = getProjectId.toJsFn, getRawQuery = getRawQuery.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
  
  extension [Self <: BigQueryDataSourceSpec](x: Self) {
    
    inline def setCopy(value: CallbackTo[DataSourceSpecBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[js.Array[DataSourceParameter]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetProjectId(value: CallbackTo[String]): Self = StObject.set(x, "getProjectId", value.toJsFn)
    
    inline def setGetRawQuery(value: CallbackTo[String]): Self = StObject.set(x, "getRawQuery", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[DataSourceType]): Self = StObject.set(x, "getType", value.toJsFn)
  }
}
