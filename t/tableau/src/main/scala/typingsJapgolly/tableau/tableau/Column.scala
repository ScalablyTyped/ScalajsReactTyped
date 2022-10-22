package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /** The data type of the column. Possible values are float, integer, string, boolean, date, and datetime. */
  def getDataType(): String
  
  /** The name of the column. */
  def getFieldName(): String
  
  /** The number of rows in the returned data. */
  def getIndex(): Double
  
  /** Whether the column data is referenced in the visualization. */
  def getIsReferenced(): Boolean
}
object Column {
  
  inline def apply(
    getDataType: CallbackTo[String],
    getFieldName: CallbackTo[String],
    getIndex: CallbackTo[Double],
    getIsReferenced: CallbackTo[Boolean]
  ): Column = {
    val __obj = js.Dynamic.literal(getDataType = getDataType.toJsFn, getFieldName = getFieldName.toJsFn, getIndex = getIndex.toJsFn, getIsReferenced = getIsReferenced.toJsFn)
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setGetDataType(value: CallbackTo[String]): Self = StObject.set(x, "getDataType", value.toJsFn)
    
    inline def setGetFieldName(value: CallbackTo[String]): Self = StObject.set(x, "getFieldName", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetIsReferenced(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsReferenced", value.toJsFn)
  }
}
