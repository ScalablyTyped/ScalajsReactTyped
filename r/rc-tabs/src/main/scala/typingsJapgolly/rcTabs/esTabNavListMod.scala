package typingsJapgolly.rcTabs

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTabs.esInterfaceMod.AnimatedConfig
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.OnTabScroll
import typingsJapgolly.rcTabs.esInterfaceMod.RenderTabBar
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraContent
import typingsJapgolly.rcTabs.esInterfaceMod.TabPosition
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TabNavListProps & RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TabNavListProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ Element, Element]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[Node] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(activeKey: String, e: ReactKeyboardEventFrom[org.scalajs.dom.Element]): Unit = js.native
    def onTabClick(activeKey: String, e: ReactMouseEventFrom[org.scalajs.dom.Element]): Unit = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
  }
  
  type _To = ForwardRefExoticComponent[TabNavListProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListMod.foo` */
  override def _to: ForwardRefExoticComponent[TabNavListProps & RefAttributes[HTMLDivElement]] = default
}
