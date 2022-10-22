package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of records from the dashboard data source.
  */
trait ASPxClientDashboardItemUnderlyingData extends StObject {
  
  /**
    * Returns an array of data members available in a data source.
    */
  def GetDataMembers(): js.Array[String]
  
  /**
    * Returns a callstack containing the error caused by an unsuccessful request for underlying data.
    */
  def GetRequestDataError(): String
  
  /**
    * Gets the number of rows in the underlying data set.
    */
  def GetRowCount(): Double
  
  /**
    * Returns the value of the specified cell within the underlying data set. An object that represents the value of the specified cell.
    * @param rowIndex An integer value that specifies the zero-based index of the required row.
    * @param dataMember A String that specifies the required data member.
    */
  def GetRowValue(rowIndex: Double, dataMember: String): Any
  
  /**
    * Returns whether a request for underlying data was successful.
    */
  def IsDataReceived(): Boolean
}
object ASPxClientDashboardItemUnderlyingData {
  
  inline def apply(
    GetDataMembers: CallbackTo[js.Array[String]],
    GetRequestDataError: CallbackTo[String],
    GetRowCount: CallbackTo[Double],
    GetRowValue: (Double, String) => Any,
    IsDataReceived: CallbackTo[Boolean]
  ): ASPxClientDashboardItemUnderlyingData = {
    val __obj = js.Dynamic.literal(GetDataMembers = GetDataMembers.toJsFn, GetRequestDataError = GetRequestDataError.toJsFn, GetRowCount = GetRowCount.toJsFn, GetRowValue = js.Any.fromFunction2(GetRowValue), IsDataReceived = IsDataReceived.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardItemUnderlyingData]
  }
  
  extension [Self <: ASPxClientDashboardItemUnderlyingData](x: Self) {
    
    inline def setGetDataMembers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "GetDataMembers", value.toJsFn)
    
    inline def setGetRequestDataError(value: CallbackTo[String]): Self = StObject.set(x, "GetRequestDataError", value.toJsFn)
    
    inline def setGetRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetRowCount", value.toJsFn)
    
    inline def setGetRowValue(value: (Double, String) => Any): Self = StObject.set(x, "GetRowValue", js.Any.fromFunction2(value))
    
    inline def setIsDataReceived(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsDataReceived", value.toJsFn)
  }
}
