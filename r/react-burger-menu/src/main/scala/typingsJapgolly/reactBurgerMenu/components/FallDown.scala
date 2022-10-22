package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.fallDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FallDown {
  
  @JSImport("react-burger-menu", "fallDown")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FallDown.type): SharedBuilder_Props_1809302565[fallDown] = new SharedBuilder_Props_1809302565[fallDown](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[fallDown] = new SharedBuilder_Props_1809302565[fallDown](js.Array(this.component, p.asInstanceOf[js.Any]))
}
