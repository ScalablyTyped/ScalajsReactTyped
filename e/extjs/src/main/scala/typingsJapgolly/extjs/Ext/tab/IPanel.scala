package typingsJapgolly.extjs.Ext.tab

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel
  extends typingsJapgolly.extjs.Ext.panel.IPanel {
  /** [Config Option] (String/Number/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the item that is currently active inside this TabPanel
  		* @returns Ext.Component The currently active item.
  		*/
  var getActiveTab: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Returns the Ext tab Bar currently used in this TabPanel
  		* @returns Ext.tab.Bar The TabBar
  		*/
  var getTabBar: js.UndefOr[js.Function0[IBar]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var removePanelHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Makes the given card active
  		* @param card String/Number/Ext.Component The card to make active. Either an ID, index or the component itself.
  		* @returns Ext.Component The resulting active child Component. The call may have been vetoed, or otherwise modified by an event listener.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* card */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] ("top"/"bottom"/"left"/"right") */
  var tabPosition: js.UndefOr[js.Any] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IPanel: typingsJapgolly.extjs.Ext.panel.IPanel = null,
    activeTab: js.Any = null,
    deferredRender: js.UndefOr[Boolean] = js.undefined,
    getActiveTab: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getTabBar: js.UndefOr[CallbackTo[IBar]] = js.undefined,
    itemCls: String = null,
    maxTabWidth: Int | Double = null,
    minTabWidth: Int | Double = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    removePanelHeader: js.UndefOr[Boolean] = js.undefined,
    setActiveTab: /* card */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    tabBar: js.Any = null,
    tabPosition: js.Any = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (!js.isUndefined(deferredRender)) __obj.updateDynamic("deferredRender")(deferredRender.asInstanceOf[js.Any])
    getActiveTab.foreach(p => __obj.updateDynamic("getActiveTab")(p.toJsFn))
    getTabBar.foreach(p => __obj.updateDynamic("getTabBar")(p.toJsFn))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (maxTabWidth != null) __obj.updateDynamic("maxTabWidth")(maxTabWidth.asInstanceOf[js.Any])
    if (minTabWidth != null) __obj.updateDynamic("minTabWidth")(minTabWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (!js.isUndefined(removePanelHeader)) __obj.updateDynamic("removePanelHeader")(removePanelHeader.asInstanceOf[js.Any])
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(js.Any.fromFunction1((t0: /* card */ js.UndefOr[js.Any]) => setActiveTab(t0).runNow()))
    if (tabBar != null) __obj.updateDynamic("tabBar")(tabBar.asInstanceOf[js.Any])
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel]
  }
}

