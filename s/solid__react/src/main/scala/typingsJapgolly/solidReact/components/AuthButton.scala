package typingsJapgolly.solidReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.solidReact.mod.AuthButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthButton {
  
  inline def apply(login: String, logout: String, popup: String): Builder = {
    val __props = js.Dynamic.literal(login = login.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AuthButtonProps]))
  }
  
  @JSImport("@solid/react", "AuthButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.solidReact.mod.AuthButton] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AuthButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
