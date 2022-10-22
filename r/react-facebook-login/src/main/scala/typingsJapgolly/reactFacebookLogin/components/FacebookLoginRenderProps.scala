package typingsJapgolly.reactFacebookLogin.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactFacebookLogin.distFacebookLoginRenderPropsMod.ReactFacebookLoginRenderProps
import typingsJapgolly.reactFacebookLogin.distFacebookLoginRenderPropsMod.RenderProps
import typingsJapgolly.reactFacebookLogin.distFacebookLoginRenderPropsMod.default
import typingsJapgolly.reactFacebookLogin.mod.ReactFacebookFailureResponse
import typingsJapgolly.reactFacebookLogin.mod.ReactFacebookLoginInfo
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.medium
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.metro
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FacebookLoginRenderProps {
  
  inline def apply(appId: String, callback: ReactFacebookFailureResponse | ReactFacebookLoginInfo => Callback): Builder = {
    val __props = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], callback = js.Any.fromFunction1((t0: ReactFacebookFailureResponse | ReactFacebookLoginInfo) => callback(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactFacebookLoginRenderProps]))
  }
  
  @JSImport("react-facebook-login/dist/facebook-login-render-props", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def authType(value: String): this.type = set("authType", value.asInstanceOf[js.Any])
    
    inline def autoLoad(value: Boolean): this.type = set("autoLoad", value.asInstanceOf[js.Any])
    
    inline def buttonStyle(value: CSSProperties): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def cookie(value: Boolean): this.type = set("cookie", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def disableMobileRedirect(value: Boolean): this.type = set("disableMobileRedirect", value.asInstanceOf[js.Any])
    
    inline def fields(value: String): this.type = set("fields", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    
    inline def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onFailure(value: /* response */ ReactFacebookFailureResponse => Callback): this.type = set("onFailure", js.Any.fromFunction1((t0: /* response */ ReactFacebookFailureResponse) => value(t0).runNow()))
    
    inline def reAuthenticate(value: Boolean): this.type = set("reAuthenticate", value.asInstanceOf[js.Any])
    
    inline def redirectUri(value: String): this.type = set("redirectUri", value.asInstanceOf[js.Any])
    
    inline def render(value: /* renderProps */ RenderProps => ReactChild): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def responseType(value: String): this.type = set("responseType", value.asInstanceOf[js.Any])
    
    inline def returnScopes(value: Boolean): this.type = set("returnScopes", value.asInstanceOf[js.Any])
    
    inline def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | metro): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def state(value: String): this.type = set("state", value.asInstanceOf[js.Any])
    
    inline def tag(value: Node | (Component[Any & js.Object, js.Object])): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def textButton(value: String): this.type = set("textButton", value.asInstanceOf[js.Any])
    
    inline def typeButton(value: String): this.type = set("typeButton", value.asInstanceOf[js.Any])
    
    inline def version(value: String): this.type = set("version", value.asInstanceOf[js.Any])
    
    inline def xfbml(value: Boolean): this.type = set("xfbml", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactFacebookLoginRenderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
