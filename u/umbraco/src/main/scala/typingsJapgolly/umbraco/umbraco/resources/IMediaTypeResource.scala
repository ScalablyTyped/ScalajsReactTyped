package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.mediaTypeResource
  * @description Loads in data for media types
  **/
trait IMediaTypeResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaTypeResource#getAllowedTypes
    * @methodOf umbraco.resources.mediaTypeResource
    *
    * @description
    * Returns a list of allowed media types underneath a media item with a given ID
    *
    * ##usage
    * <pre>
    * mediaTypeResource.getAllowedTypes(1234)
    *    .then(function(array) {
    *        $scope.type = type;
    *    });
    * </pre>
    * @param {Int} mediaId id of the media item to retrive allowed child types for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllowedTypes(mediaId: Double): IPromise[IResourcePromise]
}

object IMediaTypeResource {
  @scala.inline
  def apply(getAllowedTypes: Double => CallbackTo[IPromise[IResourcePromise]]): IMediaTypeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllowedTypes")(js.Any.fromFunction1((t0: scala.Double) => getAllowedTypes(t0).runNow()))
    __obj.asInstanceOf[IMediaTypeResource]
  }
}

