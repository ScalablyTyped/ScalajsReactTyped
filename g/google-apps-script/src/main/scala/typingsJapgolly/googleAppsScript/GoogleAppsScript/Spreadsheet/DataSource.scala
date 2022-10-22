package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify existing data source. To create a data source table with new data source, see
  * DataSourceTable.
  */
trait DataSource extends StObject {
  
  def getSpec(): DataSourceSpec
  
  def updateSpec(spec: DataSourceSpec): DataSource
}
object DataSource {
  
  inline def apply(getSpec: CallbackTo[DataSourceSpec], updateSpec: DataSourceSpec => DataSource): DataSource = {
    val __obj = js.Dynamic.literal(getSpec = getSpec.toJsFn, updateSpec = js.Any.fromFunction1(updateSpec))
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setGetSpec(value: CallbackTo[DataSourceSpec]): Self = StObject.set(x, "getSpec", value.toJsFn)
    
    inline def setUpdateSpec(value: DataSourceSpec => DataSource): Self = StObject.set(x, "updateSpec", js.Any.fromFunction1(value))
  }
}
