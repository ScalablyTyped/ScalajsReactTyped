package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
@JSGlobal("ASPxClientControlBase")
@js.native
class ASPxClientControlBase () extends js.Object {
  /**
    * Occurs on the client side after the control has been initialized.
    */
  var Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  var name: String = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): Boolean = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  def GetParentControl(): js.Any = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientControlBase")
@js.native
object ASPxClientControlBase extends js.Object {
  /**
    * Converts the specified object to the current object's type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientControlBase = js.native
}

