package typingsJapgolly.solidReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.solidReact.mod.LoginButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginButton {
  
  inline def apply(popup: String): Builder = {
    val __props = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoginButtonProps]))
  }
  
  @JSImport("@solid/react", "LoginButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.solidReact.mod.LoginButton] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoginButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
