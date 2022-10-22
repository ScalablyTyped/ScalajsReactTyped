package typingsJapgolly.djangoBananas.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.djangoBananas.djangoBananasStrings.DEBUG
import typingsJapgolly.djangoBananas.djangoBananasStrings.ERROR
import typingsJapgolly.djangoBananas.djangoBananasStrings.INFO
import typingsJapgolly.djangoBananas.djangoBananasStrings.OFF
import typingsJapgolly.djangoBananas.djangoBananasStrings.WARN
import typingsJapgolly.djangoBananas.djangoBananasStrings.horizontal
import typingsJapgolly.djangoBananas.djangoBananasStrings.vertical
import typingsJapgolly.djangoBananas.themesMod.Theme
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppProps extends StObject {
  
  var api: ApiSetting
  
  var branding: js.UndefOr[String] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[js.Symbol | (js.Function1[/* args */ Any, Any]) | Node] = js.undefined
  
  var customizeContext: js.UndefOr[js.Function1[/* context */ Any, Any]] = js.undefined
  
  var customizeUser: js.UndefOr[js.Function1[/* user */ UserInterface, UserInterface]] = js.undefined
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var editableSettings: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  var logLevel: js.UndefOr[INFO | DEBUG | WARN | ERROR | OFF] = js.undefined
  
  var loginForm: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var logo: js.UndefOr[Node | String | Boolean] = js.undefined
  
  var nav: js.UndefOr[js.Array[String] | (Record[String, NavItem | NavAppItem])] = js.undefined
  
  var pageTheme: js.UndefOr[Theme] = js.undefined
  
  def pages(route: String): Any
  
  var permanent: js.UndefOr[Boolean] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object AppProps {
  
  inline def apply(api: ApiSetting, pages: String => Any): AppProps = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], pages = js.Any.fromFunction1(pages))
    __obj.asInstanceOf[AppProps]
  }
  
  extension [Self <: AppProps](x: Self) {
    
    inline def setApi(value: ApiSetting): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setBranding(value: String): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setContainer(value: js.Symbol | (js.Function1[/* args */ Any, Any]) | Node): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerFunction1(value: /* args */ Any => Any): Self = StObject.set(x, "container", js.Any.fromFunction1(value))
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "container", js.Array(value*))
    
    inline def setContainerVdomElement(value: VdomElement): Self = StObject.set(x, "container", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCustomizeContext(value: /* context */ Any => Any): Self = StObject.set(x, "customizeContext", js.Any.fromFunction1(value))
    
    inline def setCustomizeContextUndefined: Self = StObject.set(x, "customizeContext", js.undefined)
    
    inline def setCustomizeUser(value: /* user */ UserInterface => UserInterface): Self = StObject.set(x, "customizeUser", js.Any.fromFunction1(value))
    
    inline def setCustomizeUserUndefined: Self = StObject.set(x, "customizeUser", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setEditableSettings(value: Boolean): Self = StObject.set(x, "editableSettings", value.asInstanceOf[js.Any])
    
    inline def setEditableSettingsUndefined: Self = StObject.set(x, "editableSettings", js.undefined)
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLogLevel(value: INFO | DEBUG | WARN | ERROR | OFF): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLoginForm(value: /* args */ Any => Any): Self = StObject.set(x, "loginForm", js.Any.fromFunction1(value))
    
    inline def setLoginFormUndefined: Self = StObject.set(x, "loginForm", js.undefined)
    
    inline def setLogo(value: Node | String | Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoNull: Self = StObject.set(x, "logo", null)
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setLogoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "logo", js.Array(value*))
    
    inline def setLogoVdomElement(value: VdomElement): Self = StObject.set(x, "logo", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNav(value: js.Array[String] | (Record[String, NavItem | NavAppItem])): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    inline def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value*))
    
    inline def setPageTheme(value: Theme): Self = StObject.set(x, "pageTheme", value.asInstanceOf[js.Any])
    
    inline def setPageThemeUndefined: Self = StObject.set(x, "pageTheme", js.undefined)
    
    inline def setPages(value: String => Any): Self = StObject.set(x, "pages", js.Any.fromFunction1(value))
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
