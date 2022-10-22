package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientDashboardItemRequestUnderlyingDataCompleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemClick event.
  */
@JSGlobal("ASPxClientDashboardItemClickEventArgs")
@js.native
open class ASPxClientDashboardItemClickEventArgs ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDashboardItemClickEventArgs {
  
  /**
    * Returns the axis point corresponding to the clicked visual element. An ASPxClientDashboardItemDataAxisPoint object that is the axis point.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  /* CompleteClass */
  override def GetAxisPoint(axisName: String): typingsJapgolly.devexpressWeb.ASPxClientDashboardItemDataAxisPoint = js.native
  
  /**
    * Gets the dashboard item's client data.
    */
  /* CompleteClass */
  override def GetData(): typingsJapgolly.devexpressWeb.ASPxClientDashboardItemData = js.native
  
  /**
    * Gets deltas corresponding to the clicked visual element.
    */
  /* CompleteClass */
  override def GetDeltas(): js.Array[typingsJapgolly.devexpressWeb.ASPxClientDashboardItemDataDelta] = js.native
  
  /**
    * Gets the dimensions used to create a hierarchy of axis points for the specified axis. An array of ASPxClientDashboardItemDataDimension objects that contain the dimension metadata.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  /* CompleteClass */
  override def GetDimensions(axisName: String): js.Array[typingsJapgolly.devexpressWeb.ASPxClientDashboardItemDataDimension] = js.native
  
  /**
    * Gets measures corresponding to the clicked visual element.
    */
  /* CompleteClass */
  override def GetMeasures(): js.Array[typingsJapgolly.devexpressWeb.ASPxClientDashboardItemDataMeasure] = js.native
  
  /**
    * Gets the name of the dashboard item for which the event has been raised.
    */
  /* CompleteClass */
  var ItemName: String = js.native
  
  /**
    * Requests underlying data corresponding to the clicked visual element.
    * @param onCompleted A ASPxClientDashboardItemRequestUnderlyingDataCompleted object that references a method executed after the request is completed.
    * @param dataMembers (Optional) An array of string values that specify data members used to obtain underlying data. If this parameter is not specified, underlying data for all available data members will be requested.
    */
  /* CompleteClass */
  override def RequestUnderlyingData(onCompleted: ASPxClientDashboardItemRequestUnderlyingDataCompleted, dataMembers: js.Array[String]): Unit = js.native
}
