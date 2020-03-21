package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.historyService
  *
  * @requires $rootScope
  * @requires $timeout
  * @requires angularHelper
  *
  * @description
  * Service to handle the main application navigation history. Responsible for keeping track
  * of where a user navigates to, stores an icon, url and name in a collection, to make it easy
  * for the user to go back to a previous editor / action
  *
  * **Note:** only works with new angular-based editors, not legacy ones
  *
  * ##usage
  * To use, simply inject the historyService into any controller that needs it, and make
  * sure the umbraco.services module is accesible - which it should be by default.
  */
trait IHistoryService extends js.Object {
  /**
  		* @ngdoc method
  		* @name umbraco.services.historyService#add
  		* @methodOf umbraco.services.historyService
  		*
  		* @description
  		* Adds a given history item to the users history collection.
  		*
  		* @param {Object} item the history item
  		* @param {String} item.icon icon css class for the list, ex: "icon-image", "icon-doc"
  		* @param {String} item.link route to the editor, ex: "/content/edit/1234"
  		* @param {String} item.name friendly name for the history listing
  		* @returns {Object} history item object
  		*/
  def add(item: IHistoryItem): IHistoryItem
  /**
    * @ngdoc method
    * @name umbraco.services.historyService#getCurrent
    * @methodOf umbraco.services.historyService
    *
    * @description
    * Method to return the current history collection.
    */
  def getCurrent(): js.Array[IHistoryItem]
  /**
  		 * @ngdoc method
  		 * @name umbraco.services.historyService#remove
  		 * @methodOf umbraco.services.historyService
  		 *
  		 * @description
  		 * Removes a history item from the users history collection, given an index to remove from.
  		 *
  		 * @param {Int} index index to remove item from
  		 */
  def remove(index: Double): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.historyService#removeAll
    * @methodOf umbraco.services.historyService
    *
    * @description
    * Removes all history items from the users history collection
    */
  def removeAll(): Unit
}

object IHistoryService {
  @scala.inline
  def apply(
    add: IHistoryItem => CallbackTo[IHistoryItem],
    getCurrent: CallbackTo[js.Array[IHistoryItem]],
    remove: Double => Callback,
    removeAll: Callback
  ): IHistoryService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IHistoryItem) => add(t0).runNow()))
    __obj.updateDynamic("getCurrent")(getCurrent.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("removeAll")(removeAll.toJsFn)
    __obj.asInstanceOf[IHistoryService]
  }
}

