package typingsJapgolly.rcTabs

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTabs.esInterfaceMod.AnimatedConfig
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.OnTabScroll
import typingsJapgolly.rcTabs.esInterfaceMod.RenderTabBar
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraContent
import typingsJapgolly.rcTabs.esInterfaceMod.TabPosition
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListWrapperMod {
  
  @JSImport("rc-tabs/es/TabNavList/Wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasRenderTabBarRestProps: TabNavListWrapperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRenderTabBarRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Required<std.Omit<rc-tabs.rc-tabs/es/TabNavList.TabNavListProps, 'children' | 'className'>> & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait TabNavListWrapperProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: AnimatedConfig & js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[
        js.Function1[
          /* node */ japgolly.scalajs.react.facade.React.Element, 
          japgolly.scalajs.react.facade.React.Element
        ]
      ] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: EditableConfig & js.UndefOr[EditableConfig] = js.native
    
    var extra: TabBarExtraContent & js.UndefOr[TabBarExtraContent] = js.native
    
    var getPopupContainer: (js.Function1[/* node */ HTMLElement, HTMLElement]) & (js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]]) = js.native
    
    var id: String = js.native
    
    var locale: TabsLocale & js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: Node & js.UndefOr[Node] = js.native
    
    var moreTransitionName: String & js.UndefOr[String] = js.native
    
    var onTabClick: js.Function2[
        /* activeKey */ String, 
        /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element], 
        Unit
      ] = js.native
    def onTabClick(activeKey: String, e: ReactKeyboardEventFrom[org.scalajs.dom.Element]): Unit = js.native
    def onTabClick(activeKey: String, e: ReactMouseEventFrom[org.scalajs.dom.Element]): Unit = js.native
    
    var onTabScroll: OnTabScroll & js.UndefOr[OnTabScroll] = js.native
    
    var popupClassName: String & js.UndefOr[String] = js.native
    
    var renderTabBar: RenderTabBar & js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: CSSProperties & js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: Double & js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
  }
}
