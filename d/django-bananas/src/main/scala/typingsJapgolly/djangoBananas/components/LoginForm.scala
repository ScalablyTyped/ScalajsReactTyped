package typingsJapgolly.djangoBananas.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.djangoBananas.mod.LoginFormProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginForm {
  
  inline def apply(logger: Any): Default[typingsJapgolly.djangoBananas.mod.LoginForm] = {
    val __props = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    new Default[typingsJapgolly.djangoBananas.mod.LoginForm](js.Array(this.component, __props.asInstanceOf[LoginFormProps]))
  }
  
  @JSImport("django-bananas", "LoginForm")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoginFormProps): Default[typingsJapgolly.djangoBananas.mod.LoginForm] = new Default[typingsJapgolly.djangoBananas.mod.LoginForm](js.Array(this.component, p.asInstanceOf[js.Any]))
}
