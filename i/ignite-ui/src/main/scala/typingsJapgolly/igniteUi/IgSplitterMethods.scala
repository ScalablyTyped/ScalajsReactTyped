package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitterMethods extends js.Object {
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
  	 * Collapse the specified panel.
  	 *
  	 * @param index Specifies the index of the panel to collapse.
  	 */
  def collapseAt(index: js.Object): Unit
  /**
  	 * Destroys the igSplitter widget
  	 */
  def destroy(): Unit
  /**
  	 * Expand the specified panel by index.
  	 *
  	 * @param index Specifies the index of the panel to expand.
  	 */
  def expandAt(index: js.Object): Unit
  /**
  	 * Retrieves the jQuery element of the first panel.
  	 */
  def firstPanel(): js.Object
  /**
  	 * Refresh splitter layout, use this method to re-render the splitter if some changes to the layout are applied.
  	 */
  def refreshLayout(): Unit
  /**
  	 * Retrieves the jQuery element of the second panel.
  	 */
  def secondPanel(): js.Object
  /**
  	 * You can set new size of the first panel after the splitter is rendered.
  	 *
  	 * @param size Specifies the new size of the first panel.
  	 */
  def setFirstPanelSize(size: js.Object): Unit
  /**
  	 * You can set new size of the second panel after the splitter is rendered.
  	 *
  	 * @param size Specifies the new size of the second panel.
  	 */
  def setSecondPanelSize(size: js.Object): Unit
  /**
  	 * Returns the element that represents this widget.
  	 */
  def widget(): js.Object
}

object IgSplitterMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    collapseAt: js.Object => Callback,
    destroy: Callback,
    expandAt: js.Object => Callback,
    firstPanel: CallbackTo[js.Object],
    refreshLayout: Callback,
    secondPanel: CallbackTo[js.Object],
    setFirstPanelSize: js.Object => Callback,
    setSecondPanelSize: js.Object => Callback,
    widget: CallbackTo[js.Object]
  ): IgSplitterMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()))
    __obj.updateDynamic("collapseAt")(js.Any.fromFunction1((t0: js.Object) => collapseAt(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("expandAt")(js.Any.fromFunction1((t0: js.Object) => expandAt(t0).runNow()))
    __obj.updateDynamic("firstPanel")(firstPanel.toJsFn)
    __obj.updateDynamic("refreshLayout")(refreshLayout.toJsFn)
    __obj.updateDynamic("secondPanel")(secondPanel.toJsFn)
    __obj.updateDynamic("setFirstPanelSize")(js.Any.fromFunction1((t0: js.Object) => setFirstPanelSize(t0).runNow()))
    __obj.updateDynamic("setSecondPanelSize")(js.Any.fromFunction1((t0: js.Object) => setSecondPanelSize(t0).runNow()))
    __obj.updateDynamic("widget")(widget.toJsFn)
    __obj.asInstanceOf[IgSplitterMethods]
  }
}

