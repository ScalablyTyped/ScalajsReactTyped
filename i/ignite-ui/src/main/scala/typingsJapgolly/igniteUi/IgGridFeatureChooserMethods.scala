package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooserMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridfeaturechooser#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridfeaturechooser#options:language) or [locale](ui.iggridfeaturechooser#options:locale) option setter
  	 */
  def changeLocale(): Unit
  def destroy(e: js.Object, args: js.Object): Unit
  /**
  	 * Get jQuery representation of the div holding dropdown for the specified columnKey
  	 *
  	 * @param columnKey Key of the column
  	 */
  def getDropDownByColumnKey(columnKey: String): Unit
  /**
  	 * Hide feature chooser dialog by column key
  	 *
  	 * @param columnKey Key of the column that should be hidden.
  	 */
  def hideDropDown(columnKey: String): Unit
  def shouldShowFeatureIcon(key: js.Object): Unit
  /**
  	 * Show feature chooser dialog by the specified column key
  	 *
  	 * @param columnKey Key of the column that should be shown.
  	 */
  def showDropDown(columnKey: String): Unit
  /**
  	 * Show/hide feature chooser dialog by column key
  	 *
  	 * @param columnKey Key of the column that should be shown/hidden.
  	 */
  def toggleDropDown(columnKey: String): Unit
}

object IgGridFeatureChooserMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    destroy: (js.Object, js.Object) => Callback,
    getDropDownByColumnKey: String => Callback,
    hideDropDown: String => Callback,
    shouldShowFeatureIcon: js.Object => Callback,
    showDropDown: String => Callback,
    toggleDropDown: String => Callback
  ): IgGridFeatureChooserMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("destroy")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => destroy(t0, t1).runNow()))
    __obj.updateDynamic("getDropDownByColumnKey")(js.Any.fromFunction1((t0: java.lang.String) => getDropDownByColumnKey(t0).runNow()))
    __obj.updateDynamic("hideDropDown")(js.Any.fromFunction1((t0: java.lang.String) => hideDropDown(t0).runNow()))
    __obj.updateDynamic("shouldShowFeatureIcon")(js.Any.fromFunction1((t0: js.Object) => shouldShowFeatureIcon(t0).runNow()))
    __obj.updateDynamic("showDropDown")(js.Any.fromFunction1((t0: java.lang.String) => showDropDown(t0).runNow()))
    __obj.updateDynamic("toggleDropDown")(js.Any.fromFunction1((t0: java.lang.String) => toggleDropDown(t0).runNow()))
    __obj.asInstanceOf[IgGridFeatureChooserMethods]
  }
}

