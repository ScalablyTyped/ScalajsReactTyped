package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.button.ISplit
import typingsJapgolly.extjs.Ext.menu.ICheckItem
import typingsJapgolly.extjs.Ext.menu.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICycleButton extends ISplit {
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the currently active menu item
  		* @returns Ext.menu.CheckItem The active item
  		*/
  var getActiveItem: js.UndefOr[js.Function0[ICheckItem]] = js.undefined
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycleButton: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (String) */
  var prependText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the button s active menu item
  		* @param item Ext.menu.CheckItem The item to activate
  		* @param suppressEvent Boolean True to prevent the button's change event from firing.
  		*/
  var setActiveItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[Boolean] = js.undefined
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ICycleButton {
  @scala.inline
  def apply(
    ISplit: ISplit = null,
    changeHandler: js.Any = null,
    forceGlyph: js.Any = null,
    forceIcon: java.lang.String = null,
    getActiveItem: js.UndefOr[CallbackTo[ICheckItem]] = js.undefined,
    items: Array = null,
    menu: IMenu = null,
    prependText: java.lang.String = null,
    setActiveItem: (/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    showText: js.UndefOr[Boolean] = js.undefined,
    toggleSelected: js.UndefOr[Callback] = js.undefined
  ): ICycleButton = {
    val __obj = js.Dynamic.literal()
    if (ISplit != null) js.Dynamic.global.Object.assign(__obj, ISplit)
    if (changeHandler != null) __obj.updateDynamic("changeHandler")(changeHandler.asInstanceOf[js.Any])
    if (forceGlyph != null) __obj.updateDynamic("forceGlyph")(forceGlyph.asInstanceOf[js.Any])
    if (forceIcon != null) __obj.updateDynamic("forceIcon")(forceIcon.asInstanceOf[js.Any])
    getActiveItem.foreach(p => __obj.updateDynamic("getActiveItem")(p.toJsFn))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (prependText != null) __obj.updateDynamic("prependText")(prependText.asInstanceOf[js.Any])
    if (setActiveItem != null) __obj.updateDynamic("setActiveItem")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[typingsJapgolly.extjs.Ext.menu.ICheckItem], t1: /* suppressEvent */ js.UndefOr[scala.Boolean]) => setActiveItem(t0, t1).runNow()))
    if (!js.isUndefined(showText)) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    toggleSelected.foreach(p => __obj.updateDynamic("toggleSelected")(p.toJsFn))
    __obj.asInstanceOf[ICycleButton]
  }
}

