package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.AutoClose
import typingsJapgolly.antDesignProLayout.anon.AvatarPropstitleReactNode
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.group
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.header
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.light
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.side
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sider
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sub
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.top
import typingsJapgolly.antDesignProLayout.esComponentsGlobalHeaderMod.GlobalHeaderProps
import typingsJapgolly.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsJapgolly.antDesignProLayout.esDefaultSettingsMod.ContentWidth
import typingsJapgolly.antDesignProLayout.esTypingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.esTypingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalHeader {
  
  inline def apply(matchMenuKeys: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GlobalHeaderProps & PrivateSiderMenuProps]))
  }
  
  @JSImport("@ant-design/pro-layout/es/components/GlobalHeader", "GlobalHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actionsRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, js.Array[Node]]]): this.type = set("actionsRender", value.asInstanceOf[js.Any])
    
    inline def actionsRenderFunction1(value: /* props */ HeaderViewProps => js.Array[Node]): this.type = set("actionsRender", js.Any.fromFunction1(value))
    
    inline def avatarProps(value: WithFalse[AvatarPropstitleReactNode]): this.type = set("avatarProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def collapsedButtonRender(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.SiderMenuProps['collapsedButtonRender'] */ js.Any
    ): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
    
    inline def colorPrimary(value: String): this.type = set("colorPrimary", value.asInstanceOf[js.Any])
    
    inline def colorWeak(value: Boolean): this.type = set("colorWeak", value.asInstanceOf[js.Any])
    
    inline def contentWidth(value: ContentWidth): this.type = set("contentWidth", value.asInstanceOf[js.Any])
    
    inline def fixSiderbar(value: Boolean): this.type = set("fixSiderbar", value.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    
    inline def headerContentRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ Node, Node]]): this.type = set("headerContentRender", value.asInstanceOf[js.Any])
    
    inline def headerContentRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ Node) => Node): this.type = set("headerContentRender", js.Any.fromFunction2(value))
    
    inline def iconfontUrl(value: String): this.type = set("iconfontUrl", value.asInstanceOf[js.Any])
    
    inline def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    
    inline def layout(value: side | top | mix): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def logo(value: VdomNode): this.type = set("logo", value.rawNode.asInstanceOf[js.Any])
    
    inline def logoNull: this.type = set("logo", null)
    
    inline def logoVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("logo", js.Array(value*))
    
    inline def logoVdomElement(value: VdomElement): this.type = set("logo", value.rawElement.asInstanceOf[js.Any])
    
    inline def menu(value: AutoClose): this.type = set("menu", value.asInstanceOf[js.Any])
    
    inline def menuData(value: js.Array[MenuDataItem]): this.type = set("menuData", value.asInstanceOf[js.Any])
    
    inline def menuDataVarargs(value: MenuDataItem*): this.type = set("menuData", js.Array(value*))
    
    inline def menuHeaderRender(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.SiderMenuProps['menuHeaderRender'] */ js.Any
    ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
    
    inline def menuRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ Node, Node]]): this.type = set("menuRender", value.asInstanceOf[js.Any])
    
    inline def menuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ Node) => Node): this.type = set("menuRender", js.Any.fromFunction2(value))
    
    inline def menuRenderType(value: header | sider): this.type = set("menuRenderType", value.asInstanceOf[js.Any])
    
    inline def navTheme(value: realDark | light): this.type = set("navTheme", value.asInstanceOf[js.Any])
    
    inline def onCollapse(value: /* collapsed */ Boolean => Callback): this.type = set("onCollapse", js.Any.fromFunction1((t0: /* collapsed */ Boolean) => value(t0).runNow()))
    
    inline def onMenuHeaderClick(value: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback): this.type = set("onMenuHeaderClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def originCollapsed(value: Boolean): this.type = set("originCollapsed", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def rightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, Node]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
    
    inline def rightContentRenderFunction1(value: /* props */ HeaderViewProps => Node): this.type = set("rightContentRender", js.Any.fromFunction1(value))
    
    inline def siderMenuType(value: sub | group): this.type = set("siderMenuType", value.asInstanceOf[js.Any])
    
    inline def splitMenus(value: Boolean): this.type = set("splitMenus", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String | `false`): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GlobalHeaderProps & PrivateSiderMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
