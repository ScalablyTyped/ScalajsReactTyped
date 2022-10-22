package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxProgressBar control.
  */
trait ASPxClientProgressBar
  extends StObject
     with ASPxClientEditBase {
  
  /**
    * Returns the text displayed within the progress bar.
    */
  def GetDisplayText(): String
  
  /**
    * Gets the maximum range value of the progress bar.
    */
  def GetMaximum(): Double
  
  /**
    * Gets the minimum range value of the progress bar.
    */
  def GetMinimum(): Double
  
  /**
    * Sets the percentage representation of the progress position.
    */
  def GetPercent(): Double
  
  /**
    * Gets the position of the operation's progress.
    */
  def GetPosition(): Double
  
  /**
    * Sets the pattern used to format the displayed text for the progress bar.
    * @param text A  value that is the format pattern.
    */
  def SetCustomDisplayFormat(text: String): Unit
  
  /**
    * Sets the maximum range value of the progress bar.
    * @param max An integer value specifying the maximum value of the progress bar range.
    */
  def SetMaximum(max: Double): Unit
  
  /**
    * Sets the minimum and maximum range values of the progress bar.
    * @param minValue An integer value specifying the minimum value of the progress bar range.
    * @param maxValue An integer value specifying the maximum value of the progress bar range.
    */
  def SetMinMaxValues(minValue: Double, maxValue: Double): Unit
  
  /**
    * Sets the minimum range value of the progress bar.
    * @param min An integer value specifying the minimum value of the progress bar range.
    */
  def SetMinimum(min: Double): Unit
  
  /**
    * Sets the position of the operation's progress.
    * @param position An integer value specifying the progress position.
    */
  def SetPosition(position: Double): Unit
}
object ASPxClientProgressBar {
  
  inline def apply(
    AdjustControl: Callback,
    GetCaption: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetDisplayText: CallbackTo[String],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetMaximum: CallbackTo[Double],
    GetMinimum: CallbackTo[Double],
    GetParentControl: CallbackTo[Any],
    GetPercent: CallbackTo[Double],
    GetPosition: CallbackTo[Double],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetCustomDisplayFormat: String => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetMaximum: Double => Callback,
    SetMinMaxValues: (Double, Double) => Callback,
    SetMinimum: Double => Callback,
    SetPosition: Double => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientProgressBar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetDisplayText = GetDisplayText.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetMaximum = GetMaximum.toJsFn, GetMinimum = GetMinimum.toJsFn, GetParentControl = GetParentControl.toJsFn, GetPercent = GetPercent.toJsFn, GetPosition = GetPosition.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetCustomDisplayFormat = js.Any.fromFunction1((t0: String) => SetCustomDisplayFormat(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetMaximum = js.Any.fromFunction1((t0: Double) => SetMaximum(t0).runNow()), SetMinMaxValues = js.Any.fromFunction2((t0: Double, t1: Double) => (SetMinMaxValues(t0, t1)).runNow()), SetMinimum = js.Any.fromFunction1((t0: Double) => SetMinimum(t0).runNow()), SetPosition = js.Any.fromFunction1((t0: Double) => SetPosition(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientProgressBar]
  }
  
  extension [Self <: ASPxClientProgressBar](x: Self) {
    
    inline def setGetDisplayText(value: CallbackTo[String]): Self = StObject.set(x, "GetDisplayText", value.toJsFn)
    
    inline def setGetMaximum(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaximum", value.toJsFn)
    
    inline def setGetMinimum(value: CallbackTo[Double]): Self = StObject.set(x, "GetMinimum", value.toJsFn)
    
    inline def setGetPercent(value: CallbackTo[Double]): Self = StObject.set(x, "GetPercent", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "GetPosition", value.toJsFn)
    
    inline def setSetCustomDisplayFormat(value: String => Callback): Self = StObject.set(x, "SetCustomDisplayFormat", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMaximum(value: Double => Callback): Self = StObject.set(x, "SetMaximum", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinMaxValues(value: (Double, Double) => Callback): Self = StObject.set(x, "SetMinMaxValues", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetMinimum(value: Double => Callback): Self = StObject.set(x, "SetMinimum", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPosition(value: Double => Callback): Self = StObject.set(x, "SetPosition", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
