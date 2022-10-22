package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access existing data source parameters.
  */
trait DataSourceParameter extends StObject {
  
  def getName(): String
  
  def getSourceCell(): String | Null
  
  def getType(): DataSourceParameterType
}
object DataSourceParameter {
  
  inline def apply(
    getName: CallbackTo[String],
    getSourceCell: CallbackTo[String | Null],
    getType: CallbackTo[DataSourceParameterType]
  ): DataSourceParameter = {
    val __obj = js.Dynamic.literal(getName = getName.toJsFn, getSourceCell = getSourceCell.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[DataSourceParameter]
  }
  
  extension [Self <: DataSourceParameter](x: Self) {
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSourceCell(value: CallbackTo[String | Null]): Self = StObject.set(x, "getSourceCell", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[DataSourceParameterType]): Self = StObject.set(x, "getType", value.toJsFn)
  }
}
