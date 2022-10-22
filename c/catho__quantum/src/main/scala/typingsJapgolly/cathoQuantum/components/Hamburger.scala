package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.hamburgerMod.HamburgerProps
import typingsJapgolly.cathoQuantum.hamburgerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hamburger {
  
  @JSImport("@catho/quantum/Hamburger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def ariaLabelDescription(value: String): this.type = set("ariaLabelDescription", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def isOpened(value: Boolean): this.type = set("isOpened", value.asInstanceOf[js.Any])
    
    inline def showNotification(value: Boolean): this.type = set("showNotification", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Hamburger.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HamburgerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
