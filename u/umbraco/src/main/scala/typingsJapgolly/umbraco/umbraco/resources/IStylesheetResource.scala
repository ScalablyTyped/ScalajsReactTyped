package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.stylesheetResource
  * @description service to retrieve available stylesheets
  *
  *
  **/
trait IStylesheetResource extends StObject {
  
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
  
  inline def apply(
    getAll: CallbackTo[IPromise[IResourcePromise]],
    getRules: Double => IPromise[IResourcePromise],
    getRulesByName: String => IPromise[IResourcePromise]
  ): IStylesheetResource = {
    val __obj = js.Dynamic.literal(getAll = getAll.toJsFn, getRules = js.Any.fromFunction1(getRules), getRulesByName = js.Any.fromFunction1(getRulesByName))
    __obj.asInstanceOf[IStylesheetResource]
  }
  
  extension [Self <: IStylesheetResource](x: Self) {
    
    inline def setGetAll(value: CallbackTo[IPromise[IResourcePromise]]): Self = StObject.set(x, "getAll", value.toJsFn)
    
    inline def setGetRules(value: Double => IPromise[IResourcePromise]): Self = StObject.set(x, "getRules", js.Any.fromFunction1(value))
    
    inline def setGetRulesByName(value: String => IPromise[IResourcePromise]): Self = StObject.set(x, "getRulesByName", js.Any.fromFunction1(value))
  }
}
