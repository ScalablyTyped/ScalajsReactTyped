package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IFormController
import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.angularHelper
  * @function
  *
  * @description
  * Some angular helper/extension methods
  */
trait IAngularHelper extends js.Object {
  /**
    * @ngdoc function
    * @name getCurrentForm
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * Returns the current form object applied to the scope or null if one is not found
    */
  def getCurrentForm(scope: IScope): js.Any
  /**
    * @ngdoc function
    * @name getNullForm
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * Returns a null angular FormController, mostly for use in unit tests
    *      NOTE: This is actually the same construct as angular uses internally for creating a null form but they don't expose
    *          any of this publicly to us, so we need to create our own.
    *
    * @param {string} formName The form name to assign
    */
  def getNullForm(formName: String): IFormController
  /**
    * @ngdoc function
    * @name validateHasForm
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * This will validate that the current scope has an assigned form object, if it doesn't an exception is thrown, if
    * it does we return the form object.
    */
  def getRequiredCurrentForm(scope: IScope): js.Object
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#rejectedPromise
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * In some situations we need to return a promise as a rejection, normally based on invalid data. This
    * is a wrapper to do that so we can save on writing a bit of code.
    *
    * @param {object} objReject The object to send back with the promise rejection
    */
  def rejectedPromise(objReject: js.Object): Unit
  /**
    * @ngdoc function
    * @name safeApply
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * This checks if a digest/apply is already occuring, if not it will force an apply call
    */
  def safeApply(scope: IScope, fn: js.Function): Unit
}

object IAngularHelper {
  @scala.inline
  def apply(
    getCurrentForm: IScope => CallbackTo[js.Any],
    getNullForm: String => CallbackTo[IFormController],
    getRequiredCurrentForm: IScope => CallbackTo[js.Object],
    rejectedPromise: js.Object => Callback,
    safeApply: (IScope, js.Function) => Callback
  ): IAngularHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentForm")(js.Any.fromFunction1((t0: typingsJapgolly.angular.mod.IScope) => getCurrentForm(t0).runNow()))
    __obj.updateDynamic("getNullForm")(js.Any.fromFunction1((t0: java.lang.String) => getNullForm(t0).runNow()))
    __obj.updateDynamic("getRequiredCurrentForm")(js.Any.fromFunction1((t0: typingsJapgolly.angular.mod.IScope) => getRequiredCurrentForm(t0).runNow()))
    __obj.updateDynamic("rejectedPromise")(js.Any.fromFunction1((t0: js.Object) => rejectedPromise(t0).runNow()))
    __obj.updateDynamic("safeApply")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: js.Function) => safeApply(t0, t1).runNow()))
    __obj.asInstanceOf[IAngularHelper]
  }
}

