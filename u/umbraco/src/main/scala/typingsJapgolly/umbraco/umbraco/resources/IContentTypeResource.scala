package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.contentTypeResource
  * @description Loads in data for content types
  **/
trait IContentTypeResource extends StObject {
  
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
  
  inline def apply(
    getAllPropertyTypeAliases: CallbackTo[IPromise[IResourcePromise]],
    getAllowedTypes: Double => IPromise[IResourcePromise]
  ): IContentTypeResource = {
    val __obj = js.Dynamic.literal(getAllPropertyTypeAliases = getAllPropertyTypeAliases.toJsFn, getAllowedTypes = js.Any.fromFunction1(getAllowedTypes))
    __obj.asInstanceOf[IContentTypeResource]
  }
  
  extension [Self <: IContentTypeResource](x: Self) {
    
    inline def setGetAllPropertyTypeAliases(value: CallbackTo[IPromise[IResourcePromise]]): Self = StObject.set(x, "getAllPropertyTypeAliases", value.toJsFn)
    
    inline def setGetAllowedTypes(value: Double => IPromise[IResourcePromise]): Self = StObject.set(x, "getAllowedTypes", js.Any.fromFunction1(value))
  }
}
