package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientEditEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapHyperLink control.
  */
@JSGlobal("BootstrapClientHyperLink")
@js.native
open class BootstrapClientHyperLink ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientHyperLink {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Occurs on the client side after an end-user clicks within a static editor.
    */
  /* CompleteClass */
  var Click: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEditEventHandler[typingsJapgolly.devexpressWeb.ASPxClientStaticEdit]] = js.native
  
  /**
    * Gets the CSS class of the icon displayed within the hyperlink badge.
    */
  /* CompleteClass */
  override def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the hyperlink badge.
    */
  /* CompleteClass */
  override def GetBadgeText(): String = js.native
  
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
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Gets an URL which defines the navigation location for the editor's hyperlink.
    */
  /* CompleteClass */
  override def GetNavigateUrl(): String = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Gets the text caption displayed for the hyperlink in the hyperlink editor.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  
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
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the hyperlink badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the hyperlink badge.
    * @param text A String specifying the badge text.
    */
  /* CompleteClass */
  override def SetBadgeText(text: String): Unit = js.native
  
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
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Specifies an URL which defines the navigation location for the editor's hyperlink.
    * @param url A string value which specifies an URL to where the client web browser will navigate when a hyperlink in the editor is clicked.
    */
  /* CompleteClass */
  override def SetNavigateUrl(url: String): Unit = js.native
  
  /**
    * Specifies the text caption displayed for the hyperlink in the hyperlink editor.
    * @param text A string value specifying the text caption for the hyperlink in the editor.
    */
  /* CompleteClass */
  override def SetText(text: String): Unit = js.native
  
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
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
