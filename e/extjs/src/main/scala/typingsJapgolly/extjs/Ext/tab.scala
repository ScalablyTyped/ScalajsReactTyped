package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.panel.IHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tab {
  
  trait IBar
    extends StObject
       with IHeader {
    
    /** [Method] Called by the layout system after the Component has been laid out
      * @param width Object
      */
    @JSName("afterComponentLayout")
    var afterComponentLayout_IBar: js.UndefOr[js.Function1[/* width */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var isTabBar: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var maxTabWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minTabWidth: js.UndefOr[Double] = js.undefined
    
    /** [Method] This method is invoked after a new Component has been removed
      * @param tab Object
      */
    @JSName("onRemove")
    var onRemove_IBar: js.UndefOr[js.Function1[/* tab */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_IBar: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var plain: js.UndefOr[Boolean] = js.undefined
  }
  object IBar {
    
    inline def apply(): IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBar]
    }
    
    extension [Self <: IBar](x: Self) {
      
      inline def setAfterComponentLayout(value: /* width */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "afterComponentLayout", js.Any.fromFunction1((t0: /* width */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setAfterComponentLayoutUndefined: Self = StObject.set(x, "afterComponentLayout", js.undefined)
      
      inline def setIsTabBar(value: Boolean): Self = StObject.set(x, "isTabBar", value.asInstanceOf[js.Any])
      
      inline def setIsTabBarUndefined: Self = StObject.set(x, "isTabBar", js.undefined)
      
      inline def setMaxTabWidth(value: Double): Self = StObject.set(x, "maxTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxTabWidthUndefined: Self = StObject.set(x, "maxTabWidth", js.undefined)
      
      inline def setMinTabWidth(value: Double): Self = StObject.set(x, "minTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMinTabWidthUndefined: Self = StObject.set(x, "minTabWidth", js.undefined)
      
      inline def setOnRemove(value: /* tab */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: /* tab */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnRender(value: Callback): Self = StObject.set(x, "onRender", value.toJsFn)
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    }
  }
  
  trait IPanel
    extends StObject
       with typingsJapgolly.extjs.Ext.panel.IPanel {
    
    /** [Config Option] (String/Number/Ext.Component) */
    var activeTab: js.UndefOr[Any] = js.undefined
    
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
    var itemCls: js.UndefOr[java.lang.String] = js.undefined
    
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
    var setActiveTab: js.UndefOr[js.Function1[/* card */ js.UndefOr[Any], IComponent]] = js.undefined
    
    /** [Config Option] (Object) */
    var tabBar: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] ("top"/"bottom"/"left"/"right") */
    var tabPosition: js.UndefOr[Any] = js.undefined
  }
  object IPanel {
    
    inline def apply(): typingsJapgolly.extjs.Ext.tab.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.tab.IPanel]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.tab.IPanel](x: Self) {
      
      inline def setActiveTab(value: Any): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setDeferredRender(value: Boolean): Self = StObject.set(x, "deferredRender", value.asInstanceOf[js.Any])
      
      inline def setDeferredRenderUndefined: Self = StObject.set(x, "deferredRender", js.undefined)
      
      inline def setGetActiveTab(value: CallbackTo[IComponent]): Self = StObject.set(x, "getActiveTab", value.toJsFn)
      
      inline def setGetActiveTabUndefined: Self = StObject.set(x, "getActiveTab", js.undefined)
      
      inline def setGetTabBar(value: CallbackTo[IBar]): Self = StObject.set(x, "getTabBar", value.toJsFn)
      
      inline def setGetTabBarUndefined: Self = StObject.set(x, "getTabBar", js.undefined)
      
      inline def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
      
      inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
      
      inline def setMaxTabWidth(value: Double): Self = StObject.set(x, "maxTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxTabWidthUndefined: Self = StObject.set(x, "maxTabWidth", js.undefined)
      
      inline def setMinTabWidth(value: Double): Self = StObject.set(x, "minTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMinTabWidthUndefined: Self = StObject.set(x, "minTabWidth", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setRemovePanelHeader(value: Boolean): Self = StObject.set(x, "removePanelHeader", value.asInstanceOf[js.Any])
      
      inline def setRemovePanelHeaderUndefined: Self = StObject.set(x, "removePanelHeader", js.undefined)
      
      inline def setSetActiveTab(value: /* card */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
      
      inline def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
      
      inline def setTabBar(value: Any): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
      
      inline def setTabBarUndefined: Self = StObject.set(x, "tabBar", js.undefined)
      
      inline def setTabPosition(value: Any): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
      
      inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    }
  }
  
  trait ITab
    extends StObject
       with typingsJapgolly.extjs.Ext.button.IButton {
    
    /** [Property] (Boolean) */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var closableCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var closeText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Boolean) */
    var isTab: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets this tab s attached card
      * @param card Ext.Component The card to set
      */
    var setCard: js.UndefOr[js.Function1[/* card */ js.UndefOr[IComponent], Unit]] = js.undefined
    
    /** [Method] Sets the tab as either closable or not
      * @param closable Boolean Pass false to make the tab not closable. Otherwise the tab will be made closable (eg a close button will appear on the tab)
      */
    var setClosable: js.UndefOr[js.Function1[/* closable */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object ITab {
    
    inline def apply(): ITab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITab]
    }
    
    extension [Self <: ITab](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      inline def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableCls(value: java.lang.String): Self = StObject.set(x, "closableCls", value.asInstanceOf[js.Any])
      
      inline def setClosableClsUndefined: Self = StObject.set(x, "closableCls", js.undefined)
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseText(value: java.lang.String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      inline def setIsTab(value: Boolean): Self = StObject.set(x, "isTab", value.asInstanceOf[js.Any])
      
      inline def setIsTabUndefined: Self = StObject.set(x, "isTab", js.undefined)
      
      inline def setSetCard(value: /* card */ js.UndefOr[IComponent] => Callback): Self = StObject.set(x, "setCard", js.Any.fromFunction1((t0: /* card */ js.UndefOr[IComponent]) => value(t0).runNow()))
      
      inline def setSetCardUndefined: Self = StObject.set(x, "setCard", js.undefined)
      
      inline def setSetClosable(value: /* closable */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setClosable", js.Any.fromFunction1((t0: /* closable */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetClosableUndefined: Self = StObject.set(x, "setClosable", js.undefined)
    }
  }
}
