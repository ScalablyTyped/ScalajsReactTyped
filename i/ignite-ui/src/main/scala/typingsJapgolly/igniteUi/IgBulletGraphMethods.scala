package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBulletGraphMethods extends js.Object {
  /**
  	 * Adds a new range to the bullet graph.
  	 *
  	 * @param value The range object to be added.
  	 */
  def addRange(value: js.Object): Unit
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns information about how the bullet graph is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all pending changes of the bullet graph e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): Unit
  /**
  	 * Returns a string containing the names of all the ranges delimited with a \n symbol.
  	 */
  def getRangeNames(): Unit
  /**
  	 * Removes a range from the bullet graph.
  	 *
  	 * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
  	 */
  def removeRange(value: js.Object): Unit
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): Unit
  /**
  	 * Updates the specified range of the bullet graph.
  	 *
  	 * @param value The range object to be updated.
  	 */
  def updateRange(value: js.Object): Unit
}

object IgBulletGraphMethods {
  @scala.inline
  def apply(
    addRange: js.Object => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    exportVisualData: CallbackTo[js.Object],
    flush: Callback,
    getRangeNames: Callback,
    removeRange: js.Object => Callback,
    styleUpdated: Callback,
    updateRange: js.Object => Callback
  ): IgBulletGraphMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addRange")(js.Any.fromFunction1((t0: js.Object) => addRange(t0).runNow()))
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("exportVisualData")(exportVisualData.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getRangeNames")(getRangeNames.toJsFn)
    __obj.updateDynamic("removeRange")(js.Any.fromFunction1((t0: js.Object) => removeRange(t0).runNow()))
    __obj.updateDynamic("styleUpdated")(styleUpdated.toJsFn)
    __obj.updateDynamic("updateRange")(js.Any.fromFunction1((t0: js.Object) => updateRange(t0).runNow()))
    __obj.asInstanceOf[IgBulletGraphMethods]
  }
}

