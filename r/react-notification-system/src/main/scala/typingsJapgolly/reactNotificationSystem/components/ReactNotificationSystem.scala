package typingsJapgolly.reactNotificationSystem.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNotificationSystem.mod.Attributes
import typingsJapgolly.reactNotificationSystem.mod.Style
import typingsJapgolly.reactNotificationSystem.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNotificationSystem {
  
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def allowHTML(value: Boolean): this.type = set("allowHTML", value.asInstanceOf[js.Any])
    
    inline def noAnimation(value: Boolean): this.type = set("noAnimation", value.asInstanceOf[js.Any])
    
    inline def style(value: Style | Boolean): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNotificationSystem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Attributes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
