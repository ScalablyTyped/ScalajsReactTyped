package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.appNavBarTypesMod.AppNavBarOverrides
import typingsJapgolly.baseui.appNavBarTypesMod.AppNavBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppNavBar {
  
  @JSImport("baseui/app-nav-bar", "AppNavBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isMainItemActive(value: /* a */ typingsJapgolly.baseui.appNavBarTypesMod.NavItem => Boolean): this.type = set("isMainItemActive", js.Any.fromFunction1(value))
    
    inline def mainItems(value: js.Array[typingsJapgolly.baseui.appNavBarTypesMod.NavItem]): this.type = set("mainItems", value.asInstanceOf[js.Any])
    
    inline def mainItemsVarargs(value: typingsJapgolly.baseui.appNavBarTypesMod.NavItem*): this.type = set("mainItems", js.Array(value*))
    
    inline def mapItemToNode(value: /* a */ typingsJapgolly.baseui.appNavBarTypesMod.NavItem => Node): this.type = set("mapItemToNode", js.Any.fromFunction1(value))
    
    inline def onMainItemSelect(value: /* a */ typingsJapgolly.baseui.appNavBarTypesMod.NavItem => Any): this.type = set("onMainItemSelect", js.Any.fromFunction1(value))
    
    inline def onUserItemSelect(value: /* a */ typingsJapgolly.baseui.appNavBarTypesMod.NavItem => Any): this.type = set("onUserItemSelect", js.Any.fromFunction1(value))
    
    inline def overrides(value: AppNavBarOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def userImgUrl(value: String): this.type = set("userImgUrl", value.asInstanceOf[js.Any])
    
    inline def userItems(value: js.Array[typingsJapgolly.baseui.appNavBarTypesMod.NavItem]): this.type = set("userItems", value.asInstanceOf[js.Any])
    
    inline def userItemsVarargs(value: typingsJapgolly.baseui.appNavBarTypesMod.NavItem*): this.type = set("userItems", js.Array(value*))
    
    inline def username(value: String): this.type = set("username", value.asInstanceOf[js.Any])
    
    inline def usernameSubtitle(value: VdomNode): this.type = set("usernameSubtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def usernameSubtitleNull: this.type = set("usernameSubtitle", null)
    
    inline def usernameSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("usernameSubtitle", js.Array(value*))
    
    inline def usernameSubtitleVdomElement(value: VdomElement): this.type = set("usernameSubtitle", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AppNavBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppNavBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
