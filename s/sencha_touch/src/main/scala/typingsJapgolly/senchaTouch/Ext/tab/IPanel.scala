package typingsJapgolly.senchaTouch.Ext.tab

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends IContainer {
  /** [Method] Updates this container with the new active item
  		* @param tabBar Object
  		* @param newTab Object
  		* @returns Boolean
  		*/
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IPanel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tabBar
  		* @returns Object
  		*/
  var getTabBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tabBarPosition
  		* @returns String
  		*/
  var getTabBarPosition: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of tabBar
  		* @param tabBar Object The new value.
  		*/
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of tabBarPosition
  		* @param tabBarPosition String The new value.
  		*/
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[String] = js.undefined
  /** [Method] Updates the Ui for this component and the tabBar
  		* @param newUi Object
  		* @param oldUi Object
  		*/
  var updateUi: js.UndefOr[
    js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    doTabChange: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    getCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTabBar: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTabBarPosition: js.UndefOr[CallbackTo[String]] = js.undefined,
    setCls: /* cls */ js.UndefOr[String] => Callback = null,
    setTabBar: /* tabBar */ js.UndefOr[js.Any] => Callback = null,
    setTabBarPosition: /* tabBarPosition */ js.UndefOr[String] => Callback = null,
    tabBar: js.Any = null,
    tabBarDock: js.UndefOr[Boolean] = js.undefined,
    tabBarPosition: String = null,
    updateUi: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Callback = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (doTabChange != null) __obj.updateDynamic("doTabChange")(js.Any.fromFunction2((t0: /* tabBar */ js.UndefOr[js.Any], t1: /* newTab */ js.UndefOr[js.Any]) => doTabChange(t0, t1).runNow()))
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getTabBar.foreach(p => __obj.updateDynamic("getTabBar")(p.toJsFn))
    getTabBarPosition.foreach(p => __obj.updateDynamic("getTabBarPosition")(p.toJsFn))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setCls(t0).runNow()))
    if (setTabBar != null) __obj.updateDynamic("setTabBar")(js.Any.fromFunction1((t0: /* tabBar */ js.UndefOr[js.Any]) => setTabBar(t0).runNow()))
    if (setTabBarPosition != null) __obj.updateDynamic("setTabBarPosition")(js.Any.fromFunction1((t0: /* tabBarPosition */ js.UndefOr[java.lang.String]) => setTabBarPosition(t0).runNow()))
    if (tabBar != null) __obj.updateDynamic("tabBar")(tabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarDock)) __obj.updateDynamic("tabBarDock")(tabBarDock.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (updateUi != null) __obj.updateDynamic("updateUi")(js.Any.fromFunction2((t0: /* newUi */ js.UndefOr[js.Any], t1: /* oldUi */ js.UndefOr[js.Any]) => updateUi(t0, t1).runNow()))
    __obj.asInstanceOf[IPanel]
  }
}

