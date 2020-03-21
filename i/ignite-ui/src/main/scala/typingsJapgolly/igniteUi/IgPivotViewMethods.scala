package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewMethods extends js.Object {
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
  	 * Returns the igPivotDataSelector instance of the pivot view.
  	 */
  def dataSelector(): js.Object
  /**
  	 * Destroy is part of the jQuery UI widget API and does the following:
  	 * 1. Remove custom CSS classes that were added.
  	 * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
  	 * 3. Unbind all events that were bound.
  	 */
  def destroy(): Unit
  /**
  	 * Returns the igPivotGrid instance of the pivot view.
  	 */
  def pivotGrid(): js.Object
  /**
  	 * Returns the igSplitter instance used to separate the pivot grid and the data selector.
  	 */
  def splitter(): js.Object
}

object IgPivotViewMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    dataSelector: CallbackTo[js.Object],
    destroy: Callback,
    pivotGrid: CallbackTo[js.Object],
    splitter: CallbackTo[js.Object]
  ): IgPivotViewMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()))
    __obj.updateDynamic("dataSelector")(dataSelector.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("pivotGrid")(pivotGrid.toJsFn)
    __obj.updateDynamic("splitter")(splitter.toJsFn)
    __obj.asInstanceOf[IgPivotViewMethods]
  }
}

