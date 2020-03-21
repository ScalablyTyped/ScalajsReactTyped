package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.serverValidationManager
  * @function
  *
  * @description
  * Used to handle server side validation and wires up the UI with the messages. There are 2 types of validation messages, one
  * is for user defined properties (called Properties) and the other is for field properties which are attached to the native
  * model objects (not user defined). The methods below are named according to these rules: Properties vs Fields.
  */
trait IServerValidationManager extends js.Object {
  /**
    * @ngdoc function
    * @name addFieldError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Adds an error message for a native content item field (not a user defined property, for Example, 'Name')
    */
  def addFieldError(fieldName: String, errorMsg: String): Unit
  /**
    * @ngdoc function
    * @name addPropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Adds an error message for the content property
    */
  def addPropertyError(propertyAlias: String, fieldName: String, errorMsg: String): Unit
  /**
    * @ngdoc function
    * @name clear
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Clears all errors
    */
  def clear(): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.serverValidationManager#subscribe
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    *  This method needs to be called once all field and property errors are wired up.
    *
    *  In some scenarios where the error collection needs to be persisted over a route change
    *   (i.e. when a content item (or any item) is created and the route redirects to the editor)
    *   the controller should call this method once the data is bound to the scope
    *   so that any persisted validation errors are re-bound to their controls. Once they are re-binded this then clears the validation
    *   colleciton so that if another route change occurs, the previously persisted validation errors are not re-bound to the new item.
    */
  def executeAndClearAllSubscriptions(): Unit
  /**
    * @ngdoc function
    * @name getFieldCallbacks
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets all callbacks that has been registered using the subscribe method for the field.
    */
  def getFieldCallbacks(fieldName: String): js.Any
  /**
    * @ngdoc function
    * @name getFieldError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets the error message for a content field
    */
  def getFieldError(fieldName: String): String
  /**
    * @ngdoc function
    * @name getPropertyCallbacks
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets all callbacks that has been registered using the subscribe method for the propertyAlias + fieldName combo.
    * This will always return any callbacks registered for just the property (i.e. field name is empty) and for ones with an
    * explicit field name set.
    */
  def getPropertyCallbacks(propertyAlias: String, fieldName: String): Unit
  /**
    * @ngdoc function
    * @name getPropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets the error message for the content property
    */
  def getPropertyError(propertyAlias: String, fieldName: String): String
  /**
    * @ngdoc function
    * @name hasFieldError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Checks if a content field has an error
    */
  def hasFieldError(fieldName: String): Boolean
  /**
    * @ngdoc function
    * @name hasPropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Checks if the content property + field name combo has an error
    */
  def hasPropertyError(propertyAlias: String, fieldName: String): Boolean
  /**
    * @ngdoc function
    * @name removePropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Removes an error message for the content property
    */
  def removePropertyError(propertyAlias: String, fieldName: String): Unit
  /**
    * @ngdoc function
    * @name reset
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Clears all errors and notifies all callbacks that all server errros are now valid - used when submitting a form
    */
  def reset(): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.serverValidationManager#subscribe
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    *  Adds a callback method that is executed whenever validation changes for the field name + property specified.
    *  This is generally used for server side validation in order to match up a server side validation error with
    *  a particular field, otherwise we can only pinpoint that there is an error for a content property, not the
    *  property's specific field. This is used with the val-server directive in which the directive specifies the
    *  field alias to listen for.
    *  If propertyAlias is null, then this subscription is for a field property (not a user defined property).
    */
  def subscribe(propertyAlias: String, fieldName: String, callback: js.Function): Unit
}

object IServerValidationManager {
  @scala.inline
  def apply(
    addFieldError: (String, String) => Callback,
    addPropertyError: (String, String, String) => Callback,
    clear: Callback,
    executeAndClearAllSubscriptions: Callback,
    getFieldCallbacks: String => CallbackTo[js.Any],
    getFieldError: String => CallbackTo[String],
    getPropertyCallbacks: (String, String) => Callback,
    getPropertyError: (String, String) => CallbackTo[String],
    hasFieldError: String => CallbackTo[Boolean],
    hasPropertyError: (String, String) => CallbackTo[Boolean],
    removePropertyError: (String, String) => Callback,
    reset: Callback,
    subscribe: (String, String, js.Function) => Callback
  ): IServerValidationManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFieldError")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addFieldError(t0, t1).runNow()))
    __obj.updateDynamic("addPropertyError")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => addPropertyError(t0, t1, t2).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("executeAndClearAllSubscriptions")(executeAndClearAllSubscriptions.toJsFn)
    __obj.updateDynamic("getFieldCallbacks")(js.Any.fromFunction1((t0: java.lang.String) => getFieldCallbacks(t0).runNow()))
    __obj.updateDynamic("getFieldError")(js.Any.fromFunction1((t0: java.lang.String) => getFieldError(t0).runNow()))
    __obj.updateDynamic("getPropertyCallbacks")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getPropertyCallbacks(t0, t1).runNow()))
    __obj.updateDynamic("getPropertyError")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getPropertyError(t0, t1).runNow()))
    __obj.updateDynamic("hasFieldError")(js.Any.fromFunction1((t0: java.lang.String) => hasFieldError(t0).runNow()))
    __obj.updateDynamic("hasPropertyError")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => hasPropertyError(t0, t1).runNow()))
    __obj.updateDynamic("removePropertyError")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => removePropertyError(t0, t1).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function) => subscribe(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IServerValidationManager]
  }
}

