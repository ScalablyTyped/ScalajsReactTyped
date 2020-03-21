package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridModalDialogMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmodaldialog#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridmodaldialog#options:language) or [locale](ui.iggridmodaldialog#options:locale) option setter
  	 */
  def changeLocale(): Unit
  def closeModalDialog(accepted: js.Object, e: js.Object): Unit
  def destroy(): Unit
  def getCaptionButtonContainer(): Unit
  def getContent(): Unit
  def getFooter(): Unit
  def openModalDialog(): Unit
}

object IgGridModalDialogMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    closeModalDialog: (js.Object, js.Object) => Callback,
    destroy: Callback,
    getCaptionButtonContainer: Callback,
    getContent: Callback,
    getFooter: Callback,
    openModalDialog: Callback
  ): IgGridModalDialogMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("closeModalDialog")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => closeModalDialog(t0, t1).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getCaptionButtonContainer")(getCaptionButtonContainer.toJsFn)
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getFooter")(getFooter.toJsFn)
    __obj.updateDynamic("openModalDialog")(openModalDialog.toJsFn)
    __obj.asInstanceOf[IgGridModalDialogMethods]
  }
}

