package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxTrackBar control.
  */
trait ASPxClientTrackBar
  extends StObject
     with ASPxClientEdit {
  
  /**
    * Returns the number of the track bar items that are maintained by the item collection.
    */
  def GetItemCount(): Double
  
  /**
    * Returns a track bar item index by the item's value. An Int32 value that is an index of the item with the specified value. null (Nothing in Visual Basic) if the item was not found.
    * @param value An object that specifies the item's value.
    */
  def GetItemIndexByValue(value: Any): Double
  
  /**
    * Returns a track bar item text. A String value specifying the track bar item text.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemText(index: Double): String
  
  /**
    * Returns a track bar item's tooltip text. A String value that specifies the text content of the current item's tooltip.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemToolTip(index: Double): String
  
  /**
    * Returns a track bar item's associated value. An Object that specifies the item's value.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemValue(index: Double): Any
  
  /**
    * Gets a drag handle position.
    */
  def GetPosition(): Double
  
  /**
    * Returns the secondary drag handle position.
    */
  def GetPositionEnd(): Double
  
  /**
    * Returns the main drag handle position.
    */
  def GetPositionStart(): Double
  
  /**
    * Fires after the editor's position has been changed.
    */
  var PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  
  /**
    * Occurs on the client before a user changes track bar position.
    */
  var PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]]
  
  /**
    * Specifies a drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPosition(position: Double): Unit
  
  /**
    * Specifies the secondary drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPositionEnd(position: Double): Unit
  
  /**
    * Specifies the main drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPositionStart(position: Double): Unit
  
  /**
    * Occurs on the client-side when an end-user moves a cursor while the drag handle is held down.
    */
  var Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  
  /**
    * Occurs on the client-side when an end-user releases a drag handle after moving it.
    */
  var TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  
  /**
    * Occurs on the client-side when an end-user presses a drag handle and moves it.
    */
  var TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
}
object ASPxClientTrackBar {
  
  inline def apply(
    AdjustControl: Callback,
    Focus: Callback,
    GetCaption: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetErrorText: CallbackTo[String],
    GetHeight: CallbackTo[Double],
    GetInputElement: CallbackTo[Any],
    GetIsValid: CallbackTo[Boolean],
    GetItemCount: CallbackTo[Double],
    GetItemIndexByValue: Any => Double,
    GetItemText: Double => String,
    GetItemToolTip: Double => String,
    GetItemValue: Double => Any,
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetPosition: CallbackTo[Double],
    GetPositionEnd: CallbackTo[Double],
    GetPositionStart: CallbackTo[Double],
    GetReadOnly: CallbackTo[Boolean],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetErrorText: String => Callback,
    SetHeight: Double => Callback,
    SetIsValid: Boolean => Callback,
    SetPosition: Double => Callback,
    SetPositionEnd: Double => Callback,
    SetPositionStart: Double => Callback,
    SetReadOnly: Boolean => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientTrackBar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Focus = Focus.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetItemCount = GetItemCount.toJsFn, GetItemIndexByValue = js.Any.fromFunction1(GetItemIndexByValue), GetItemText = js.Any.fromFunction1(GetItemText), GetItemToolTip = js.Any.fromFunction1(GetItemToolTip), GetItemValue = js.Any.fromFunction1(GetItemValue), GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetPosition = GetPosition.toJsFn, GetPositionEnd = GetPositionEnd.toJsFn, GetPositionStart = GetPositionStart.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], PositionChanged = PositionChanged.asInstanceOf[js.Any], PositionChanging = PositionChanging.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetPosition = js.Any.fromFunction1((t0: Double) => SetPosition(t0).runNow()), SetPositionEnd = js.Any.fromFunction1((t0: Double) => SetPositionEnd(t0).runNow()), SetPositionStart = js.Any.fromFunction1((t0: Double) => SetPositionStart(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Track = Track.asInstanceOf[js.Any], TrackEnd = TrackEnd.asInstanceOf[js.Any], TrackStart = TrackStart.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTrackBar]
  }
  
  extension [Self <: ASPxClientTrackBar](x: Self) {
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetItemCount", value.toJsFn)
    
    inline def setGetItemIndexByValue(value: Any => Double): Self = StObject.set(x, "GetItemIndexByValue", js.Any.fromFunction1(value))
    
    inline def setGetItemText(value: Double => String): Self = StObject.set(x, "GetItemText", js.Any.fromFunction1(value))
    
    inline def setGetItemToolTip(value: Double => String): Self = StObject.set(x, "GetItemToolTip", js.Any.fromFunction1(value))
    
    inline def setGetItemValue(value: Double => Any): Self = StObject.set(x, "GetItemValue", js.Any.fromFunction1(value))
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "GetPosition", value.toJsFn)
    
    inline def setGetPositionEnd(value: CallbackTo[Double]): Self = StObject.set(x, "GetPositionEnd", value.toJsFn)
    
    inline def setGetPositionStart(value: CallbackTo[Double]): Self = StObject.set(x, "GetPositionStart", value.toJsFn)
    
    inline def setPositionChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = StObject.set(x, "PositionChanged", value.asInstanceOf[js.Any])
    
    inline def setPositionChanging(value: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]]): Self = StObject.set(x, "PositionChanging", value.asInstanceOf[js.Any])
    
    inline def setSetPosition(value: Double => Callback): Self = StObject.set(x, "SetPosition", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPositionEnd(value: Double => Callback): Self = StObject.set(x, "SetPositionEnd", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPositionStart(value: Double => Callback): Self = StObject.set(x, "SetPositionStart", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTrack(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
    
    inline def setTrackEnd(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = StObject.set(x, "TrackEnd", value.asInstanceOf[js.Any])
    
    inline def setTrackStart(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = StObject.set(x, "TrackStart", value.asInstanceOf[js.Any])
  }
}
