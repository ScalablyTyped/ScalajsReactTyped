package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemElementCustomColor event.
  */
trait ASPxClientDashboardItemElementCustomColorEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the color of the current dashboard item element.
    */
  def GetColor(): String
  
  /**
    * Gets measures corresponding to the current dashboard item element.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure]
  
  /**
    * Gets the axis point tuple that corresponds to the current dashboard item element.
    */
  def GetTargetElement(): ASPxClientDashboardItemDataAxisPointTuple
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
  
  /**
    * Sets the color of the current dashboard item element.
    * @param color A String that specifies the color of the current dashboard item element.
    */
  def SetColor(color: String): Unit
}
object ASPxClientDashboardItemElementCustomColorEventArgs {
  
  inline def apply(
    GetColor: CallbackTo[String],
    GetMeasures: CallbackTo[js.Array[ASPxClientDashboardItemDataMeasure]],
    GetTargetElement: CallbackTo[ASPxClientDashboardItemDataAxisPointTuple],
    ItemName: String,
    SetColor: String => Callback
  ): ASPxClientDashboardItemElementCustomColorEventArgs = {
    val __obj = js.Dynamic.literal(GetColor = GetColor.toJsFn, GetMeasures = GetMeasures.toJsFn, GetTargetElement = GetTargetElement.toJsFn, ItemName = ItemName.asInstanceOf[js.Any], SetColor = js.Any.fromFunction1((t0: String) => SetColor(t0).runNow()))
    __obj.asInstanceOf[ASPxClientDashboardItemElementCustomColorEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemElementCustomColorEventArgs](x: Self) {
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "GetColor", value.toJsFn)
    
    inline def setGetMeasures(value: CallbackTo[js.Array[ASPxClientDashboardItemDataMeasure]]): Self = StObject.set(x, "GetMeasures", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[ASPxClientDashboardItemDataAxisPointTuple]): Self = StObject.set(x, "GetTargetElement", value.toJsFn)
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
    
    inline def setSetColor(value: String => Callback): Self = StObject.set(x, "SetColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
