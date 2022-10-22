package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait IServerValidationManager extends StObject {
  
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
  def getFieldCallbacks(fieldName: String): Any
  
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
  
  inline def apply(
    addFieldError: (String, String) => Callback,
    addPropertyError: (String, String, String) => Callback,
    clear: Callback,
    executeAndClearAllSubscriptions: Callback,
    getFieldCallbacks: String => Any,
    getFieldError: String => String,
    getPropertyCallbacks: (String, String) => Callback,
    getPropertyError: (String, String) => String,
    hasFieldError: String => Boolean,
    hasPropertyError: (String, String) => Boolean,
    removePropertyError: (String, String) => Callback,
    reset: Callback,
    subscribe: (String, String, js.Function) => Callback
  ): IServerValidationManager = {
    val __obj = js.Dynamic.literal(addFieldError = js.Any.fromFunction2((t0: String, t1: String) => (addFieldError(t0, t1)).runNow()), addPropertyError = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (addPropertyError(t0, t1, t2)).runNow()), clear = clear.toJsFn, executeAndClearAllSubscriptions = executeAndClearAllSubscriptions.toJsFn, getFieldCallbacks = js.Any.fromFunction1(getFieldCallbacks), getFieldError = js.Any.fromFunction1(getFieldError), getPropertyCallbacks = js.Any.fromFunction2((t0: String, t1: String) => (getPropertyCallbacks(t0, t1)).runNow()), getPropertyError = js.Any.fromFunction2(getPropertyError), hasFieldError = js.Any.fromFunction1(hasFieldError), hasPropertyError = js.Any.fromFunction2(hasPropertyError), removePropertyError = js.Any.fromFunction2((t0: String, t1: String) => (removePropertyError(t0, t1)).runNow()), reset = reset.toJsFn, subscribe = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function) => (subscribe(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IServerValidationManager]
  }
  
  extension [Self <: IServerValidationManager](x: Self) {
    
    inline def setAddFieldError(value: (String, String) => Callback): Self = StObject.set(x, "addFieldError", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddPropertyError(value: (String, String, String) => Callback): Self = StObject.set(x, "addPropertyError", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setExecuteAndClearAllSubscriptions(value: Callback): Self = StObject.set(x, "executeAndClearAllSubscriptions", value.toJsFn)
    
    inline def setGetFieldCallbacks(value: String => Any): Self = StObject.set(x, "getFieldCallbacks", js.Any.fromFunction1(value))
    
    inline def setGetFieldError(value: String => String): Self = StObject.set(x, "getFieldError", js.Any.fromFunction1(value))
    
    inline def setGetPropertyCallbacks(value: (String, String) => Callback): Self = StObject.set(x, "getPropertyCallbacks", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetPropertyError(value: (String, String) => String): Self = StObject.set(x, "getPropertyError", js.Any.fromFunction2(value))
    
    inline def setHasFieldError(value: String => Boolean): Self = StObject.set(x, "hasFieldError", js.Any.fromFunction1(value))
    
    inline def setHasPropertyError(value: (String, String) => Boolean): Self = StObject.set(x, "hasPropertyError", js.Any.fromFunction2(value))
    
    inline def setRemovePropertyError(value: (String, String) => Callback): Self = StObject.set(x, "removePropertyError", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSubscribe(value: (String, String, js.Function) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function) => (value(t0, t1, t2)).runNow()))
  }
}
