package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events that are related to data validation (see ASPxClientEdit.Validate).
  */
@JSGlobal("ASPxClientEditValidationEventArgs")
@js.native
class ASPxClientEditValidationEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientEditValidationEventArgs class with the specified settings.
    * @param value An object that represents the validated value.
    * @param errorText A string representing the error description.
    * @param isValid true if the validated value is valid; otherwise, false.
    */
  def this(value: String, errorText: String, isValid: Boolean) = this()
  /**
    * Gets or sets the error description.
    */
  var errorText: String = js.native
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  var isValid: Boolean = js.native
  /**
    * Gets or sets the editor's value being validated.
    */
  var value: String = js.native
}

