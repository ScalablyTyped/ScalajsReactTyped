package typingsJapgolly.reactNotificationsComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNotificationsComponent.mod.ReactNotificationProps
import typingsJapgolly.reactNotificationsComponent.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNotificationsComponent {
  
  @JSImport("react-notifications-component", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def breakpoint(value: Double): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    
    inline def types(value: js.Array[String]): this.type = set("types", value.asInstanceOf[js.Any])
    
    inline def typesVarargs(value: String*): this.type = set("types", js.Array(value*))
  }
  
  implicit def make(companion: ReactNotificationsComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactNotificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
