package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.bubble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bubble {
  
  @JSImport("react-burger-menu", "bubble")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Bubble.type): SharedBuilder_Props_1809302565[bubble] = new SharedBuilder_Props_1809302565[bubble](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[bubble] = new SharedBuilder_Props_1809302565[bubble](js.Array(this.component, p.asInstanceOf[js.Any]))
}
