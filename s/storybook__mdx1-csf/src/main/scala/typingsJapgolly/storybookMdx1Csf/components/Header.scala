package typingsJapgolly.storybookMdx1Csf.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookMdx1Csf.distTsStoriesHeaderMod.HeaderProps
import typingsJapgolly.storybookMdx1Csf.distTsStoriesHeaderMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  inline def apply(onCreateAccount: Callback, onLogin: Callback, onLogout: Callback): Builder = {
    val __props = js.Dynamic.literal(onCreateAccount = onCreateAccount.toJsFn, onLogin = onLogin.toJsFn, onLogout = onLogout.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[HeaderProps]))
  }
  
  @JSImport("@storybook/mdx1-csf/dist/ts/stories/Header", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def user(value: User): this.type = set("user", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
