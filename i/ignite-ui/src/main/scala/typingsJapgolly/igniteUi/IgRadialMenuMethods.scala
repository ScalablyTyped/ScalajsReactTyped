package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialMenuMethods extends js.Object {
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
  	 * Destroys the widget.
  	 */
  def destroy(): Unit
  /**
  	 * Exports visual data from the radial menu to aid in unit testing
  	 */
  def exportVisualData(): Unit
  /**
  	 * Forces any pending deferred work to render on the radial menu before continuing
  	 */
  def flush(): Unit
  /**
  	 * Gets or sets the value of a property for the item created with the specified key
  	 *
  	 * @param itemKey The name of the item
  	 * @param key The name of the property/option
  	 * @param value The new value for the property or undefined to obtain the current value
  	 */
  def itemOption(itemKey: String, key: String, value: js.Object): js.Object
  /**
  	 * Notify the radial menu that style information used for rendering the menu may have been updated.
  	 */
  def styleUpdated(): Unit
}

object IgRadialMenuMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    exportVisualData: Callback,
    flush: Callback,
    itemOption: (String, String, js.Object) => CallbackTo[js.Object],
    styleUpdated: Callback
  ): IgRadialMenuMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("exportVisualData")(exportVisualData.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("itemOption")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => itemOption(t0, t1, t2).runNow()))
    __obj.updateDynamic("styleUpdated")(styleUpdated.toJsFn)
    __obj.asInstanceOf[IgRadialMenuMethods]
  }
}

