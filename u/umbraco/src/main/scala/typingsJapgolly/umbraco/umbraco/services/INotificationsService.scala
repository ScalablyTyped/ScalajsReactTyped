package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait INotificationsService extends js.Object {
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
  def addView(view: String, args: js.Any*): Unit
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
  @scala.inline
  def apply(
    add: INotificationItem => CallbackTo[INotification],
    addView: (String, /* repeated */ js.Any) => Callback,
    current: js.Array[String],
    error: (String, String) => CallbackTo[INotification],
    getCurrent: CallbackTo[js.Array[INotification]],
    hasView: String => CallbackTo[Boolean],
    info: (String, String) => CallbackTo[INotification],
    remove: Double => Callback,
    removeAll: Callback,
    showNotification: INotificationArgs => CallbackTo[INotification],
    success: (String, String) => CallbackTo[INotification],
    warning: (String, String) => CallbackTo[INotification]
  ): INotificationsService = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.INotificationItem) => add(t0).runNow()))
    __obj.updateDynamic("addView")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => addView(t0, t1).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => error(t0, t1).runNow()))
    __obj.updateDynamic("getCurrent")(getCurrent.toJsFn)
    __obj.updateDynamic("hasView")(js.Any.fromFunction1((t0: java.lang.String) => hasView(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => info(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("removeAll")(removeAll.toJsFn)
    __obj.updateDynamic("showNotification")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.INotificationArgs) => showNotification(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => success(t0, t1).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => warning(t0, t1).runNow()))
    __obj.asInstanceOf[INotificationsService]
  }
}

