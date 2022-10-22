package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponse extends StObject {
  
  def getDataTable(): DataTable
  
  def getDetailedMessage(): String
  
  def getMessage(): String
  
  def getReasons(): js.Array[String]
  
  def hasWarning(): Boolean
  
  def isError(): Boolean
}
object QueryResponse {
  
  inline def apply(
    getDataTable: CallbackTo[DataTable],
    getDetailedMessage: CallbackTo[String],
    getMessage: CallbackTo[String],
    getReasons: CallbackTo[js.Array[String]],
    hasWarning: CallbackTo[Boolean],
    isError: CallbackTo[Boolean]
  ): QueryResponse = {
    val __obj = js.Dynamic.literal(getDataTable = getDataTable.toJsFn, getDetailedMessage = getDetailedMessage.toJsFn, getMessage = getMessage.toJsFn, getReasons = getReasons.toJsFn, hasWarning = hasWarning.toJsFn, isError = isError.toJsFn)
    __obj.asInstanceOf[QueryResponse]
  }
  
  extension [Self <: QueryResponse](x: Self) {
    
    inline def setGetDataTable(value: CallbackTo[DataTable]): Self = StObject.set(x, "getDataTable", value.toJsFn)
    
    inline def setGetDetailedMessage(value: CallbackTo[String]): Self = StObject.set(x, "getDetailedMessage", value.toJsFn)
    
    inline def setGetMessage(value: CallbackTo[String]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetReasons(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getReasons", value.toJsFn)
    
    inline def setHasWarning(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasWarning", value.toJsFn)
    
    inline def setIsError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isError", value.toJsFn)
  }
}
