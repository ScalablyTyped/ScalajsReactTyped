package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgScrollMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * This method overrides the base method and does nothing, because the scoll container shouldn't change the container locales
  	 * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
  	 */
  def changeLocale(): Unit
  def destroy(): Unit
  def option(optionName: js.Object, value: js.Object): Unit
  def refresh(): Unit
}

object IgScrollMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    destroy: Callback,
    option: (js.Object, js.Object) => Callback,
    refresh: Callback
  ): IgScrollMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("option")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => option(t0, t1).runNow()))
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[IgScrollMethods]
  }
}

