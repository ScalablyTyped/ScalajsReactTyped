package typingsJapgolly.reactBetterPassword.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBetterPassword.mod.PasswordProps
import typingsJapgolly.reactBetterPassword.mod.default
import typingsJapgolly.reactBetterPassword.reactBetterPasswordStrings.Bullet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBetterPassword {
  
  @JSImport("react-better-password", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def mask(value: Bullet | String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactBetterPassword.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PasswordProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
