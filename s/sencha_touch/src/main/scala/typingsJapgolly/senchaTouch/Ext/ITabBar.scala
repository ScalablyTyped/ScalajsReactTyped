package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabBar extends IToolbar {
  /** [Config Option] (Number/String/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of activeTab
  		* @returns Number/String/Ext.Component
  		*/
  var getActiveTab: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of activeTab
  		* @param activeTab Number/String/Ext.Component The new value.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ITabBar {
  @scala.inline
  def apply(
    IToolbar: IToolbar = null,
    activeTab: js.Any = null,
    getActiveTab: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setActiveTab: /* activeTab */ js.UndefOr[js.Any] => Callback = null
  ): ITabBar = {
    val __obj = js.Dynamic.literal()
    if (IToolbar != null) js.Dynamic.global.Object.assign(__obj, IToolbar)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    getActiveTab.foreach(p => __obj.updateDynamic("getActiveTab")(p.toJsFn))
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(js.Any.fromFunction1((t0: /* activeTab */ js.UndefOr[js.Any]) => setActiveTab(t0).runNow()))
    __obj.asInstanceOf[ITabBar]
  }
}

