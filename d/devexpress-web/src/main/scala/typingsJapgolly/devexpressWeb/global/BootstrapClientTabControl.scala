package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTabControlTabCancelEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTabControlTabClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTabControlTabEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapTabControl control.
  */
@JSGlobal("BootstrapClientTabControl")
@js.native
open class BootstrapClientTabControl ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientTabControl {
  
  /**
    * Fires on the client side after the active tab has been changed within a tab control.
    */
  /* CompleteClass */
  var ActiveTabChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTabControlTabEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTabControlBase]
  ] = js.native
  
  /**
    * Fires on the client side before the active tab is changed within a tab control.
    */
  /* CompleteClass */
  var ActiveTabChanging: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTabControlTabCancelEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTabControlBase]
  ] = js.native
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Modifies a tab page's size in accordance with the content.
    */
  /* CompleteClass */
  override def AdjustSize(): Unit = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  var BeginCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTabControlBase]
  ] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a client tab control.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTabControlBase]
  ] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientEndCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTabControlBase]
  ] = js.native
  
  /**
    * Returns the active tab within the tab control.
    */
  /* CompleteClass */
  override def GetActiveTab(): typingsJapgolly.devexpressWeb.ASPxClientTab = js.native
  
  /**
    * Returns the index of the active tab within the tab control.
    */
  /* CompleteClass */
  override def GetActiveTabIndex(): Double = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
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
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns a tab specified by its index. An ASPxClientTab object representing the tab located at the specified index within the control's ASPxTabControl.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  /* CompleteClass */
  override def GetTab(index: Double): typingsJapgolly.devexpressWeb.ASPxClientTab = js.native
  
  /**
    * Returns a tab specified by its name. An ASPxClientTab object that represents the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  /* CompleteClass */
  override def GetTabByName(name: String): typingsJapgolly.devexpressWeb.ASPxClientTab = js.native
  
  /**
    * Returns the number of tabs in the ASPxTabControl.
    */
  /* CompleteClass */
  override def GetTabCount(): Double = js.native
  
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
    * Makes the specified tab active within the tab control on the client side.
    * @param tab An ASPxClientTab object specifying the tab to select.
    */
  /* CompleteClass */
  override def SetActiveTab(tab: typingsJapgolly.devexpressWeb.ASPxClientTab): Unit = js.native
  /**
    * Makes the specified tab active within the Tab Control on the client side.
    * @param tab A BootstrapClientTab object specifying the tab to select.
    */
  /* CompleteClass */
  override def SetActiveTab(tab: typingsJapgolly.devexpressWeb.BootstrapClientTab): Unit = js.native
  
  /**
    * Makes a tab active within the tab control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  /* CompleteClass */
  override def SetActiveTabIndex(index: Double): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
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
    * Fires when a tab is clicked.
    */
  /* CompleteClass */
  var TabClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTabControlTabClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTabControlBase]
  ] = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
