package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.Key
import typingsJapgolly.antDesignPro.anon.Title
import typingsJapgolly.history.mod.Location
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PageHeaderProps973534749[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def action(value: Node | String): this.type = set("action", value.asInstanceOf[js.Any])
  
  inline def actionNull: this.type = set("action", null)
  
  inline def actionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("action", js.Array(value*))
  
  inline def actionVdomElement(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
  
  inline def breadcrumbList(value: js.Array[Title]): this.type = set("breadcrumbList", value.asInstanceOf[js.Any])
  
  inline def breadcrumbListVarargs(value: Title*): this.type = set("breadcrumbList", js.Array(value*))
  
  inline def breadcrumbNameMap(value: Any): this.type = set("breadcrumbNameMap", value.asInstanceOf[js.Any])
  
  inline def breadcrumbSeparator(value: VdomNode): this.type = set("breadcrumbSeparator", value.rawNode.asInstanceOf[js.Any])
  
  inline def breadcrumbSeparatorNull: this.type = set("breadcrumbSeparator", null)
  
  inline def breadcrumbSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("breadcrumbSeparator", js.Array(value*))
  
  inline def breadcrumbSeparatorVdomElement(value: VdomElement): this.type = set("breadcrumbSeparator", value.rawElement.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def extraContent(value: VdomNode): this.type = set("extraContent", value.rawNode.asInstanceOf[js.Any])
  
  inline def extraContentNull: this.type = set("extraContent", null)
  
  inline def extraContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extraContent", js.Array(value*))
  
  inline def extraContentVdomElement(value: VdomElement): this.type = set("extraContent", value.rawElement.asInstanceOf[js.Any])
  
  inline def hiddenBreadcrumb(value: Boolean): this.type = set("hiddenBreadcrumb", value.asInstanceOf[js.Any])
  
  inline def home(value: VdomNode): this.type = set("home", value.rawNode.asInstanceOf[js.Any])
  
  inline def homeNull: this.type = set("home", null)
  
  inline def homeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("home", js.Array(value*))
  
  inline def homeVdomElement(value: VdomElement): this.type = set("home", value.rawElement.asInstanceOf[js.Any])
  
  inline def linkElement(value: Node | String): this.type = set("linkElement", value.asInstanceOf[js.Any])
  
  inline def linkElementNull: this.type = set("linkElement", null)
  
  inline def linkElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("linkElement", js.Array(value*))
  
  inline def linkElementVdomElement(value: VdomElement): this.type = set("linkElement", value.rawElement.asInstanceOf[js.Any])
  
  inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  inline def location(value: Location): this.type = set("location", value.asInstanceOf[js.Any])
  
  inline def logo(value: Node | String): this.type = set("logo", value.asInstanceOf[js.Any])
  
  inline def logoNull: this.type = set("logo", null)
  
  inline def logoVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("logo", js.Array(value*))
  
  inline def logoVdomElement(value: VdomElement): this.type = set("logo", value.rawElement.asInstanceOf[js.Any])
  
  inline def onTabChange(value: /* key */ String => Callback): this.type = set("onTabChange", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
  
  inline def params(value: Any): this.type = set("params", value.asInstanceOf[js.Any])
  
  inline def routes(value: js.Array[Any]): this.type = set("routes", value.asInstanceOf[js.Any])
  
  inline def routesVarargs(value: Any*): this.type = set("routes", js.Array(value*))
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def tabActiveKey(value: String): this.type = set("tabActiveKey", value.asInstanceOf[js.Any])
  
  inline def tabBarExtraContent(value: VdomNode): this.type = set("tabBarExtraContent", value.rawNode.asInstanceOf[js.Any])
  
  inline def tabBarExtraContentNull: this.type = set("tabBarExtraContent", null)
  
  inline def tabBarExtraContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tabBarExtraContent", js.Array(value*))
  
  inline def tabBarExtraContentVdomElement(value: VdomElement): this.type = set("tabBarExtraContent", value.rawElement.asInstanceOf[js.Any])
  
  inline def tabDefaultActiveKey(value: String): this.type = set("tabDefaultActiveKey", value.asInstanceOf[js.Any])
  
  inline def tabList(value: js.Array[Key]): this.type = set("tabList", value.asInstanceOf[js.Any])
  
  inline def tabListVarargs(value: Key*): this.type = set("tabList", js.Array(value*))
  
  inline def title(value: Node | String | Double): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def wide(value: Boolean): this.type = set("wide", value.asInstanceOf[js.Any])
}
