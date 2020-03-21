package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridRowSelectorsMethods extends js.Object {
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridrowselectors#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridrowselectors#options:language) or [locale](ui.iggridrowselectors#options:locale) option setter
  	 */
  def changeLocale(): Unit
  def destroy(): Unit
  def rsRenderColgroup(): Unit
}

object IgGridRowSelectorsMethods {
  @scala.inline
  def apply(changeLocale: Callback, destroy: Callback, rsRenderColgroup: Callback): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("rsRenderColgroup")(rsRenderColgroup.toJsFn)
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
}

