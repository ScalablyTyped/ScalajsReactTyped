package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.macroResource
  * @description Deals with data for macros
  *
  **/
trait IMacroResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroParameters
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the editable macro parameters for the specified macro alias
    *
    * @param {int} macroId The macro id to get parameters for
    *
    */
  def getMacroParameters(macroId: Double): js.Any
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroResult
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the result of a macro as html to display in the rich text editor
    *
    * @param {int} macroId The macro id to get parameters for
    * @param {int} pageId The current page id
    * @param {Array} macroParamDictionary A dictionary of macro parameters
    *
    */
  def getMacroResultAsHtmlForEditor(macroId: Double, pageId: Double, macroParamDictionary: js.Array[_]): js.Any
}

object IMacroResource {
  @scala.inline
  def apply(
    getMacroParameters: Double => CallbackTo[js.Any],
    getMacroResultAsHtmlForEditor: (Double, Double, js.Array[js.Any]) => CallbackTo[js.Any]
  ): IMacroResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMacroParameters")(js.Any.fromFunction1((t0: scala.Double) => getMacroParameters(t0).runNow()))
    __obj.updateDynamic("getMacroResultAsHtmlForEditor")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Array[js.Any]) => getMacroResultAsHtmlForEditor(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IMacroResource]
  }
}

