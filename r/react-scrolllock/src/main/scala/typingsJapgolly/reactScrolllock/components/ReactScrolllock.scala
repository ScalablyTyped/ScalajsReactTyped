package typingsJapgolly.reactScrolllock.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactScrolllock.mod.ScrollLockProps
import typingsJapgolly.reactScrolllock.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScrolllock {
  
  @JSImport("react-scrolllock", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accountForScrollbars(value: Boolean): this.type = set("accountForScrollbars", value.asInstanceOf[js.Any])
    
    inline def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactScrolllock.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollLockProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
