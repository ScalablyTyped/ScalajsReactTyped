package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.anon.Key
import typingsJapgolly.antDesignPro.anon.Title
import typingsJapgolly.history.mod.Location
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPageHeaderMod {
  
  @JSImport("ant-design-pro/lib/PageHeader", JSImport.Default)
  @js.native
  open class default () extends Component[PageHeaderProps, Any, Any]
  
  type PageHeader = japgolly.scalajs.react.facade.React.Component[PageHeaderProps & js.Object, js.Object]
  
  trait PageHeaderProps extends StObject {
    
    var action: js.UndefOr[Node | String] = js.undefined
    
    var breadcrumbList: js.UndefOr[js.Array[Title]] = js.undefined
    
    var breadcrumbNameMap: js.UndefOr[Any] = js.undefined
    
    var breadcrumbSeparator: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var extraContent: js.UndefOr[Node] = js.undefined
    
    var hiddenBreadcrumb: js.UndefOr[Boolean] = js.undefined
    
    var home: js.UndefOr[Node] = js.undefined
    
    def itemRender(menuItem: Any): Node
    
    var linkElement: js.UndefOr[Node | String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[Location] = js.undefined
    
    var logo: js.UndefOr[Node | String] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var routes: js.UndefOr[js.Array[Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabActiveKey: js.UndefOr[String] = js.undefined
    
    var tabBarExtraContent: js.UndefOr[Node] = js.undefined
    
    var tabDefaultActiveKey: js.UndefOr[String] = js.undefined
    
    var tabList: js.UndefOr[js.Array[Key]] = js.undefined
    
    var title: js.UndefOr[Node | String | Double] = js.undefined
    
    var wide: js.UndefOr[Boolean] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(itemRender: Any => Node): PageHeaderProps = {
      val __obj = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setAction(value: Node | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setActionVdomElement(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBreadcrumbList(value: js.Array[Title]): Self = StObject.set(x, "breadcrumbList", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbListUndefined: Self = StObject.set(x, "breadcrumbList", js.undefined)
      
      inline def setBreadcrumbListVarargs(value: Title*): Self = StObject.set(x, "breadcrumbList", js.Array(value*))
      
      inline def setBreadcrumbNameMap(value: Any): Self = StObject.set(x, "breadcrumbNameMap", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbNameMapUndefined: Self = StObject.set(x, "breadcrumbNameMap", js.undefined)
      
      inline def setBreadcrumbSeparator(value: VdomNode): Self = StObject.set(x, "breadcrumbSeparator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBreadcrumbSeparatorNull: Self = StObject.set(x, "breadcrumbSeparator", null)
      
      inline def setBreadcrumbSeparatorUndefined: Self = StObject.set(x, "breadcrumbSeparator", js.undefined)
      
      inline def setBreadcrumbSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "breadcrumbSeparator", js.Array(value*))
      
      inline def setBreadcrumbSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "breadcrumbSeparator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExtraContent(value: VdomNode): Self = StObject.set(x, "extraContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraContentNull: Self = StObject.set(x, "extraContent", null)
      
      inline def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
      
      inline def setExtraContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extraContent", js.Array(value*))
      
      inline def setExtraContentVdomElement(value: VdomElement): Self = StObject.set(x, "extraContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHiddenBreadcrumb(value: Boolean): Self = StObject.set(x, "hiddenBreadcrumb", value.asInstanceOf[js.Any])
      
      inline def setHiddenBreadcrumbUndefined: Self = StObject.set(x, "hiddenBreadcrumb", js.undefined)
      
      inline def setHome(value: VdomNode): Self = StObject.set(x, "home", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHomeNull: Self = StObject.set(x, "home", null)
      
      inline def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      inline def setHomeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "home", js.Array(value*))
      
      inline def setHomeVdomElement(value: VdomElement): Self = StObject.set(x, "home", value.rawElement.asInstanceOf[js.Any])
      
      inline def setItemRender(value: Any => Node): Self = StObject.set(x, "itemRender", js.Any.fromFunction1(value))
      
      inline def setLinkElement(value: Node | String): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      inline def setLinkElementNull: Self = StObject.set(x, "linkElement", null)
      
      inline def setLinkElementUndefined: Self = StObject.set(x, "linkElement", js.undefined)
      
      inline def setLinkElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "linkElement", js.Array(value*))
      
      inline def setLinkElementVdomElement(value: VdomElement): Self = StObject.set(x, "linkElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setLogo(value: Node | String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoNull: Self = StObject.set(x, "logo", null)
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setLogoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "logo", js.Array(value*))
      
      inline def setLogoVdomElement(value: VdomElement): Self = StObject.set(x, "logo", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnTabChange(value: /* key */ String => Callback): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRoutes(value: js.Array[Any]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Any*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      inline def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      inline def setTabBarExtraContent(value: VdomNode): Self = StObject.set(x, "tabBarExtraContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTabBarExtraContentNull: Self = StObject.set(x, "tabBarExtraContent", null)
      
      inline def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      inline def setTabBarExtraContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tabBarExtraContent", js.Array(value*))
      
      inline def setTabBarExtraContentVdomElement(value: VdomElement): Self = StObject.set(x, "tabBarExtraContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabDefaultActiveKey(value: String): Self = StObject.set(x, "tabDefaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setTabDefaultActiveKeyUndefined: Self = StObject.set(x, "tabDefaultActiveKey", js.undefined)
      
      inline def setTabList(value: js.Array[Key]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      inline def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      inline def setTabListVarargs(value: Key*): Self = StObject.set(x, "tabList", js.Array(value*))
      
      inline def setTitle(value: Node | String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWide(value: Boolean): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
      
      inline def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    }
  }
}
