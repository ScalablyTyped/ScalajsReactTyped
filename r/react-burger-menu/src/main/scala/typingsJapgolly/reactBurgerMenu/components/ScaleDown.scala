package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.scaleDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleDown {
  
  @JSImport("react-burger-menu", "scaleDown")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ScaleDown.type): SharedBuilder_Props_1809302565[scaleDown] = new SharedBuilder_Props_1809302565[scaleDown](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[scaleDown] = new SharedBuilder_Props_1809302565[scaleDown](js.Array(this.component, p.asInstanceOf[js.Any]))
}
