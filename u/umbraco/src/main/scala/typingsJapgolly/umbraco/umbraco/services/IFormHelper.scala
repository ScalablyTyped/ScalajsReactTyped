package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.formHelper
  * @function
  *
  * @description
  * A utility class used to streamline how forms are developed, to ensure that validation is check and displayed consistently and to ensure that the correct events
  * fire when they need to.
  */
trait IFormHelper extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#handleError
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * Needs to be called when a form submission fails, this will wire up all server validation errors in ModelState and
    * add the correct messages to the notifications. If a server error has occurred this will show a ysod.
    *
    * @param {object} err The error object returned from the http promise
    */
  def handleError(err: js.Object): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#handleServerValidation
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * This wires up all of the server validation model state so that valServer and valServerField directives work
    *
    * @param {object} err The error object returned from the http promise
    */
  def handleServerValidation(modelState: IModelState): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#submitForm
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * Called by controllers when a form has been successfully submitted. the correct events execute
    * and that the notifications are displayed if there are any.
    *
    * @param {object} args An object containing arguments for form submission
    */
  def resetForm(args: js.Any*): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#submitForm
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * Called by controllers when submitting a form - this ensures that all client validation is checked,
    * server validation is cleared, that the correct events execute and status messages are displayed.
    * This returns true if the form is valid, otherwise false if form submission cannot continue.
    *
    * @param {object} args An object containing arguments for form submission
    */
  def submitForm(args: js.Any*): Unit
}

object IFormHelper {
  @scala.inline
  def apply(
    handleError: js.Object => Callback,
    handleServerValidation: IModelState => Callback,
    resetForm: /* repeated */ js.Any => Callback,
    submitForm: /* repeated */ js.Any => Callback
  ): IFormHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleError")(js.Any.fromFunction1((t0: js.Object) => handleError(t0).runNow()))
    __obj.updateDynamic("handleServerValidation")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IModelState) => handleServerValidation(t0).runNow()))
    __obj.updateDynamic("resetForm")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resetForm(t0).runNow()))
    __obj.updateDynamic("submitForm")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => submitForm(t0).runNow()))
    __obj.asInstanceOf[IFormHelper]
  }
}

