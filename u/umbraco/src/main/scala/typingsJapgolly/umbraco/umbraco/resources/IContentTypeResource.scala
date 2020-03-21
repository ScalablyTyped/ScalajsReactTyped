package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.contentTypeResource
  * @description Loads in data for content types
  **/
trait IContentTypeResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.contentTypeResource#getAllPropertyTypeAliases
    * @methodOf umbraco.resources.contentTypeResource
    *
    * @description
    * Returns a list of defined property type aliases
    *
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllPropertyTypeAliases(): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.contentTypeResource#getAllowedTypes
    * @methodOf umbraco.resources.contentTypeResource
    *
    * @description
    * Returns a list of allowed content types underneath a content item with a given ID
    *
    * ##usage
    * <pre>
    * contentTypeResource.getAllowedTypes(1234)
    *    .then(function(array) {
    *        $scope.type = type;
    *    });
    * </pre>
    * @param {Int} contentId id of the content item to retrive allowed child types for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllowedTypes(contentId: Double): IPromise[IResourcePromise]
}

object IContentTypeResource {
  @scala.inline
  def apply(
    getAllPropertyTypeAliases: CallbackTo[IPromise[IResourcePromise]],
    getAllowedTypes: Double => CallbackTo[IPromise[IResourcePromise]]
  ): IContentTypeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllPropertyTypeAliases")(getAllPropertyTypeAliases.toJsFn)
    __obj.updateDynamic("getAllowedTypes")(js.Any.fromFunction1((t0: scala.Double) => getAllowedTypes(t0).runNow()))
    __obj.asInstanceOf[IContentTypeResource]
  }
}

