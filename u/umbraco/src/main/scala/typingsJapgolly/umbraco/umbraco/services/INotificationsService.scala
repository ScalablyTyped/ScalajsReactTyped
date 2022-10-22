package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.navigationService
  *
  * @requires $rootScope
  * @requires $routeParams
  * @requires $log
  * @requires $location
  * @requires dialogService
  * @requires treeService
  * @requires sectionResource
  *
  * @description
  * Service to handle the main application navigation. Responsible for invoking the tree
  * Section navigation and search, and maintain their state for the entire application lifetime
  *
  */
trait INotificationsService extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#add
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Lower level api for adding notifcations, support more advanced options
    * @param {Object} item The notification item
    * @param {String} item.headline Short headline
    * @param {String} item.message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @param {String} item.type Notification type, can be: "success","warning","error" or "info"
    * @param {String} item.url url to open when notification is clicked
    * @param {String} item.view path to custom view to load into the notification box
    * @param {Array} item.actions Collection of button actions to append (label, func, cssClass)
    * @param {Boolean} item.sticky if set to true, the notification will not auto-close
    * @returns {Object} args notification object
    */
  def add(item: INotificationItem): INotification
  
  def addView(view: String, args: Any*): Unit
  
  /**
    * @ngdoc property
    * @name umbraco.services.notificationsService#current
    * @propertyOf umbraco.services.notificationsService
    *
    * @description
    * Returns an array of current notifications to display
    *
    * @returns {string} returns an array
    */
  var current: js.Array[String]
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#error
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a red error notication to the notications collection
    * This should be used when an operations *fails* and could not complete
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def error(headline: String, message: String): INotification
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#getCurrent
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Method to return all notifications from the notifcations collection
    */
  def getCurrent(): js.Array[INotification]
  
  def hasView(view: String): Boolean
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#warning
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a yellow warning notication to the notications collection
    * This should be used when an operations *completes* but something was not as expected
    *
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def info(headline: String, message: String): INotification
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#remove
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Removes a notification from the notifcations collection at a given index
    *
    * @param {Int} index index where the notication should be removed from
    */
  def remove(index: Double): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#removeAll
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Removes all notifications from the notifcations collection
    */
  def removeAll(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#showNotification
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Shows a notification based on the object passed in, normally used to render notifications sent back from the server
    *
    * @returns {Object} args notification object
    */
  def showNotification(args: INotificationArgs): INotification
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#success
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a green success notication to the notications collection
    * This should be used when an operations *completes* without errors
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def success(headline: String, message: String): INotification
  
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#warning
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a yellow warning notication to the notications collection
    * This should be used when an operations *completes* but something was not as expected
    *
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def warning(headline: String, message: String): INotification
}
object INotificationsService {
  
  inline def apply(
    add: INotificationItem => INotification,
    addView: (String, /* repeated */ Any) => Callback,
    current: js.Array[String],
    error: (String, String) => INotification,
    getCurrent: CallbackTo[js.Array[INotification]],
    hasView: String => Boolean,
    info: (String, String) => INotification,
    remove: Double => Callback,
    removeAll: Callback,
    showNotification: INotificationArgs => INotification,
    success: (String, String) => INotification,
    warning: (String, String) => INotification
  ): INotificationsService = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addView = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (addView(t0, t1)).runNow()), current = current.asInstanceOf[js.Any], error = js.Any.fromFunction2(error), getCurrent = getCurrent.toJsFn, hasView = js.Any.fromFunction1(hasView), info = js.Any.fromFunction2(info), remove = js.Any.fromFunction1((t0: Double) => remove(t0).runNow()), removeAll = removeAll.toJsFn, showNotification = js.Any.fromFunction1(showNotification), success = js.Any.fromFunction2(success), warning = js.Any.fromFunction2(warning))
    __obj.asInstanceOf[INotificationsService]
  }
  
  extension [Self <: INotificationsService](x: Self) {
    
    inline def setAdd(value: INotificationItem => INotification): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddView(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "addView", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setCurrent(value: js.Array[String]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentVarargs(value: String*): Self = StObject.set(x, "current", js.Array(value*))
    
    inline def setError(value: (String, String) => INotification): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setGetCurrent(value: CallbackTo[js.Array[INotification]]): Self = StObject.set(x, "getCurrent", value.toJsFn)
    
    inline def setHasView(value: String => Boolean): Self = StObject.set(x, "hasView", js.Any.fromFunction1(value))
    
    inline def setInfo(value: (String, String) => INotification): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveAll(value: Callback): Self = StObject.set(x, "removeAll", value.toJsFn)
    
    inline def setShowNotification(value: INotificationArgs => INotification): Self = StObject.set(x, "showNotification", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (String, String) => INotification): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    inline def setWarning(value: (String, String) => INotification): Self = StObject.set(x, "warning", js.Any.fromFunction2(value))
  }
}
