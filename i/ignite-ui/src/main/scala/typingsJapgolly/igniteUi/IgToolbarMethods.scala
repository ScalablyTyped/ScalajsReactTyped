package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarMethods extends js.Object {
  /**
  	 * Activate item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 * @param activated The activate property value.
  	 */
  def activateItem(index: js.Object, activated: js.Object): Unit
  /**
  	 * Add item to widget item array
  	 *
  	 * @param item The item to be added.
  	 */
  def addItem(item: js.Object): Unit
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  def changeLocale(): Unit
  /**
  	 * Deactivate all buttons.
  	 */
  def deactivateAll(): Unit
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): Unit
  /**
  	 * Disable item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 * @param disabled The disabled property value.
  	 */
  def disableItem(index: js.Object, disabled: js.Object): Unit
  /**
  	 * Gets the item by matching the provided index.
  	 *
  	 * @param index The index of the item.
  	 */
  def getItem(index: js.Object): js.Object
  /**
  	 * Remove the item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 */
  def removeItem(index: js.Object): js.Object
  /**
  	 * Returns the element on which the widget was instantiated
  	 */
  def widget(): Unit
}

object IgToolbarMethods {
  @scala.inline
  def apply(
    activateItem: (js.Object, js.Object) => Callback,
    addItem: js.Object => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    deactivateAll: Callback,
    destroy: Callback,
    disableItem: (js.Object, js.Object) => Callback,
    getItem: js.Object => CallbackTo[js.Object],
    removeItem: js.Object => CallbackTo[js.Object],
    widget: Callback
  ): IgToolbarMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateItem")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => activateItem(t0, t1).runNow()))
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: js.Object) => addItem(t0).runNow()))
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("deactivateAll")(deactivateAll.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disableItem")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => disableItem(t0, t1).runNow()))
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: js.Object) => getItem(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: js.Object) => removeItem(t0).runNow()))
    __obj.updateDynamic("widget")(widget.toJsFn)
    __obj.asInstanceOf[IgToolbarMethods]
  }
}

