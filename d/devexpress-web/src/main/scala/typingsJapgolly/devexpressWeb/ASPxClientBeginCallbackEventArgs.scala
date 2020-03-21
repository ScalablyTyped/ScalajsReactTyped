package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
@JSGlobal("ASPxClientBeginCallbackEventArgs")
@js.native
class ASPxClientBeginCallbackEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientBeginCallbackEventArgs object with the specified setting.
    * @param command A string value that specifies the command.
    */
  def this(command: String) = this()
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String = js.native
}

