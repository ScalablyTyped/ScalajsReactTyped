package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.reveal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reveal {
  
  @JSImport("react-burger-menu", "reveal")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Reveal.type): SharedBuilder_Props_1809302565[reveal] = new SharedBuilder_Props_1809302565[reveal](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[reveal] = new SharedBuilder_Props_1809302565[reveal](js.Array(this.component, p.asInstanceOf[js.Any]))
}
