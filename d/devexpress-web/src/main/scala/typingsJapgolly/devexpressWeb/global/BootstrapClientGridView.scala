package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGridBatchEditSummaryDisplayTextEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGridToolbarItemClickEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client BootstrapGridView.
  */
@JSGlobal("BootstrapClientGridView")
@js.native
open class BootstrapClientGridView ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientGridView {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Fires when a user changes the summary item value.
    */
  /* CompleteClass */
  var BatchEditSummaryDisplayText: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGridBatchEditSummaryDisplayTextEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGridBase]
  ] = js.native
  
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
    * Returns a grid's toolbar specified by its index. An ASPxClientMenu object that is the toolbar located at the specified index within the control's Toolbars collection.
    * @param index An integer value specifying the zero-based index of the toolbar object to retrieve.
    */
  /* CompleteClass */
  override def GetToolbar(index: Double): typingsJapgolly.devexpressWeb.ASPxClientMenu = js.native
  
  /**
    * Returns a toolbar specified by its name. An ASPxClientMenu object that is the toolbar with the specified name.
    * @param name A string value specifying the toolbar name.
    */
  /* CompleteClass */
  override def GetToolbarByName(name: String): typingsJapgolly.devexpressWeb.ASPxClientMenu = js.native
  
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
    * Fires after a toolbar item has been clicked.
    */
  /* CompleteClass */
  var ToolbarItemClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGridToolbarItemClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGridBase]
  ] = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
