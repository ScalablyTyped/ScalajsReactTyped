package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientValidationSummary.VisibilityChanged event.
  */
@JSGlobal("ASPxClientValidationSummaryVisibilityChangedEventArgs")
@js.native
class ASPxClientValidationSummaryVisibilityChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientValidationSummaryVisibilityChangedEventArgs class.
    * @param visible true if the editor is visible; otherwise, false.
    */
  def this(visible: Boolean) = this()
  /**
    * Gets or sets whether the editor is visible on the client.
    */
  var visible: Boolean = js.native
}

