package typingsJapgolly.rcTabs

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTabs.esInterfaceMod.AnimatedConfig
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.OnTabScroll
import typingsJapgolly.rcTabs.esInterfaceMod.RenderTabBar
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraContent
import typingsJapgolly.rcTabs.esInterfaceMod.TabPosition
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.rcTabs.rcTabsStrings.bottom
import typingsJapgolly.rcTabs.rcTabsStrings.left
import typingsJapgolly.rcTabs.rcTabsStrings.right
import typingsJapgolly.rcTabs.rcTabsStrings.top
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction extends StObject {
    
    var direction: left | right | top | bottom
  }
  object Direction {
    
    inline def apply(direction: left | right | top | bottom): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    extension [Self <: Direction](x: Self) {
      
      inline def setDirection(value: left | right | top | bottom): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    var event: ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Event {
    
    inline def apply(event: ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setEvent(value: ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  tabs :std.Array<rc-tabs.rc-tabs/es/interface.Tab>} & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait tabsArrayTabTabNavListPro extends StObject {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[
        js.Function1[
          /* node */ japgolly.scalajs.react.facade.React.Element, 
          japgolly.scalajs.react.facade.React.Element
        ]
      ] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[Node] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(activeKey: String, e: ReactKeyboardEventFrom[Element]): Unit = js.native
    def onTabClick(activeKey: String, e: ReactMouseEventFrom[Element]): Unit = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
}
