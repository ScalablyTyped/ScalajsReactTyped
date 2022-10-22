package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxPivotCustomizationControl control.
  */
trait ASPxClientPivotCustomization
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns an HTML element that represents the root of the control's hierarchy.
    */
  def GetMainContainer(): Any
  
  /**
    * Returns a client-side equivalent of the owner Pivot Grid Control.
    */
  def GetPivotGrid(): ASPxClientPivotGrid
  
  /**
    * Specifies the Customization Control's layout.
    * @param layout A string that specifies the Customization Control's layout.
    */
  def SetLayout(layout: String): Unit
  
  /**
    * Recalculates the Customization Control height.
    */
  def UpdateHeight(): Unit
}
object ASPxClientPivotCustomization {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainContainer: CallbackTo[Any],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetPivotGrid: CallbackTo[ASPxClientPivotGrid],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetLayout: String => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    UpdateHeight: Callback,
    name: String
  ): ASPxClientPivotCustomization = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainContainer = GetMainContainer.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetPivotGrid = GetPivotGrid.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetLayout = js.Any.fromFunction1((t0: String) => SetLayout(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), UpdateHeight = UpdateHeight.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPivotCustomization]
  }
  
  extension [Self <: ASPxClientPivotCustomization](x: Self) {
    
    inline def setGetMainContainer(value: CallbackTo[Any]): Self = StObject.set(x, "GetMainContainer", value.toJsFn)
    
    inline def setGetPivotGrid(value: CallbackTo[ASPxClientPivotGrid]): Self = StObject.set(x, "GetPivotGrid", value.toJsFn)
    
    inline def setSetLayout(value: String => Callback): Self = StObject.set(x, "SetLayout", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateHeight(value: Callback): Self = StObject.set(x, "UpdateHeight", value.toJsFn)
  }
}
