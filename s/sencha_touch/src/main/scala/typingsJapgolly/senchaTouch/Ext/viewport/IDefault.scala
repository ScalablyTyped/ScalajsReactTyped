package typingsJapgolly.senchaTouch.Ext.viewport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IContainer
import typingsJapgolly.senchaTouch.Ext.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefault extends IContainer {
  /** [Config Option] (Boolean) */
  var autoMaximize: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of autoMaximize
  		* @returns Boolean
  		*/
  var getAutoMaximize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current orientation
  		* @returns String portrait or landscape
  		*/
  var getOrientation: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of preventPanning
  		* @returns Boolean
  		*/
  var getPreventPanning: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of preventZooming
  		* @returns Boolean
  		*/
  var getPreventZooming: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useBodyElement
  		* @returns Boolean
  		*/
  var getUseBodyElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Retrieves the document height
  		* @returns Number height in pixels.
  		*/
  var getWindowHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Retrieves the document width
  		* @returns Number width in pixels.
  		*/
  var getWindowWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Hides all visible menus
  		* @param animation Object
  		*/
  var hideAllMenus: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Hides a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var hideMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Hides all menus except for the side specified
  		* @param side String Side(s) not to hide
  		* @param animation String Animation to hide with
  		*/
  var hideOtherMenus: js.UndefOr[
    js.Function2[/* side */ js.UndefOr[String], /* animation */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isReady: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventPanning: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventZooming: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes a menu from a specified side
  		* @param side String The side to remove the menu from
  		*/
  var removeMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of autoMaximize
  		* @param autoMaximize Boolean The new value.
  		*/
  var setAutoMaximize: js.UndefOr[js.Function1[/* autoMaximize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets a menu for a given side of the Viewport
  		* @param menu Ext.Menu The menu to assign to the viewport
  		* @param config Object The configuration for the menu.
  		*/
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the value of preventPanning
  		* @param preventPanning Boolean The new value.
  		*/
  var setPreventPanning: js.UndefOr[js.Function1[/* preventPanning */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of preventZooming
  		* @param preventZooming Boolean The new value.
  		*/
  var setPreventZooming: js.UndefOr[js.Function1[/* preventZooming */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useBodyElement
  		* @param useBodyElement Boolean The new value.
  		*/
  var setUseBodyElement: js.UndefOr[js.Function1[/* useBodyElement */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Shows a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var showMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Toggles the menu specified by side
  		* @param side String The side which the menu is placed.
  		*/
  var toggleMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.undefined
}

object IDefault {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    autoMaximize: js.UndefOr[Boolean] = js.undefined,
    getAutoMaximize: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOrientation: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPreventPanning: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getPreventZooming: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseBodyElement: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getWindowHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getWindowWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hideAllMenus: /* animation */ js.UndefOr[js.Any] => Callback = null,
    hideMenu: /* side */ js.UndefOr[String] => Callback = null,
    hideOtherMenus: (/* side */ js.UndefOr[String], /* animation */ js.UndefOr[String]) => Callback = null,
    isReady: js.UndefOr[Boolean] = js.undefined,
    preventPanning: js.UndefOr[Boolean] = js.undefined,
    preventZooming: js.UndefOr[Boolean] = js.undefined,
    removeMenu: /* side */ js.UndefOr[String] => Callback = null,
    setAutoMaximize: /* autoMaximize */ js.UndefOr[Boolean] => Callback = null,
    setMenu: (/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any]) => Callback = null,
    setPreventPanning: /* preventPanning */ js.UndefOr[Boolean] => Callback = null,
    setPreventZooming: /* preventZooming */ js.UndefOr[Boolean] => Callback = null,
    setUseBodyElement: /* useBodyElement */ js.UndefOr[Boolean] => Callback = null,
    showMenu: /* side */ js.UndefOr[String] => Callback = null,
    toggleMenu: /* side */ js.UndefOr[String] => Callback = null
  ): IDefault = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(autoMaximize)) __obj.updateDynamic("autoMaximize")(autoMaximize.asInstanceOf[js.Any])
    getAutoMaximize.foreach(p => __obj.updateDynamic("getAutoMaximize")(p.toJsFn))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getOrientation.foreach(p => __obj.updateDynamic("getOrientation")(p.toJsFn))
    getPreventPanning.foreach(p => __obj.updateDynamic("getPreventPanning")(p.toJsFn))
    getPreventZooming.foreach(p => __obj.updateDynamic("getPreventZooming")(p.toJsFn))
    getUseBodyElement.foreach(p => __obj.updateDynamic("getUseBodyElement")(p.toJsFn))
    getWindowHeight.foreach(p => __obj.updateDynamic("getWindowHeight")(p.toJsFn))
    getWindowWidth.foreach(p => __obj.updateDynamic("getWindowWidth")(p.toJsFn))
    if (hideAllMenus != null) __obj.updateDynamic("hideAllMenus")(js.Any.fromFunction1((t0: /* animation */ js.UndefOr[js.Any]) => hideAllMenus(t0).runNow()))
    if (hideMenu != null) __obj.updateDynamic("hideMenu")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => hideMenu(t0).runNow()))
    if (hideOtherMenus != null) __obj.updateDynamic("hideOtherMenus")(js.Any.fromFunction2((t0: /* side */ js.UndefOr[java.lang.String], t1: /* animation */ js.UndefOr[java.lang.String]) => hideOtherMenus(t0, t1).runNow()))
    if (!js.isUndefined(isReady)) __obj.updateDynamic("isReady")(isReady.asInstanceOf[js.Any])
    if (!js.isUndefined(preventPanning)) __obj.updateDynamic("preventPanning")(preventPanning.asInstanceOf[js.Any])
    if (!js.isUndefined(preventZooming)) __obj.updateDynamic("preventZooming")(preventZooming.asInstanceOf[js.Any])
    if (removeMenu != null) __obj.updateDynamic("removeMenu")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => removeMenu(t0).runNow()))
    if (setAutoMaximize != null) __obj.updateDynamic("setAutoMaximize")(js.Any.fromFunction1((t0: /* autoMaximize */ js.UndefOr[scala.Boolean]) => setAutoMaximize(t0).runNow()))
    if (setMenu != null) __obj.updateDynamic("setMenu")(js.Any.fromFunction2((t0: /* menu */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IMenu], t1: /* config */ js.UndefOr[js.Any]) => setMenu(t0, t1).runNow()))
    if (setPreventPanning != null) __obj.updateDynamic("setPreventPanning")(js.Any.fromFunction1((t0: /* preventPanning */ js.UndefOr[scala.Boolean]) => setPreventPanning(t0).runNow()))
    if (setPreventZooming != null) __obj.updateDynamic("setPreventZooming")(js.Any.fromFunction1((t0: /* preventZooming */ js.UndefOr[scala.Boolean]) => setPreventZooming(t0).runNow()))
    if (setUseBodyElement != null) __obj.updateDynamic("setUseBodyElement")(js.Any.fromFunction1((t0: /* useBodyElement */ js.UndefOr[scala.Boolean]) => setUseBodyElement(t0).runNow()))
    if (showMenu != null) __obj.updateDynamic("showMenu")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => showMenu(t0).runNow()))
    if (toggleMenu != null) __obj.updateDynamic("toggleMenu")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => toggleMenu(t0).runNow()))
    __obj.asInstanceOf[IDefault]
  }
}

