package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.PointerDown event.
  */
@JSGlobal("ASPxClientRichEditPointerDownEventArgs")
@js.native
class ASPxClientRichEditPointerDownEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditPointerDownEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    */
  def this(htmlEvent: js.Any, handled: Boolean) = this()
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

