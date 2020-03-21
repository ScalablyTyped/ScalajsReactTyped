package typingsJapgolly.extjs.Ext.menu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu extends IPanel {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_IMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOtherMenus: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether a menu item can be activated or not
  		* @param item Object
  		* @returns Boolean
  		*/
  var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Deactivates the current active item on the menu if one exists
  		* @param andBlurFocusedItem Object
  		*/
  var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMenu: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreParentClicks: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isMenu: js.UndefOr[Boolean] = js.undefined
  /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IMenu: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
  /** [Method] Shows this component by the specified Component or Element
  		* @param cmp Object
  		* @param pos Object
  		* @param off Object
  		* @returns Ext.Component this
  		*/
  @JSName("showBy")
  var showBy_IMenu: js.UndefOr[
    js.Function3[
      /* cmp */ js.UndefOr[js.Any], 
      /* pos */ js.UndefOr[js.Any], 
      /* off */ js.UndefOr[js.Any], 
      IComponent
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showSeparator: js.UndefOr[Boolean] = js.undefined
}

object IMenu {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    afterShow: js.UndefOr[Callback] = js.undefined,
    allowOtherMenus: js.UndefOr[Boolean] = js.undefined,
    canActivateItem: /* item */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    deactivateActiveItem: /* andBlurFocusedItem */ js.UndefOr[js.Any] => Callback = null,
    enableKeyNav: js.UndefOr[Boolean] = js.undefined,
    hide: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    ignoreParentClicks: js.UndefOr[Boolean] = js.undefined,
    isMenu: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    parentMenu: IMenu = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    showBy: (/* cmp */ js.UndefOr[js.Any], /* pos */ js.UndefOr[js.Any], /* off */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    showSeparator: js.UndefOr[Boolean] = js.undefined
  ): IMenu = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    afterShow.foreach(p => __obj.updateDynamic("afterShow")(p.toJsFn))
    if (!js.isUndefined(allowOtherMenus)) __obj.updateDynamic("allowOtherMenus")(allowOtherMenus.asInstanceOf[js.Any])
    if (canActivateItem != null) __obj.updateDynamic("canActivateItem")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => canActivateItem(t0).runNow()))
    if (deactivateActiveItem != null) __obj.updateDynamic("deactivateActiveItem")(js.Any.fromFunction1((t0: /* andBlurFocusedItem */ js.UndefOr[js.Any]) => deactivateActiveItem(t0).runNow()))
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (!js.isUndefined(ignoreParentClicks)) __obj.updateDynamic("ignoreParentClicks")(ignoreParentClicks.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenu)) __obj.updateDynamic("isMenu")(isMenu.asInstanceOf[js.Any])
    isVisible.foreach(p => __obj.updateDynamic("isVisible")(p.toJsFn))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction3((t0: /* cmp */ js.UndefOr[js.Any], t1: /* pos */ js.UndefOr[js.Any], t2: /* off */ js.UndefOr[js.Any]) => showBy(t0, t1, t2).runNow()))
    if (!js.isUndefined(showSeparator)) __obj.updateDynamic("showSeparator")(showSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenu]
  }
}

