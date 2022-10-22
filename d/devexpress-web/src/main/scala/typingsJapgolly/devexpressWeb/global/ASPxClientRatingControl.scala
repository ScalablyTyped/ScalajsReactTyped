package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientRatingControlItemClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientRatingControlItemMouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxRatingControl control.
  */
@JSGlobal("ASPxClientRatingControl")
@js.native
open class ASPxClientRatingControl ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRatingControl {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
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
    * Returns a value indicating whether the control's status is read-only.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  
  /**
    * Gets the item tooltip title specified by the item index. A string that is the specified item tooltip title.
    * @param index An integer value specifying the item index.
    */
  /* CompleteClass */
  override def GetTitle(index: Double): String = js.native
  
  /**
    * Returns the value of the ASPxRatingControl.
    */
  /* CompleteClass */
  override def GetValue(): Double = js.native
  
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
    * Fires on the server after an item has been clicked.
    */
  /* CompleteClass */
  var ItemClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientRatingControlItemClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientRatingControl]
  ] = js.native
  
  /**
    * Occurs on the client side when the mouse cursor moves outside a rating control item.
    */
  /* CompleteClass */
  var ItemMouseOut: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientRatingControlItemMouseEventHandler[typingsJapgolly.devexpressWeb.ASPxClientRatingControl]
  ] = js.native
  
  /**
    * Occurs on the client side when the mouse cursor is moved into a rating control item.
    */
  /* CompleteClass */
  var ItemMouseOver: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientRatingControlItemMouseEventHandler[typingsJapgolly.devexpressWeb.ASPxClientRatingControl]
  ] = js.native
  
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
    * Specifies whether the control's status is read-only.
    * @param value true to make the control read-only; otherwise, false.
    */
  /* CompleteClass */
  override def SetReadOnly(value: Boolean): Unit = js.native
  
  /**
    * Modifies the value of the ASPxRatingControl on the client side.
    * @param value A decimal value representing the value of the control.
    */
  /* CompleteClass */
  override def SetValue(value: Double): Unit = js.native
  
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
object ASPxClientRatingControl {
  
  @JSGlobal("ASPxClientRatingControl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientRatingControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typingsJapgolly.devexpressWeb.ASPxClientRatingControl = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devexpressWeb.ASPxClientRatingControl]
}
