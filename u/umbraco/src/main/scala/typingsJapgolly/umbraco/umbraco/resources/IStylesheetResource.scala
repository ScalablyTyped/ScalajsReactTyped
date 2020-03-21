package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.stylesheetResource
  * @description service to retrieve available stylesheets
  *
  *
  **/
trait IStylesheetResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.stylesheetResource#getAll
    * @methodOf umbraco.resources.stylesheetResource
    *
    * @description
    * Gets all registered stylesheets
    *
    * ##usage
    * <pre>
    * stylesheetResource.getAll()
    *    .then(function(stylesheets) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the stylesheets.
    *
    */
  def getAll(): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.stylesheetResource#getRules
    * @methodOf umbraco.resources.stylesheetResource
    *
    * @description
    * Returns all defined child rules for a stylesheet with a given ID
    *
    * ##usage
    * <pre>
    * stylesheetResource.getRules(2345)
    *    .then(function(rules) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the rules.
    *
    */
  def getRules(id: Double): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.stylesheetResource#getRulesByName
    * @methodOf umbraco.resources.stylesheetResource
    *
    * @description
    * Returns all defined child rules for a stylesheet with a given name
    *
    * ##usage
    * <pre>
    * stylesheetResource.getRulesByName("ie7stylesheet")
    *    .then(function(rules) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the rules.
    *
    */
  def getRulesByName(name: String): IPromise[IResourcePromise]
}

object IStylesheetResource {
  @scala.inline
  def apply(
    getAll: CallbackTo[IPromise[IResourcePromise]],
    getRules: Double => CallbackTo[IPromise[IResourcePromise]],
    getRulesByName: String => CallbackTo[IPromise[IResourcePromise]]
  ): IStylesheetResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("getRules")(js.Any.fromFunction1((t0: scala.Double) => getRules(t0).runNow()))
    __obj.updateDynamic("getRulesByName")(js.Any.fromFunction1((t0: java.lang.String) => getRulesByName(t0).runNow()))
    __obj.asInstanceOf[IStylesheetResource]
  }
}

