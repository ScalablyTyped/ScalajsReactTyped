package typingsJapgolly.djangoBananas.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.djangoBananas.djangoBananasStrings.DEBUG
import typingsJapgolly.djangoBananas.djangoBananasStrings.ERROR
import typingsJapgolly.djangoBananas.djangoBananasStrings.INFO
import typingsJapgolly.djangoBananas.djangoBananasStrings.OFF
import typingsJapgolly.djangoBananas.djangoBananasStrings.WARN
import typingsJapgolly.djangoBananas.djangoBananasStrings.horizontal
import typingsJapgolly.djangoBananas.djangoBananasStrings.vertical
import typingsJapgolly.djangoBananas.mod.ApiSetting
import typingsJapgolly.djangoBananas.mod.AppProps
import typingsJapgolly.djangoBananas.mod.NavAppItem
import typingsJapgolly.djangoBananas.mod.NavItem
import typingsJapgolly.djangoBananas.mod.UserInterface
import typingsJapgolly.djangoBananas.themesMod.Theme
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  inline def apply(api: ApiSetting, pages: String => Any): Builder = {
    val __props = js.Dynamic.literal(api = api.asInstanceOf[js.Any], pages = js.Any.fromFunction1(pages))
    new Builder(js.Array(this.component, __props.asInstanceOf[AppProps]))
  }
  
  @JSImport("django-bananas", "App")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.djangoBananas.mod.App] {
    
    inline def branding(value: String): this.type = set("branding", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def container(value: js.Symbol | (js.Function1[/* args */ Any, Any]) | Node): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerFunction1(value: /* args */ Any => Any): this.type = set("container", js.Any.fromFunction1(value))
    
    inline def containerNull: this.type = set("container", null)
    
    inline def containerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("container", js.Array(value*))
    
    inline def containerVdomElement(value: VdomElement): this.type = set("container", value.rawElement.asInstanceOf[js.Any])
    
    inline def customizeContext(value: /* context */ Any => Any): this.type = set("customizeContext", js.Any.fromFunction1(value))
    
    inline def customizeUser(value: /* user */ UserInterface => UserInterface): this.type = set("customizeUser", js.Any.fromFunction1(value))
    
    inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    
    inline def editableSettings(value: Boolean): this.type = set("editableSettings", value.asInstanceOf[js.Any])
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def logLevel(value: INFO | DEBUG | WARN | ERROR | OFF): this.type = set("logLevel", value.asInstanceOf[js.Any])
    
    inline def loginForm(value: /* args */ Any => Any): this.type = set("loginForm", js.Any.fromFunction1(value))
    
    inline def logo(value: Node | String | Boolean): this.type = set("logo", value.asInstanceOf[js.Any])
    
    inline def logoNull: this.type = set("logo", null)
    
    inline def logoVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("logo", js.Array(value*))
    
    inline def logoVdomElement(value: VdomElement): this.type = set("logo", value.rawElement.asInstanceOf[js.Any])
    
    inline def nav(value: js.Array[String] | (Record[String, NavItem | NavAppItem])): this.type = set("nav", value.asInstanceOf[js.Any])
    
    inline def navVarargs(value: String*): this.type = set("nav", js.Array(value*))
    
    inline def pageTheme(value: Theme): this.type = set("pageTheme", value.asInstanceOf[js.Any])
    
    inline def permanent(value: Boolean): this.type = set("permanent", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def version(value: String): this.type = set("version", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
