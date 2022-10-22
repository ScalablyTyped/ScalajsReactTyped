package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.tinyMceService
  *
  *
  * @description
  * A service containing all logic for all of the Umbraco TinyMCE plugins
  */
trait ITinyMceService extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#configuration
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Returns a collection of plugins available to the tinyMCE editor
    *
    */
  def configuration(): js.Array[ITinyMcePlugin]
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createInsertEmbeddedMedia
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the umbrco insert embedded media tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createInsertEmbeddedMedia(editor: js.Object, $scope: IScope): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createUmbracoMacro
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the insert umbrco macro tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createInsertMacro(editor: js.Object, $scope: IScope): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createMediaPicker
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the umbrco insert media tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createMediaPicker(editor: js.Object): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#defaultPrevalues
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Returns a default configration to fallback on in case none is provided
    *
    */
  def defaultPrevalues(): IConfiguration
}
object ITinyMceService {
  
  inline def apply(
    configuration: CallbackTo[js.Array[ITinyMcePlugin]],
    createInsertEmbeddedMedia: (js.Object, IScope) => Callback,
    createInsertMacro: (js.Object, IScope) => Callback,
    createMediaPicker: js.Object => Callback,
    defaultPrevalues: CallbackTo[IConfiguration]
  ): ITinyMceService = {
    val __obj = js.Dynamic.literal(configuration = configuration.toJsFn, createInsertEmbeddedMedia = js.Any.fromFunction2((t0: js.Object, t1: IScope) => (createInsertEmbeddedMedia(t0, t1)).runNow()), createInsertMacro = js.Any.fromFunction2((t0: js.Object, t1: IScope) => (createInsertMacro(t0, t1)).runNow()), createMediaPicker = js.Any.fromFunction1((t0: js.Object) => createMediaPicker(t0).runNow()), defaultPrevalues = defaultPrevalues.toJsFn)
    __obj.asInstanceOf[ITinyMceService]
  }
  
  extension [Self <: ITinyMceService](x: Self) {
    
    inline def setConfiguration(value: CallbackTo[js.Array[ITinyMcePlugin]]): Self = StObject.set(x, "configuration", value.toJsFn)
    
    inline def setCreateInsertEmbeddedMedia(value: (js.Object, IScope) => Callback): Self = StObject.set(x, "createInsertEmbeddedMedia", js.Any.fromFunction2((t0: js.Object, t1: IScope) => (value(t0, t1)).runNow()))
    
    inline def setCreateInsertMacro(value: (js.Object, IScope) => Callback): Self = StObject.set(x, "createInsertMacro", js.Any.fromFunction2((t0: js.Object, t1: IScope) => (value(t0, t1)).runNow()))
    
    inline def setCreateMediaPicker(value: js.Object => Callback): Self = StObject.set(x, "createMediaPicker", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDefaultPrevalues(value: CallbackTo[IConfiguration]): Self = StObject.set(x, "defaultPrevalues", value.toJsFn)
  }
}
