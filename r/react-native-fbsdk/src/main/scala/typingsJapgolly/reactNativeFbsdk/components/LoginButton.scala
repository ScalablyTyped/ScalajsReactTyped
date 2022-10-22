package typingsJapgolly.reactNativeFbsdk.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeFbsdk.mod.DefaultAudience
import typingsJapgolly.reactNativeFbsdk.mod.LoginBehaviorAndroid
import typingsJapgolly.reactNativeFbsdk.mod.LoginButtonProps
import typingsJapgolly.reactNativeFbsdk.mod.LoginResult
import typingsJapgolly.reactNativeFbsdk.mod.Permissions
import typingsJapgolly.reactNativeFbsdk.mod.TooltipBehaviorIOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginButton {
  
  @JSImport("react-native-fbsdk", "LoginButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeFbsdk.mod.LoginButton] {
    
    inline def defaultAudience(value: DefaultAudience): this.type = set("defaultAudience", value.asInstanceOf[js.Any])
    
    inline def loginBehaviorAndroid(value: LoginBehaviorAndroid): this.type = set("loginBehaviorAndroid", value.asInstanceOf[js.Any])
    
    inline def onLoginFinished(value: (/* error */ js.Object, /* result */ LoginResult) => Callback): this.type = set("onLoginFinished", js.Any.fromFunction2((t0: /* error */ js.Object, t1: /* result */ LoginResult) => (value(t0, t1)).runNow()))
    
    inline def onLogoutFinished(value: Callback): this.type = set("onLogoutFinished", value.toJsFn)
    
    inline def permissions(value: js.Array[Permissions]): this.type = set("permissions", value.asInstanceOf[js.Any])
    
    inline def permissionsVarargs(value: Permissions*): this.type = set("permissions", js.Array(value*))
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tooltipBehaviorIOS(value: TooltipBehaviorIOS): this.type = set("tooltipBehaviorIOS", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LoginButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoginButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
