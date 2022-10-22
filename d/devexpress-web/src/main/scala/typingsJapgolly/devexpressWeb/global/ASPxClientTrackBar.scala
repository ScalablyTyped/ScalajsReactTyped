package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientEditValidationEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientProcessingModeEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTrackBarPositionChangingEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxTrackBar control.
  */
@JSGlobal("ASPxClientTrackBar")
@js.native
open class ASPxClientTrackBar ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientTrackBar {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Sets input focus to the editor.
    */
  /* CompleteClass */
  override def Focus(): Unit = js.native
  
  /**
    * Returns the text displayed in the editor caption.
    */
  /* CompleteClass */
  override def GetCaption(): String = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  /* CompleteClass */
  override def GetErrorText(): String = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the control's input element.
    */
  /* CompleteClass */
  override def GetInputElement(): Any = js.native
  
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  /* CompleteClass */
  override def GetIsValid(): Boolean = js.native
  
  /**
    * Returns the number of the track bar items that are maintained by the item collection.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  
  /**
    * Returns a track bar item index by the item's value. An Int32 value that is an index of the item with the specified value. null (Nothing in Visual Basic) if the item was not found.
    * @param value An object that specifies the item's value.
    */
  /* CompleteClass */
  override def GetItemIndexByValue(value: Any): Double = js.native
  
  /**
    * Returns a track bar item text. A String value specifying the track bar item text.
    * @param index An integer value that specifies the required item's index.
    */
  /* CompleteClass */
  override def GetItemText(index: Double): String = js.native
  
  /**
    * Returns a track bar item's tooltip text. A String value that specifies the text content of the current item's tooltip.
    * @param index An integer value that specifies the required item's index.
    */
  /* CompleteClass */
  override def GetItemToolTip(index: Double): String = js.native
  
  /**
    * Returns a track bar item's associated value. An Object that specifies the item's value.
    * @param index An integer value that specifies the required item's index.
    */
  /* CompleteClass */
  override def GetItemValue(index: Double): Any = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Gets a drag handle position.
    */
  /* CompleteClass */
  override def GetPosition(): Double = js.native
  
  /**
    * Returns the secondary drag handle position.
    */
  /* CompleteClass */
  override def GetPositionEnd(): Double = js.native
  
  /**
    * Returns the main drag handle position.
    */
  /* CompleteClass */
  override def GetPositionStart(): Double = js.native
  
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  
  /**
    * Returns the editor's value.
    */
  /* CompleteClass */
  override def GetValue(): Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Fires on the client side when the editor receives input focus.
    */
  /* CompleteClass */
  var GotFocus: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Fires on the client side when the editor loses input focus.
    */
  /* CompleteClass */
  var LostFocus: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Fires after the editor's position has been changed.
    */
  /* CompleteClass */
  var PositionChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTrackBar]
  ] = js.native
  
  /**
    * Occurs on the client before a user changes track bar position.
    */
  /* CompleteClass */
  var PositionChanging: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTrackBarPositionChangingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTrackBar]
  ] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  /* CompleteClass */
  override def SetCaption(caption: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  /* CompleteClass */
  override def SetErrorText(errorText: String): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  /* CompleteClass */
  override def SetIsValid(isValid: Boolean): Unit = js.native
  
  /**
    * Specifies a drag handle position.
    * @param position A  value that specifies the position.
    */
  /* CompleteClass */
  override def SetPosition(position: Double): Unit = js.native
  
  /**
    * Specifies the secondary drag handle position.
    * @param position A  value that specifies the position.
    */
  /* CompleteClass */
  override def SetPositionEnd(position: Double): Unit = js.native
  
  /**
    * Specifies the main drag handle position.
    * @param position A  value that specifies the position.
    */
  /* CompleteClass */
  override def SetPositionStart(position: Double): Unit = js.native
  
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  /* CompleteClass */
  override def SetReadOnly(readOnly: Boolean): Unit = js.native
  
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  /* CompleteClass */
  override def SetValue(value: Any): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Occurs on the client-side when an end-user moves a cursor while the drag handle is held down.
    */
  /* CompleteClass */
  var Track: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTrackBar]
  ] = js.native
  
  /**
    * Occurs on the client-side when an end-user releases a drag handle after moving it.
    */
  /* CompleteClass */
  var TrackEnd: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTrackBar]
  ] = js.native
  
  /**
    * Occurs on the client-side when an end-user presses a drag handle and moves it.
    */
  /* CompleteClass */
  var TrackStart: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTrackBar]
  ] = js.native
  
  /**
    * Performs the editor's validation.
    */
  /* CompleteClass */
  override def Validate(): Unit = js.native
  
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  /* CompleteClass */
  var Validation: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientEditValidationEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]
  ] = js.native
  
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  /* CompleteClass */
  var ValueChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]
  ] = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object ASPxClientTrackBar {
  
  @JSGlobal("ASPxClientTrackBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientTrackBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typingsJapgolly.devexpressWeb.ASPxClientTrackBar = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devexpressWeb.ASPxClientTrackBar]
}
