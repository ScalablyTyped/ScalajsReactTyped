package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRatingControl.ItemClick event.
  */
@JSGlobal("ASPxClientRatingControlItemClickEventArgs")
@js.native
class ASPxClientRatingControlItemClickEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new ASPxClientRatingControlItemClickEventArgs class instance with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param index An integer value that represents the index of the clicked item.
    */
  def this(processOnServer: Boolean, index: Double) = this()
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
}

