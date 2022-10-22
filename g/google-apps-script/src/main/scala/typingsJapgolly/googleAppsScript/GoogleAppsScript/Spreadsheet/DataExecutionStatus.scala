package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data execution status.
  */
trait DataExecutionStatus extends StObject {
  
  def getErrorCode(): DataExecutionErrorCode
  
  def getErrorMessage(): String
  
  def getExecutionState(): DataExecutionState
  
  def getLastRefreshedTime(): Date | Null
  
  def isTruncated(): Boolean
}
object DataExecutionStatus {
  
  inline def apply(
    getErrorCode: CallbackTo[DataExecutionErrorCode],
    getErrorMessage: CallbackTo[String],
    getExecutionState: CallbackTo[DataExecutionState],
    getLastRefreshedTime: CallbackTo[Date | Null],
    isTruncated: CallbackTo[Boolean]
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = getErrorCode.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getExecutionState = getExecutionState.toJsFn, getLastRefreshedTime = getLastRefreshedTime.toJsFn, isTruncated = isTruncated.toJsFn)
    __obj.asInstanceOf[DataExecutionStatus]
  }
  
  extension [Self <: DataExecutionStatus](x: Self) {
    
    inline def setGetErrorCode(value: CallbackTo[DataExecutionErrorCode]): Self = StObject.set(x, "getErrorCode", value.toJsFn)
    
    inline def setGetErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
    
    inline def setGetExecutionState(value: CallbackTo[DataExecutionState]): Self = StObject.set(x, "getExecutionState", value.toJsFn)
    
    inline def setGetLastRefreshedTime(value: CallbackTo[Date | Null]): Self = StObject.set(x, "getLastRefreshedTime", value.toJsFn)
    
    inline def setIsTruncated(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTruncated", value.toJsFn)
  }
}
