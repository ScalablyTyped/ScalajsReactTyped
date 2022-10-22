package typingsJapgolly.rcTabs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTabs.anon.Direction
import typingsJapgolly.rcTabs.esInterfaceMod.AnimatedConfig
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.RenderTabBarProps
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraContent
import typingsJapgolly.rcTabs.esInterfaceMod.TabPosition
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.rcTabs.esTabNavListMod.TabNavListProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNavList {
  
  inline def apply(
    activeKey: String,
    id: String,
    mobile: Boolean,
    onTabClick: (String, ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element]) => Callback,
    rtl: Boolean,
    tabPosition: TabPosition
  ): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2((t0: String, t1: ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element]) => (onTabClick(t0, t1)).runNow()), rtl = rtl.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNavListProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def animated(value: AnimatedConfig): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def children(
      value: /* node */ japgolly.scalajs.react.facade.React.Element => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def extra(value: TabBarExtraContent): this.type = set("extra", value.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def moreIcon(value: VdomNode): this.type = set("moreIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def moreIconNull: this.type = set("moreIcon", null)
    
    inline def moreIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("moreIcon", js.Array(value*))
    
    inline def moreIconVdomElement(value: VdomElement): this.type = set("moreIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def moreTransitionName(value: String): this.type = set("moreTransitionName", value.asInstanceOf[js.Any])
    
    inline def onTabScroll(value: /* info */ Direction => Callback): this.type = set("onTabScroll", js.Any.fromFunction1((t0: /* info */ Direction) => value(t0).runNow()))
    
    inline def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    inline def renderTabBar(
      value: (/* props */ RenderTabBarProps, /* DefaultTabBar */ ComponentType[TabNavListProps]) => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("renderTabBar", js.Any.fromFunction2(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabNavListProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
