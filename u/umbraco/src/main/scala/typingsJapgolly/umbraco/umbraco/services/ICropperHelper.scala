package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.cropperHelper
  * @description A helper object used for dealing with image cropper data
  */
trait ICropperHelper extends js.Object {
  /**
  		* @ngdoc method
  		* @name umbraco.services.cropperHelper#configuration
  		* @methodOf umbraco.services.cropperHelper
  		*
  		* @description
  		* Returns a collection of plugins available to the tinyMCE editor
  		*
  		*/
  def configuration(mediaTypeAlias: String): js.Any
}

object ICropperHelper {
  @scala.inline
  def apply(configuration: String => CallbackTo[js.Any]): ICropperHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configuration")(js.Any.fromFunction1((t0: java.lang.String) => configuration(t0).runNow()))
    __obj.asInstanceOf[ICropperHelper]
  }
}

