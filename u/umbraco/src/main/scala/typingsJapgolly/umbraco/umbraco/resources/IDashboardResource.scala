package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.dashboardResource
  * @description Handles loading the dashboard manifest
  **/
trait IDashboardResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.dashboardResource#getDashboard
    * @methodOf umbraco.resources.dashboardResource
    *
    * @description
    * Retrieves the dashboard configuration for a given section
    *
    * @param {string} section Alias of section to retrieve dashboard configuraton for
    * @returns {Promise} resourcePromise object containing the user array.
    *
    */
  def getDashboard(section: String): IPromise[IResourcePromise]
}

object IDashboardResource {
  @scala.inline
  def apply(getDashboard: String => CallbackTo[IPromise[IResourcePromise]]): IDashboardResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDashboard")(js.Any.fromFunction1((t0: java.lang.String) => getDashboard(t0).runNow()))
    __obj.asInstanceOf[IDashboardResource]
  }
}

