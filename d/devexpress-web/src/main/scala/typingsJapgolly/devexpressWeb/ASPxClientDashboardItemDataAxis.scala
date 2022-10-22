package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
trait ASPxClientDashboardItemDataAxis extends StObject {
  
  /**
    * Gets the dimensions used to create a hierarchy of axis points belonging to the current axis.
    */
  def GetDimensions(): js.Array[ASPxClientDashboardItemDataDimension]
  
  /**
    * Returns the data point for the specified axis by unique values. An ASPxClientDashboardItemDataAxisPoint object representing the data point belonging to the specified axis.
    * @param uniqueValues A hierarchy of unique values identifying the required data point.
    */
  def GetPointByUniqueValues(uniqueValues: js.Array[Any]): ASPxClientDashboardItemDataAxisPoint
  
  /**
    * Returns axis points corresponding to values of the last-level dimension.
    */
  def GetPoints(): js.Array[ASPxClientDashboardItemDataAxisPoint]
  
  /**
    * Returns axis points corresponding to the specified dimension. An array of ASPxClientDashboardItemDataAxisPoint objects that represent data points in a multidimensional space.
    * @param dimensionId A String that is the dimension identifier.
    */
  def GetPointsByDimension(dimensionId: String): js.Array[ASPxClientDashboardItemDataAxisPoint]
  
  /**
    * Gets the root axis point belonging to the current ASPxClientDashboardItemDataAxis.
    */
  def GetRootPoint(): ASPxClientDashboardItemDataAxisPoint
}
object ASPxClientDashboardItemDataAxis {
  
  inline def apply(
    GetDimensions: CallbackTo[js.Array[ASPxClientDashboardItemDataDimension]],
    GetPointByUniqueValues: js.Array[Any] => ASPxClientDashboardItemDataAxisPoint,
    GetPoints: CallbackTo[js.Array[ASPxClientDashboardItemDataAxisPoint]],
    GetPointsByDimension: String => js.Array[ASPxClientDashboardItemDataAxisPoint],
    GetRootPoint: CallbackTo[ASPxClientDashboardItemDataAxisPoint]
  ): ASPxClientDashboardItemDataAxis = {
    val __obj = js.Dynamic.literal(GetDimensions = GetDimensions.toJsFn, GetPointByUniqueValues = js.Any.fromFunction1(GetPointByUniqueValues), GetPoints = GetPoints.toJsFn, GetPointsByDimension = js.Any.fromFunction1(GetPointsByDimension), GetRootPoint = GetRootPoint.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardItemDataAxis]
  }
  
  extension [Self <: ASPxClientDashboardItemDataAxis](x: Self) {
    
    inline def setGetDimensions(value: CallbackTo[js.Array[ASPxClientDashboardItemDataDimension]]): Self = StObject.set(x, "GetDimensions", value.toJsFn)
    
    inline def setGetPointByUniqueValues(value: js.Array[Any] => ASPxClientDashboardItemDataAxisPoint): Self = StObject.set(x, "GetPointByUniqueValues", js.Any.fromFunction1(value))
    
    inline def setGetPoints(value: CallbackTo[js.Array[ASPxClientDashboardItemDataAxisPoint]]): Self = StObject.set(x, "GetPoints", value.toJsFn)
    
    inline def setGetPointsByDimension(value: String => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "GetPointsByDimension", js.Any.fromFunction1(value))
    
    inline def setGetRootPoint(value: CallbackTo[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "GetRootPoint", value.toJsFn)
  }
}
