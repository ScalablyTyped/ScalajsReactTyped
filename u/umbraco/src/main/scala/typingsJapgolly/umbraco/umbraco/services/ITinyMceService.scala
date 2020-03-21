package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.tinyMceService
  *
  *
  * @description
  * A service containing all logic for all of the Umbraco TinyMCE plugins
  */
trait ITinyMceService extends js.Object {
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
  @scala.inline
  def apply(
    configuration: CallbackTo[js.Array[ITinyMcePlugin]],
    createInsertEmbeddedMedia: (js.Object, IScope) => Callback,
    createInsertMacro: (js.Object, IScope) => Callback,
    createMediaPicker: js.Object => Callback,
    defaultPrevalues: CallbackTo[IConfiguration]
  ): ITinyMceService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configuration")(configuration.toJsFn)
    __obj.updateDynamic("createInsertEmbeddedMedia")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.angular.mod.IScope) => createInsertEmbeddedMedia(t0, t1).runNow()))
    __obj.updateDynamic("createInsertMacro")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.angular.mod.IScope) => createInsertMacro(t0, t1).runNow()))
    __obj.updateDynamic("createMediaPicker")(js.Any.fromFunction1((t0: js.Object) => createMediaPicker(t0).runNow()))
    __obj.updateDynamic("defaultPrevalues")(defaultPrevalues.toJsFn)
    __obj.asInstanceOf[ITinyMceService]
  }
}

