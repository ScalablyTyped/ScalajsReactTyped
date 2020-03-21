package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.logResource
  * @description Retrives log history from umbraco
  *
  *
  **/
trait ILogResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getEntityLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the log history for a give entity id
    *
    * ##usage
    * <pre>
    * logResource.getEntityLog(1234)
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id id of entity to return log history
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getEntityLog(id: Double): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the log history for a given type of log entry
    *
    * ##usage
    * <pre>
    * logResource.getLog("save", new Date())
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {String} type logtype to query for
    * @param {DateTime} since query the log back to this date, by defalt 7 days ago
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getLog(`type`: LogType, since: js.Date): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getUserLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the current users' log history for a given type of log entry
    *
    * ##usage
    * <pre>
    * logResource.getUserLog("save", new Date())
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {String} type logtype to query for
    * @param {DateTime} since query the log back to this date, by defalt 7 days ago
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getUserLog(`type`: LogType, since: js.Date): IPromise[IResourcePromise]
}

object ILogResource {
  @scala.inline
  def apply(
    getEntityLog: Double => CallbackTo[IPromise[IResourcePromise]],
    getLog: (LogType, js.Date) => CallbackTo[IPromise[IResourcePromise]],
    getUserLog: (LogType, js.Date) => CallbackTo[IPromise[IResourcePromise]]
  ): ILogResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntityLog")(js.Any.fromFunction1((t0: scala.Double) => getEntityLog(t0).runNow()))
    __obj.updateDynamic("getLog")(js.Any.fromFunction2((t0: typingsJapgolly.umbraco.umbraco.resources.LogType, t1: js.Date) => getLog(t0, t1).runNow()))
    __obj.updateDynamic("getUserLog")(js.Any.fromFunction2((t0: typingsJapgolly.umbraco.umbraco.resources.LogType, t1: js.Date) => getUserLog(t0, t1).runNow()))
    __obj.asInstanceOf[ILogResource]
  }
}

