package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientButtonClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientProcessingModeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapButton control.
  */
@JSGlobal("BootstrapClientButton")
@js.native
open class BootstrapClientButton ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientButton {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  /* CompleteClass */
  var CheckedChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientButton]
  ] = js.native
  
  /**
    * Occurs on the client side after a button is clicked.
    */
  /* CompleteClass */
  var Click: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientButtonClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientButton]
  ] = js.native
  
  /**
    * Simulates a mouse click action on the button control.
    */
  /* CompleteClass */
  override def DoClick(): Unit = js.native
  
  /**
    * Sets input focus to the button.
    */
  /* CompleteClass */
  override def Focus(): Unit = js.native
  
  /**
    * Gets the CSS class of the icon displayed within the button badge.
    */
  /* CompleteClass */
  override def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the button badge.
    */
  /* CompleteClass */
  override def GetBadgeText(): String = js.native
  
  /**
    * Returns a value indicating whether the button is checked.
    */
  /* CompleteClass */
  override def GetChecked(): Boolean = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns a value indicating whether the button is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  /* CompleteClass */
  override def GetImageUrl(): String = js.native
  
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
    * Returns the text displayed within the button.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  
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
    * Fires on the client side when the button receives input focus.
    */
  /* CompleteClass */
  var GotFocus: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientButton]] = js.native
  
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
    * Fires on the client side when the button loses input focus.
    */
  /* CompleteClass */
  var LostFocus: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientButton]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the button badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the button badge.
    * @param text A String specifying the badge text.
    */
  /* CompleteClass */
  override def SetBadgeText(text: String): Unit = js.native
  
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  /* CompleteClass */
  override def SetChecked(value: Boolean): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  /* CompleteClass */
  override def SetImageUrl(value: String): Unit = js.native
  
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  
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
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
