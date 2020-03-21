package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.ValidationCompleted client event that allows you to centrally validate user input within all DevExpress web controls to which validation is applied.
  */
@JSGlobal("ASPxClientValidationCompletedEventArgs")
@js.native
class ASPxClientValidationCompletedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientValidationCompletedEventArgs class.
    * @param container An object representing the container of controls that have been validated.
    * @param validationGroup A string value that specifies the name of the group of controls that has been validated.
    * @param invisibleControlsValidated true if both visible and invisible input controls have been validated; false if only visible input controls have been validated.
    * @param isValid true if the validation has been completed successfully; otherwise, false.
    * @param firstInvalidControl An object representing the first input control that has an invalid value.
    * @param firstVisibleInvalidControl An object representing the first visible input control that has an invalid value.
    */
  def this(
    container: js.Any,
    validationGroup: String,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    firstInvalidControl: ASPxClientControl,
    firstVisibleInvalidControl: ASPxClientControl
  ) = this()
  /**
    * Gets a container object that holds the validated control(s).
    */
  var container: js.Any = js.native
  /**
    * Gets the first control (either visible or invisible) that hasn't passed the validation applied.
    */
  var firstInvalidControl: ASPxClientControl = js.native
  /**
    * Gets the first visible control that hasn't passed the validation applied.
    */
  var firstVisibleInvalidControl: ASPxClientControl = js.native
  /**
    * Gets a value that indicates whether validation has been applied to both visible and invisible controls.
    */
  var invisibleControlsValidated: Boolean = js.native
  /**
    * Gets a value specifying whether the validation has been completed successfully.
    */
  var isValid: Boolean = js.native
  /**
    * Gets the name of the validation group name to which validation has been applied.
    */
  var validationGroup: String = js.native
}

