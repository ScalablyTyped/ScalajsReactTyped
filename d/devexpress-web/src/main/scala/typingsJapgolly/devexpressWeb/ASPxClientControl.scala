package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
trait ASPxClientControl
  extends StObject
     with ASPxClientControlBase {
  
  /**
    * Modifies the control's size against the control's container.
    */
  def AdjustControl(): Unit
  
  /**
    * Returns the control's height.
    */
  def GetHeight(): Double
  
  /**
    * Returns the control's width.
    */
  def GetWidth(): Double
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  def SetHeight(height: Double): Unit
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  def SetWidth(width: Double): Unit
}
object ASPxClientControl {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControl]
  }
  
  extension [Self <: ASPxClientControl](x: Self) {
    
    inline def setAdjustControl(value: Callback): Self = StObject.set(x, "AdjustControl", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "GetHeight", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "GetWidth", value.toJsFn)
    
    inline def setSetHeight(value: Double => Callback): Self = StObject.set(x, "SetHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetWidth(value: Double => Callback): Self = StObject.set(x, "SetWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
